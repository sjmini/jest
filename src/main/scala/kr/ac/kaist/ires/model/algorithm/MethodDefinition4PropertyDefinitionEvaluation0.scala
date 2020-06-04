package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MethodDefinition4PropertyDefinitionEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition4PropertyDefinitionEvaluation0""", List(Id("""this"""), Id("""PropertyName"""), Id("""FunctionBody"""), Id("""object"""), Id("""enumerable""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""Evaluation""")).setId(39770), ILet(Id("""propKey"""), ERef(RefId(Id("""__x0__""")))).setId(39771), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""propKey""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""propKey""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""propKey""")), ERef(RefProp(RefId(Id("""propKey""")), EStr("""Value""")))).setId(39773), IReturn(ERef(RefId(Id("""propKey""")))).setId(39774)).setId(39775), ISeq(List()).setId(39776)).setId(39777), IExpr(ERef(RefId(Id("""propKey""")))).setId(39778), ILet(Id("""scope"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(39780), ILet(Id("""formalParameterList"""), EParseSyntax(EStr(""""""), EStr("""FormalParameters"""), List(EBool(false), EBool(false)))).setId(39782), IApp(Id("""__x1__"""), ERef(RefId(Id("""FunctionCreate"""))), List(ERef(RefId(Id("""CONST_Method"""))), ERef(RefId(Id("""formalParameterList"""))), ERef(RefId(Id("""FunctionBody"""))), ERef(RefId(Id("""scope"""))))).setId(39784), ILet(Id("""closure"""), ERef(RefId(Id("""__x1__""")))).setId(39785), IApp(Id("""__x2__"""), ERef(RefId(Id("""MakeMethod"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""object"""))))).setId(39787), IExpr(ERef(RefId(Id("""__x2__""")))).setId(39788), IApp(Id("""__x3__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""propKey"""))), EStr("""get"""))).setId(39790), IExpr(ERef(RefId(Id("""__x3__""")))).setId(39791), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(39793), ILet(Id("""desc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Get"""), ERef(RefId(Id("""closure""")))), (EStr("""Enumerable"""), ERef(RefId(Id("""enumerable""")))), (EStr("""Configurable"""), EBool(true))))).setId(39795), IApp(Id("""__x4__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""object"""))), ERef(RefId(Id("""propKey"""))), ERef(RefId(Id("""desc"""))))).setId(39797), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(39798), IReturn(ERef(RefId(Id("""__x4__""")))).setId(39799)).setId(39800), ISeq(List()).setId(39776)).setId(39801), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(39802), IReturn(ERef(RefId(Id("""__x5__""")))).setId(39803))).setId(-1))
  /* Beautified form:
  "MethodDefinition4PropertyDefinitionEvaluation0" (this, PropertyName, FunctionBody, object, enumerable) => {
    access __x0__ = (PropertyName "Evaluation")
    let propKey = __x0__
    if (= (typeof propKey) "Completion") if (= propKey["Type"] CONST_normal) propKey = propKey["Value"] else return propKey else {}
    propKey
    let scope = GLOBAL_context["LexicalEnvironment"]
    let formalParameterList = (parse-syntax "" "FormalParameters" false false)
    app __x1__ = (FunctionCreate CONST_Method formalParameterList FunctionBody scope)
    let closure = __x1__
    app __x2__ = (MakeMethod closure object)
    __x2__
    app __x3__ = (SetFunctionName closure propKey "get")
    __x3__
    closure["SourceText"] = (get-syntax this)
    let desc = (new PropertyDescriptor("Get" -> closure, "Enumerable" -> enumerable, "Configurable" -> true))
    app __x4__ = (DefinePropertyOrThrow object propKey desc)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
