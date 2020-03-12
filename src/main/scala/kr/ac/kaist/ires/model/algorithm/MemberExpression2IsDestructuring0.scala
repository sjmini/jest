package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression2IsDestructuring0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression2IsDestructuring0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""IdentifierName""")), None, IReturn(EBool(false)).setId(16379))
  val instToStepMap: Map[Int, Int] = Map(16379 -> 0, 16380 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16379, 16380))
  /* Beautified form:
  "MemberExpression2IsDestructuring0" (this, MemberExpression, IdentifierName) => return false
  */
}
