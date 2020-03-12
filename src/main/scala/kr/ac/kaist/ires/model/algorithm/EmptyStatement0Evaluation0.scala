package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EmptyStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""EmptyStatement0Evaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(30136), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(30137), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30138))).setId(30144))
  val instToStepMap: Map[Int, Int] = Map(30136 -> 0, 30137 -> 0, 30138 -> 0, 30139 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(30139, 30138, 30137, 30136))
  /* Beautified form:
  "EmptyStatement0Evaluation0" (this) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
