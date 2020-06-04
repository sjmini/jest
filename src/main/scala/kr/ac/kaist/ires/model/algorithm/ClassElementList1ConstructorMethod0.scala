package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassElementList1ConstructorMethod0 {
  val length: Int = 0
  val func: Func = Func("""ClassElementList1ConstructorMethod0""", List(Id("""this"""), Id("""ClassElementList"""), Id("""ClassElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassElementList"""))), EStr("""ConstructorMethod""")).setId(42256), ILet(Id("""head"""), ERef(RefId(Id("""__x0__""")))).setId(42257), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""head"""))), ERef(RefId(Id("""CONST_empty"""))))), IReturn(ERef(RefId(Id("""head""")))).setId(42259), ISeq(List()).setId(42261)).setId(42262), IIf(EIsInstanceOf(ERef(RefId(Id("""ClassElement"""))), """ClassElement2"""), IReturn(ERef(RefId(Id("""CONST_empty""")))).setId(42264), ISeq(List()).setId(42267)).setId(42268), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""IsStatic""")).setId(42269), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), IReturn(ERef(RefId(Id("""CONST_empty""")))).setId(42270), ISeq(List()).setId(42261)).setId(42272), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")).setId(42274), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EStr("""constructor"""))), IReturn(ERef(RefId(Id("""CONST_empty""")))).setId(42275), ISeq(List()).setId(42261)).setId(42277), IReturn(ERef(RefId(Id("""ClassElement""")))).setId(42279))).setId(-1))
  /* Beautified form:
  "ClassElementList1ConstructorMethod0" (this, ClassElementList, ClassElement) => {
    access __x0__ = (ClassElementList "ConstructorMethod")
    let head = __x0__
    if (! (= head CONST_empty)) return head else {}
    if (is-instance-of ClassElement ClassElement2) return CONST_empty else {}
    access __x1__ = (ClassElement "IsStatic")
    if (= __x1__ true) return CONST_empty else {}
    access __x2__ = (ClassElement "PropName")
    if (! (= __x2__ "constructor")) return CONST_empty else {}
    return ClassElement
  }
  */
}
