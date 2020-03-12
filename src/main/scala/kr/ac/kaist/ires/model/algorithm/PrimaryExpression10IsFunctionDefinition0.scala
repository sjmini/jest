package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression10IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression10IsFunctionDefinition0""", List(Id("""this"""), Id("""RegularExpressionLiteral""")), None, IReturn(EBool(false)).setId(13507))
  val instToStepMap: Map[Int, Int] = Map(13507 -> 0, 13508 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13507, 13508))
  /* Beautified form:
  "PrimaryExpression10IsFunctionDefinition0" (this, RegularExpressionLiteral) => return false
  */
}
