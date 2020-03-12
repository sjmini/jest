package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncArrowBindingIdentifier0ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""AsyncArrowBindingIdentifier0ContainsExpression0""", List(Id("""this"""), Id("""BindingIdentifier""")), None, IReturn(EBool(false)).setId(44216))
  val instToStepMap: Map[Int, Int] = Map(44216 -> 0, 44217 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44216, 44217))
  /* Beautified form:
  "AsyncArrowBindingIdentifier0ContainsExpression0" (this, BindingIdentifier) => return false
  */
}
