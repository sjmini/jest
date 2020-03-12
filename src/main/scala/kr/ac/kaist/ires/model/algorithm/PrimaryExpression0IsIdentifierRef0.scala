package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression0IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression0IsIdentifierRef0""", List(Id("""this""")), None, IReturn(EBool(false)).setId(13539))
  val instToStepMap: Map[Int, Int] = Map(13539 -> 0, 13540 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13539, 13540))
  /* Beautified form:
  "PrimaryExpression0IsIdentifierRef0" (this) => return false
  */
}
