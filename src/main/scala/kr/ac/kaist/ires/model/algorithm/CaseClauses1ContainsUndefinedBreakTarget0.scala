package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseClauses1ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""CaseClauses1ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""CaseClauses"""), Id("""CaseClause"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(34544), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34545), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))).setId(34546), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(34548), ISeq(List()).setId(34562)).setId(34551), IAccess(Id("""__x2__"""), ERef(RefId(Id("""CaseClause"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(34553), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34554), IReturn(ERef(RefId(Id("""__x3__""")))).setId(34555))).setId(34567))
  val instToStepMap: Map[Int, Int] = HashMap(34548 -> 1, 34549 -> 1, 34553 -> 3, 34545 -> 0, 34546 -> 0, 34556 -> 3, 34555 -> 3, 34551 -> 2, 34547 -> 0, 34554 -> 3, 34552 -> 2, 34544 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34545, 34546, 34547, 34544), 1 -> HashSet(34548, 34549), 2 -> HashSet(34551, 34552), 3 -> HashSet(34553, 34556, 34555, 34554))
  /* Beautified form:
  "CaseClauses1ContainsUndefinedBreakTarget0" (this, CaseClauses, CaseClause, labelSet) => {
    access __x0__ = (CaseClauses "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (CaseClause "ContainsUndefinedBreakTarget")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }
  */
}
