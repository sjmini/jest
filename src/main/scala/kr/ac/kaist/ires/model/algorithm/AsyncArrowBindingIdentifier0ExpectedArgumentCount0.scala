package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncArrowBindingIdentifier0ExpectedArgumentCount0 {
  val length: Int = 0
  val func: Func = Func("""AsyncArrowBindingIdentifier0ExpectedArgumentCount0""", List(Id("""this"""), Id("""BindingIdentifier""")), None, IReturn(EINum(1L)).setId(44221))
  val instToStepMap: Map[Int, Int] = Map(44221 -> 0, 44222 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44222, 44221))
  /* Beautified form:
  "AsyncArrowBindingIdentifier0ExpectedArgumentCount0" (this, BindingIdentifier) => return 1i
  */
}
