package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ReturnStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ReturnStatement0Evaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), EUndef), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))).setId(34027), IReturn(ERef(RefId(Id("""__x0__""")))).setId(34028))).setId(34033))
  val instToStepMap: Map[Int, Int] = Map(34027 -> 0, 34028 -> 0, 34029 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34029, 34028, 34027))
  /* Beautified form:
  "ReturnStatement0Evaluation0" (this) => {
    app __x0__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> undefined, "Target" -> CONST_empty)))
    return __x0__
  }
  */
}
