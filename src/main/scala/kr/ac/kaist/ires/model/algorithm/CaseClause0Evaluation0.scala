package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseClause0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0Evaluation0""", List(Id("""this"""), Id("""Expression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(36088), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(36089), IReturn(ERef(RefId(Id("""__x1__""")))).setId(36090))).setId(36096))
  val instToStepMap: Map[Int, Int] = Map(36088 -> 0, 36089 -> 0, 36090 -> 0, 36091 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36088, 36091, 36090, 36089))
  /* Beautified form:
  "CaseClause0Evaluation0" (this, Expression) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
