package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object WithStatement0ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""WithStatement0ContainsDuplicateLabels0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsDuplicateLabels""")).setId(34123), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34124), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34125))).setId(34131))
  val instToStepMap: Map[Int, Int] = Map(34123 -> 0, 34124 -> 0, 34125 -> 0, 34126 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34125, 34126, 34123, 34124))
  /* Beautified form:
  "WithStatement0ContainsDuplicateLabels0" (this, Expression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
