package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement8ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""Statement8ContainsDuplicateLabels0""", List(Id("""this"""), Id("""ReturnStatement"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25672))
  val instToStepMap: Map[Int, Int] = Map(25672 -> 0, 25673 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25673, 25672))
  /* Beautified form:
  "Statement8ContainsDuplicateLabels0" (this, ReturnStatement, labelSet) => return false
  */
}
