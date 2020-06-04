package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArgumentsExoticObjectDOTSet {
  val length: Int = 3
  val func: Func = Func("""ArgumentsExoticObject.Set""", List(Id("""args"""), Id("""P"""), Id("""V"""), Id("""Receiver""")), None, ISeq(List(ILet(Id("""args"""), ERef(RefId(Id("""args""")))).setId(55689), IApp(Id("""__x0__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""args"""))), ERef(RefId(Id("""Receiver"""))))).setId(55691), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false)), ILet(Id("""isMapped"""), EBool(false)).setId(55692), ISeq(List(ILet(Id("""map"""), ERef(RefProp(RefId(Id("""args""")), EStr("""ParameterMap""")))).setId(55695), IApp(Id("""__x1__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))).setId(55697), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(55698), IReturn(ERef(RefId(Id("""__x1__""")))).setId(55699)).setId(55700), ISeq(List()).setId(55701)).setId(55702), ILet(Id("""isMapped"""), ERef(RefId(Id("""__x1__""")))).setId(55703))).setId(55705)).setId(55706), IIf(EBOp(OEq, ERef(RefId(Id("""isMapped"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))), EBool(false))).setId(55708), ILet(Id("""setStatus"""), ERef(RefId(Id("""__x2__""")))).setId(55709))).setId(55711), ISeq(List()).setId(55701)).setId(55712), IApp(Id("""__x3__"""), ERef(RefId(Id("""OrdinarySet"""))), List(ERef(RefId(Id("""args"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))), ERef(RefId(Id("""Receiver"""))))).setId(55714), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(55715), IReturn(ERef(RefId(Id("""__x3__""")))).setId(55716)).setId(55717), ISeq(List()).setId(55701)).setId(55718), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(55719), IReturn(ERef(RefId(Id("""__x4__""")))).setId(55720))).setId(-1))
  /* Beautified form:
  "ArgumentsExoticObject.Set" (args, P, V, Receiver) => {
    let args = args
    app __x0__ = (SameValue args Receiver)
    if (= __x0__ false) let isMapped = false else {
      let map = args["ParameterMap"]
      app __x1__ = (HasOwnProperty map P)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let isMapped = __x1__
    }
    if (= isMapped true) {
      app __x2__ = (Set map P V false)
      let setStatus = __x2__
    } else {}
    app __x3__ = (OrdinarySet args P V Receiver)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
