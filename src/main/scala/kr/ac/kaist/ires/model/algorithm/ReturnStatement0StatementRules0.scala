package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ReturnStatement0StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""ReturnStatement0StatementRules0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44865), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44866))).setId(-1))
  /* Beautified form:
  "ReturnStatement0StatementRules0" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
