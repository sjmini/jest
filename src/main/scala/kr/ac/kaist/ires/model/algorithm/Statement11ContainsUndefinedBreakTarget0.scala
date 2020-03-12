package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement11ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""Statement11ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""ThrowStatement"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25712))
  val instToStepMap: Map[Int, Int] = Map(25712 -> 0, 25713 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25712, 25713))
  /* Beautified form:
  "Statement11ContainsUndefinedBreakTarget0" (this, ThrowStatement, labelSet) => return false
  */
}
