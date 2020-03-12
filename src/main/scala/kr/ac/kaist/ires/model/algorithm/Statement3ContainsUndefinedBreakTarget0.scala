package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement3ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""Statement3ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""ExpressionStatement"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25697))
  val instToStepMap: Map[Int, Int] = Map(25697 -> 0, 25698 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25698, 25697))
  /* Beautified form:
  "Statement3ContainsUndefinedBreakTarget0" (this, ExpressionStatement, labelSet) => return false
  */
}
