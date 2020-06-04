package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncMethod0HasDirectSuper0 {
  val length: Int = 0
  val func: Func = Func("""AsyncMethod0HasDirectSuper0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""AsyncFunctionBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UniqueFormalParameters"""))), EStr("""Contains""")).setId(43417), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(EStr("""SuperCall"""))).setId(43418), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), IReturn(EBool(true)).setId(43419), ISeq(List()).setId(43421)).setId(43422), IAccess(Id("""__x2__"""), ERef(RefId(Id("""AsyncFunctionBody"""))), EStr("""Contains""")).setId(43424), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(EStr("""SuperCall"""))).setId(43425), IReturn(ERef(RefId(Id("""__x3__""")))).setId(43426))).setId(-1))
  /* Beautified form:
  "AsyncMethod0HasDirectSuper0" (this, PropertyName, UniqueFormalParameters, AsyncFunctionBody) => {
    access __x0__ = (UniqueFormalParameters "Contains")
    app __x1__ = (__x0__ "SuperCall")
    if (= __x1__ true) return true else {}
    access __x2__ = (AsyncFunctionBody "Contains")
    app __x3__ = (__x2__ "SuperCall")
    return __x3__
  }
  */
}
