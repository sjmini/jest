package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionExpression0Contains1 {
  val length: Int = 0
  val func: Func = Func("""FunctionExpression0Contains1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""FunctionBody"""), Id("""symbol""")), None, IReturn(EBool(false)).setId(37810))
  val instToStepMap: Map[Int, Int] = Map(37810 -> 0, 37811 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37811, 37810))
  /* Beautified form:
  "FunctionExpression0Contains1" (this, BindingIdentifier, FormalParameters, FunctionBody, symbol) => return false
  */
}
