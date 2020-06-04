package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PromiseResolve {
  val length: Int = 2
  val func: Func = Func("""PromiseResolve""", List(Id("""C"""), Id("""x""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsPromise"""))), List(ERef(RefId(Id("""x"""))))).setId(12655), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""x"""))), EStr("""constructor"""))).setId(12656), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(12657), IReturn(ERef(RefId(Id("""__x1__""")))).setId(12658)).setId(12659), ISeq(List()).setId(12654)).setId(12660), ILet(Id("""xConstructor"""), ERef(RefId(Id("""__x1__""")))).setId(12661), IApp(Id("""__x2__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""xConstructor"""))), ERef(RefId(Id("""C"""))))).setId(12663), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""x"""))))).setId(12664), IReturn(ERef(RefId(Id("""__x3__""")))).setId(12665))).setId(12666), ISeq(List()).setId(12654)).setId(12667))).setId(12669), ISeq(List()).setId(12654)).setId(12670), IApp(Id("""__x4__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""C"""))))).setId(12672), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(12673), IReturn(ERef(RefId(Id("""__x4__""")))).setId(12674)).setId(12675), ISeq(List()).setId(12654)).setId(12676), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x4__""")))).setId(12677), IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefId(Id("""x"""))))))).setId(12679), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(12680), IReturn(ERef(RefId(Id("""__x5__""")))).setId(12681)).setId(12682), ISeq(List()).setId(12654)).setId(12683), IExpr(ERef(RefId(Id("""__x5__""")))).setId(12684), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(12686), IReturn(ERef(RefId(Id("""__x6__""")))).setId(12687))).setId(-1))
  /* Beautified form:
  "PromiseResolve" (C, x) => {
    app __x0__ = (IsPromise x)
    if (= __x0__ true) {
      app __x1__ = (Get x "constructor")
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let xConstructor = __x1__
      app __x2__ = (SameValue xConstructor C)
      if (= __x2__ true) {
        app __x3__ = (WrapCompletion x)
        return __x3__
      } else {}
    } else {}
    app __x4__ = (NewPromiseCapability C)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let promiseCapability = __x4__
    app __x5__ = (Call promiseCapability["Resolve"] undefined (new [x]))
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    app __x6__ = (WrapCompletion promiseCapability["Promise"])
    return __x6__
  }
  */
}
