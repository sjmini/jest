package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DefaultClause0ContainsUndefinedBreakTarget1 {
  val length: Int = 0
  val func: Func = Func("""DefaultClause0ContainsUndefinedBreakTarget1""", List(Id("""this"""), Id("""StatementList"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(34604), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34605), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34606))).setId(34617), ISeq(List()).setId(34618)).setId(34609), IReturn(EBool(false)).setId(34611))).setId(34621))
  val instToStepMap: Map[Int, Int] = HashMap(34606 -> 0, 34609 -> 1, 34610 -> 1, 34605 -> 0, 34611 -> 2, 34604 -> 0, 34612 -> 2, 34607 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34606, 34607, 34605, 34604), 1 -> HashSet(34609, 34610), 2 -> HashSet(34612, 34611))
  /* Beautified form:
  "DefaultClause0ContainsUndefinedBreakTarget1" (this, StatementList, labelSet) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "ContainsUndefinedBreakTarget")
      app __x1__ = (__x0__ labelSet)
      return __x1__
    } else {}
    return false
  }
  */
}
