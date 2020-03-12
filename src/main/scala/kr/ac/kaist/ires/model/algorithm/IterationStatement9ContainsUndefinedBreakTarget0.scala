package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement9ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement9ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""ForBinding"""), Id("""AssignmentExpression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(31957), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(31958), IReturn(ERef(RefId(Id("""__x1__""")))).setId(31959))).setId(31965))
  val instToStepMap: Map[Int, Int] = Map(31957 -> 0, 31958 -> 0, 31959 -> 0, 31960 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(31960, 31959, 31958, 31957))
  /* Beautified form:
  "IterationStatement9ContainsUndefinedBreakTarget0" (this, ForBinding, AssignmentExpression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
