package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement11ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""Statement11ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""ThrowStatement"""), Id("""iterationSet"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25747))
  val instToStepMap: Map[Int, Int] = Map(25747 -> 0, 25748 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25748, 25747))
  /* Beautified form:
  "Statement11ContainsUndefinedContinueTarget0" (this, ThrowStatement, iterationSet, labelSet) => return false
  */
}
