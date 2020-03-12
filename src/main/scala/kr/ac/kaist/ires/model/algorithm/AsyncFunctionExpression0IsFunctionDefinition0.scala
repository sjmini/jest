package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionExpression0IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionExpression0IsFunctionDefinition0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody""")), None, IReturn(EBool(true)).setId(43467))
  val instToStepMap: Map[Int, Int] = Map(43467 -> 0, 43468 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43468, 43467))
  /* Beautified form:
  "AsyncFunctionExpression0IsFunctionDefinition0" (this, FormalParameters, AsyncFunctionBody) => return true
  */
}
