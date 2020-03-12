package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement12ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement12ContainsDuplicateLabels0""", List(Id("""this"""), Id("""ForBinding"""), Id("""AssignmentExpression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsDuplicateLabels""")).setId(31879), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(31880), IReturn(ERef(RefId(Id("""__x1__""")))).setId(31881))).setId(31887))
  val instToStepMap: Map[Int, Int] = Map(31879 -> 0, 31880 -> 0, 31881 -> 0, 31882 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(31882, 31879, 31881, 31880))
  /* Beautified form:
  "IterationStatement12ContainsDuplicateLabels0" (this, ForBinding, AssignmentExpression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
