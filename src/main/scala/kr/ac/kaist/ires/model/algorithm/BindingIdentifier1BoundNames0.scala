package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingIdentifier1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""BindingIdentifier1BoundNames0""", List(Id("""this""")), None, IReturn(EList(List(EStr("""yield""")))).setId(13134))
  val instToStepMap: Map[Int, Int] = Map(13134 -> 0, 13135 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13134, 13135))
  /* Beautified form:
  "BindingIdentifier1BoundNames0" (this) => return (new ["yield"])
  */
}
