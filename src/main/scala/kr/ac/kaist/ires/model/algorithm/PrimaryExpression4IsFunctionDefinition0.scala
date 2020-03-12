package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression4IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression4IsFunctionDefinition0""", List(Id("""this"""), Id("""ObjectLiteral""")), None, IReturn(EBool(false)).setId(13502))
  val instToStepMap: Map[Int, Int] = Map(13502 -> 0, 13503 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13503, 13502))
  /* Beautified form:
  "PrimaryExpression4IsFunctionDefinition0" (this, ObjectLiteral) => return false
  */
}
