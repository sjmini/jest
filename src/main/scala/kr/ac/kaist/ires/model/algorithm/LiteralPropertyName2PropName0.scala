package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LiteralPropertyName2PropName0 {
  val length: Int = 0
  val func: Func = Func("""LiteralPropertyName2PropName0""", List(Id("""this"""), Id("""NumericLiteral""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""NumericLiteral"""))), EStr("""MV""")).setId(14505), ILet(Id("""nbr"""), ERef(RefId(Id("""__x0__""")))).setId(14506), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""nbr"""))))).setId(14508), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(14509), IReturn(ERef(RefId(Id("""__x1__""")))).setId(14510)).setId(14511), ISeq(List()).setId(14523)).setId(14513), IReturn(ERef(RefId(Id("""__x1__""")))).setId(14514))).setId(14526))
  val instToStepMap: Map[Int, Int] = HashMap(14506 -> 0, 14515 -> 1, 14505 -> 0, 14508 -> 1, 14513 -> 1, 14507 -> 0, 14514 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14506, 14505, 14507), 1 -> HashSet(14515, 14508, 14513, 14514))
  /* Beautified form:
  "LiteralPropertyName2PropName0" (this, NumericLiteral) => {
    access __x0__ = (NumericLiteral "MV")
    let nbr = __x0__
    app __x1__ = (ToString nbr)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    return __x1__
  }
  */
}
