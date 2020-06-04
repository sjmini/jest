package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorDeclaration0InstantiateFunctionObject0 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorDeclaration0InstantiateFunctionObject0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""AsyncGeneratorBody"""), Id("""scope""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(41590), ILet(Id("""name"""), ERef(RefId(Id("""__x0__""")))).setId(41591), IApp(Id("""__x1__"""), ERef(RefId(Id("""AsyncGeneratorFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""AsyncGeneratorBody"""))), ERef(RefId(Id("""scope"""))))).setId(41593), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(41594), IReturn(ERef(RefId(Id("""__x1__""")))).setId(41595)).setId(41596), ISeq(List()).setId(41597)).setId(41598), ILet(Id("""F"""), ERef(RefId(Id("""__x1__""")))).setId(41599), IApp(Id("""__x2__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_AsyncGeneratorPrototype"""))))).setId(41601), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(41602), IReturn(ERef(RefId(Id("""__x2__""")))).setId(41603)).setId(41604), ISeq(List()).setId(41597)).setId(41605), ILet(Id("""prototype"""), ERef(RefId(Id("""__x2__""")))).setId(41606), IApp(Id("""__x3__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(41608), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(41609), IReturn(ERef(RefId(Id("""__x3__""")))).setId(41610)).setId(41611), ISeq(List()).setId(41597)).setId(41612), IExpr(ERef(RefId(Id("""__x3__""")))).setId(41613), IApp(Id("""__x4__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""name"""))))).setId(41615), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(41616), IReturn(ERef(RefId(Id("""__x4__""")))).setId(41617)).setId(41618), ISeq(List()).setId(41597)).setId(41619), IExpr(ERef(RefId(Id("""__x4__""")))).setId(41620), IAssign(RefProp(RefId(Id("""F""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(41622), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(41624), IReturn(ERef(RefId(Id("""__x5__""")))).setId(41625))).setId(-1))
  /* Beautified form:
  "AsyncGeneratorDeclaration0InstantiateFunctionObject0" (this, BindingIdentifier, FormalParameters, AsyncGeneratorBody, scope) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let name = __x0__
    app __x1__ = (AsyncGeneratorFunctionCreate CONST_Normal FormalParameters AsyncGeneratorBody scope)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let F = __x1__
    app __x2__ = (ObjectCreate INTRINSIC_AsyncGeneratorPrototype)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let prototype = __x2__
    app __x3__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (SetFunctionName F name)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    __x4__
    F["SourceText"] = (get-syntax this)
    app __x5__ = (WrapCompletion F)
    return __x5__
  }
  */
}
