package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingElement1IsSimpleParameterList0 {
  val length: Int = 0
  val func: Func = Func("""BindingElement1IsSimpleParameterList0""", List(Id("""this"""), Id("""BindingPattern""")), None, IReturn(EBool(false)).setId(28179))
  val instToStepMap: Map[Int, Int] = Map(28179 -> 0, 28180 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28179, 28180))
  /* Beautified form:
  "BindingElement1IsSimpleParameterList0" (this, BindingPattern) => return false
  */
}
