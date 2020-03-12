package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledItem1ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""LabelledItem1ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""FunctionDeclaration"""), Id("""iterationSet"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(36253))
  val instToStepMap: Map[Int, Int] = Map(36253 -> 0, 36254 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36253, 36254))
  /* Beautified form:
  "LabelledItem1ContainsUndefinedContinueTarget0" (this, FunctionDeclaration, iterationSet, labelSet) => return false
  */
}
