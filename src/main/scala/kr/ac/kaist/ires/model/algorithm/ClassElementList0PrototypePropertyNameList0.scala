package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassElementList0PrototypePropertyNameList0 {
  val length: Int = 0
  val func: Func = Func("""ClassElementList0PrototypePropertyNameList0""", List(Id("""this"""), Id("""ClassElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")).setId(42607), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""CONST_empty""")))), IReturn(EList(List())).setId(42608), ISeq(List()).setId(42610)).setId(42611), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""IsStatic""")).setId(42613), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), IReturn(EList(List())).setId(42614), ISeq(List()).setId(42610)).setId(42616), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")).setId(42618), IReturn(EList(List(ERef(RefId(Id("""__x2__""")))))).setId(42619))).setId(-1))
  /* Beautified form:
  "ClassElementList0PrototypePropertyNameList0" (this, ClassElement) => {
    access __x0__ = (ClassElement "PropName")
    if (= __x0__ CONST_empty) return (new []) else {}
    access __x1__ = (ClassElement "IsStatic")
    if (= __x1__ true) return (new []) else {}
    access __x2__ = (ClassElement "PropName")
    return (new [__x2__])
  }
  */
}
