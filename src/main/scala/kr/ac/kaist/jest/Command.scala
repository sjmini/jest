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

// generate
case object CmdGenerate extends CommandObj("generate", CmdBase >> Generate)

// inject
case object CmdInject extends CommandObj("inject", CmdBase >> Inject)

// check
case object CmdCheck extends CommandObj("check", CmdBase >> Check)

// localize
case object CmdLocalize extends CommandObj("localize", CmdBase >> Localize)

// run
case object CmdRun extends CommandObj("run", CmdBase >> Sample >> Generate >> Inject >> Check >> Localize)
