package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseResolve {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.PromiseResolve""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(92803), ILet(Id("""C"""), ERef(RefId(Id("""__x0__""")))).setId(92804), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(92806), ILet(Id("""x"""), ERef(RefId(Id("""__x1__""")))).setId(92807), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsPromise"""))), List(ERef(RefId(Id("""x"""))))).setId(92810), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""x"""))), EStr("""constructor"""))).setId(92811), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(92812), IReturn(ERef(RefId(Id("""__x3__""")))).setId(92813)).setId(92814), ISeq(List()).setId(92809)).setId(92815), ILet(Id("""xConstructor"""), ERef(RefId(Id("""__x3__""")))).setId(92816), IApp(Id("""__x4__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""xConstructor"""))), ERef(RefId(Id("""C"""))))).setId(92818), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""x"""))))).setId(92819), IReturn(ERef(RefId(Id("""__x5__""")))).setId(92820))).setId(92821), ISeq(List()).setId(92809)).setId(92822))).setId(92824), ISeq(List()).setId(92809)).setId(92825), IApp(Id("""__x6__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""C"""))))).setId(92827), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(92828), IReturn(ERef(RefId(Id("""__x6__""")))).setId(92829)).setId(92830), ISeq(List()).setId(92809)).setId(92831), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x6__""")))).setId(92832), IApp(Id("""__x7__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefId(Id("""x"""))))))).setId(92834), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(92835), IReturn(ERef(RefId(Id("""__x7__""")))).setId(92836)).setId(92837), ISeq(List()).setId(92809)).setId(92838), IExpr(ERef(RefId(Id("""__x7__""")))).setId(92839), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(92841), IReturn(ERef(RefId(Id("""__x8__""")))).setId(92842))).setId(-1))
  /* Beautified form:
  "GLOBAL.PromiseResolve" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let C = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let x = __x1__
    app __x2__ = (IsPromise x)
    if (= __x2__ true) {
      app __x3__ = (Get x "constructor")
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let xConstructor = __x3__
      app __x4__ = (SameValue xConstructor C)
      if (= __x4__ true) {
        app __x5__ = (WrapCompletion x)
        return __x5__
      } else {}
    } else {}
    app __x6__ = (NewPromiseCapability C)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let promiseCapability = __x6__
    app __x7__ = (Call promiseCapability["Resolve"] undefined (new [x]))
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    __x7__
    app __x8__ = (WrapCompletion promiseCapability["Promise"])
    return __x8__
  }
  */
}
