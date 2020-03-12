package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ObjectBindingPattern0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""ObjectBindingPattern0BoundNames0""", List(Id("""this""")), None, IReturn(EList(List())).setId(27772))
  val instToStepMap: Map[Int, Int] = Map(27772 -> 0, 27773 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27772, 27773))
  /* Beautified form:
  "ObjectBindingPattern0BoundNames0" (this) => return (new [])
  */
}
