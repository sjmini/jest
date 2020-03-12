package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression2IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression2IsFunctionDefinition0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, IReturn(EBool(false)).setId(20698))
  val instToStepMap: Map[Int, Int] = Map(20698 -> 0, 20699 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(20698, 20699))
  /* Beautified form:
  "RelationalExpression2IsFunctionDefinition0" (this, RelationalExpression, ShiftExpression) => return false
  */
}
