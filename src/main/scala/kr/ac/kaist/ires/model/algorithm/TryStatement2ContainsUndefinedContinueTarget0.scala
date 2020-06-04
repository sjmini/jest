package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement2ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement2ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""Block"""), Id("""Catch"""), Id("""Finally"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(36999), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(37000), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))).setId(37001), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(37003), ISeq(List()).setId(37005)).setId(37006), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Catch"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(37008), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(37009), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x3__""")))).setId(37010), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(37012), ISeq(List()).setId(37005)).setId(37014), IAccess(Id("""__x4__"""), ERef(RefId(Id("""Finally"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(37016), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(37017), IReturn(ERef(RefId(Id("""__x5__""")))).setId(37018))).setId(-1))
  /* Beautified form:
  "TryStatement2ContainsUndefinedContinueTarget0" (this, Block, Catch, Finally, iterationSet, labelSet) => {
    access __x0__ = (Block "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (Catch "ContainsUndefinedContinueTarget")
    app __x3__ = (__x2__ iterationSet (new []))
    let hasUndefinedLabels = __x3__
    if (= hasUndefinedLabels true) return true else {}
    access __x4__ = (Finally "ContainsUndefinedContinueTarget")
    app __x5__ = (__x4__ iterationSet (new []))
    return __x5__
  }
  */
}
