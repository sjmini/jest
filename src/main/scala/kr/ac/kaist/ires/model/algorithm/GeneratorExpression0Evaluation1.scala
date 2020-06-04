package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorExpression0Evaluation1 {
  val length: Int = 0
  val func: Func = Func("""GeneratorExpression0Evaluation1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""GeneratorBody""")), None, ISeq(List(ILet(Id("""scope"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(40376), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""scope"""))))).setId(40378), ILet(Id("""funcEnv"""), ERef(RefId(Id("""__x0__""")))).setId(40379), ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""funcEnv""")), EStr("""EnvironmentRecord""")))).setId(40381), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(40383), ILet(Id("""name"""), ERef(RefId(Id("""__x1__""")))).setId(40384), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))), EBool(false))).setId(40386), IExpr(ERef(RefId(Id("""__x2__""")))).setId(40387), IApp(Id("""__x3__"""), ERef(RefId(Id("""GeneratorFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""GeneratorBody"""))), ERef(RefId(Id("""funcEnv"""))))).setId(40389), ILet(Id("""closure"""), ERef(RefId(Id("""__x3__""")))).setId(40390), IApp(Id("""__x4__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_GeneratorPrototype"""))))).setId(40392), ILet(Id("""prototype"""), ERef(RefId(Id("""__x4__""")))).setId(40393), IApp(Id("""__x5__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""closure"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(40395), IExpr(ERef(RefId(Id("""__x5__""")))).setId(40396), IApp(Id("""__x6__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""name"""))))).setId(40398), IExpr(ERef(RefId(Id("""__x6__""")))).setId(40399), IApp(Id("""__x7__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))), ERef(RefId(Id("""closure"""))))).setId(40401), IExpr(ERef(RefId(Id("""__x7__""")))).setId(40402), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(40404), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(40406), IReturn(ERef(RefId(Id("""__x8__""")))).setId(40407))).setId(-1))
  /* Beautified form:
  "GeneratorExpression0Evaluation1" (this, BindingIdentifier, FormalParameters, GeneratorBody) => {
    let scope = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment scope)
    let funcEnv = __x0__
    let envRec = funcEnv["EnvironmentRecord"]
    access __x1__ = (BindingIdentifier "StringValue")
    let name = __x1__
    app __x2__ = (envRec["CreateImmutableBinding"] envRec name false)
    __x2__
    app __x3__ = (GeneratorFunctionCreate CONST_Normal FormalParameters GeneratorBody funcEnv)
    let closure = __x3__
    app __x4__ = (ObjectCreate INTRINSIC_GeneratorPrototype)
    let prototype = __x4__
    app __x5__ = (DefinePropertyOrThrow closure "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    __x5__
    app __x6__ = (SetFunctionName closure name)
    __x6__
    app __x7__ = (envRec["InitializeBinding"] envRec name closure)
    __x7__
    closure["SourceText"] = (get-syntax this)
    app __x8__ = (WrapCompletion closure)
    return __x8__
  }
  */
}
