package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassElementList0NonConstructorMethodDefinitions0 {
  val length: Int = 0
  val func: Func = Func("""ClassElementList0NonConstructorMethodDefinitions0""", List(Id("""this"""), Id("""ClassElement""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""ClassElement"""))), """ClassElement2"""), IReturn(EList(List())).setId(42494), ISeq(List()).setId(42497)).setId(42498), IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""IsStatic""")).setId(42499), ILet(Id("""__x1__"""), EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false))).setId(42506), IIf(ERef(RefId(Id("""__x1__"""))), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")).setId(42500), IAssign(RefId(Id("""__x1__""")), EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EStr("""constructor"""))).setId(42503))).setId(42504), ISeq(List()).setId(42505)).setId(42507), IIf(ERef(RefId(Id("""__x1__"""))), IReturn(EList(List())).setId(42508), ISeq(List()).setId(42505)).setId(42510), IReturn(EList(List(ERef(RefId(Id("""ClassElement""")))))).setId(42512))).setId(-1))
  /* Beautified form:
  "ClassElementList0NonConstructorMethodDefinitions0" (this, ClassElement) => {
    if (is-instance-of ClassElement ClassElement2) return (new []) else {}
    access __x0__ = (ClassElement "IsStatic")
    let __x1__ = (= __x0__ false)
    if __x1__ {
      access __x2__ = (ClassElement "PropName")
      __x1__ = (= __x2__ "constructor")
    } else {}
    if __x1__ return (new []) else {}
    return (new [ClassElement])
  }
  */
}
