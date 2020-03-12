package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayBindingPattern0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern0BoundNames0""", List(Id("""this""")), None, IReturn(EList(List())).setId(27777))
  val instToStepMap: Map[Int, Int] = Map(27777 -> 0, 27778 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27778, 27777))
  /* Beautified form:
  "ArrayBindingPattern0BoundNames0" (this) => return (new [])
  */
}
