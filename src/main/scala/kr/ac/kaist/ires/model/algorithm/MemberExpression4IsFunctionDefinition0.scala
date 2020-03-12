package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression4IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression4IsFunctionDefinition0""", List(Id("""this"""), Id("""SuperProperty""")), None, IReturn(EBool(false)).setId(16331))
  val instToStepMap: Map[Int, Int] = Map(16331 -> 0, 16332 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16332, 16331))
  /* Beautified form:
  "MemberExpression4IsFunctionDefinition0" (this, SuperProperty) => return false
  */
}
