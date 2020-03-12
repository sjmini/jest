package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement9ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement9ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""ForBinding"""), Id("""AssignmentExpression"""), Id("""Statement"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(32074), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(32075), IReturn(ERef(RefId(Id("""__x1__""")))).setId(32076))).setId(32082))
  val instToStepMap: Map[Int, Int] = Map(32074 -> 0, 32075 -> 0, 32076 -> 0, 32077 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32074, 32077, 32076, 32075))
  /* Beautified form:
  "IterationStatement9ContainsUndefinedContinueTarget0" (this, ForBinding, AssignmentExpression, Statement, iterationSet, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    return __x1__
  }
  */
}
