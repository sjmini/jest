package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression2IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression2IsIdentifierRef0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""IdentifierName""")), None, IReturn(EBool(false)).setId(16419))
  val instToStepMap: Map[Int, Int] = Map(16419 -> 0, 16420 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16420, 16419))
  /* Beautified form:
  "MemberExpression2IsIdentifierRef0" (this, MemberExpression, IdentifierName) => return false
  */
}
