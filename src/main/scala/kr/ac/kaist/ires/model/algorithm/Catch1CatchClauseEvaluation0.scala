package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Catch1CatchClauseEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""Catch1CatchClauseEvaluation0""", List(Id("""this"""), Id("""Block"""), Id("""thrownValue""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""Evaluation""")).setId(37505), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(37506), IReturn(ERef(RefId(Id("""__x1__""")))).setId(37507))).setId(-1))
  /* Beautified form:
  "Catch1CatchClauseEvaluation0" (this, Block, thrownValue) => {
    access __x0__ = (Block "Evaluation")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
