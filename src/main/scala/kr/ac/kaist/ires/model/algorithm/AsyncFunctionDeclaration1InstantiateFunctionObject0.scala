package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncFunctionDeclaration1InstantiateFunctionObject0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionDeclaration1InstantiateFunctionObject0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody"""), Id("""scope""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""AsyncFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""AsyncFunctionBody"""))), ERef(RefId(Id("""scope"""))))).setId(43551), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(43552), IReturn(ERef(RefId(Id("""__x0__""")))).setId(43553)).setId(43554), ISeq(List()).setId(43555)).setId(43556), ILet(Id("""F"""), ERef(RefId(Id("""__x0__""")))).setId(43557), IApp(Id("""__x1__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""F"""))), EStr("""default"""))).setId(43559), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(43560), IReturn(ERef(RefId(Id("""__x1__""")))).setId(43561)).setId(43562), ISeq(List()).setId(43555)).setId(43563), IExpr(ERef(RefId(Id("""__x1__""")))).setId(43564), IAssign(RefProp(RefId(Id("""F""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(43566), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(43568), IReturn(ERef(RefId(Id("""__x2__""")))).setId(43569))).setId(-1))
  /* Beautified form:
  "AsyncFunctionDeclaration1InstantiateFunctionObject0" (this, FormalParameters, AsyncFunctionBody, scope) => {
    app __x0__ = (AsyncFunctionCreate CONST_Normal FormalParameters AsyncFunctionBody scope)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let F = __x0__
    app __x1__ = (SetFunctionName F "default")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    F["SourceText"] = (get-syntax this)
    app __x2__ = (WrapCompletion F)
    return __x2__
  }
  */
}
