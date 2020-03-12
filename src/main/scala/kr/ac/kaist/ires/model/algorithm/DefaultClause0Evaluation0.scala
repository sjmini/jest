package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DefaultClause0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""DefaultClause0Evaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(36115), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(36116), IReturn(ERef(RefId(Id("""__x1__""")))).setId(36117))).setId(36123))
  val instToStepMap: Map[Int, Int] = Map(36115 -> 0, 36116 -> 0, 36117 -> 0, 36118 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36115, 36116, 36117, 36118))
  /* Beautified form:
  "DefaultClause0Evaluation0" (this) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
