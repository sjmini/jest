package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ContinueStatement0ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""ContinueStatement0ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""iterationSet"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(33921))
  val instToStepMap: Map[Int, Int] = Map(33921 -> 0, 33922 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(33922, 33921))
  /* Beautified form:
  "ContinueStatement0ContainsUndefinedContinueTarget0" (this, iterationSet, labelSet) => return false
  */
}
