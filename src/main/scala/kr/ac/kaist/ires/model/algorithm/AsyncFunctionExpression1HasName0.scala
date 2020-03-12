package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionExpression1HasName0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionExpression1HasName0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody""")), None, IReturn(EBool(true)).setId(43452))
  val instToStepMap: Map[Int, Int] = Map(43452 -> 0, 43453 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43452, 43453))
  /* Beautified form:
  "AsyncFunctionExpression1HasName0" (this, BindingIdentifier, FormalParameters, AsyncFunctionBody) => return true
  */
}
