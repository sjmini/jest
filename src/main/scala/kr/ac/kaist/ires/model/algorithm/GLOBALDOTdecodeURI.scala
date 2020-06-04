package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTdecodeURI {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.decodeURI""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(63399), ILet(Id("""encodedURI"""), ERef(RefId(Id("""__x0__""")))).setId(63400), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""encodedURI"""))))).setId(63402), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(63403), IReturn(ERef(RefId(Id("""__x1__""")))).setId(63404)).setId(63405), ISeq(List()).setId(63406)).setId(63407), ILet(Id("""uriString"""), ERef(RefId(Id("""__x1__""")))).setId(63408), IExpr(ENotSupported("""Etc""")).setId(63410), IApp(Id("""__x2__"""), ERef(RefId(Id("""Decode"""))), List(ERef(RefId(Id("""uriString"""))), ERef(RefId(Id("""reservedURISet"""))))).setId(63411), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(63412), IReturn(ERef(RefId(Id("""__x2__""")))).setId(63413)).setId(63414), ISeq(List()).setId(63406)).setId(63415), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(63416), IReturn(ERef(RefId(Id("""__x3__""")))).setId(63417))).setId(-1))
  /* Beautified form:
  "GLOBAL.decodeURI" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let encodedURI = __x0__
    app __x1__ = (ToString encodedURI)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let uriString = __x1__
    !!! "Etc"
    app __x2__ = (Decode uriString reservedURISet)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
