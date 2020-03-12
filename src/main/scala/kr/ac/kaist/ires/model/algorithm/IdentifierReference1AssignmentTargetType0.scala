package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IdentifierReference1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""IdentifierReference1AssignmentTargetType0""", List(Id("""this""")), None, IReturn(ERef(RefId(Id("""CONST_simple""")))).setId(13154))
  val instToStepMap: Map[Int, Int] = Map(13154 -> 0, 13155 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13155, 13154))
  /* Beautified form:
  "IdentifierReference1AssignmentTargetType0" (this) => return CONST_simple
  */
}
