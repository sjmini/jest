package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingRestElement0ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""BindingRestElement0ContainsExpression0""", List(Id("""this"""), Id("""BindingIdentifier""")), None, IReturn(EBool(false)).setId(28144))
  val instToStepMap: Map[Int, Int] = Map(28144 -> 0, 28145 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28144, 28145))
  /* Beautified form:
  "BindingRestElement0ContainsExpression0" (this, BindingIdentifier) => return false
  */
}
