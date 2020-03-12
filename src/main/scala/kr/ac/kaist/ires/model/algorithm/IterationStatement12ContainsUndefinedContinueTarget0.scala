package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement12ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement12ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""ForBinding"""), Id("""AssignmentExpression"""), Id("""Statement"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(32113), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(32114), IReturn(ERef(RefId(Id("""__x1__""")))).setId(32115))).setId(32121))
  val instToStepMap: Map[Int, Int] = Map(32113 -> 0, 32114 -> 0, 32115 -> 0, 32116 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32116, 32115, 32113, 32114))
  /* Beautified form:
  "IterationStatement12ContainsUndefinedContinueTarget0" (this, ForBinding, AssignmentExpression, Statement, iterationSet, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    return __x1__
  }
  */
}
