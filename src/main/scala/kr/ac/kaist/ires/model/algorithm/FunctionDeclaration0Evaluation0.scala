package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionDeclaration0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""FunctionDeclaration0Evaluation0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""FunctionBody""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(38521), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(38522), IReturn(ERef(RefId(Id("""__x1__""")))).setId(38523))).setId(38529))
  val instToStepMap: Map[Int, Int] = Map(38521 -> 0, 38522 -> 0, 38523 -> 0, 38524 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38521, 38524, 38523, 38522))
  /* Beautified form:
  "FunctionDeclaration0Evaluation0" (this, BindingIdentifier, FormalParameters, FunctionBody) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
