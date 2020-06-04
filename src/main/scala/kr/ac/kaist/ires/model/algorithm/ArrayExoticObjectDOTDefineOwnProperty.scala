package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayExoticObjectDOTDefineOwnProperty {
  val length: Int = 2
  val func: Func = Func("""ArrayExoticObject.DefineOwnProperty""", List(Id("""A"""), Id("""P"""), Id("""Desc""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""P"""))), EStr("""length""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ArraySetLength"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""Desc"""))))).setId(53975), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(53976), IReturn(ERef(RefId(Id("""__x0__""")))).setId(53977)).setId(53978), ISeq(List()).setId(53974)).setId(53979), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(53980), IReturn(ERef(RefId(Id("""__x1__""")))).setId(53981))).setId(53983), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IsArrayIndex"""))), List(ERef(RefId(Id("""P"""))))).setId(53984), IIf(ERef(RefId(Id("""__x2__"""))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""OrdinaryGetOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""))).setId(53985), ILet(Id("""oldLenDesc"""), ERef(RefId(Id("""__x3__""")))).setId(53986), ILet(Id("""oldLen"""), ERef(RefProp(RefId(Id("""oldLenDesc""")), EStr("""Value""")))).setId(53988), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""P"""))))).setId(53990), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(53991), IReturn(ERef(RefId(Id("""__x4__""")))).setId(53992)).setId(53993), ISeq(List()).setId(53974)).setId(53994), ILet(Id("""index"""), ERef(RefId(Id("""__x4__""")))).setId(53995), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""oldLen"""))))), EBOp(OEq, ERef(RefProp(RefId(Id("""oldLenDesc""")), EStr("""Writable"""))), EBool(false))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(53997), IReturn(ERef(RefId(Id("""__x5__""")))).setId(53998))).setId(53999), ISeq(List()).setId(53974)).setId(54000), IApp(Id("""__x6__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Desc"""))))).setId(54002), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(54003), IReturn(ERef(RefId(Id("""__x6__""")))).setId(54004)).setId(54005), ISeq(List()).setId(53974)).setId(54006), ILet(Id("""succeeded"""), ERef(RefId(Id("""__x6__""")))).setId(54007), IIf(EBOp(OEq, ERef(RefId(Id("""succeeded"""))), EBool(false)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(54009), IReturn(ERef(RefId(Id("""__x7__""")))).setId(54010))).setId(54011), ISeq(List()).setId(53974)).setId(54012), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""oldLen"""))))), ISeq(List(IAssign(RefProp(RefId(Id("""oldLenDesc""")), EStr("""Value""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))).setId(54014), IApp(Id("""__x8__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""oldLenDesc"""))))).setId(54016), ILet(Id("""succeeded"""), ERef(RefId(Id("""__x8__""")))).setId(54017))).setId(54019), ISeq(List()).setId(53974)).setId(54020), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(54022), IReturn(ERef(RefId(Id("""__x9__""")))).setId(54023))).setId(54025), ISeq(List()).setId(53974)).setId(54026))).setId(54027)).setId(54028), IApp(Id("""__x10__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Desc"""))))).setId(54030), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(54031), IReturn(ERef(RefId(Id("""__x11__""")))).setId(54032))).setId(-1))
  /* Beautified form:
  "ArrayExoticObject.DefineOwnProperty" (A, P, Desc) => {
    if (= P "length") {
      app __x0__ = (ArraySetLength A Desc)
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      app __x1__ = (WrapCompletion __x0__)
      return __x1__
    } else {
      app __x2__ = (IsArrayIndex P)
      if __x2__ {
        app __x3__ = (OrdinaryGetOwnProperty A "length")
        let oldLenDesc = __x3__
        let oldLen = oldLenDesc["Value"]
        app __x4__ = (ToUint32 P)
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        let index = __x4__
        if (&& (! (< index oldLen)) (= oldLenDesc["Writable"] false)) {
          app __x5__ = (WrapCompletion false)
          return __x5__
        } else {}
        app __x6__ = (OrdinaryDefineOwnProperty A P Desc)
        if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        let succeeded = __x6__
        if (= succeeded false) {
          app __x7__ = (WrapCompletion false)
          return __x7__
        } else {}
        if (! (< index oldLen)) {
          oldLenDesc["Value"] = (+ index 1i)
          app __x8__ = (OrdinaryDefineOwnProperty A "length" oldLenDesc)
          let succeeded = __x8__
        } else {}
        app __x9__ = (WrapCompletion true)
        return __x9__
      } else {}
    }
    app __x10__ = (OrdinaryDefineOwnProperty A P Desc)
    app __x11__ = (WrapCompletion __x10__)
    return __x11__
  }
  */
}
