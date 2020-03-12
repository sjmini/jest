package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LiteralPropertyName2Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""LiteralPropertyName2Evaluation0""", List(Id("""this"""), Id("""NumericLiteral""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""NumericLiteral"""))), EStr("""MV""")).setId(14724), ILet(Id("""nbr"""), ERef(RefId(Id("""__x0__""")))).setId(14725), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""nbr"""))))).setId(14727), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(14728), IReturn(ERef(RefId(Id("""__x1__""")))).setId(14729)).setId(14730), ISeq(List()).setId(14743)).setId(14732), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(14733), IReturn(ERef(RefId(Id("""__x2__""")))).setId(14734))).setId(14747))
  val instToStepMap: Map[Int, Int] = HashMap(14726 -> 0, 14733 -> 1, 14735 -> 1, 14725 -> 0, 14734 -> 1, 14724 -> 0, 14732 -> 1, 14727 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14726, 14725, 14724), 1 -> HashSet(14733, 14735, 14734, 14732, 14727))
  /* Beautified form:
  "LiteralPropertyName2Evaluation0" (this, NumericLiteral) => {
    access __x0__ = (NumericLiteral "MV")
    let nbr = __x0__
    app __x1__ = (ToString nbr)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
