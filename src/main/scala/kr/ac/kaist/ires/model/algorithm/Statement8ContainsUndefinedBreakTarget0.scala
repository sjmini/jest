package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement8ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""Statement8ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""ReturnStatement"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25707))
  val instToStepMap: Map[Int, Int] = Map(25707 -> 0, 25708 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25707, 25708))
  /* Beautified form:
  "Statement8ContainsUndefinedBreakTarget0" (this, ReturnStatement, labelSet) => return false
  */
}
