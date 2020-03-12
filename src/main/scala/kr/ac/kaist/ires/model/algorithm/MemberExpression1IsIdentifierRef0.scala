package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression1IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression1IsIdentifierRef0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Expression""")), None, IReturn(EBool(false)).setId(16414))
  val instToStepMap: Map[Int, Int] = Map(16414 -> 0, 16415 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16414, 16415))
  /* Beautified form:
  "MemberExpression1IsIdentifierRef0" (this, MemberExpression, Expression) => return false
  */
}
