package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement8StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement8StatementRules0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44885), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44886))).setId(44891))
  val instToStepMap: Map[Int, Int] = Map(44885 -> 0, 44886 -> 0, 44887 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44885, 44886, 44887))
  /* Beautified form:
  "IterationStatement8StatementRules0" (this, LeftHandSideExpression, AssignmentExpression, Statement) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
