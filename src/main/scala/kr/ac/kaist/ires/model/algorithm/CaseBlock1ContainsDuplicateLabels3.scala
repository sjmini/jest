package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseBlock1ContainsDuplicateLabels3 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock1ContainsDuplicateLabels3""", List(Id("""this"""), Id("""CaseClauses0"""), Id("""DefaultClause"""), Id("""CaseClauses1"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses0"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses0"""))), EStr("""ContainsDuplicateLabels""")).setId(34294), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34295), ILet(Id("""hasDuplicates"""), ERef(RefId(Id("""__x1__""")))).setId(34296), IIf(EBOp(OEq, ERef(RefId(Id("""hasDuplicates"""))), EBool(true)), IReturn(EBool(true)).setId(34298), ISeq(List()).setId(34300)).setId(34301))).setId(34303), ISeq(List()).setId(34300)).setId(34304), IAccess(Id("""__x2__"""), ERef(RefId(Id("""DefaultClause"""))), EStr("""ContainsDuplicateLabels""")).setId(34306), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34307), ILet(Id("""hasDuplicates"""), ERef(RefId(Id("""__x3__""")))).setId(34308), IIf(EBOp(OEq, ERef(RefId(Id("""hasDuplicates"""))), EBool(true)), IReturn(EBool(true)).setId(34310), ISeq(List()).setId(34300)).setId(34312), IIf(EBOp(OEq, ERef(RefId(Id("""CaseClauses1"""))), EAbsent), IReturn(EBool(false)).setId(34314), ISeq(List()).setId(34300)).setId(34316), IAccess(Id("""__x4__"""), ERef(RefId(Id("""CaseClauses1"""))), EStr("""ContainsDuplicateLabels""")).setId(34318), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34319), IReturn(ERef(RefId(Id("""__x5__""")))).setId(34320))).setId(-1))
  /* Beautified form:
  "CaseBlock1ContainsDuplicateLabels3" (this, CaseClauses0, DefaultClause, CaseClauses1, labelSet) => {
    if (! (= CaseClauses0 absent)) {
      access __x0__ = (CaseClauses0 "ContainsDuplicateLabels")
      app __x1__ = (__x0__ labelSet)
      let hasDuplicates = __x1__
      if (= hasDuplicates true) return true else {}
    } else {}
    access __x2__ = (DefaultClause "ContainsDuplicateLabels")
    app __x3__ = (__x2__ labelSet)
    let hasDuplicates = __x3__
    if (= hasDuplicates true) return true else {}
    if (= CaseClauses1 absent) return false else {}
    access __x4__ = (CaseClauses1 "ContainsDuplicateLabels")
    app __x5__ = (__x4__ labelSet)
    return __x5__
  }
  */
}
