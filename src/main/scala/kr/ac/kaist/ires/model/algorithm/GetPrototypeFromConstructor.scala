package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetPrototypeFromConstructor {
  val length: Int = 2
  val func: Func = Func("""GetPrototypeFromConstructor""", List(Id("""constructor"""), Id("""intrinsicDefaultProto""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""constructor"""))), EStr("""prototype"""))).setId(51218), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(51219), IReturn(ERef(RefId(Id("""__x0__""")))).setId(51220)).setId(51221), ISeq(List()).setId(51217)).setId(51222), ILet(Id("""proto"""), ERef(RefId(Id("""__x0__""")))).setId(51223), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""proto"""))))).setId(51225), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""GetFunctionRealm"""))), List(ERef(RefId(Id("""constructor"""))))).setId(51226), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(51227), IReturn(ERef(RefId(Id("""__x2__""")))).setId(51228)).setId(51229), ISeq(List()).setId(51217)).setId(51230), ILet(Id("""realm"""), ERef(RefId(Id("""__x2__""")))).setId(51231), IExpr(ENotSupported("""Etc""")).setId(51233))).setId(51234), ISeq(List()).setId(51217)).setId(51235), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""proto"""))))).setId(51237), IReturn(ERef(RefId(Id("""__x3__""")))).setId(51238))).setId(-1))
  /* Beautified form:
  "GetPrototypeFromConstructor" (constructor, intrinsicDefaultProto) => {
    app __x0__ = (Get constructor "prototype")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let proto = __x0__
    app __x1__ = (Type proto)
    if (! (= __x1__ Object)) {
      app __x2__ = (GetFunctionRealm constructor)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let realm = __x2__
      !!! "Etc"
    } else {}
    app __x3__ = (WrapCompletion proto)
    return __x3__
  }
  */
}
