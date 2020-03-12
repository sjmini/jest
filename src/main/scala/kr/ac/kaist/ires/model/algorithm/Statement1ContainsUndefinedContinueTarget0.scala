package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement1ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""Statement1ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""VariableStatement"""), Id("""iterationSet"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25722))
  val instToStepMap: Map[Int, Int] = Map(25722 -> 0, 25723 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25722, 25723))
  /* Beautified form:
  "Statement1ContainsUndefinedContinueTarget0" (this, VariableStatement, iterationSet, labelSet) => return false
  */
}
