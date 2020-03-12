package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement6ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement6ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""ForBinding"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(31918), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(31919), IReturn(ERef(RefId(Id("""__x1__""")))).setId(31920))).setId(31926))
  val instToStepMap: Map[Int, Int] = Map(31920 -> 0, 31921 -> 0, 31918 -> 0, 31919 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(31918, 31919, 31921, 31920))
  /* Beautified form:
  "IterationStatement6ContainsUndefinedBreakTarget0" (this, ForBinding, Expression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
