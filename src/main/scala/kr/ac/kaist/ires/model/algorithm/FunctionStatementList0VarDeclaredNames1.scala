package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionStatementList0VarDeclaredNames1 {
  val length: Int = 0
  val func: Func = Func("""FunctionStatementList0VarDeclaredNames1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""TopLevelVarDeclaredNames""")).setId(38105), IReturn(ERef(RefId(Id("""__x0__""")))).setId(38106))).setId(38111))
  val instToStepMap: Map[Int, Int] = Map(38105 -> 0, 38106 -> 0, 38107 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38107, 38106, 38105))
  /* Beautified form:
  "FunctionStatementList0VarDeclaredNames1" (this, StatementList) => {
    access __x0__ = (StatementList "TopLevelVarDeclaredNames")
    return __x0__
  }
  */
}
