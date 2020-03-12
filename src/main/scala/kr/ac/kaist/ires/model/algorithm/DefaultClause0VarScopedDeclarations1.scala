package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DefaultClause0VarScopedDeclarations1 {
  val length: Int = 0
  val func: Func = Func("""DefaultClause0VarScopedDeclarations1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""VarScopedDeclarations""")).setId(35408), IReturn(ERef(RefId(Id("""__x0__""")))).setId(35409))).setId(35419), ISeq(List()).setId(35420)).setId(35412), IReturn(EList(List())).setId(35414))).setId(35423))
  val instToStepMap: Map[Int, Int] = HashMap(35415 -> 2, 35410 -> 0, 35408 -> 0, 35412 -> 1, 35413 -> 1, 35409 -> 0, 35414 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(35410, 35408, 35409), 1 -> HashSet(35412, 35413), 2 -> HashSet(35415, 35414))
  /* Beautified form:
  "DefaultClause0VarScopedDeclarations1" (this, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "VarScopedDeclarations")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
