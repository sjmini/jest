package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement1ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement1ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(30869), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(30870), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30871))).setId(30877))
  val instToStepMap: Map[Int, Int] = Map(30869 -> 0, 30870 -> 0, 30871 -> 0, 30872 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(30870, 30869, 30871, 30872))
  /* Beautified form:
  "IterationStatement1ContainsUndefinedBreakTarget0" (this, Expression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
