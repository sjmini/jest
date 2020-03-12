package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncArrowFunction0HasName0 {
  val length: Int = 0
  val func: Func = Func("""AsyncArrowFunction0HasName0""", List(Id("""this"""), Id("""AsyncArrowBindingIdentifier"""), Id("""AsyncConciseBody""")), None, IReturn(EBool(false)).setId(44226))
  val instToStepMap: Map[Int, Int] = Map(44226 -> 0, 44227 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44226, 44227))
  /* Beautified form:
  "AsyncArrowFunction0HasName0" (this, AsyncArrowBindingIdentifier, AsyncConciseBody) => return false
  */
}
