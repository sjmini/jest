package kr.ac.kaist.jest

import kr.ac.kaist.jest.error.NoMode
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.model.Script
import kr.ac.kaist.jest.phase._
import kr.ac.kaist.jest.util.ArgParser

sealed trait Command {
  val name: String
  def apply(args: List[String]): Any
}

class CommandObj[Result](
    override val name: String,
    pList: PhaseList[Result]
) extends Command {
  def apply(args: List[String]): Result = {
    val jestConfig = JESTConfig(this)
    val parser = new ArgParser(this, jestConfig)
    val runner = pList.getRunner(parser)
    parser(args)
    JEST(this, runner(_), jestConfig)
  }

  def display(res: Result): Unit = ()

  override def toString: String = pList.toString

  def >>[C <: Config, R](phase: PhaseObj[Result, C, R]): PhaseList[R] = pList >> phase
}

// base command
case object CmdBase extends CommandObj("", PhaseNil)

// help
case object CmdHelp extends CommandObj("help", CmdBase >> Help)

// sample
case object CmdSample extends CommandObj("sample", CmdBase >> Sample)

// parse
case object CmdParse extends CommandObj("parse", CmdBase >> Parse) {
  override def display(script: Script): Unit = println(script.toJson)
}

// eval
case object CmdEval extends CommandObj("eval", CmdParse >> Load >> Eval) {
  override def display(tag: Tag): Unit = println(tag match {
    case NormalTag => "Normally terminated."
    case IRErrorTag(uid) => s"Throws an IR error (#$uid)."
    case ErrorThrowTag(name) => s"Throws a JavaScript ${name}Error."
    case ValueThrowTag(name) => s"Throws a JavaScript value: ${name}."
  })
}

// mutate
case object CmdMutate extends CommandObj("mutate", CmdParse >> Mutate) {
  override def display(mutated: Script): Unit = {
    println("Mutated Script:")
    println(mutated)
  }
}

// generate
case object CmdGenerate extends CommandObj("generate", CmdBase >> Generate)

// inject
case object CmdInject extends CommandObj("inject", CmdBase >> Inject)

// check
case object CmdCheck extends CommandObj("check", CmdBase >> Check)

// localize
case object CmdLocalize extends CommandObj("localize", CmdBase >> Localize)

// find-bug
case object CmdFindBug extends CommandObj("find-bug", CmdBase >> Inject >> Check >> Localize)
