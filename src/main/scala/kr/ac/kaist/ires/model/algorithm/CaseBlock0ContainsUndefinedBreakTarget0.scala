package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseBlock0ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock0ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(34466))
  val instToStepMap: Map[Int, Int] = Map(34466 -> 0, 34467 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34467, 34466))
  /* Beautified form:
  "CaseBlock0ContainsUndefinedBreakTarget0" (this, labelSet) => return false
  */
}
