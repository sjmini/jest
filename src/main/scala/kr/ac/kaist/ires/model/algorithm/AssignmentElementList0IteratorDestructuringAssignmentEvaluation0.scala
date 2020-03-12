package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentElementList0IteratorDestructuringAssignmentEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentElementList0IteratorDestructuringAssignmentEvaluation0""", List(Id("""this"""), Id("""AssignmentElisionElement"""), Id("""iteratorRecord""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AssignmentElisionElement"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")).setId(24613), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(24614), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(24615), IReturn(ERef(RefId(Id("""__x2__""")))).setId(24616))).setId(24623))
  val instToStepMap: Map[Int, Int] = HashMap(24617 -> 0, 24613 -> 0, 24614 -> 0, 24616 -> 0, 24615 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(24617, 24613, 24614, 24616, 24615))
  /* Beautified form:
  "AssignmentElementList0IteratorDestructuringAssignmentEvaluation0" (this, AssignmentElisionElement, iteratorRecord) => {
    access __x0__ = (AssignmentElisionElement "IteratorDestructuringAssignmentEvaluation")
    app __x1__ = (__x0__ iteratorRecord)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
