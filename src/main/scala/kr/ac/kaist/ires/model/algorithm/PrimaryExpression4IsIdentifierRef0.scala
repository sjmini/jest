package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression4IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression4IsIdentifierRef0""", List(Id("""this"""), Id("""ObjectLiteral""")), None, IReturn(EBool(false)).setId(13554))
  val instToStepMap: Map[Int, Int] = Map(13554 -> 0, 13555 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13554, 13555))
  /* Beautified form:
  "PrimaryExpression4IsIdentifierRef0" (this, ObjectLiteral) => return false
  */
}
