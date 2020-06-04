package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement0ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement0ContainsDuplicateLabels0""", List(Id("""this"""), Id("""Block"""), Id("""Catch"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""ContainsDuplicateLabels""")).setId(36661), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36662), ILet(Id("""hasDuplicates"""), ERef(RefId(Id("""__x1__""")))).setId(36663), IIf(EBOp(OEq, ERef(RefId(Id("""hasDuplicates"""))), EBool(true)), IReturn(EBool(true)).setId(36665), ISeq(List()).setId(36667)).setId(36668), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Catch"""))), EStr("""ContainsDuplicateLabels""")).setId(36670), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36671), IReturn(ERef(RefId(Id("""__x3__""")))).setId(36672))).setId(-1))
  /* Beautified form:
  "TryStatement0ContainsDuplicateLabels0" (this, Block, Catch, labelSet) => {
    access __x0__ = (Block "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    let hasDuplicates = __x1__
    if (= hasDuplicates true) return true else {}
    access __x2__ = (Catch "ContainsDuplicateLabels")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }
  */
}
