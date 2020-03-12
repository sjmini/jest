package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression3IsDestructuring0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression3IsDestructuring0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""TemplateLiteral""")), None, IReturn(EBool(false)).setId(16384))
  val instToStepMap: Map[Int, Int] = Map(16384 -> 0, 16385 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16385, 16384))
  /* Beautified form:
  "MemberExpression3IsDestructuring0" (this, MemberExpression, TemplateLiteral) => return false
  */
}
