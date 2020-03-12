package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IdentifierReference1StringValue0 {
  val length: Int = 0
  val func: Func = Func("""IdentifierReference1StringValue0""", List(Id("""this""")), None, IReturn(EStr("""yield""")).setId(13164))
  val instToStepMap: Map[Int, Int] = Map(13164 -> 0, 13165 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13164, 13165))
  /* Beautified form:
  "IdentifierReference1StringValue0" (this) => return "yield"
  */
}
