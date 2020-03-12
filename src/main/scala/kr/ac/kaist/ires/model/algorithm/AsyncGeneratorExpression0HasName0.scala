package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorExpression0HasName0 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorExpression0HasName0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""AsyncGeneratorBody""")), None, IReturn(EBool(false)).setId(41481))
  val instToStepMap: Map[Int, Int] = Map(41481 -> 0, 41482 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(41482, 41481))
  /* Beautified form:
  "AsyncGeneratorExpression0HasName0" (this, FormalParameters, AsyncGeneratorBody) => return false
  */
}
