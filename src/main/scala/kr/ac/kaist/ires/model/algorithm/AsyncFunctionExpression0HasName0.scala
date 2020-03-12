package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionExpression0HasName0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionExpression0HasName0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody""")), None, IReturn(EBool(false)).setId(43447))
  val instToStepMap: Map[Int, Int] = Map(43447 -> 0, 43448 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43448, 43447))
  /* Beautified form:
  "AsyncFunctionExpression0HasName0" (this, FormalParameters, AsyncFunctionBody) => return false
  */
}
