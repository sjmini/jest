package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseBlock1ContainsDuplicateLabels3 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock1ContainsDuplicateLabels3""", List(Id("""this"""), Id("""CaseClauses0"""), Id("""DefaultClause"""), Id("""CaseClauses1"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses0"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses0"""))), EStr("""ContainsDuplicateLabels""")).setId(34294), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34295), ILet(Id("""hasDuplicates"""), ERef(RefId(Id("""__x1__""")))).setId(34296), IIf(EBOp(OEq, ERef(RefId(Id("""hasDuplicates"""))), EBool(true)), IReturn(EBool(true)).setId(34298), ISeq(List()).setId(34327)).setId(34301))).setId(34329), ISeq(List()).setId(34330)).setId(34304), IAccess(Id("""__x2__"""), ERef(RefId(Id("""DefaultClause"""))), EStr("""ContainsDuplicateLabels""")).setId(34306), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34307), ILet(Id("""hasDuplicates"""), ERef(RefId(Id("""__x3__""")))).setId(34308), IIf(EBOp(OEq, ERef(RefId(Id("""hasDuplicates"""))), EBool(true)), IReturn(EBool(true)).setId(34310), ISeq(List()).setId(34336)).setId(34312), IIf(EBOp(OEq, ERef(RefId(Id("""CaseClauses1"""))), EAbsent), IReturn(EBool(false)).setId(34314), ISeq(List()).setId(34339)).setId(34316), IAccess(Id("""__x4__"""), ERef(RefId(Id("""CaseClauses1"""))), EStr("""ContainsDuplicateLabels""")).setId(34318), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34319), IReturn(ERef(RefId(Id("""__x5__""")))).setId(34320))).setId(34344))
  val instToStepMap: Map[Int, Int] = HashMap(34320 -> 10, 34296 -> 3, 34303 -> 3, 34309 -> 5, 34317 -> 9, 34312 -> 7, 34305 -> 4, 34295 -> 3, 34297 -> 3, 34314 -> 8, 34301 -> 3, 34310 -> 6, 34294 -> 3, 34298 -> 3, 34315 -> 8, 34302 -> 3, 34319 -> 10, 34307 -> 5, 34299 -> 3, 34304 -> 4, 34306 -> 5, 34316 -> 9, 34308 -> 5, 34313 -> 7, 34311 -> 6, 34321 -> 10, 34318 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(5 -> HashSet(34309, 34306, 34308, 34307), 10 -> HashSet(34320, 34319, 34321, 34318), 6 -> HashSet(34310, 34311), 9 -> HashSet(34316, 34317), 2 -> HashSet(34296, 34295, 34297, 34294), 7 -> HashSet(34313, 34312), 3 -> HashSet(34296, 34303, 34299, 34295, 34297, 34301, 34294, 34298, 34302), 8 -> HashSet(34314, 34315), 4 -> HashSet(34304, 34305))
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
