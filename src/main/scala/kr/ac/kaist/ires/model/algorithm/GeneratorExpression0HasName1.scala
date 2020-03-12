package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorExpression0HasName1 {
  val length: Int = 0
  val func: Func = Func("""GeneratorExpression0HasName1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""GeneratorBody""")), None, IReturn(EBool(true)).setId(40027))
  val instToStepMap: Map[Int, Int] = Map(40027 -> 0, 40028 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(40028, 40027))
  /* Beautified form:
  "GeneratorExpression0HasName1" (this, BindingIdentifier, FormalParameters, GeneratorBody) => return true
  */
}
