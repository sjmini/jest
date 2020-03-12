package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionStatementList0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""FunctionStatementList0VarDeclaredNames0""", List(Id("""this""")), None, IReturn(EList(List())).setId(38100))
  val instToStepMap: Map[Int, Int] = Map(38100 -> 0, 38101 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38100, 38101))
  /* Beautified form:
  "FunctionStatementList0VarDeclaredNames0" (this) => return (new [])
  */
}
