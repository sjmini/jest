package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseClauses1ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""CaseClauses1ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""CaseClauses"""), Id("""CaseClause"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(34721), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(34722), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))).setId(34723), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(34725), ISeq(List()).setId(34739)).setId(34728), IAccess(Id("""__x2__"""), ERef(RefId(Id("""CaseClause"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(34730), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(34731), IReturn(ERef(RefId(Id("""__x3__""")))).setId(34732))).setId(34744))
  val instToStepMap: Map[Int, Int] = HashMap(34726 -> 1, 34729 -> 2, 34733 -> 3, 34730 -> 3, 34723 -> 0, 34731 -> 3, 34724 -> 0, 34728 -> 2, 34732 -> 3, 34721 -> 0, 34722 -> 0, 34725 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34722, 34723, 34724, 34721), 1 -> HashSet(34726, 34725), 2 -> HashSet(34729, 34728), 3 -> HashSet(34733, 34730, 34731, 34732))
  /* Beautified form:
  "CaseClauses1ContainsUndefinedContinueTarget0" (this, CaseClauses, CaseClause, iterationSet, labelSet) => {
    access __x0__ = (CaseClauses "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (CaseClause "ContainsUndefinedContinueTarget")
    app __x3__ = (__x2__ iterationSet (new []))
    return __x3__
  }
  */
}
