package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody""")), None, IReturn(EBool(true)).setId(43472))
  val instToStepMap: Map[Int, Int] = Map(43472 -> 0, 43473 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43472, 43473))
  /* Beautified form:
  "AsyncFunctionExpression1IsFunctionDefinition0" (this, BindingIdentifier, FormalParameters, AsyncFunctionBody) => return true
  */
}
