package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentElisionElement0IteratorDestructuringAssignmentEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentElisionElement0IteratorDestructuringAssignmentEvaluation0""", List(Id("""this"""), Id("""AssignmentElement"""), Id("""iteratorRecord""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AssignmentElement"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")).setId(24670), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(24671), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(24672), IReturn(ERef(RefId(Id("""__x2__""")))).setId(24673))).setId(24680))
  val instToStepMap: Map[Int, Int] = HashMap(24670 -> 0, 24671 -> 0, 24674 -> 0, 24672 -> 0, 24673 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(24670, 24671, 24674, 24672, 24673))
  /* Beautified form:
  "AssignmentElisionElement0IteratorDestructuringAssignmentEvaluation0" (this, AssignmentElement, iteratorRecord) => {
    access __x0__ = (AssignmentElement "IteratorDestructuringAssignmentEvaluation")
    app __x1__ = (__x0__ iteratorRecord)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
