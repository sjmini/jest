package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionDeclaration0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionDeclaration0Evaluation0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(43859), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(43860), IReturn(ERef(RefId(Id("""__x1__""")))).setId(43861))).setId(43867))
  val instToStepMap: Map[Int, Int] = Map(43859 -> 0, 43860 -> 0, 43861 -> 0, 43862 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43859, 43862, 43860, 43861))
  /* Beautified form:
  "AsyncFunctionDeclaration0Evaluation0" (this, BindingIdentifier, FormalParameters, AsyncFunctionBody) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
