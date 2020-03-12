package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassElement2PropName0 {
  val length: Int = 0
  val func: Func = Func("""ClassElement2PropName0""", List(Id("""this""")), None, IReturn(ERef(RefId(Id("""CONST_empty""")))).setId(42692))
  val instToStepMap: Map[Int, Int] = Map(42692 -> 0, 42693 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(42692, 42693))
  /* Beautified form:
  "ClassElement2PropName0" (this) => return CONST_empty
  */
}
