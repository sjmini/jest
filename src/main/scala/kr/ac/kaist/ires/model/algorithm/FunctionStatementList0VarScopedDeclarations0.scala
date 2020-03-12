package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionStatementList0VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""FunctionStatementList0VarScopedDeclarations0""", List(Id("""this""")), None, IReturn(EList(List())).setId(38115))
  val instToStepMap: Map[Int, Int] = Map(38115 -> 0, 38116 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38115, 38116))
  /* Beautified form:
  "FunctionStatementList0VarScopedDeclarations0" (this) => return (new [])
  */
}
