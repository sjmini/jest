package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression6IsDestructuring0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression6IsDestructuring0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Arguments""")), None, IReturn(EBool(false)).setId(16399))
  val instToStepMap: Map[Int, Int] = Map(16400 -> 0, 16399 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16399, 16400))
  /* Beautified form:
  "MemberExpression6IsDestructuring0" (this, MemberExpression, Arguments) => return false
  */
}
