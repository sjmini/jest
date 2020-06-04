package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement1ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement1ContainsDuplicateLabels0""", List(Id("""this"""), Id("""Block"""), Id("""Finally"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""ContainsDuplicateLabels""")).setId(36695), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36696), ILet(Id("""hasDuplicates"""), ERef(RefId(Id("""__x1__""")))).setId(36697), IIf(EBOp(OEq, ERef(RefId(Id("""hasDuplicates"""))), EBool(true)), IReturn(EBool(true)).setId(36699), ISeq(List()).setId(36701)).setId(36702), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Finally"""))), EStr("""ContainsDuplicateLabels""")).setId(36704), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36705), IReturn(ERef(RefId(Id("""__x3__""")))).setId(36706))).setId(-1))
  /* Beautified form:
  "TryStatement1ContainsDuplicateLabels0" (this, Block, Finally, labelSet) => {
    access __x0__ = (Block "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    let hasDuplicates = __x1__
    if (= hasDuplicates true) return true else {}
    access __x2__ = (Finally "ContainsDuplicateLabels")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }
  */
}
