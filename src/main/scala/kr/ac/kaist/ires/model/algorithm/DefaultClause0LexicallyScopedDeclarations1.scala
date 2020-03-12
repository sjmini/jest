package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DefaultClause0LexicallyScopedDeclarations1 {
  val length: Int = 0
  val func: Func = Func("""DefaultClause0LexicallyScopedDeclarations1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""LexicallyScopedDeclarations""")).setId(35086), IReturn(ERef(RefId(Id("""__x0__""")))).setId(35087))).setId(35097), ISeq(List()).setId(35098)).setId(35090), IReturn(EList(List())).setId(35092))).setId(35101))
  val instToStepMap: Map[Int, Int] = HashMap(35087 -> 0, 35093 -> 2, 35090 -> 1, 35091 -> 1, 35086 -> 0, 35088 -> 0, 35092 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(35087, 35086, 35088), 1 -> HashSet(35090, 35091), 2 -> HashSet(35093, 35092))
  /* Beautified form:
  "DefaultClause0LexicallyScopedDeclarations1" (this, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "LexicallyScopedDeclarations")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
