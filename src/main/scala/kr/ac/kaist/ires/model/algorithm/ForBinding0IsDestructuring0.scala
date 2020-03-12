package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ForBinding0IsDestructuring0 {
  val length: Int = 0
  val func: Func = Func("""ForBinding0IsDestructuring0""", List(Id("""this"""), Id("""BindingIdentifier""")), None, IReturn(EBool(false)).setId(32149))
  val instToStepMap: Map[Int, Int] = Map(32149 -> 0, 32150 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32150, 32149))
  /* Beautified form:
  "ForBinding0IsDestructuring0" (this, BindingIdentifier) => return false
  */
}
