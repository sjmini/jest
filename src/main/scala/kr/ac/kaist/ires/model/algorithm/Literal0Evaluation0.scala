package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Literal0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""Literal0Evaluation0""", List(Id("""this"""), Id("""NullLiteral""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENull)).setId(13699), IReturn(ERef(RefId(Id("""__x0__""")))).setId(13700))).setId(13705))
  val instToStepMap: Map[Int, Int] = Map(13699 -> 0, 13700 -> 0, 13701 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13700, 13699, 13701))
  /* Beautified form:
  "Literal0Evaluation0" (this, NullLiteral) => {
    app __x0__ = (WrapCompletion null)
    return __x0__
  }
  */
}
