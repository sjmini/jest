package kr.ac.kaist.ase

import kr.ac.kaist.ase.phase._
import kr.ac.kaist.ase.error._
import kr.ac.kaist.ase.util._

object ASE {
  ////////////////////////////////////////////////////////////////////////////////
  // Main entry point
  ////////////////////////////////////////////////////////////////////////////////
  def main(tokens: Array[String]): Unit = try tokens.toList match {
    case str :: args => cmdMap.get(str) match {
      case Some(cmd) => cmd(args)
      case None => throw NoCmdError(str)
    }
    case Nil => throw NoInputError
  } catch {
    // ASEError: print the error message.
    case ex: ASEError =>
      Console.err.println(ex.getMessage)
    // Unexpected: print the stack trace.
    case ex: Throwable =>
      Console.err.println("* Unexpected error occurred.")
      Console.err.println(ex.toString)
      Console.err.println(ex.getStackTrace.mkString(LINE_SEP))
  }

  def apply[Result](
    command: CommandObj[Result],
    runner: ASEConfig => Result,
    config: ASEConfig
  ): Result = {
    // set the start time.
    val startTime = System.currentTimeMillis

    // execute the command.
    val result: Result = runner(config)

    // duration
    val duration = System.currentTimeMillis - startTime

    // display the result.
    if (!config.silent) {
      command.display(result)
    }

    // display the time.
    if (config.time) {
      val name = config.command.name
      println(s"The command '$name' took $duration ms.")
    }

    // return result
    result
  }

  // commands
  val commands: List[Command] = List(
    CmdHelp,
    CmdParseAlgo,
    CmdCompileAlgo,
    CmdParse,
    CmdLoad,
    CmdEval,
    CmdREPL,
    CmdParseCore,
    CmdLoadCore,
    CmdEvalCore,
    CmdREPLCore,
    CmdGenModel,
    CmdFilterMeta
  )
  val cmdMap = commands.foldLeft[Map[String, Command]](Map()) {
    case (map, cmd) => map + (cmd.name -> cmd)
  }

  // phases
  var phases: List[Phase] = List(
    Help,
    ParseAlgo,
    CompileAlgo,
    Parse,
    Load,
    ParseCore,
    LoadCore,
    EvalCore,
    REPLCore,
    GenModel,
    FilterMeta
  )

  // global options
  val options: List[PhaseOption[ASEConfig]] = List(
    ("silent", BoolOption(c => c.silent = true),
      "final results are not displayed."),
    ("time", BoolOption(c => c.time = true),
      "display duration time.")
  )

  // indentation
  private val INDENT = 20

  // print help message.
  val help: String = {
    val s: StringBuilder = new StringBuilder
    s.append("Invoked as script: ase args").append(LINE_SEP)
      .append("Invoked by java: java ... kr.ac.kaist.ase.ASE args").append(LINE_SEP)
      .append(LINE_SEP)
      .append("* command list:").append(LINE_SEP)
      .append("    Each command consists of following phases.").append(LINE_SEP)
      .append("    format: {command} {phase} [>> {phase}]*").append(LINE_SEP).append(LINE_SEP)
    commands foreach (cmd => {
      s.append(s"    %-${INDENT}s".format(cmd.name))
        .append(cmd.toString.replace(LINE_SEP, LINE_SEP + "    " + " " * INDENT))
        .append(LINE_SEP)
    })
    s.append(LINE_SEP)
      .append("* phase list:").append(LINE_SEP)
      .append("    Each phase has following options.").append(LINE_SEP)
      .append("    format: {phase} [-{phase}:{option}[={input}]]*").append(LINE_SEP).append(LINE_SEP)
    phases foreach (phase => {
      s.append(s"    %-${INDENT}s".format(phase.name))
      Useful.indentation(s, phase.help, INDENT + 4)
      s.append(LINE_SEP)
        .append(LINE_SEP)
      phase.getOptDescs foreach {
        case (name, desc) =>
          s.append(s"%${INDENT + 4}s".format("") + s"If $name is given, $desc").append(LINE_SEP)
      }
      s.append(LINE_SEP)
    })
    s.append("* global option:").append(LINE_SEP).append(LINE_SEP)
    options.foreach {
      case (opt, kind, desc) =>
        val name = s"-${opt}${kind.postfix}"
        s.append(s"    If $name is given, $desc").append(LINE_SEP)
    }
    s.toString
  }
}

case class ASEConfig(
  var command: Command,
  var fileNames: List[String] = Nil,
  var silent: Boolean = false,
  var time: Boolean = false
) extends Config
