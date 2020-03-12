package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionExpression1Contains0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionExpression1Contains0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody"""), Id("""symbol""")), None, IReturn(EBool(false)).setId(43412))
  val instToStepMap: Map[Int, Int] = Map(43412 -> 0, 43413 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43413, 43412))
  /* Beautified form:
  "AsyncFunctionExpression1Contains0" (this, BindingIdentifier, FormalParameters, AsyncFunctionBody, symbol) => return false
  */
}
