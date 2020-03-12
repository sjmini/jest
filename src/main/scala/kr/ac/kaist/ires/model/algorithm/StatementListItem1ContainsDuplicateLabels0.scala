package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementListItem1ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem1ContainsDuplicateLabels0""", List(Id("""this"""), Id("""Declaration"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(26149))
  val instToStepMap: Map[Int, Int] = Map(26149 -> 0, 26150 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26149, 26150))
  /* Beautified form:
  "StatementListItem1ContainsDuplicateLabels0" (this, Declaration, labelSet) => return false
  */
}
