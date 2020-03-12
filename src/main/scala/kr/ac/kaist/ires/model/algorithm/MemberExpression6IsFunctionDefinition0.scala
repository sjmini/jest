package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression6IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression6IsFunctionDefinition0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Arguments""")), None, IReturn(EBool(false)).setId(16341))
  val instToStepMap: Map[Int, Int] = Map(16341 -> 0, 16342 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16342, 16341))
  /* Beautified form:
  "MemberExpression6IsFunctionDefinition0" (this, MemberExpression, Arguments) => return false
  */
}
