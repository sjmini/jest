package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseClause0VarScopedDeclarations1 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0VarScopedDeclarations1""", List(Id("""this"""), Id("""Expression"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""VarScopedDeclarations""")).setId(35385), IReturn(ERef(RefId(Id("""__x0__""")))).setId(35386))).setId(35396), ISeq(List()).setId(35397)).setId(35389), IReturn(EList(List())).setId(35391))).setId(35400))
  val instToStepMap: Map[Int, Int] = HashMap(35389 -> 1, 35386 -> 0, 35390 -> 1, 35385 -> 0, 35387 -> 0, 35391 -> 2, 35392 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(35386, 35385, 35387), 1 -> HashSet(35389, 35390), 2 -> HashSet(35391, 35392))
  /* Beautified form:
  "CaseClause0VarScopedDeclarations1" (this, Expression, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "VarScopedDeclarations")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
