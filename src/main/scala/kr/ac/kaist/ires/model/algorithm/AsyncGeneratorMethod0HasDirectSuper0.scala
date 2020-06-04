package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorMethod0HasDirectSuper0 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorMethod0HasDirectSuper0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""AsyncGeneratorBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UniqueFormalParameters"""))), EStr("""Contains""")).setId(41451), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(EStr("""SuperCall"""))).setId(41452), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), IReturn(EBool(true)).setId(41453), ISeq(List()).setId(41455)).setId(41456), IAccess(Id("""__x2__"""), ERef(RefId(Id("""AsyncGeneratorBody"""))), EStr("""Contains""")).setId(41458), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(EStr("""SuperCall"""))).setId(41459), IReturn(ERef(RefId(Id("""__x3__""")))).setId(41460))).setId(-1))
  /* Beautified form:
  "AsyncGeneratorMethod0HasDirectSuper0" (this, PropertyName, UniqueFormalParameters, AsyncGeneratorBody) => {
    access __x0__ = (UniqueFormalParameters "Contains")
    app __x1__ = (__x0__ "SuperCall")
    if (= __x1__ true) return true else {}
    access __x2__ = (AsyncGeneratorBody "Contains")
    app __x3__ = (__x2__ "SuperCall")
    return __x3__
  }
  */
}
