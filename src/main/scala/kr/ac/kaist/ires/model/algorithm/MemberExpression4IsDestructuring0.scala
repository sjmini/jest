package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression4IsDestructuring0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression4IsDestructuring0""", List(Id("""this"""), Id("""SuperProperty""")), None, IReturn(EBool(false)).setId(16389))
  val instToStepMap: Map[Int, Int] = Map(16389 -> 0, 16390 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16390, 16389))
  /* Beautified form:
  "MemberExpression4IsDestructuring0" (this, SuperProperty) => return false
  */
}
