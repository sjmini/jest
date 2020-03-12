package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement5ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement5ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""Expression"""), Id("""Statement"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(32022), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(32023), IReturn(ERef(RefId(Id("""__x1__""")))).setId(32024))).setId(32030))
  val instToStepMap: Map[Int, Int] = Map(32022 -> 0, 32023 -> 0, 32024 -> 0, 32025 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32023, 32022, 32025, 32024))
  /* Beautified form:
  "IterationStatement5ContainsUndefinedContinueTarget0" (this, LeftHandSideExpression, Expression, Statement, iterationSet, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    return __x1__
  }
  */
}
