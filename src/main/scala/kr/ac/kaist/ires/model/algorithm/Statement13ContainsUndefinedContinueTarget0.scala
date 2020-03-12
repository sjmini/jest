package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement13ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""Statement13ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""DebuggerStatement"""), Id("""iterationSet"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25752))
  val instToStepMap: Map[Int, Int] = Map(25752 -> 0, 25753 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25752, 25753))
  /* Beautified form:
  "Statement13ContainsUndefinedContinueTarget0" (this, DebuggerStatement, iterationSet, labelSet) => return false
  */
}
