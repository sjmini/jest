package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression10IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression10IsIdentifierRef0""", List(Id("""this"""), Id("""RegularExpressionLiteral""")), None, IReturn(EBool(false)).setId(13584))
  val instToStepMap: Map[Int, Int] = Map(13584 -> 0, 13585 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13584, 13585))
  /* Beautified form:
  "PrimaryExpression10IsIdentifierRef0" (this, RegularExpressionLiteral) => return false
  */
}
