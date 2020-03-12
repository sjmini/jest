package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArgumentsExoticObjectDOTGet {
  val length: Int = 2
  val func: Func = Func("""ArgumentsExoticObject.Get""", List(Id("""args"""), Id("""P"""), Id("""Receiver""")), None, ISeq(List(ILet(Id("""args"""), ERef(RefId(Id("""args""")))).setId(55612), ILet(Id("""map"""), ERef(RefProp(RefId(Id("""args""")), EStr("""ParameterMap""")))).setId(55614), IApp(Id("""__x0__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))).setId(55616), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(55617), IReturn(ERef(RefId(Id("""__x0__""")))).setId(55618)).setId(55619), ISeq(List()).setId(55647)).setId(55621), ILet(Id("""isMapped"""), ERef(RefId(Id("""__x0__""")))).setId(55622), IIf(EBOp(OEq, ERef(RefId(Id("""isMapped"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryGet"""))), List(ERef(RefId(Id("""args"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Receiver"""))))).setId(55624), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(55625), IReturn(ERef(RefId(Id("""__x1__""")))).setId(55626)).setId(55627), ISeq(List()).setId(55654)).setId(55628), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(55629), IReturn(ERef(RefId(Id("""__x2__""")))).setId(55630))).setId(55658), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))).setId(55633), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(55634), IReturn(ERef(RefId(Id("""__x4__""")))).setId(55635))).setId(55662)).setId(55638))).setId(55664))
  val instToStepMap: Map[Int, Int] = HashMap(55612 -> 0, 55633 -> 9, 55636 -> 9, 55621 -> 2, 55631 -> 5, 55616 -> 2, 55613 -> 0, 55623 -> 2, 55638 -> 9, 55629 -> 5, 55622 -> 2, 55637 -> 9, 55630 -> 5, 55615 -> 1, 55624 -> 5, 55639 -> 9, 55632 -> 5, 55620 -> 9, 55635 -> 9, 55634 -> 9, 55614 -> 1, 55628 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(55612, 55613), 5 -> HashSet(55630, 55631, 55624, 55632, 55628, 55629), 1 -> HashSet(55615, 55614), 9 -> HashSet(55637, 55633, 55636, 55639, 55638, 55634, 55620, 55635), 2 -> HashSet(55622, 55621, 55616, 55623), 8 -> HashSet(55620))
  /* Beautified form:
  "ArgumentsExoticObject.Get" (args, P, Receiver) => {
    let args = args
    let map = args["ParameterMap"]
    app __x0__ = (HasOwnProperty map P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let isMapped = __x0__
    if (= isMapped false) {
      app __x1__ = (OrdinaryGet args P Receiver)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {
      app __x3__ = (Get map P)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    }
  }
  */
}
