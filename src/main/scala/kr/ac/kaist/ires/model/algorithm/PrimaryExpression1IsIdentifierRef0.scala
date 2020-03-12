package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression1IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression1IsIdentifierRef0""", List(Id("""this"""), Id("""IdentifierReference""")), None, IReturn(EBool(true)).setId(13534))
  val instToStepMap: Map[Int, Int] = Map(13534 -> 0, 13535 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13535, 13534))
  /* Beautified form:
  "PrimaryExpression1IsIdentifierRef0" (this, IdentifierReference) => return true
  */
}
