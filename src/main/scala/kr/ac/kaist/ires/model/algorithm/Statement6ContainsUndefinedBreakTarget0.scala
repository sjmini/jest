package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement6ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""Statement6ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""ContinueStatement"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25702))
  val instToStepMap: Map[Int, Int] = Map(25702 -> 0, 25703 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25702, 25703))
  /* Beautified form:
  "Statement6ContainsUndefinedBreakTarget0" (this, ContinueStatement, labelSet) => return false
  */
}
