package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement9ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement9ContainsDuplicateLabels0""", List(Id("""this"""), Id("""ForBinding"""), Id("""AssignmentExpression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsDuplicateLabels""")).setId(31840), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(31841), IReturn(ERef(RefId(Id("""__x1__""")))).setId(31842))).setId(31848))
  val instToStepMap: Map[Int, Int] = Map(31840 -> 0, 31841 -> 0, 31842 -> 0, 31843 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(31842, 31841, 31843, 31840))
  /* Beautified form:
  "IterationStatement9ContainsDuplicateLabels0" (this, ForBinding, AssignmentExpression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
