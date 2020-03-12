package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Block0ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""Block0ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""iterationSet"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(26198))
  val instToStepMap: Map[Int, Int] = Map(26198 -> 0, 26199 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26198, 26199))
  /* Beautified form:
  "Block0ContainsUndefinedContinueTarget0" (this, iterationSet, labelSet) => return false
  */
}
