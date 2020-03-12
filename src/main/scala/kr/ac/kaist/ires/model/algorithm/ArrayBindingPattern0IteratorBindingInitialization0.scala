package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayBindingPattern0IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern0IteratorBindingInitialization0""", List(Id("""this"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(28733), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(28734), IReturn(ERef(RefId(Id("""__x1__""")))).setId(28735))).setId(28741))
  val instToStepMap: Map[Int, Int] = Map(28736 -> 0, 28733 -> 0, 28734 -> 0, 28735 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28734, 28735, 28736, 28733))
  /* Beautified form:
  "ArrayBindingPattern0IteratorBindingInitialization0" (this, iteratorRecord, environment) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
