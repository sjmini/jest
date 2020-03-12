package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseClause0ContainsDuplicateLabels1 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0ContainsDuplicateLabels1""", List(Id("""this"""), Id("""Expression"""), Id("""StatementList"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""ContainsDuplicateLabels""")).setId(34401), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34402), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34403))).setId(34414), ISeq(List()).setId(34415)).setId(34406), IReturn(EBool(false)).setId(34408))).setId(34418))
  val instToStepMap: Map[Int, Int] = HashMap(34403 -> 0, 34406 -> 1, 34401 -> 0, 34408 -> 2, 34409 -> 2, 34404 -> 0, 34407 -> 1, 34402 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34403, 34401, 34404, 34402), 1 -> HashSet(34406, 34407), 2 -> HashSet(34408, 34409))
  /* Beautified form:
  "CaseClause0ContainsDuplicateLabels1" (this, Expression, StatementList, labelSet) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "ContainsDuplicateLabels")
      app __x1__ = (__x0__ labelSet)
      return __x1__
    } else {}
    return false
  }
  */
}
