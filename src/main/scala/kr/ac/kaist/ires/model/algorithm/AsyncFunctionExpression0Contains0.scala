package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionExpression0Contains0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionExpression0Contains0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody"""), Id("""symbol""")), None, IReturn(EBool(false)).setId(43407))
  val instToStepMap: Map[Int, Int] = Map(43408 -> 0, 43407 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43408, 43407))
  /* Beautified form:
  "AsyncFunctionExpression0Contains0" (this, FormalParameters, AsyncFunctionBody, symbol) => return false
  */
}
