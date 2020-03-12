package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IdentifierReference2AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""IdentifierReference2AssignmentTargetType0""", List(Id("""this""")), None, IReturn(ERef(RefId(Id("""CONST_simple""")))).setId(13159))
  val instToStepMap: Map[Int, Int] = Map(13159 -> 0, 13160 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13159, 13160))
  /* Beautified form:
  "IdentifierReference2AssignmentTargetType0" (this) => return CONST_simple
  */
}
