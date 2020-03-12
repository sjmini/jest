package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement3ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""Statement3ContainsDuplicateLabels0""", List(Id("""this"""), Id("""ExpressionStatement"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25657))
  val instToStepMap: Map[Int, Int] = Map(25657 -> 0, 25658 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25657, 25658))
  /* Beautified form:
  "Statement3ContainsDuplicateLabels0" (this, ExpressionStatement, labelSet) => return false
  */
}
