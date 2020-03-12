package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression6IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression6IsIdentifierRef0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Arguments""")), None, IReturn(EBool(false)).setId(16439))
  val instToStepMap: Map[Int, Int] = Map(16439 -> 0, 16440 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16440, 16439))
  /* Beautified form:
  "MemberExpression6IsIdentifierRef0" (this, MemberExpression, Arguments) => return false
  */
}
