package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression4IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression4IsIdentifierRef0""", List(Id("""this"""), Id("""SuperProperty""")), None, IReturn(EBool(false)).setId(16429))
  val instToStepMap: Map[Int, Int] = Map(16429 -> 0, 16430 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16429, 16430))
  /* Beautified form:
  "MemberExpression4IsIdentifierRef0" (this, SuperProperty) => return false
  */
}
