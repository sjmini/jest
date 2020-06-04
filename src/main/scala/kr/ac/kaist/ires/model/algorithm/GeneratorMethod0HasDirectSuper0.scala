package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorMethod0HasDirectSuper0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorMethod0HasDirectSuper0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""GeneratorBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UniqueFormalParameters"""))), EStr("""Contains""")).setId(39992), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(EStr("""SuperCall"""))).setId(39993), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), IReturn(EBool(true)).setId(39994), ISeq(List()).setId(39996)).setId(39997), IAccess(Id("""__x2__"""), ERef(RefId(Id("""GeneratorBody"""))), EStr("""Contains""")).setId(39999), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(EStr("""SuperCall"""))).setId(40000), IReturn(ERef(RefId(Id("""__x3__""")))).setId(40001))).setId(-1))
  /* Beautified form:
  "GeneratorMethod0HasDirectSuper0" (this, PropertyName, UniqueFormalParameters, GeneratorBody) => {
    access __x0__ = (UniqueFormalParameters "Contains")
    app __x1__ = (__x0__ "SuperCall")
    if (= __x1__ true) return true else {}
    access __x2__ = (GeneratorBody "Contains")
    app __x3__ = (__x2__ "SuperCall")
    return __x3__
  }
  */
}
