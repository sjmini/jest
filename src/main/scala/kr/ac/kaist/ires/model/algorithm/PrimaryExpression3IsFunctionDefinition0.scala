package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression3IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression3IsFunctionDefinition0""", List(Id("""this"""), Id("""ArrayLiteral""")), None, IReturn(EBool(false)).setId(13497))
  val instToStepMap: Map[Int, Int] = Map(13497 -> 0, 13498 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13498, 13497))
  /* Beautified form:
  "PrimaryExpression3IsFunctionDefinition0" (this, ArrayLiteral) => return false
  */
}
