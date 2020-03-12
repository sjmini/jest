package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement0ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement0ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""Statement"""), Id("""Expression"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(30690), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(30691), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30692))).setId(30698))
  val instToStepMap: Map[Int, Int] = Map(30690 -> 0, 30691 -> 0, 30692 -> 0, 30693 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(30690, 30691, 30692, 30693))
  /* Beautified form:
  "IterationStatement0ContainsUndefinedBreakTarget0" (this, Statement, Expression, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
