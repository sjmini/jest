package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object WithStatement0ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""WithStatement0ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(34136), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34137), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34138))).setId(34144))
  val instToStepMap: Map[Int, Int] = Map(34136 -> 0, 34137 -> 0, 34138 -> 0, 34139 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34139, 34136, 34137, 34138))
  /* Beautified form:
  "WithStatement0ContainsUndefinedBreakTarget0" (this, Expression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
