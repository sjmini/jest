package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Statement7StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""Statement7StatementRules0""", List(Id("""this"""), Id("""BreakStatement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44825), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44826))).setId(-1))
  /* Beautified form:
  "Statement7StatementRules0" (this, BreakStatement) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
