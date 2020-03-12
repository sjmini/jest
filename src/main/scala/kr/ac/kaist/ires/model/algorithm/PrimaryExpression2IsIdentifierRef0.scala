package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression2IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression2IsIdentifierRef0""", List(Id("""this"""), Id("""Literal""")), None, IReturn(EBool(false)).setId(13544))
  val instToStepMap: Map[Int, Int] = Map(13544 -> 0, 13545 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13544, 13545))
  /* Beautified form:
  "PrimaryExpression2IsIdentifierRef0" (this, Literal) => return false
  */
}
