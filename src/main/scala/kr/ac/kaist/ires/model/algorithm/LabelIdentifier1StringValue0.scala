package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelIdentifier1StringValue0 {
  val length: Int = 0
  val func: Func = Func("""LabelIdentifier1StringValue0""", List(Id("""this""")), None, IReturn(EStr("""yield""")).setId(13174))
  val instToStepMap: Map[Int, Int] = Map(13174 -> 0, 13175 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13174, 13175))
  /* Beautified form:
  "LabelIdentifier1StringValue0" (this) => return "yield"
  */
}
