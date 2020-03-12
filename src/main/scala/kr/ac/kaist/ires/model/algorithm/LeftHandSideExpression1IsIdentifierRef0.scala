package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LeftHandSideExpression1IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""LeftHandSideExpression1IsIdentifierRef0""", List(Id("""this"""), Id("""CallExpression""")), None, IReturn(EBool(false)).setId(16449))
  val instToStepMap: Map[Int, Int] = Map(16449 -> 0, 16450 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16449, 16450))
  /* Beautified form:
  "LeftHandSideExpression1IsIdentifierRef0" (this, CallExpression) => return false
  */
}
