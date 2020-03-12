package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement7ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""Statement7ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""BreakStatement"""), Id("""iterationSet"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25737))
  val instToStepMap: Map[Int, Int] = Map(25737 -> 0, 25738 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25737, 25738))
  /* Beautified form:
  "Statement7ContainsUndefinedContinueTarget0" (this, BreakStatement, iterationSet, labelSet) => return false
  */
}
