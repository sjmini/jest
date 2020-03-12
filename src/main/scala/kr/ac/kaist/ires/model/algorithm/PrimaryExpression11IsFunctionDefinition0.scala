package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression11IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression11IsFunctionDefinition0""", List(Id("""this"""), Id("""TemplateLiteral""")), None, IReturn(EBool(false)).setId(13512))
  val instToStepMap: Map[Int, Int] = Map(13512 -> 0, 13513 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13512, 13513))
  /* Beautified form:
  "PrimaryExpression11IsFunctionDefinition0" (this, TemplateLiteral) => return false
  */
}
