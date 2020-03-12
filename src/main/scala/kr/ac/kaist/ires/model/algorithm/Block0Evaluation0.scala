package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Block0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""Block0Evaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(26851), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(26852), IReturn(ERef(RefId(Id("""__x1__""")))).setId(26853))).setId(26859))
  val instToStepMap: Map[Int, Int] = Map(26851 -> 0, 26852 -> 0, 26853 -> 0, 26854 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26852, 26851, 26854, 26853))
  /* Beautified form:
  "Block0Evaluation0" (this) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
