package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DefaultClause0VarDeclaredNames1 {
  val length: Int = 0
  val func: Func = Func("""DefaultClause0VarDeclaredNames1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""VarDeclaredNames""")).setId(35247), IReturn(ERef(RefId(Id("""__x0__""")))).setId(35248))).setId(35258), ISeq(List()).setId(35259)).setId(35251), IReturn(EList(List())).setId(35253))).setId(35262))
  val instToStepMap: Map[Int, Int] = HashMap(35254 -> 2, 35249 -> 0, 35247 -> 0, 35251 -> 1, 35248 -> 0, 35252 -> 1, 35253 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(35249, 35247, 35248), 1 -> HashSet(35252, 35251), 2 -> HashSet(35254, 35253))
  /* Beautified form:
  "DefaultClause0VarDeclaredNames1" (this, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "VarDeclaredNames")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
