package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression3IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression3IsFunctionDefinition0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""TemplateLiteral""")), None, IReturn(EBool(false)).setId(16326))
  val instToStepMap: Map[Int, Int] = Map(16326 -> 0, 16327 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16327, 16326))
  /* Beautified form:
  "MemberExpression3IsFunctionDefinition0" (this, MemberExpression, TemplateLiteral) => return false
  */
}
