package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement8ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""Statement8ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""ReturnStatement"""), Id("""iterationSet"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25742))
  val instToStepMap: Map[Int, Int] = Map(25742 -> 0, 25743 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25742, 25743))
  /* Beautified form:
  "Statement8ContainsUndefinedContinueTarget0" (this, ReturnStatement, iterationSet, labelSet) => return false
  */
}
