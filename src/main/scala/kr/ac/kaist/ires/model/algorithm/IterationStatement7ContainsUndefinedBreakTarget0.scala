package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement7ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement7ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(31931), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(31932), IReturn(ERef(RefId(Id("""__x1__""")))).setId(31933))).setId(31939))
  val instToStepMap: Map[Int, Int] = Map(31931 -> 0, 31932 -> 0, 31933 -> 0, 31934 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(31934, 31931, 31932, 31933))
  /* Beautified form:
  "IterationStatement7ContainsUndefinedBreakTarget0" (this, ForDeclaration, Expression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
