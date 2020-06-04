package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement2ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement2ContainsDuplicateLabels0""", List(Id("""this"""), Id("""Block"""), Id("""Catch"""), Id("""Finally"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""ContainsDuplicateLabels""")).setId(36729), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36730), ILet(Id("""hasDuplicates"""), ERef(RefId(Id("""__x1__""")))).setId(36731), IIf(EBOp(OEq, ERef(RefId(Id("""hasDuplicates"""))), EBool(true)), IReturn(EBool(true)).setId(36733), ISeq(List()).setId(36735)).setId(36736), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Catch"""))), EStr("""ContainsDuplicateLabels""")).setId(36738), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36739), ILet(Id("""hasDuplicates"""), ERef(RefId(Id("""__x3__""")))).setId(36740), IIf(EBOp(OEq, ERef(RefId(Id("""hasDuplicates"""))), EBool(true)), IReturn(EBool(true)).setId(36742), ISeq(List()).setId(36735)).setId(36744), IAccess(Id("""__x4__"""), ERef(RefId(Id("""Finally"""))), EStr("""ContainsDuplicateLabels""")).setId(36746), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36747), IReturn(ERef(RefId(Id("""__x5__""")))).setId(36748))).setId(-1))
  /* Beautified form:
  "TryStatement2ContainsDuplicateLabels0" (this, Block, Catch, Finally, labelSet) => {
    access __x0__ = (Block "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    let hasDuplicates = __x1__
    if (= hasDuplicates true) return true else {}
    access __x2__ = (Catch "ContainsDuplicateLabels")
    app __x3__ = (__x2__ labelSet)
    let hasDuplicates = __x3__
    if (= hasDuplicates true) return true else {}
    access __x4__ = (Finally "ContainsDuplicateLabels")
    app __x5__ = (__x4__ labelSet)
    return __x5__
  }
  */
}
