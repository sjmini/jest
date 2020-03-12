package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingIdentifier2StringValue0 {
  val length: Int = 0
  val func: Func = Func("""BindingIdentifier2StringValue0""", List(Id("""this""")), None, IReturn(EStr("""await""")).setId(13184))
  val instToStepMap: Map[Int, Int] = Map(13184 -> 0, 13185 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13184, 13185))
  /* Beautified form:
  "BindingIdentifier2StringValue0" (this) => return "await"
  */
}
