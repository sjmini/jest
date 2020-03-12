package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingIdentifier2BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""BindingIdentifier2BoundNames0""", List(Id("""this""")), None, IReturn(EList(List(EStr("""await""")))).setId(13139))
  val instToStepMap: Map[Int, Int] = Map(13139 -> 0, 13140 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13140, 13139))
  /* Beautified form:
  "BindingIdentifier2BoundNames0" (this) => return (new ["await"])
  */
}
