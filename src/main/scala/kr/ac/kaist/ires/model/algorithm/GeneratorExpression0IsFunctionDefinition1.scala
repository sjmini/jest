package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorExpression0IsFunctionDefinition1 {
  val length: Int = 0
  val func: Func = Func("""GeneratorExpression0IsFunctionDefinition1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""GeneratorBody""")), None, IReturn(EBool(true)).setId(40042))
  val instToStepMap: Map[Int, Int] = Map(40042 -> 0, 40043 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(40043, 40042))
  /* Beautified form:
  "GeneratorExpression0IsFunctionDefinition1" (this, BindingIdentifier, FormalParameters, GeneratorBody) => return true
  */
}
