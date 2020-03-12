package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement3ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""Statement3ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""ExpressionStatement"""), Id("""iterationSet"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25732))
  val instToStepMap: Map[Int, Int] = Map(25732 -> 0, 25733 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25733, 25732))
  /* Beautified form:
  "Statement3ContainsUndefinedContinueTarget0" (this, ExpressionStatement, iterationSet, labelSet) => return false
  */
}
