package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorExpression0Contains1 {
  val length: Int = 0
  val func: Func = Func("""GeneratorExpression0Contains1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""GeneratorBody"""), Id("""symbol""")), None, IReturn(EBool(false)).setId(39987))
  val instToStepMap: Map[Int, Int] = Map(39987 -> 0, 39988 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39988, 39987))
  /* Beautified form:
  "GeneratorExpression0Contains1" (this, BindingIdentifier, FormalParameters, GeneratorBody, symbol) => return false
  */
}
