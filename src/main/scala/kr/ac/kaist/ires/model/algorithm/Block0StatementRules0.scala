package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Block0StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""Block0StatementRules0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44855), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44856))).setId(-1))
  /* Beautified form:
  "Block0StatementRules0" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
