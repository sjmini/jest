package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression11IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression11IsIdentifierRef0""", List(Id("""this"""), Id("""TemplateLiteral""")), None, IReturn(EBool(false)).setId(13589))
  val instToStepMap: Map[Int, Int] = Map(13589 -> 0, 13590 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13590, 13589))
  /* Beautified form:
  "PrimaryExpression11IsIdentifierRef0" (this, TemplateLiteral) => return false
  */
}
