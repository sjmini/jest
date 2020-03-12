package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorMethod0PropertyDefinitionEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorMethod0PropertyDefinitionEvaluation0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""GeneratorBody"""), Id("""object"""), Id("""enumerable""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""Evaluation""")).setId(40209), ILet(Id("""propKey"""), ERef(RefId(Id("""__x0__""")))).setId(40210), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""propKey""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""propKey""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""propKey""")), ERef(RefProp(RefId(Id("""propKey""")), EStr("""Value""")))).setId(40212), IReturn(ERef(RefId(Id("""propKey""")))).setId(40213)).setId(40214), ISeq(List()).setId(40254)).setId(40216), IExpr(ERef(RefId(Id("""propKey""")))).setId(40217), ILet(Id("""scope"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(40219), IApp(Id("""__x1__"""), ERef(RefId(Id("""GeneratorFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Method"""))), ERef(RefId(Id("""UniqueFormalParameters"""))), ERef(RefId(Id("""GeneratorBody"""))), ERef(RefId(Id("""scope"""))))).setId(40221), ILet(Id("""closure"""), ERef(RefId(Id("""__x1__""")))).setId(40222), IApp(Id("""__x2__"""), ERef(RefId(Id("""MakeMethod"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""object"""))))).setId(40224), IExpr(ERef(RefId(Id("""__x2__""")))).setId(40225), IApp(Id("""__x3__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_GeneratorPrototype"""))))).setId(40227), ILet(Id("""prototype"""), ERef(RefId(Id("""__x3__""")))).setId(40228), IApp(Id("""__x4__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""closure"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(40230), IExpr(ERef(RefId(Id("""__x4__""")))).setId(40231), IApp(Id("""__x5__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""propKey"""))))).setId(40233), IExpr(ERef(RefId(Id("""__x5__""")))).setId(40234), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(40236), ILet(Id("""desc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""closure""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), ERef(RefId(Id("""enumerable""")))), (EStr("""Configurable"""), EBool(true))))).setId(40238), IApp(Id("""__x6__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""object"""))), ERef(RefId(Id("""propKey"""))), ERef(RefId(Id("""desc"""))))).setId(40240), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(40241), IReturn(ERef(RefId(Id("""__x6__""")))).setId(40242)).setId(40243), ISeq(List()).setId(40274)).setId(40244), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(40245), IReturn(ERef(RefId(Id("""__x7__""")))).setId(40246))).setId(40278))
  val instToStepMap: Map[Int, Int] = HashMap(40210 -> 0, 40225 -> 4, 40238 -> 9, 40219 -> 2, 40234 -> 7, 40224 -> 4, 40211 -> 0, 40226 -> 4, 40222 -> 3, 40218 -> 1, 40223 -> 3, 40230 -> 6, 40227 -> 5, 40231 -> 6, 40217 -> 1, 40232 -> 6, 40209 -> 0, 40236 -> 8, 40235 -> 7, 40220 -> 2, 40229 -> 5, 40246 -> 10, 40247 -> 10, 40237 -> 8, 40240 -> 10, 40233 -> 7, 40216 -> 1, 40221 -> 3, 40244 -> 10, 40239 -> 9, 40228 -> 5, 40245 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(40210, 40211, 40209), 5 -> HashSet(40229, 40227, 40228), 10 -> HashSet(40246, 40247, 40240, 40244, 40245), 1 -> HashSet(40218, 40216, 40217), 6 -> HashSet(40230, 40231, 40232), 9 -> HashSet(40238, 40239), 2 -> HashSet(40219, 40220), 7 -> HashSet(40234, 40233, 40235), 3 -> HashSet(40222, 40223, 40221), 8 -> HashSet(40237, 40236), 4 -> HashSet(40225, 40224, 40226))
  /* Beautified form:
  "GeneratorMethod0PropertyDefinitionEvaluation0" (this, PropertyName, UniqueFormalParameters, GeneratorBody, object, enumerable) => {
    access __x0__ = (PropertyName "Evaluation")
    let propKey = __x0__
    if (= (typeof propKey) "Completion") if (= propKey["Type"] CONST_normal) propKey = propKey["Value"] else return propKey else {}
    propKey
    let scope = GLOBAL_context["LexicalEnvironment"]
    app __x1__ = (GeneratorFunctionCreate CONST_Method UniqueFormalParameters GeneratorBody scope)
    let closure = __x1__
    app __x2__ = (MakeMethod closure object)
    __x2__
    app __x3__ = (ObjectCreate INTRINSIC_GeneratorPrototype)
    let prototype = __x3__
    app __x4__ = (DefinePropertyOrThrow closure "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    __x4__
    app __x5__ = (SetFunctionName closure propKey)
    __x5__
    closure["SourceText"] = (get-syntax this)
    let desc = (new PropertyDescriptor("Value" -> closure, "Writable" -> true, "Enumerable" -> enumerable, "Configurable" -> true))
    app __x6__ = (DefinePropertyOrThrow object propKey desc)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
