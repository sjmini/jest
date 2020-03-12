package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionDeclaration1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""FunctionDeclaration1Evaluation0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""FunctionBody""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(38534), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(38535), IReturn(ERef(RefId(Id("""__x1__""")))).setId(38536))).setId(38542))
  val instToStepMap: Map[Int, Int] = Map(38534 -> 0, 38535 -> 0, 38536 -> 0, 38537 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38535, 38536, 38534, 38537))
  /* Beautified form:
  "FunctionDeclaration1Evaluation0" (this, FormalParameters, FunctionBody) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
