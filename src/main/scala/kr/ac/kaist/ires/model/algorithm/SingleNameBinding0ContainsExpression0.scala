package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SingleNameBinding0ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""SingleNameBinding0ContainsExpression0""", List(Id("""this"""), Id("""BindingIdentifier""")), None, IReturn(EBool(false)).setId(28134))
  val instToStepMap: Map[Int, Int] = Map(28134 -> 0, 28135 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28134, 28135))
  /* Beautified form:
  "SingleNameBinding0ContainsExpression0" (this, BindingIdentifier) => return false
  */
}
