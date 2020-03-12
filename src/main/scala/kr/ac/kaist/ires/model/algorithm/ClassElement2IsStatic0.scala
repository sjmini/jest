package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassElement2IsStatic0 {
  val length: Int = 0
  val func: Func = Func("""ClassElement2IsStatic0""", List(Id("""this""")), None, IReturn(EBool(false)).setId(42489))
  val instToStepMap: Map[Int, Int] = Map(42489 -> 0, 42490 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(42490, 42489))
  /* Beautified form:
  "ClassElement2IsStatic0" (this) => return false
  */
}
