package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IfStatement0ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""IfStatement0ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(30266), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(30267), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30268))).setId(30274))
  val instToStepMap: Map[Int, Int] = Map(30266 -> 0, 30267 -> 0, 30268 -> 0, 30269 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(30266, 30269, 30267, 30268))
  /* Beautified form:
  "IfStatement0ContainsUndefinedBreakTarget0" (this, Expression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
