package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrowFunction0HasName0 {
  val length: Int = 0
  val func: Func = Func("""ArrowFunction0HasName0""", List(Id("""this"""), Id("""ArrowParameters"""), Id("""ConciseBody""")), None, IReturn(EBool(false)).setId(38758))
  val instToStepMap: Map[Int, Int] = Map(38758 -> 0, 38759 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38759, 38758))
  /* Beautified form:
  "ArrowFunction0HasName0" (this, ArrowParameters, ConciseBody) => return false
  */
}
