package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression5IsDestructuring0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression5IsDestructuring0""", List(Id("""this"""), Id("""MetaProperty""")), None, IReturn(EBool(false)).setId(16394))
  val instToStepMap: Map[Int, Int] = Map(16394 -> 0, 16395 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16394, 16395))
  /* Beautified form:
  "MemberExpression5IsDestructuring0" (this, MetaProperty) => return false
  */
}
