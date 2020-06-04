package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassDeclaration0BindingClassDeclarationEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ClassDeclaration0BindingClassDeclarationEvaluation0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""ClassTail""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(43121), ILet(Id("""className"""), ERef(RefId(Id("""__x0__""")))).setId(43122), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ClassTail"""))), EStr("""ClassDefinitionEvaluation""")).setId(43124), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""className"""))), ERef(RefId(Id("""className"""))))).setId(43125), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(43126), IReturn(ERef(RefId(Id("""__x2__""")))).setId(43127)).setId(43128), ISeq(List()).setId(43129)).setId(43130), ILet(Id("""value"""), ERef(RefId(Id("""__x2__""")))).setId(43131), IAssign(RefProp(RefId(Id("""value""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(43133), ILet(Id("""env"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(43135), IApp(Id("""__x3__"""), ERef(RefId(Id("""InitializeBoundName"""))), List(ERef(RefId(Id("""className"""))), ERef(RefId(Id("""value"""))), ERef(RefId(Id("""env"""))))).setId(43137), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(43138), IReturn(ERef(RefId(Id("""__x3__""")))).setId(43139)).setId(43140), ISeq(List()).setId(43129)).setId(43141), IExpr(ERef(RefId(Id("""__x3__""")))).setId(43142), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(43144), IReturn(ERef(RefId(Id("""__x4__""")))).setId(43145))).setId(-1))
  /* Beautified form:
  "ClassDeclaration0BindingClassDeclarationEvaluation0" (this, BindingIdentifier, ClassTail) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let className = __x0__
    access __x1__ = (ClassTail "ClassDefinitionEvaluation")
    app __x2__ = (__x1__ className className)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let value = __x2__
    value["SourceText"] = (get-syntax this)
    let env = GLOBAL_context["LexicalEnvironment"]
    app __x3__ = (InitializeBoundName className value env)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (WrapCompletion value)
    return __x4__
  }
  */
}
