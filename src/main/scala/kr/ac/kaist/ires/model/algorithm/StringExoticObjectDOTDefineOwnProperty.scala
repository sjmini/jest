package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StringExoticObjectDOTDefineOwnProperty {
  val length: Int = 2
  val func: Func = Func("""StringExoticObject.DefineOwnProperty""", List(Id("""S"""), Id("""P"""), Id("""Desc""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""StringGetOwnProperty"""))), List(ERef(RefId(Id("""S"""))), ERef(RefId(Id("""P"""))))).setId(54955), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(54956), IReturn(ERef(RefId(Id("""__x0__""")))).setId(54957)).setId(54958), ISeq(List()).setId(54954)).setId(54959), ILet(Id("""stringDesc"""), ERef(RefId(Id("""__x0__""")))).setId(54960), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""stringDesc"""))), EUndef)), ISeq(List(ILet(Id("""extensible"""), ERef(RefProp(RefId(Id("""S""")), EStr("""Extensible""")))).setId(54962), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsCompatiblePropertyDescriptor"""))), List(ERef(RefId(Id("""extensible"""))), ERef(RefId(Id("""Desc"""))), ERef(RefId(Id("""stringDesc"""))))).setId(54964), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(54965), IReturn(ERef(RefId(Id("""__x1__""")))).setId(54966)).setId(54967), ISeq(List()).setId(54954)).setId(54968), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(54969), IReturn(ERef(RefId(Id("""__x2__""")))).setId(54970))).setId(54972), ISeq(List()).setId(54954)).setId(54973), IApp(Id("""__x3__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""S"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Desc"""))))).setId(54975), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(54976), IReturn(ERef(RefId(Id("""__x3__""")))).setId(54977)).setId(54978), ISeq(List()).setId(54954)).setId(54979), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(54980), IReturn(ERef(RefId(Id("""__x4__""")))).setId(54981))).setId(-1))
  /* Beautified form:
  "StringExoticObject.DefineOwnProperty" (S, P, Desc) => {
    app __x0__ = (StringGetOwnProperty S P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let stringDesc = __x0__
    if (! (= stringDesc undefined)) {
      let extensible = S["Extensible"]
      app __x1__ = (IsCompatiblePropertyDescriptor extensible Desc stringDesc)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    app __x3__ = (OrdinaryDefineOwnProperty S P Desc)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
