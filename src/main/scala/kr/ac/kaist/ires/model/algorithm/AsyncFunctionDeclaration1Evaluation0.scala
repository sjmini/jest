package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionDeclaration1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionDeclaration1Evaluation0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(43872), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(43873), IReturn(ERef(RefId(Id("""__x1__""")))).setId(43874))).setId(43880))
  val instToStepMap: Map[Int, Int] = Map(43872 -> 0, 43873 -> 0, 43874 -> 0, 43875 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43873, 43875, 43872, 43874))
  /* Beautified form:
  "AsyncFunctionDeclaration1Evaluation0" (this, FormalParameters, AsyncFunctionBody) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
