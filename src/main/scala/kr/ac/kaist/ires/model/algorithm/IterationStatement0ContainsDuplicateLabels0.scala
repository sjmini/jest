package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement0ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement0ContainsDuplicateLabels0""", List(Id("""this"""), Id("""Statement"""), Id("""Expression"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsDuplicateLabels""")).setId(30677), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(30678), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30679))).setId(30685))
  val instToStepMap: Map[Int, Int] = Map(30677 -> 0, 30678 -> 0, 30679 -> 0, 30680 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(30679, 30680, 30677, 30678))
  /* Beautified form:
  "IterationStatement0ContainsDuplicateLabels0" (this, Statement, Expression, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
