package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression2IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression2IsFunctionDefinition0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""IdentifierName""")), None, IReturn(EBool(false)).setId(16321))
  val instToStepMap: Map[Int, Int] = Map(16321 -> 0, 16322 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16322, 16321))
  /* Beautified form:
  "MemberExpression2IsFunctionDefinition0" (this, MemberExpression, IdentifierName) => return false
  */
}
