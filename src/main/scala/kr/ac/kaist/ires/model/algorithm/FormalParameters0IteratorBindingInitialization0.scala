package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FormalParameters0IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameters0IteratorBindingInitialization0""", List(Id("""this"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(38166), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(38167), IReturn(ERef(RefId(Id("""__x1__""")))).setId(38168))).setId(38174))
  val instToStepMap: Map[Int, Int] = Map(38166 -> 0, 38167 -> 0, 38168 -> 0, 38169 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38166, 38167, 38168, 38169))
  /* Beautified form:
  "FormalParameters0IteratorBindingInitialization0" (this, iteratorRecord, environment) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
