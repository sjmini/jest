package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement0ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement0ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""Statement"""), Id("""Expression"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(30703), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(30704), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30705))).setId(30711))
  val instToStepMap: Map[Int, Int] = Map(30704 -> 0, 30705 -> 0, 30706 -> 0, 30703 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(30705, 30704, 30706, 30703))
  /* Beautified form:
  "IterationStatement0ContainsUndefinedContinueTarget0" (this, Statement, Expression, iterationSet, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    return __x1__
  }
  */
}
