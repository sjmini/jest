package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement8ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement8ContainsDuplicateLabels0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentExpression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsDuplicateLabels""")).setId(31827), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(31828), IReturn(ERef(RefId(Id("""__x1__""")))).setId(31829))).setId(31835))
  val instToStepMap: Map[Int, Int] = Map(31827 -> 0, 31828 -> 0, 31829 -> 0, 31830 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(31828, 31827, 31830, 31829))
  /* Beautified form:
  "IterationStatement8ContainsDuplicateLabels0" (this, LeftHandSideExpression, AssignmentExpression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
