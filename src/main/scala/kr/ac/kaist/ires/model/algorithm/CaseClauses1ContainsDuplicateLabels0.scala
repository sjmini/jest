package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseClauses1ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""CaseClauses1ContainsDuplicateLabels0""", List(Id("""this"""), Id("""CaseClauses"""), Id("""CaseClause"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses"""))), EStr("""ContainsDuplicateLabels""")).setId(34367), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34368), ILet(Id("""hasDuplicates"""), ERef(RefId(Id("""__x1__""")))).setId(34369), IIf(EBOp(OEq, ERef(RefId(Id("""hasDuplicates"""))), EBool(true)), IReturn(EBool(true)).setId(34371), ISeq(List()).setId(34385)).setId(34374), IAccess(Id("""__x2__"""), ERef(RefId(Id("""CaseClause"""))), EStr("""ContainsDuplicateLabels""")).setId(34376), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34377), IReturn(ERef(RefId(Id("""__x3__""")))).setId(34378))).setId(34390))
  val instToStepMap: Map[Int, Int] = HashMap(34367 -> 0, 34368 -> 0, 34374 -> 2, 34376 -> 3, 34372 -> 1, 34371 -> 1, 34370 -> 0, 34379 -> 3, 34369 -> 0, 34378 -> 3, 34375 -> 2, 34377 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34367, 34370, 34368, 34369), 1 -> HashSet(34372, 34371), 2 -> HashSet(34374, 34375), 3 -> HashSet(34379, 34378, 34376, 34377))
  /* Beautified form:
  "CaseClauses1ContainsDuplicateLabels0" (this, CaseClauses, CaseClause, labelSet) => {
    access __x0__ = (CaseClauses "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    let hasDuplicates = __x1__
    if (= hasDuplicates true) return true else {}
    access __x2__ = (CaseClause "ContainsDuplicateLabels")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }
  */
}
