package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement1ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement1ContainsDuplicateLabels0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsDuplicateLabels""")).setId(30856), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(30857), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30858))).setId(30864))
  val instToStepMap: Map[Int, Int] = Map(30856 -> 0, 30857 -> 0, 30858 -> 0, 30859 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(30856, 30859, 30857, 30858))
  /* Beautified form:
  "IterationStatement1ContainsDuplicateLabels0" (this, Expression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
