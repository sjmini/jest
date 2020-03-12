package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassExpression0HasName1 {
  val length: Int = 0
  val func: Func = Func("""ClassExpression0HasName1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""ClassTail""")), None, IReturn(EBool(true)).setId(42459))
  val instToStepMap: Map[Int, Int] = Map(42459 -> 0, 42460 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(42459, 42460))
  /* Beautified form:
  "ClassExpression0HasName1" (this, BindingIdentifier, ClassTail) => return true
  */
}
