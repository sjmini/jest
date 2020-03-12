package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncArrowFunction1HasName0 {
  val length: Int = 0
  val func: Func = Func("""AsyncArrowFunction1HasName0""", List(Id("""this"""), Id("""CoverCallExpressionAndAsyncArrowHead"""), Id("""AsyncConciseBody""")), None, IReturn(EBool(false)).setId(44231))
  val instToStepMap: Map[Int, Int] = Map(44231 -> 0, 44232 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44231, 44232))
  /* Beautified form:
  "AsyncArrowFunction1HasName0" (this, CoverCallExpressionAndAsyncArrowHead, AsyncConciseBody) => return false
  */
}
