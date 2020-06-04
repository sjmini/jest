package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StringGetOwnProperty {
  val length: Int = 2
  val func: Func = Func("""StringGetOwnProperty""", List(Id("""S"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))).setId(55237), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(55238), IReturn(ERef(RefId(Id("""__x1__""")))).setId(55239))).setId(55240), ISeq(List()).setId(55236)).setId(55241), IApp(Id("""__x2__"""), ERef(RefId(Id("""CanonicalNumericIndexString"""))), List(ERef(RefId(Id("""P"""))))).setId(55243), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(55244), IReturn(ERef(RefId(Id("""__x2__""")))).setId(55245)).setId(55246), ISeq(List()).setId(55236)).setId(55247), ILet(Id("""index"""), ERef(RefId(Id("""__x2__""")))).setId(55248), IIf(EBOp(OEq, ERef(RefId(Id("""index"""))), EUndef), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(55250), IReturn(ERef(RefId(Id("""__x3__""")))).setId(55251))).setId(55252), ISeq(List()).setId(55236)).setId(55253), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""index"""))))).setId(55255), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(55256), IReturn(ERef(RefId(Id("""__x5__""")))).setId(55257))).setId(55258), ISeq(List()).setId(55236)).setId(55259), IIf(EBOp(OEq, ERef(RefId(Id("""index"""))), ENum(-0.0)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(55261), IReturn(ERef(RefId(Id("""__x6__""")))).setId(55262))).setId(55263), ISeq(List()).setId(55236)).setId(55264), ILet(Id("""str"""), ERef(RefProp(RefId(Id("""S""")), EStr("""StringData""")))).setId(55266), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""str""")), EStr("""length""")))).setId(55268), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""index"""))), EINum(0L)), EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""len""")))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(55270), IReturn(ERef(RefId(Id("""__x7__""")))).setId(55271))).setId(55272), ISeq(List()).setId(55236)).setId(55273), ILet(Id("""resultStr"""), ERef(RefProp(RefId(Id("""str""")), ERef(RefId(Id("""index""")))))).setId(55275), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""resultStr""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(true)), (EStr("""Configurable"""), EBool(false)))))).setId(55277), IReturn(ERef(RefId(Id("""__x8__""")))).setId(55278))).setId(-1))
  /* Beautified form:
  "StringGetOwnProperty" (S, P) => {
    app __x0__ = (Type P)
    if (! (= __x0__ String)) {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    } else {}
    app __x2__ = (CanonicalNumericIndexString P)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let index = __x2__
    if (= index undefined) {
      app __x3__ = (WrapCompletion undefined)
      return __x3__
    } else {}
    app __x4__ = (IsInteger index)
    if (= __x4__ false) {
      app __x5__ = (WrapCompletion undefined)
      return __x5__
    } else {}
    if (= index -0.0) {
      app __x6__ = (WrapCompletion undefined)
      return __x6__
    } else {}
    let str = S["StringData"]
    let len = str["length"]
    if (|| (< index 0i) (! (< index len))) {
      app __x7__ = (WrapCompletion undefined)
      return __x7__
    } else {}
    let resultStr = str[index]
    app __x8__ = (WrapCompletion (new PropertyDescriptor("Value" -> resultStr, "Writable" -> false, "Enumerable" -> true, "Configurable" -> false)))
    return __x8__
  }
  */
}
