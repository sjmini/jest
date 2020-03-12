package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassExpression0IsFunctionDefinition1 {
  val length: Int = 0
  val func: Func = Func("""ClassExpression0IsFunctionDefinition1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""ClassTail""")), None, IReturn(EBool(true)).setId(42474))
  val instToStepMap: Map[Int, Int] = Map(42474 -> 0, 42475 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(42475, 42474))
  /* Beautified form:
  "ClassExpression0IsFunctionDefinition1" (this, BindingIdentifier, ClassTail) => return true
  */
}
