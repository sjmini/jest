package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FormalParameters0IsSimpleParameterList0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameters0IsSimpleParameterList0""", List(Id("""this""")), None, IReturn(EBool(true)).setId(38026))
  val instToStepMap: Map[Int, Int] = Map(38026 -> 0, 38027 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38026, 38027))
  /* Beautified form:
  "FormalParameters0IsSimpleParameterList0" (this) => return true
  */
}
