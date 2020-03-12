package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseBlock0ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock0ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""iterationSet"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(34643))
  val instToStepMap: Map[Int, Int] = Map(34643 -> 0, 34644 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34644, 34643))
  /* Beautified form:
  "CaseBlock0ContainsUndefinedContinueTarget0" (this, iterationSet, labelSet) => return false
  */
}
