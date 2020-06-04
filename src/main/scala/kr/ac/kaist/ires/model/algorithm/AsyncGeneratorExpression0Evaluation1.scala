package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorExpression0Evaluation1 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorExpression0Evaluation1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""AsyncGeneratorBody""")), None, ISeq(List(ILet(Id("""scope"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(42019), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""scope"""))))).setId(42021), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(42022), IReturn(ERef(RefId(Id("""__x0__""")))).setId(42023)).setId(42024), ISeq(List()).setId(42025)).setId(42026), ILet(Id("""funcEnv"""), ERef(RefId(Id("""__x0__""")))).setId(42027), ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""funcEnv""")), EStr("""EnvironmentRecord""")))).setId(42029), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(42031), ILet(Id("""name"""), ERef(RefId(Id("""__x1__""")))).setId(42032), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))))).setId(42034), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(42035), IReturn(ERef(RefId(Id("""__x2__""")))).setId(42036)).setId(42037), ISeq(List()).setId(42025)).setId(42038), IExpr(ERef(RefId(Id("""__x2__""")))).setId(42039), IApp(Id("""__x3__"""), ERef(RefId(Id("""AsyncGeneratorFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""AsyncGeneratorBody"""))), ERef(RefId(Id("""funcEnv"""))))).setId(42041), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(42042), IReturn(ERef(RefId(Id("""__x3__""")))).setId(42043)).setId(42044), ISeq(List()).setId(42025)).setId(42045), ILet(Id("""closure"""), ERef(RefId(Id("""__x3__""")))).setId(42046), IApp(Id("""__x4__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_AsyncGeneratorPrototype"""))))).setId(42048), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(42049), IReturn(ERef(RefId(Id("""__x4__""")))).setId(42050)).setId(42051), ISeq(List()).setId(42025)).setId(42052), ILet(Id("""prototype"""), ERef(RefId(Id("""__x4__""")))).setId(42053), IApp(Id("""__x5__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""closure"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(42055), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(42056), IReturn(ERef(RefId(Id("""__x5__""")))).setId(42057)).setId(42058), ISeq(List()).setId(42025)).setId(42059), IExpr(ERef(RefId(Id("""__x5__""")))).setId(42060), IApp(Id("""__x6__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""name"""))))).setId(42062), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(42063), IReturn(ERef(RefId(Id("""__x6__""")))).setId(42064)).setId(42065), ISeq(List()).setId(42025)).setId(42066), IExpr(ERef(RefId(Id("""__x6__""")))).setId(42067), IApp(Id("""__x7__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))), ERef(RefId(Id("""closure"""))))).setId(42069), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(42070), IReturn(ERef(RefId(Id("""__x7__""")))).setId(42071)).setId(42072), ISeq(List()).setId(42025)).setId(42073), IExpr(ERef(RefId(Id("""__x7__""")))).setId(42074), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(42076), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(42078), IReturn(ERef(RefId(Id("""__x8__""")))).setId(42079))).setId(-1))
  /* Beautified form:
  "AsyncGeneratorExpression0Evaluation1" (this, BindingIdentifier, FormalParameters, AsyncGeneratorBody) => {
    let scope = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment scope)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let funcEnv = __x0__
    let envRec = funcEnv["EnvironmentRecord"]
    access __x1__ = (BindingIdentifier "StringValue")
    let name = __x1__
    app __x2__ = (envRec["CreateImmutableBinding"] envRec name)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (AsyncGeneratorFunctionCreate CONST_Normal FormalParameters AsyncGeneratorBody funcEnv)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let closure = __x3__
    app __x4__ = (ObjectCreate INTRINSIC_AsyncGeneratorPrototype)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let prototype = __x4__
    app __x5__ = (DefinePropertyOrThrow closure "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    app __x6__ = (SetFunctionName closure name)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    __x6__
    app __x7__ = (envRec["InitializeBinding"] envRec name closure)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    __x7__
    closure["SourceText"] = (get-syntax this)
    app __x8__ = (WrapCompletion closure)
    return __x8__
  }
  */
}
