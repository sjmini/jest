package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceExoticObjectDOTGetOwnProperty {
  val length: Int = 1
  val func: Func = Func("""ModuleNamespaceExoticObject.GetOwnProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))).setId(57606), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Symbol""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryGetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(57607), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(57608), IReturn(ERef(RefId(Id("""__x2__""")))).setId(57609))).setId(57610), ISeq(List()).setId(57611)).setId(57612), ILet(Id("""exports"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Exports""")))).setId(57614), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""exports"""))), ERef(RefId(Id("""P"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(57616), IReturn(ERef(RefId(Id("""__x3__""")))).setId(57617))).setId(57618), ISeq(List()).setId(57611)).setId(57619), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""O"""))))).setId(57621), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(57622), IReturn(ERef(RefId(Id("""__x4__""")))).setId(57623)).setId(57624), ISeq(List()).setId(57611)).setId(57625), ILet(Id("""value"""), ERef(RefId(Id("""__x4__""")))).setId(57626), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""value""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(true)), (EStr("""Configurable"""), EBool(false)))))).setId(57628), IReturn(ERef(RefId(Id("""__x5__""")))).setId(57629))).setId(-1))
  /* Beautified form:
  "ModuleNamespaceExoticObject.GetOwnProperty" (O, P) => {
    app __x0__ = (Type P)
    if (= __x0__ Symbol) {
      app __x1__ = (OrdinaryGetOwnProperty O P)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    let exports = O["Exports"]
    if (! (contains exports P)) {
      app __x3__ = (WrapCompletion undefined)
      return __x3__
    } else {}
    app __x4__ = (O["Get"] O P O)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let value = __x4__
    app __x5__ = (WrapCompletion (new PropertyDescriptor("Value" -> value, "Writable" -> true, "Enumerable" -> true, "Configurable" -> false)))
    return __x5__
  }
  */
}
