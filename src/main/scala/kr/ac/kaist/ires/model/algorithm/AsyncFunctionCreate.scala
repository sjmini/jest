package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncFunctionCreate {
  val length: Int = 4
  val func: Func = Func("""AsyncFunctionCreate""", List(Id("""kind"""), Id("""parameters"""), Id("""body"""), Id("""Scope""")), None, ISeq(List(ILet(Id("""functionPrototype"""), ERef(RefId(Id("""INTRINSIC_AsyncFunctionPrototype""")))).setId(52225), IApp(Id("""__x0__"""), ERef(RefId(Id("""FunctionAllocate"""))), List(ERef(RefId(Id("""functionPrototype"""))), EStr("""async"""))).setId(52227), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(52228), IReturn(ERef(RefId(Id("""__x0__""")))).setId(52229)).setId(52230), ISeq(List()).setId(52231)).setId(52232), ILet(Id("""F"""), ERef(RefId(Id("""__x0__""")))).setId(52233), IApp(Id("""__x1__"""), ERef(RefId(Id("""FunctionInitialize"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""kind"""))), ERef(RefId(Id("""parameters"""))), ERef(RefId(Id("""body"""))), ERef(RefId(Id("""Scope"""))))).setId(52235), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(52236), IReturn(ERef(RefId(Id("""__x1__""")))).setId(52237)).setId(52238), ISeq(List()).setId(52231)).setId(52239), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(52240), IReturn(ERef(RefId(Id("""__x2__""")))).setId(52241))).setId(-1))
  /* Beautified form:
  "AsyncFunctionCreate" (kind, parameters, body, Scope) => {
    let functionPrototype = INTRINSIC_AsyncFunctionPrototype
    app __x0__ = (FunctionAllocate functionPrototype "async")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let F = __x0__
    app __x1__ = (FunctionInitialize F kind parameters body Scope)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
