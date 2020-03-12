package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseClause0ContainsUndefinedBreakTarget1 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0ContainsUndefinedBreakTarget1""", List(Id("""this"""), Id("""Expression"""), Id("""StatementList"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(34578), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34579), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34580))).setId(34591), ISeq(List()).setId(34592)).setId(34583), IReturn(EBool(false)).setId(34585))).setId(34595))
  val instToStepMap: Map[Int, Int] = HashMap(34584 -> 1, 34580 -> 0, 34585 -> 2, 34581 -> 0, 34578 -> 0, 34579 -> 0, 34583 -> 1, 34586 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34580, 34581, 34578, 34579), 1 -> HashSet(34584, 34583), 2 -> HashSet(34585, 34586))
  /* Beautified form:
  "CaseClause0ContainsUndefinedBreakTarget1" (this, Expression, StatementList, labelSet) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "ContainsUndefinedBreakTarget")
      app __x1__ = (__x0__ labelSet)
      return __x1__
    } else {}
    return false
  }
  */
}
