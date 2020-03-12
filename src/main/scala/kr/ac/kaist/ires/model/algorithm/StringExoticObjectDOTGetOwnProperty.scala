package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StringExoticObjectDOTGetOwnProperty {
  val length: Int = 1
  val func: Func = Func("""StringExoticObject.GetOwnProperty""", List(Id("""S"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryGetOwnProperty"""))), List(ERef(RefId(Id("""S"""))), ERef(RefId(Id("""P"""))))).setId(54905), ILet(Id("""desc"""), ERef(RefId(Id("""__x0__""")))).setId(54906), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""desc"""))))).setId(54908), IReturn(ERef(RefId(Id("""__x1__""")))).setId(54909))).setId(54926), ISeq(List()).setId(54927)).setId(54911), IApp(Id("""__x2__"""), ERef(RefId(Id("""StringGetOwnProperty"""))), List(ERef(RefId(Id("""S"""))), ERef(RefId(Id("""P"""))))).setId(54913), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(54914), IReturn(ERef(RefId(Id("""__x2__""")))).setId(54915)).setId(54916), ISeq(List()).setId(54933)).setId(54917), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(54918), IReturn(ERef(RefId(Id("""__x3__""")))).setId(54919))).setId(54937))
  val instToStepMap: Map[Int, Int] = HashMap(54906 -> 1, 54919 -> 4, 54911 -> 3, 54907 -> 1, 54908 -> 2, 54918 -> 4, 54912 -> 3, 54905 -> 1, 54904 -> 0, 54917 -> 4, 54920 -> 4, 54910 -> 2, 54909 -> 2, 54913 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(54904), 1 -> HashSet(54906, 54907, 54905), 2 -> HashSet(54910, 54908, 54909), 3 -> HashSet(54911, 54912), 4 -> HashSet(54920, 54919, 54918, 54913, 54917))
  /* Beautified form:
  "StringExoticObject.GetOwnProperty" (S, P) => {
    app __x0__ = (OrdinaryGetOwnProperty S P)
    let desc = __x0__
    if (! (= desc undefined)) {
      app __x1__ = (WrapCompletion desc)
      return __x1__
    } else {}
    app __x2__ = (StringGetOwnProperty S P)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
