package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassElementList0ConstructorMethod0 {
  val length: Int = 0
  val func: Func = Func("""ClassElementList0ConstructorMethod0""", List(Id("""this"""), Id("""ClassElement""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""ClassElement"""))), """ClassElement2"""), IReturn(ERef(RefId(Id("""CONST_empty""")))).setId(42211), ISeq(List()).setId(42214)).setId(42215), IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""IsStatic""")).setId(42216), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), IReturn(ERef(RefId(Id("""CONST_empty""")))).setId(42217), ISeq(List()).setId(42219)).setId(42220), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")).setId(42222), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EStr("""constructor"""))), IReturn(ERef(RefId(Id("""CONST_empty""")))).setId(42223), ISeq(List()).setId(42219)).setId(42225), IReturn(ERef(RefId(Id("""ClassElement""")))).setId(42227))).setId(-1))
  /* Beautified form:
  "ClassElementList0ConstructorMethod0" (this, ClassElement) => {
    if (is-instance-of ClassElement ClassElement2) return CONST_empty else {}
    access __x0__ = (ClassElement "IsStatic")
    if (= __x0__ true) return CONST_empty else {}
    access __x1__ = (ClassElement "PropName")
    if (! (= __x1__ "constructor")) return CONST_empty else {}
    return ClassElement
  }
  */
}
