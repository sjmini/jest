package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTencodeURI {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.encodeURI""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(63518), ILet(Id("""uri"""), ERef(RefId(Id("""__x0__""")))).setId(63519), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""uri"""))))).setId(63521), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(63522), IReturn(ERef(RefId(Id("""__x1__""")))).setId(63523)).setId(63524), ISeq(List()).setId(63525)).setId(63526), ILet(Id("""uriString"""), ERef(RefId(Id("""__x1__""")))).setId(63527), IExpr(ENotSupported("""Etc""")).setId(63529), IApp(Id("""__x2__"""), ERef(RefId(Id("""Encode"""))), List(ERef(RefId(Id("""uriString"""))), ERef(RefId(Id("""unescapedURISet"""))))).setId(63530), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(63531), IReturn(ERef(RefId(Id("""__x2__""")))).setId(63532)).setId(63533), ISeq(List()).setId(63525)).setId(63534), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(63535), IReturn(ERef(RefId(Id("""__x3__""")))).setId(63536))).setId(-1))
  /* Beautified form:
  "GLOBAL.encodeURI" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let uri = __x0__
    app __x1__ = (ToString uri)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let uriString = __x1__
    !!! "Etc"
    app __x2__ = (Encode uriString unescapedURISet)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
