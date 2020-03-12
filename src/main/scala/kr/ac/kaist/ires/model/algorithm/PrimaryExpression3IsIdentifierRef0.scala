package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression3IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression3IsIdentifierRef0""", List(Id("""this"""), Id("""ArrayLiteral""")), None, IReturn(EBool(false)).setId(13549))
  val instToStepMap: Map[Int, Int] = Map(13549 -> 0, 13550 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13550, 13549))
  /* Beautified form:
  "PrimaryExpression3IsIdentifierRef0" (this, ArrayLiteral) => return false
  */
}
