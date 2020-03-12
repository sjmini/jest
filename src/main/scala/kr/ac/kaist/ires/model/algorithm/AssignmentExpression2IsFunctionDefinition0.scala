package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentExpression2IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression2IsFunctionDefinition0""", List(Id("""this"""), Id("""ArrowFunction""")), None, IReturn(EBool(true)).setId(22628))
  val instToStepMap: Map[Int, Int] = Map(22628 -> 0, 22629 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(22629, 22628))
  /* Beautified form:
  "AssignmentExpression2IsFunctionDefinition0" (this, ArrowFunction) => return true
  */
}
