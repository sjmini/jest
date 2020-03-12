package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Invoke {
  val length: Int = 2
  val func: Func = Func("""Invoke""", List(Id("""V"""), Id("""P"""), Id("""argumentsList""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""argumentsList"""))), EAbsent), IAssign(RefId(Id("""argumentsList""")), EList(List())).setId(6196), ISeq(List()).setId(6217)).setId(6198), IApp(Id("""__x0__"""), ERef(RefId(Id("""GetV"""))), List(ERef(RefId(Id("""V"""))), ERef(RefId(Id("""P"""))))).setId(6200), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(6201), IReturn(ERef(RefId(Id("""__x0__""")))).setId(6202)).setId(6203), ISeq(List()).setId(6223)).setId(6204), ILet(Id("""func"""), ERef(RefId(Id("""__x0__""")))).setId(6205), IApp(Id("""__x1__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""func"""))), ERef(RefId(Id("""V"""))), ERef(RefId(Id("""argumentsList"""))))).setId(6207), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(6208), IReturn(ERef(RefId(Id("""__x1__""")))).setId(6209)).setId(6210), ISeq(List()).setId(6230)).setId(6211), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(6212), IReturn(ERef(RefId(Id("""__x2__""")))).setId(6213))).setId(6234))
  val instToStepMap: Map[Int, Int] = HashMap(6204 -> 3, 6200 -> 3, 6195 -> 0, 6212 -> 4, 6206 -> 3, 6213 -> 4, 6198 -> 2, 6205 -> 3, 6199 -> 2, 6214 -> 4, 6207 -> 4, 6211 -> 4, 6197 -> 1, 6196 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(6195), 1 -> HashSet(6197, 6196), 2 -> HashSet(6199, 6198), 3 -> HashSet(6204, 6200, 6206, 6205), 4 -> HashSet(6214, 6212, 6213, 6207, 6211))
  /* Beautified form:
  "Invoke" (V, P, argumentsList) => {
    if (= argumentsList absent) argumentsList = (new []) else {}
    app __x0__ = (GetV V P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let func = __x0__
    app __x1__ = (Call func V argumentsList)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
