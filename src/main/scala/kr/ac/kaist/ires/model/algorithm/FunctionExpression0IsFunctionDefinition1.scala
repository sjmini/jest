package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionExpression0IsFunctionDefinition1 {
  val length: Int = 0
  val func: Func = Func("""FunctionExpression0IsFunctionDefinition1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""FunctionBody""")), None, IReturn(EBool(true)).setId(38021))
  val instToStepMap: Map[Int, Int] = Map(38021 -> 0, 38022 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38022, 38021))
  /* Beautified form:
  "FunctionExpression0IsFunctionDefinition1" (this, BindingIdentifier, FormalParameters, FunctionBody) => return true
  */
}
