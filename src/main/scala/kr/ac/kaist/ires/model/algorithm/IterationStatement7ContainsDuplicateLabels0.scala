package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement7ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement7ContainsDuplicateLabels0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsDuplicateLabels""")).setId(31814), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(31815), IReturn(ERef(RefId(Id("""__x1__""")))).setId(31816))).setId(31822))
  val instToStepMap: Map[Int, Int] = Map(31814 -> 0, 31815 -> 0, 31816 -> 0, 31817 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(31815, 31814, 31817, 31816))
  /* Beautified form:
  "IterationStatement7ContainsDuplicateLabels0" (this, ForDeclaration, Expression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
