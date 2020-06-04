package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionExpression0Evaluation1 {
  val length: Int = 0
  val func: Func = Func("""FunctionExpression0Evaluation1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""FunctionBody""")), None, ISeq(List(ILet(Id("""scope"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(38582), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""scope"""))))).setId(38584), ILet(Id("""funcEnv"""), ERef(RefId(Id("""__x0__""")))).setId(38585), ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""funcEnv""")), EStr("""EnvironmentRecord""")))).setId(38587), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(38589), ILet(Id("""name"""), ERef(RefId(Id("""__x1__""")))).setId(38590), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))), EBool(false))).setId(38592), IExpr(ERef(RefId(Id("""__x2__""")))).setId(38593), IApp(Id("""__x3__"""), ERef(RefId(Id("""FunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""FunctionBody"""))), ERef(RefId(Id("""funcEnv"""))))).setId(38595), ILet(Id("""closure"""), ERef(RefId(Id("""__x3__""")))).setId(38596), IApp(Id("""__x4__"""), ERef(RefId(Id("""MakeConstructor"""))), List(ERef(RefId(Id("""closure"""))))).setId(38598), IExpr(ERef(RefId(Id("""__x4__""")))).setId(38599), IApp(Id("""__x5__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""name"""))))).setId(38601), IExpr(ERef(RefId(Id("""__x5__""")))).setId(38602), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(38604), IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))), ERef(RefId(Id("""closure"""))))).setId(38606), IExpr(ERef(RefId(Id("""__x6__""")))).setId(38607), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(38609), IReturn(ERef(RefId(Id("""__x7__""")))).setId(38610))).setId(-1))
  /* Beautified form:
  "FunctionExpression0Evaluation1" (this, BindingIdentifier, FormalParameters, FunctionBody) => {
    let scope = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment scope)
    let funcEnv = __x0__
    let envRec = funcEnv["EnvironmentRecord"]
    access __x1__ = (BindingIdentifier "StringValue")
    let name = __x1__
    app __x2__ = (envRec["CreateImmutableBinding"] envRec name false)
    __x2__
    app __x3__ = (FunctionCreate CONST_Normal FormalParameters FunctionBody funcEnv)
    let closure = __x3__
    app __x4__ = (MakeConstructor closure)
    __x4__
    app __x5__ = (SetFunctionName closure name)
    __x5__
    closure["SourceText"] = (get-syntax this)
    app __x6__ = (envRec["InitializeBinding"] envRec name closure)
    __x6__
    app __x7__ = (WrapCompletion closure)
    return __x7__
  }
  */
}
