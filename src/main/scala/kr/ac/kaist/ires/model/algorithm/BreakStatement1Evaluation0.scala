package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BreakStatement1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""BreakStatement1Evaluation0""", List(Id("""this"""), Id("""LabelIdentifier""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelIdentifier"""))), EStr("""StringValue""")).setId(34010), ILet(Id("""label"""), ERef(RefId(Id("""__x0__""")))).setId(34011), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_break""")))), (EStr("""Value"""), ERef(RefId(Id("""CONST_empty""")))), (EStr("""Target"""), ERef(RefId(Id("""label""")))))))).setId(34013), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34014))).setId(34021))
  val instToStepMap: Map[Int, Int] = HashMap(34013 -> 1, 34012 -> 0, 34011 -> 0, 34010 -> 0, 34015 -> 1, 34014 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34012, 34011, 34010), 1 -> HashSet(34013, 34015, 34014))
  /* Beautified form:
  "BreakStatement1Evaluation0" (this, LabelIdentifier) => {
    access __x0__ = (LabelIdentifier "StringValue")
    let label = __x0__
    app __x1__ = (WrapCompletion (new Completion("Type" -> CONST_break, "Value" -> CONST_empty, "Target" -> label)))
    return __x1__
  }
  */
}
