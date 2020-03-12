package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FormalParameters0ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameters0ContainsExpression0""", List(Id("""this""")), None, IReturn(EBool(false)).setId(37815))
  val instToStepMap: Map[Int, Int] = Map(37815 -> 0, 37816 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37815, 37816))
  /* Beautified form:
  "FormalParameters0ContainsExpression0" (this) => return false
  */
}
