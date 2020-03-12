package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionExpression0HasName0 {
  val length: Int = 0
  val func: Func = Func("""FunctionExpression0HasName0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""FunctionBody""")), None, IReturn(EBool(false)).setId(37958))
  val instToStepMap: Map[Int, Int] = Map(37958 -> 0, 37959 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37959, 37958))
  /* Beautified form:
  "FunctionExpression0HasName0" (this, FormalParameters, FunctionBody) => return false
  */
}
