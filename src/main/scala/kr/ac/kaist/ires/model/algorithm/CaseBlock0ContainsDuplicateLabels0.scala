package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseBlock0ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock0ContainsDuplicateLabels0""", List(Id("""this"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(34289))
  val instToStepMap: Map[Int, Int] = Map(34289 -> 0, 34290 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34290, 34289))
  /* Beautified form:
  "CaseBlock0ContainsDuplicateLabels0" (this, labelSet) => return false
  */
}
