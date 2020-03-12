package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement5ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement5ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(31905), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(31906), IReturn(ERef(RefId(Id("""__x1__""")))).setId(31907))).setId(31913))
  val instToStepMap: Map[Int, Int] = Map(31905 -> 0, 31906 -> 0, 31907 -> 0, 31908 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(31907, 31906, 31905, 31908))
  /* Beautified form:
  "IterationStatement5ContainsUndefinedBreakTarget0" (this, LeftHandSideExpression, Expression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
