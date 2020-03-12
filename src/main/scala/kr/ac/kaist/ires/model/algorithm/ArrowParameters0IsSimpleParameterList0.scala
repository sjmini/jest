package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrowParameters0IsSimpleParameterList0 {
  val length: Int = 0
  val func: Func = Func("""ArrowParameters0IsSimpleParameterList0""", List(Id("""this"""), Id("""BindingIdentifier""")), None, IReturn(EBool(true)).setId(38763))
  val instToStepMap: Map[Int, Int] = Map(38763 -> 0, 38764 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38763, 38764))
  /* Beautified form:
  "ArrowParameters0IsSimpleParameterList0" (this, BindingIdentifier) => return true
  */
}
