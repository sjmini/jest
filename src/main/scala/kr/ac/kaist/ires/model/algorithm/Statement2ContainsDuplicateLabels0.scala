package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement2ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""Statement2ContainsDuplicateLabels0""", List(Id("""this"""), Id("""EmptyStatement"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25652))
  val instToStepMap: Map[Int, Int] = Map(25652 -> 0, 25653 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25653, 25652))
  /* Beautified form:
  "Statement2ContainsDuplicateLabels0" (this, EmptyStatement, labelSet) => return false
  */
}
