package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression6IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression6IsIdentifierRef0""", List(Id("""this"""), Id("""ClassExpression""")), None, IReturn(EBool(false)).setId(13564))
  val instToStepMap: Map[Int, Int] = Map(13564 -> 0, 13565 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13565, 13564))
  /* Beautified form:
  "PrimaryExpression6IsIdentifierRef0" (this, ClassExpression) => return false
  */
}
