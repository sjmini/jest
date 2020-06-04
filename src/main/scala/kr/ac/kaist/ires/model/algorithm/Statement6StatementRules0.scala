package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Statement6StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""Statement6StatementRules0""", List(Id("""this"""), Id("""ContinueStatement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44815), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44816))).setId(-1))
  /* Beautified form:
  "Statement6StatementRules0" (this, ContinueStatement) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
