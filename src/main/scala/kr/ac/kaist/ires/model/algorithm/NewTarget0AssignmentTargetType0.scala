package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object NewTarget0AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""NewTarget0AssignmentTargetType0""", List(Id("""this""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(16519))
  val instToStepMap: Map[Int, Int] = Map(16519 -> 0, 16520 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16520, 16519))
  /* Beautified form:
  "NewTarget0AssignmentTargetType0" (this) => return CONST_invalid
  */
}
