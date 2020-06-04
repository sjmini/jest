package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Statement13StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""Statement13StatementRules0""", List(Id("""this"""), Id("""DebuggerStatement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44845), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44846))).setId(-1))
  /* Beautified form:
  "Statement13StatementRules0" (this, DebuggerStatement) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
