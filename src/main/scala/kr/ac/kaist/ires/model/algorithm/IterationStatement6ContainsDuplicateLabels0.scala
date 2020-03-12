package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement6ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement6ContainsDuplicateLabels0""", List(Id("""this"""), Id("""ForBinding"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsDuplicateLabels""")).setId(31801), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(31802), IReturn(ERef(RefId(Id("""__x1__""")))).setId(31803))).setId(31809))
  val instToStepMap: Map[Int, Int] = Map(31801 -> 0, 31802 -> 0, 31803 -> 0, 31804 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(31802, 31801, 31804, 31803))
  /* Beautified form:
  "IterationStatement6ContainsDuplicateLabels0" (this, ForBinding, Expression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
