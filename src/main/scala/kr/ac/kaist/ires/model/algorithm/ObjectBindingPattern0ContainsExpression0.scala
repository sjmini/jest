package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ObjectBindingPattern0ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""ObjectBindingPattern0ContainsExpression0""", List(Id("""this""")), None, IReturn(EBool(false)).setId(27977))
  val instToStepMap: Map[Int, Int] = Map(27977 -> 0, 27978 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27977, 27978))
  /* Beautified form:
  "ObjectBindingPattern0ContainsExpression0" (this) => return false
  */
}
