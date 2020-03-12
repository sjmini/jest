package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingIdentifier1StringValue0 {
  val length: Int = 0
  val func: Func = Func("""BindingIdentifier1StringValue0""", List(Id("""this""")), None, IReturn(EStr("""yield""")).setId(13169))
  val instToStepMap: Map[Int, Int] = Map(13169 -> 0, 13170 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13170, 13169))
  /* Beautified form:
  "BindingIdentifier1StringValue0" (this) => return "yield"
  */
}
