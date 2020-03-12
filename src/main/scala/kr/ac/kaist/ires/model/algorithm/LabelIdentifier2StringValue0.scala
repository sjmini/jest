package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelIdentifier2StringValue0 {
  val length: Int = 0
  val func: Func = Func("""LabelIdentifier2StringValue0""", List(Id("""this""")), None, IReturn(EStr("""await""")).setId(13189))
  val instToStepMap: Map[Int, Int] = Map(13189 -> 0, 13190 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13190, 13189))
  /* Beautified form:
  "LabelIdentifier2StringValue0" (this) => return "await"
  */
}
