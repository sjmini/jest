package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object NewExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""NewExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""NewExpression""")), None, IReturn(EBool(false)).setId(16346))
  val instToStepMap: Map[Int, Int] = Map(16346 -> 0, 16347 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16347, 16346))
  /* Beautified form:
  "NewExpression1IsFunctionDefinition0" (this, NewExpression) => return false
  */
}
