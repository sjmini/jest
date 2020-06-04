package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement2ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement2ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""Block"""), Id("""Catch"""), Id("""Finally"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(36864), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36865), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))).setId(36866), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(36868), ISeq(List()).setId(36870)).setId(36871), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Catch"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(36873), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36874), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x3__""")))).setId(36875), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(36877), ISeq(List()).setId(36870)).setId(36879), IAccess(Id("""__x4__"""), ERef(RefId(Id("""Finally"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(36881), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36882), IReturn(ERef(RefId(Id("""__x5__""")))).setId(36883))).setId(-1))
  /* Beautified form:
  "TryStatement2ContainsUndefinedBreakTarget0" (this, Block, Catch, Finally, labelSet) => {
    access __x0__ = (Block "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (Catch "ContainsUndefinedBreakTarget")
    app __x3__ = (__x2__ labelSet)
    let hasUndefinedLabels = __x3__
    if (= hasUndefinedLabels true) return true else {}
    access __x4__ = (Finally "ContainsUndefinedBreakTarget")
    app __x5__ = (__x4__ labelSet)
    return __x5__
  }
  */
}
