package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression0IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression0IsFunctionDefinition0""", List(Id("""this""")), None, IReturn(EBool(false)).setId(13482))
  val instToStepMap: Map[Int, Int] = Map(13482 -> 0, 13483 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13483, 13482))
  /* Beautified form:
  "PrimaryExpression0IsFunctionDefinition0" (this) => return false
  */
}
