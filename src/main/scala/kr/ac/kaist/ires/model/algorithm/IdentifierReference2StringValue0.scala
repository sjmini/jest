package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IdentifierReference2StringValue0 {
  val length: Int = 0
  val func: Func = Func("""IdentifierReference2StringValue0""", List(Id("""this""")), None, IReturn(EStr("""await""")).setId(13179))
  val instToStepMap: Map[Int, Int] = Map(13179 -> 0, 13180 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13179, 13180))
  /* Beautified form:
  "IdentifierReference2StringValue0" (this) => return "await"
  */
}
