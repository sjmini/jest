package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseBlock1ContainsUndefinedContinueTarget3 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock1ContainsUndefinedContinueTarget3""", List(Id("""this"""), Id("""CaseClauses0"""), Id("""DefaultClause"""), Id("""CaseClauses1"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses0"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses0"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(34648), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(34649), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))).setId(34650), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(34652), ISeq(List()).setId(34681)).setId(34655))).setId(34683), ISeq(List()).setId(34684)).setId(34658), IAccess(Id("""__x2__"""), ERef(RefId(Id("""DefaultClause"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(34660), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(34661), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x3__""")))).setId(34662), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(34664), ISeq(List()).setId(34690)).setId(34666), IIf(EBOp(OEq, ERef(RefId(Id("""CaseClauses1"""))), EAbsent), IReturn(EBool(false)).setId(34668), ISeq(List()).setId(34693)).setId(34670), IAccess(Id("""__x4__"""), ERef(RefId(Id("""CaseClauses1"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(34672), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(34673), IReturn(ERef(RefId(Id("""__x5__""")))).setId(34674))).setId(34698))
  val instToStepMap: Map[Int, Int] = HashMap(34665 -> 6, 34662 -> 5, 34673 -> 10, 34649 -> 3, 34666 -> 7, 34659 -> 4, 34661 -> 5, 34672 -> 10, 34667 -> 7, 34650 -> 3, 34664 -> 6, 34675 -> 10, 34671 -> 9, 34651 -> 3, 34656 -> 3, 34663 -> 5, 34657 -> 3, 34653 -> 3, 34652 -> 3, 34648 -> 3, 34670 -> 9, 34658 -> 4, 34660 -> 5, 34669 -> 8, 34668 -> 8, 34655 -> 3, 34674 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(5 -> HashSet(34662, 34661, 34660, 34663), 10 -> HashSet(34673, 34672, 34675, 34674), 6 -> HashSet(34665, 34664), 9 -> HashSet(34670, 34671), 2 -> HashSet(34649, 34648, 34650, 34651), 7 -> HashSet(34666, 34667), 3 -> HashSet(34649, 34648, 34650, 34651, 34656, 34657, 34655, 34653, 34652), 8 -> HashSet(34669, 34668), 4 -> HashSet(34659, 34658))
  /* Beautified form:
  "CaseBlock1ContainsUndefinedContinueTarget3" (this, CaseClauses0, DefaultClause, CaseClauses1, iterationSet, labelSet) => {
    if (! (= CaseClauses0 absent)) {
      access __x0__ = (CaseClauses0 "ContainsUndefinedContinueTarget")
      app __x1__ = (__x0__ iterationSet (new []))
      let hasUndefinedLabels = __x1__
      if (= hasUndefinedLabels true) return true else {}
    } else {}
    access __x2__ = (DefaultClause "ContainsUndefinedContinueTarget")
    app __x3__ = (__x2__ iterationSet (new []))
    let hasUndefinedLabels = __x3__
    if (= hasUndefinedLabels true) return true else {}
    if (= CaseClauses1 absent) return false else {}
    access __x4__ = (CaseClauses1 "ContainsUndefinedContinueTarget")
    app __x5__ = (__x4__ iterationSet (new []))
    return __x5__
  }
  */
}
