package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Elision0ElisionWidth0 {
  val length: Int = 0
  val func: Func = Func("""Elision0ElisionWidth0""", List(Id("""this""")), None, IReturn(EINum(1L)).setId(13770))
  val instToStepMap: Map[Int, Int] = Map(13770 -> 0, 13771 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13771, 13770))
  /* Beautified form:
  "Elision0ElisionWidth0" (this) => return 1i
  */
}
