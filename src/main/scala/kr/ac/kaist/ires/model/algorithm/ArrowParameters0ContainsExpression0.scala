package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrowParameters0ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""ArrowParameters0ContainsExpression0""", List(Id("""this"""), Id("""BindingIdentifier""")), None, IReturn(EBool(false)).setId(38743))
  val instToStepMap: Map[Int, Int] = Map(38743 -> 0, 38744 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38744, 38743))
  /* Beautified form:
  "ArrowParameters0ContainsExpression0" (this, BindingIdentifier) => return false
  */
}
