package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement11ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement11ContainsDuplicateLabels0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentExpression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsDuplicateLabels""")).setId(31866), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(31867), IReturn(ERef(RefId(Id("""__x1__""")))).setId(31868))).setId(31874))
  val instToStepMap: Map[Int, Int] = Map(31866 -> 0, 31867 -> 0, 31868 -> 0, 31869 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(31868, 31867, 31866, 31869))
  /* Beautified form:
  "IterationStatement11ContainsDuplicateLabels0" (this, LeftHandSideExpression, AssignmentExpression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
