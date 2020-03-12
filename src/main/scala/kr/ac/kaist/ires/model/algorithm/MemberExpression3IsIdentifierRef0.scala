package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression3IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression3IsIdentifierRef0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""TemplateLiteral""")), None, IReturn(EBool(false)).setId(16424))
  val instToStepMap: Map[Int, Int] = Map(16424 -> 0, 16425 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16424, 16425))
  /* Beautified form:
  "MemberExpression3IsIdentifierRef0" (this, MemberExpression, TemplateLiteral) => return false
  */
}
