package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement11ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement11ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentExpression"""), Id("""Statement"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(32100), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(32101), IReturn(ERef(RefId(Id("""__x1__""")))).setId(32102))).setId(32108))
  val instToStepMap: Map[Int, Int] = Map(32100 -> 0, 32101 -> 0, 32102 -> 0, 32103 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32101, 32102, 32103, 32100))
  /* Beautified form:
  "IterationStatement11ContainsUndefinedContinueTarget0" (this, LeftHandSideExpression, AssignmentExpression, Statement, iterationSet, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    return __x1__
  }
  */
}
