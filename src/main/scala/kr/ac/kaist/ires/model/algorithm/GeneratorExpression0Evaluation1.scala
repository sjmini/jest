package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorExpression0Evaluation1 {
  val length: Int = 0
  val func: Func = Func("""GeneratorExpression0Evaluation1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""GeneratorBody""")), None, ISeq(List(ILet(Id("""scope"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(40376), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""scope"""))))).setId(40378), ILet(Id("""funcEnv"""), ERef(RefId(Id("""__x0__""")))).setId(40379), ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""funcEnv""")), EStr("""EnvironmentRecord""")))).setId(40381), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(40383), ILet(Id("""name"""), ERef(RefId(Id("""__x1__""")))).setId(40384), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))), EBool(false))).setId(40386), IExpr(ERef(RefId(Id("""__x2__""")))).setId(40387), IApp(Id("""__x3__"""), ERef(RefId(Id("""GeneratorFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""GeneratorBody"""))), ERef(RefId(Id("""funcEnv"""))))).setId(40389), ILet(Id("""closure"""), ERef(RefId(Id("""__x3__""")))).setId(40390), IApp(Id("""__x4__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_GeneratorPrototype"""))))).setId(40392), ILet(Id("""prototype"""), ERef(RefId(Id("""__x4__""")))).setId(40393), IApp(Id("""__x5__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""closure"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(40395), IExpr(ERef(RefId(Id("""__x5__""")))).setId(40396), IApp(Id("""__x6__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""name"""))))).setId(40398), IExpr(ERef(RefId(Id("""__x6__""")))).setId(40399), IApp(Id("""__x7__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))), ERef(RefId(Id("""closure"""))))).setId(40401), IExpr(ERef(RefId(Id("""__x7__""")))).setId(40402), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(40404), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(40406), IReturn(ERef(RefId(Id("""__x8__""")))).setId(40407))).setId(40431))
  val instToStepMap: Map[Int, Int] = HashMap(40394 -> 6, 40402 -> 9, 40406 -> 11, 40395 -> 7, 40405 -> 10, 40396 -> 7, 40404 -> 10, 40400 -> 8, 40386 -> 4, 40383 -> 3, 40391 -> 5, 40378 -> 1, 40393 -> 6, 40376 -> 0, 40398 -> 8, 40408 -> 11, 40390 -> 5, 40403 -> 9, 40379 -> 1, 40389 -> 5, 40380 -> 1, 40407 -> 11, 40384 -> 3, 40385 -> 3, 40381 -> 2, 40388 -> 4, 40401 -> 9, 40382 -> 2, 40387 -> 4, 40399 -> 8, 40397 -> 7, 40392 -> 6, 40377 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(40376, 40377), 5 -> HashSet(40391, 40390, 40389), 10 -> HashSet(40405, 40404), 1 -> HashSet(40378, 40379, 40380), 6 -> HashSet(40393, 40394, 40392), 9 -> HashSet(40403, 40402, 40401), 2 -> HashSet(40381, 40382), 7 -> HashSet(40395, 40396, 40397), 3 -> HashSet(40383, 40384, 40385), 11 -> HashSet(40408, 40406, 40407), 8 -> HashSet(40400, 40398, 40399), 4 -> HashSet(40386, 40388, 40387))
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
