package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledItem1ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""LabelledItem1ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""FunctionDeclaration"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(36218))
  val instToStepMap: Map[Int, Int] = Map(36218 -> 0, 36219 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36219, 36218))
  /* Beautified form:
  "LabelledItem1ContainsUndefinedBreakTarget0" (this, FunctionDeclaration, labelSet) => return false
  */
}
