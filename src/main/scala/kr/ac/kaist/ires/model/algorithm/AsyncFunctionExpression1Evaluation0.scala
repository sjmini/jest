package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncFunctionExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionExpression1Evaluation0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""GLOBAL_context"""))), EStr("""LexicalEnvironment""")).setId(43928), ILet(Id("""scope"""), ERef(RefId(Id("""__x0__""")))).setId(43929), IApp(Id("""__x1__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""scope"""))))).setId(43931), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(43932), IReturn(ERef(RefId(Id("""__x1__""")))).setId(43933)).setId(43934), ISeq(List()).setId(43935)).setId(43936), ILet(Id("""funcEnv"""), ERef(RefId(Id("""__x1__""")))).setId(43937), ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""funcEnv""")), EStr("""EnvironmentRecord""")))).setId(43939), IAccess(Id("""__x2__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(43941), ILet(Id("""name"""), ERef(RefId(Id("""__x2__""")))).setId(43942), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))))).setId(43944), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(43945), IReturn(ERef(RefId(Id("""__x3__""")))).setId(43946)).setId(43947), ISeq(List()).setId(43935)).setId(43948), IExpr(ERef(RefId(Id("""__x3__""")))).setId(43949), IApp(Id("""__x4__"""), ERef(RefId(Id("""AsyncFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""AsyncFunctionBody"""))), ERef(RefId(Id("""funcEnv"""))))).setId(43951), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(43952), IReturn(ERef(RefId(Id("""__x4__""")))).setId(43953)).setId(43954), ISeq(List()).setId(43935)).setId(43955), ILet(Id("""closure"""), ERef(RefId(Id("""__x4__""")))).setId(43956), IApp(Id("""__x5__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""name"""))))).setId(43958), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(43959), IReturn(ERef(RefId(Id("""__x5__""")))).setId(43960)).setId(43961), ISeq(List()).setId(43935)).setId(43962), IExpr(ERef(RefId(Id("""__x5__""")))).setId(43963), IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))), ERef(RefId(Id("""closure"""))))).setId(43965), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(43966), IReturn(ERef(RefId(Id("""__x6__""")))).setId(43967)).setId(43968), ISeq(List()).setId(43935)).setId(43969), IExpr(ERef(RefId(Id("""__x6__""")))).setId(43970), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(43972), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(43974), IReturn(ERef(RefId(Id("""__x7__""")))).setId(43975))).setId(-1))
  /* Beautified form:
  "AsyncFunctionExpression1Evaluation0" (this, BindingIdentifier, FormalParameters, AsyncFunctionBody) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    app __x1__ = (NewDeclarativeEnvironment scope)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let funcEnv = __x1__
    let envRec = funcEnv["EnvironmentRecord"]
    access __x2__ = (BindingIdentifier "StringValue")
    let name = __x2__
    app __x3__ = (envRec["CreateImmutableBinding"] envRec name)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (AsyncFunctionCreate CONST_Normal FormalParameters AsyncFunctionBody funcEnv)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let closure = __x4__
    app __x5__ = (SetFunctionName closure name)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    app __x6__ = (envRec["InitializeBinding"] envRec name closure)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    __x6__
    closure["SourceText"] = (get-syntax this)
    app __x7__ = (WrapCompletion closure)
    return __x7__
  }
  */
}
