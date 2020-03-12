package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BreakStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""BreakStatement0Evaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_break""")))), (EStr("""Value"""), ERef(RefId(Id("""CONST_empty""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))).setId(34000), IReturn(ERef(RefId(Id("""__x0__""")))).setId(34001))).setId(34006))
  val instToStepMap: Map[Int, Int] = Map(34000 -> 0, 34001 -> 0, 34002 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34000, 34001, 34002))
  /* Beautified form:
  "BreakStatement0Evaluation0" (this) => {
    app __x0__ = (WrapCompletion (new Completion("Type" -> CONST_break, "Value" -> CONST_empty, "Target" -> CONST_empty)))
    return __x0__
  }
  */
}
