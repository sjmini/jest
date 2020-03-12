package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseClause0ContainsUndefinedContinueTarget1 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0ContainsUndefinedContinueTarget1""", List(Id("""this"""), Id("""Expression"""), Id("""StatementList"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(34755), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(34756), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34757))).setId(34768), ISeq(List()).setId(34769)).setId(34760), IReturn(EBool(false)).setId(34762))).setId(34772))
  val instToStepMap: Map[Int, Int] = HashMap(34758 -> 0, 34762 -> 2, 34757 -> 0, 34756 -> 0, 34763 -> 2, 34760 -> 1, 34761 -> 1, 34755 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34755, 34758, 34757, 34756), 1 -> HashSet(34761, 34760), 2 -> HashSet(34762, 34763))
  /* Beautified form:
  "CaseClause0ContainsUndefinedContinueTarget1" (this, Expression, StatementList, iterationSet, labelSet) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "ContainsUndefinedContinueTarget")
      app __x1__ = (__x0__ iterationSet (new []))
      return __x1__
    } else {}
    return false
  }
  */
}
