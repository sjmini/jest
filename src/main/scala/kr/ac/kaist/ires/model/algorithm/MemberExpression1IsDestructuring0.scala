package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression1IsDestructuring0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression1IsDestructuring0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Expression""")), None, IReturn(EBool(false)).setId(16374))
  val instToStepMap: Map[Int, Int] = Map(16374 -> 0, 16375 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16375, 16374))
  /* Beautified form:
  "MemberExpression1IsDestructuring0" (this, MemberExpression, Expression) => return false
  */
}
