package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FormalParameters0ExpectedArgumentCount0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameters0ExpectedArgumentCount0""", List(Id("""this""")), None, IReturn(EINum(0L)).setId(37872))
  val instToStepMap: Map[Int, Int] = Map(37872 -> 0, 37873 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37872, 37873))
  /* Beautified form:
  "FormalParameters0ExpectedArgumentCount0" (this) => return 0i
  */
}
