package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IfStatement0ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""IfStatement0ContainsDuplicateLabels0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsDuplicateLabels""")).setId(30219), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(30220), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30221))).setId(30227))
  val instToStepMap: Map[Int, Int] = Map(30219 -> 0, 30220 -> 0, 30221 -> 0, 30222 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(30221, 30220, 30219, 30222))
  /* Beautified form:
  "IfStatement0ContainsDuplicateLabels0" (this, Expression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
