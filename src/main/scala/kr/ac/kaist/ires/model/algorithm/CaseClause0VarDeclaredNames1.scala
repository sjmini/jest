package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseClause0VarDeclaredNames1 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0VarDeclaredNames1""", List(Id("""this"""), Id("""Expression"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""VarDeclaredNames""")).setId(35224), IReturn(ERef(RefId(Id("""__x0__""")))).setId(35225))).setId(35235), ISeq(List()).setId(35236)).setId(35228), IReturn(EList(List())).setId(35230))).setId(35239))
  val instToStepMap: Map[Int, Int] = HashMap(35229 -> 1, 35225 -> 0, 35226 -> 0, 35230 -> 2, 35224 -> 0, 35231 -> 2, 35228 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(35225, 35226, 35224), 1 -> HashSet(35229, 35228), 2 -> HashSet(35230, 35231))
  /* Beautified form:
  "CaseClause0VarDeclaredNames1" (this, Expression, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "VarDeclaredNames")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
