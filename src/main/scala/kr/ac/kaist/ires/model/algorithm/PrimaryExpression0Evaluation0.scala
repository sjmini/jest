package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression0Evaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ResolveThisBinding"""))), List()).setId(13671), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(13672), IReturn(ERef(RefId(Id("""__x0__""")))).setId(13673)).setId(13674), ISeq(List()).setId(13685)).setId(13676), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(13677), IReturn(ERef(RefId(Id("""__x1__""")))).setId(13678))).setId(13689))
  val instToStepMap: Map[Int, Int] = HashMap(13679 -> 0, 13671 -> 0, 13676 -> 0, 13677 -> 0, 13678 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13679, 13671, 13676, 13677, 13678))
  /* Beautified form:
  "PrimaryExpression0Evaluation0" (this) => {
    app __x0__ = (ResolveThisBinding )
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
