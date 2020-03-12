package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement2ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""Statement2ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""EmptyStatement"""), Id("""iterationSet"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25727))
  val instToStepMap: Map[Int, Int] = Map(25728 -> 0, 25727 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25727, 25728))
  /* Beautified form:
  "Statement2ContainsUndefinedContinueTarget0" (this, EmptyStatement, iterationSet, labelSet) => return false
  */
}
