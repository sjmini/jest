package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayBindingPattern0IteratorBindingInitialization2 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern0IteratorBindingInitialization2""", List(Id("""this"""), Id("""Elision"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Elision"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")).setId(28746), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(28747), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(28748), IReturn(ERef(RefId(Id("""__x2__""")))).setId(28749))).setId(28756))
  val instToStepMap: Map[Int, Int] = HashMap(28747 -> 0, 28748 -> 0, 28749 -> 0, 28750 -> 0, 28746 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28747, 28748, 28749, 28750, 28746))
  /* Beautified form:
  "ArrayBindingPattern0IteratorBindingInitialization2" (this, Elision, iteratorRecord, environment) => {
    access __x0__ = (Elision "IteratorDestructuringAssignmentEvaluation")
    app __x1__ = (__x0__ iteratorRecord)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
