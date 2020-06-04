package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MethodDefinition4HasDirectSuper0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition4HasDirectSuper0""", List(Id("""this"""), Id("""PropertyName"""), Id("""FunctionBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FunctionBody"""))), EStr("""Contains""")).setId(39518), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(EStr("""SuperCall"""))).setId(39519), IReturn(ERef(RefId(Id("""__x1__""")))).setId(39520))).setId(-1))
  /* Beautified form:
  "MethodDefinition4HasDirectSuper0" (this, PropertyName, FunctionBody) => {
    access __x0__ = (FunctionBody "Contains")
    app __x1__ = (__x0__ "SuperCall")
    return __x1__
  }
  */
}
