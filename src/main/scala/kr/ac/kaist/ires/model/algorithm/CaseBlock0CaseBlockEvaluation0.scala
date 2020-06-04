package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseBlock0CaseBlockEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock0CaseBlockEvaluation0""", List(Id("""this"""), Id("""input""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(35431), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(35432), IReturn(ERef(RefId(Id("""__x1__""")))).setId(35433))).setId(-1))
  /* Beautified form:
  "CaseBlock0CaseBlockEvaluation0" (this, input) => {
    app __x0__ = (NormalCompletion undefined)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
