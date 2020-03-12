package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression2IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression2IsFunctionDefinition0""", List(Id("""this"""), Id("""Literal""")), None, IReturn(EBool(false)).setId(13492))
  val instToStepMap: Map[Int, Int] = Map(13492 -> 0, 13493 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13492, 13493))
  /* Beautified form:
  "PrimaryExpression2IsFunctionDefinition0" (this, Literal) => return false
  */
}
