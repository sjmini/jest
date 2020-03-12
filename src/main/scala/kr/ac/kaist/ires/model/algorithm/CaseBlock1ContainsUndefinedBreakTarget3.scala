package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseBlock1ContainsUndefinedBreakTarget3 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock1ContainsUndefinedBreakTarget3""", List(Id("""this"""), Id("""CaseClauses0"""), Id("""DefaultClause"""), Id("""CaseClauses1"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses0"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses0"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(34471), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34472), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))).setId(34473), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(34475), ISeq(List()).setId(34504)).setId(34478))).setId(34506), ISeq(List()).setId(34507)).setId(34481), IAccess(Id("""__x2__"""), ERef(RefId(Id("""DefaultClause"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(34483), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34484), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x3__""")))).setId(34485), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(34487), ISeq(List()).setId(34513)).setId(34489), IIf(EBOp(OEq, ERef(RefId(Id("""CaseClauses1"""))), EAbsent), IReturn(EBool(false)).setId(34491), ISeq(List()).setId(34516)).setId(34493), IAccess(Id("""__x4__"""), ERef(RefId(Id("""CaseClauses1"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(34495), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34496), IReturn(ERef(RefId(Id("""__x5__""")))).setId(34497))).setId(34521))
  val instToStepMap: Map[Int, Int] = HashMap(34474 -> 3, 34494 -> 9, 34490 -> 7, 34475 -> 3, 34478 -> 3, 34481 -> 4, 34493 -> 9, 34489 -> 7, 34485 -> 5, 34482 -> 4, 34472 -> 3, 34473 -> 3, 34496 -> 10, 34495 -> 10, 34487 -> 6, 34476 -> 3, 34491 -> 8, 34479 -> 3, 34484 -> 5, 34492 -> 8, 34471 -> 3, 34486 -> 5, 34497 -> 10, 34483 -> 5, 34488 -> 6, 34480 -> 3, 34498 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(5 -> HashSet(34484, 34485, 34486, 34483), 10 -> HashSet(34496, 34497, 34495, 34498), 6 -> HashSet(34488, 34487), 9 -> HashSet(34494, 34493), 2 -> HashSet(34474, 34472, 34471, 34473), 7 -> HashSet(34490, 34489), 3 -> HashSet(34479, 34474, 34475, 34478, 34472, 34471, 34473, 34476, 34480), 8 -> HashSet(34492, 34491), 4 -> HashSet(34481, 34482))
  /* Beautified form:
  "CaseBlock1ContainsUndefinedBreakTarget3" (this, CaseClauses0, DefaultClause, CaseClauses1, labelSet) => {
    if (! (= CaseClauses0 absent)) {
      access __x0__ = (CaseClauses0 "ContainsUndefinedBreakTarget")
      app __x1__ = (__x0__ labelSet)
      let hasUndefinedLabels = __x1__
      if (= hasUndefinedLabels true) return true else {}
    } else {}
    access __x2__ = (DefaultClause "ContainsUndefinedBreakTarget")
    app __x3__ = (__x2__ labelSet)
    let hasUndefinedLabels = __x3__
    if (= hasUndefinedLabels true) return true else {}
    if (= CaseClauses1 absent) return false else {}
    access __x4__ = (CaseClauses1 "ContainsUndefinedBreakTarget")
    app __x5__ = (__x4__ labelSet)
    return __x5__
  }
  */
}
