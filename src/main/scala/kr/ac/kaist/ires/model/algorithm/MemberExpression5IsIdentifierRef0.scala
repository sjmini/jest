package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression5IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression5IsIdentifierRef0""", List(Id("""this"""), Id("""MetaProperty""")), None, IReturn(EBool(false)).setId(16434))
  val instToStepMap: Map[Int, Int] = Map(16434 -> 0, 16435 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16434, 16435))
  /* Beautified form:
  "MemberExpression5IsIdentifierRef0" (this, MetaProperty) => return false
  */
}
