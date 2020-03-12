package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FormalParameters0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameters0BoundNames0""", List(Id("""this""")), None, IReturn(EList(List())).setId(37715))
  val instToStepMap: Map[Int, Int] = Map(37715 -> 0, 37716 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37716, 37715))
  /* Beautified form:
  "FormalParameters0BoundNames0" (this) => return (new [])
  */
}
