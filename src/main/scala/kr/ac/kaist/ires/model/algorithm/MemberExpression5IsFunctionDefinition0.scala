package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression5IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression5IsFunctionDefinition0""", List(Id("""this"""), Id("""MetaProperty""")), None, IReturn(EBool(false)).setId(16336))
  val instToStepMap: Map[Int, Int] = Map(16336 -> 0, 16337 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16336, 16337))
  /* Beautified form:
  "MemberExpression5IsFunctionDefinition0" (this, MetaProperty) => return false
  */
}
