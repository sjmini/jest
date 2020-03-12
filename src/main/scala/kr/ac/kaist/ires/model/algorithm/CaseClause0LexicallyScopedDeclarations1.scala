package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseClause0LexicallyScopedDeclarations1 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0LexicallyScopedDeclarations1""", List(Id("""this"""), Id("""Expression"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""LexicallyScopedDeclarations""")).setId(35063), IReturn(ERef(RefId(Id("""__x0__""")))).setId(35064))).setId(35074), ISeq(List()).setId(35075)).setId(35067), IReturn(EList(List())).setId(35069))).setId(35078))
  val instToStepMap: Map[Int, Int] = HashMap(35070 -> 2, 35063 -> 0, 35065 -> 0, 35069 -> 2, 35068 -> 1, 35064 -> 0, 35067 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(35063, 35065, 35064), 1 -> HashSet(35068, 35067), 2 -> HashSet(35070, 35069))
  /* Beautified form:
  "CaseClause0LexicallyScopedDeclarations1" (this, Expression, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "LexicallyScopedDeclarations")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
