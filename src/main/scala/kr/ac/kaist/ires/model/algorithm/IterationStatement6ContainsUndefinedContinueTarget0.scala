package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement6ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement6ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""ForBinding"""), Id("""Expression"""), Id("""Statement"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(32035), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(32036), IReturn(ERef(RefId(Id("""__x1__""")))).setId(32037))).setId(32043))
  val instToStepMap: Map[Int, Int] = Map(32035 -> 0, 32036 -> 0, 32037 -> 0, 32038 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32037, 32036, 32038, 32035))
  /* Beautified form:
  "IterationStatement6ContainsUndefinedContinueTarget0" (this, ForBinding, Expression, Statement, iterationSet, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    return __x1__
  }
  */
}
