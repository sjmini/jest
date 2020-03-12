package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement13ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement13ContainsDuplicateLabels0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""AssignmentExpression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsDuplicateLabels""")).setId(31892), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(31893), IReturn(ERef(RefId(Id("""__x1__""")))).setId(31894))).setId(31900))
  val instToStepMap: Map[Int, Int] = Map(31892 -> 0, 31893 -> 0, 31894 -> 0, 31895 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(31892, 31895, 31894, 31893))
  /* Beautified form:
  "IterationStatement13ContainsDuplicateLabels0" (this, ForDeclaration, AssignmentExpression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
