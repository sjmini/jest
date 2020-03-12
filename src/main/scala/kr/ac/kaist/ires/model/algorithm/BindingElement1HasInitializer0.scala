package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingElement1HasInitializer0 {
  val length: Int = 0
  val func: Func = Func("""BindingElement1HasInitializer0""", List(Id("""this"""), Id("""BindingPattern""")), None, IReturn(EBool(false)).setId(28159))
  val instToStepMap: Map[Int, Int] = Map(28160 -> 0, 28159 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28160, 28159))
  /* Beautified form:
  "BindingElement1HasInitializer0" (this, BindingPattern) => return false
  */
}
