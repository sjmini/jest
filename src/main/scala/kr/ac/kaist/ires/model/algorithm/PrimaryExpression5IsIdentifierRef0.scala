package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression5IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression5IsIdentifierRef0""", List(Id("""this"""), Id("""FunctionExpression""")), None, IReturn(EBool(false)).setId(13559))
  val instToStepMap: Map[Int, Int] = Map(13559 -> 0, 13560 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13559, 13560))
  /* Beautified form:
  "PrimaryExpression5IsIdentifierRef0" (this, FunctionExpression) => return false
  */
}
