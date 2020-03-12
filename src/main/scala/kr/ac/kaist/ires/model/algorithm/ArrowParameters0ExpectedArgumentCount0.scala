package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrowParameters0ExpectedArgumentCount0 {
  val length: Int = 0
  val func: Func = Func("""ArrowParameters0ExpectedArgumentCount0""", List(Id("""this"""), Id("""BindingIdentifier""")), None, IReturn(EINum(1L)).setId(38753))
  val instToStepMap: Map[Int, Int] = Map(38753 -> 0, 38754 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38754, 38753))
  /* Beautified form:
  "ArrowParameters0ExpectedArgumentCount0" (this, BindingIdentifier) => return 1i
  */
}
