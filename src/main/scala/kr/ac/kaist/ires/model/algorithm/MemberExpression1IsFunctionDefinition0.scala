package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Expression""")), None, IReturn(EBool(false)).setId(16316))
  val instToStepMap: Map[Int, Int] = Map(16316 -> 0, 16317 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16316, 16317))
  /* Beautified form:
  "MemberExpression1IsFunctionDefinition0" (this, MemberExpression, Expression) => return false
  */
}
