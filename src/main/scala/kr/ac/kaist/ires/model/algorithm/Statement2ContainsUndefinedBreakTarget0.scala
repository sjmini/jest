package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement2ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""Statement2ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""EmptyStatement"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25692))
  val instToStepMap: Map[Int, Int] = Map(25692 -> 0, 25693 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25692, 25693))
  /* Beautified form:
  "Statement2ContainsUndefinedBreakTarget0" (this, EmptyStatement, labelSet) => return false
  */
}
