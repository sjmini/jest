package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MethodDefinition0DefineMethod0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition0DefineMethod0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""FunctionBody"""), Id("""object"""), Id("""functionPrototype""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""Evaluation""")).setId(39622), ILet(Id("""propKey"""), ERef(RefId(Id("""__x0__""")))).setId(39623), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""propKey""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""propKey""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""propKey""")), ERef(RefProp(RefId(Id("""propKey""")), EStr("""Value""")))).setId(39625), IReturn(ERef(RefId(Id("""propKey""")))).setId(39626)).setId(39627), ISeq(List()).setId(39628)).setId(39629), IExpr(ERef(RefId(Id("""propKey""")))).setId(39630), ILet(Id("""scope"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(39632), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""functionPrototype"""))), EAbsent)), ISeq(List(ILet(Id("""kind"""), ERef(RefId(Id("""CONST_Normal""")))).setId(39634), ILet(Id("""prototype"""), ERef(RefId(Id("""functionPrototype""")))).setId(39636))).setId(39638), ISeq(List(ILet(Id("""kind"""), ERef(RefId(Id("""CONST_Method""")))).setId(39639), ILet(Id("""prototype"""), ERef(RefId(Id("""INTRINSIC_FunctionPrototype""")))).setId(39641))).setId(39643)).setId(39644), IApp(Id("""__x1__"""), ERef(RefId(Id("""FunctionCreate"""))), List(ERef(RefId(Id("""kind"""))), ERef(RefId(Id("""UniqueFormalParameters"""))), ERef(RefId(Id("""FunctionBody"""))), ERef(RefId(Id("""scope"""))), ERef(RefId(Id("""prototype"""))))).setId(39646), ILet(Id("""closure"""), ERef(RefId(Id("""__x1__""")))).setId(39647), IApp(Id("""__x2__"""), ERef(RefId(Id("""MakeMethod"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""object"""))))).setId(39649), IExpr(ERef(RefId(Id("""__x2__""")))).setId(39650), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(39652), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Record"""), List((EStr("""Key"""), ERef(RefId(Id("""propKey""")))), (EStr("""Closure"""), ERef(RefId(Id("""closure""")))))))).setId(39654), IReturn(ERef(RefId(Id("""__x3__""")))).setId(39655))).setId(-1))
  /* Beautified form:
  "MethodDefinition0DefineMethod0" (this, PropertyName, UniqueFormalParameters, FunctionBody, object, functionPrototype) => {
    access __x0__ = (PropertyName "Evaluation")
    let propKey = __x0__
    if (= (typeof propKey) "Completion") if (= propKey["Type"] CONST_normal) propKey = propKey["Value"] else return propKey else {}
    propKey
    let scope = GLOBAL_context["LexicalEnvironment"]
    if (! (= functionPrototype absent)) {
      let kind = CONST_Normal
      let prototype = functionPrototype
    } else {
      let kind = CONST_Method
      let prototype = INTRINSIC_FunctionPrototype
    }
    app __x1__ = (FunctionCreate kind UniqueFormalParameters FunctionBody scope prototype)
    let closure = __x1__
    app __x2__ = (MakeMethod closure object)
    __x2__
    closure["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion (new Record("Key" -> propKey, "Closure" -> closure)))
    return __x3__
  }
  */
}
