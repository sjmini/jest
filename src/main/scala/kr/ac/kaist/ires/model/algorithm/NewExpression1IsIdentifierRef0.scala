package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object NewExpression1IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""NewExpression1IsIdentifierRef0""", List(Id("""this"""), Id("""NewExpression""")), None, IReturn(EBool(false)).setId(16444))
  val instToStepMap: Map[Int, Int] = Map(16444 -> 0, 16445 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16444, 16445))
  /* Beautified form:
  "NewExpression1IsIdentifierRef0" (this, NewExpression) => return false
  */
}
