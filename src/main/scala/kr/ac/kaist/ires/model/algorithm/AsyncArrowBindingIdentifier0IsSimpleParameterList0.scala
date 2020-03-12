package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncArrowBindingIdentifier0IsSimpleParameterList0 {
  val length: Int = 0
  val func: Func = Func("""AsyncArrowBindingIdentifier0IsSimpleParameterList0""", List(Id("""this"""), Id("""BindingIdentifier""")), None, IReturn(EBool(true)).setId(44236))
  val instToStepMap: Map[Int, Int] = Map(44236 -> 0, 44237 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44237, 44236))
  /* Beautified form:
  "AsyncArrowBindingIdentifier0IsSimpleParameterList0" (this, BindingIdentifier) => return true
  */
}
