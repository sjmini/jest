package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorExpression0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorExpression0Evaluation0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""GeneratorBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""GLOBAL_context"""))), EStr("""LexicalEnvironment""")).setId(40334), ILet(Id("""scope"""), ERef(RefId(Id("""__x0__""")))).setId(40335), IApp(Id("""__x1__"""), ERef(RefId(Id("""GeneratorFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""GeneratorBody"""))), ERef(RefId(Id("""scope"""))))).setId(40337), ILet(Id("""closure"""), ERef(RefId(Id("""__x1__""")))).setId(40338), IApp(Id("""__x2__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_GeneratorPrototype"""))))).setId(40340), ILet(Id("""prototype"""), ERef(RefId(Id("""__x2__""")))).setId(40341), IApp(Id("""__x3__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""closure"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(40343), IExpr(ERef(RefId(Id("""__x3__""")))).setId(40344), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(40346), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(40348), IReturn(ERef(RefId(Id("""__x4__""")))).setId(40349))).setId(40363))
  val instToStepMap: Map[Int, Int] = HashMap(40343 -> 3, 40342 -> 2, 40338 -> 1, 40348 -> 5, 40349 -> 5, 40341 -> 2, 40337 -> 1, 40344 -> 3, 40346 -> 4, 40339 -> 1, 40334 -> 0, 40347 -> 4, 40336 -> 0, 40335 -> 0, 40350 -> 5, 40340 -> 2, 40345 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(40334, 40336, 40335), 5 -> HashSet(40348, 40349, 40350), 1 -> HashSet(40339, 40338, 40337), 2 -> HashSet(40342, 40341, 40340), 3 -> HashSet(40343, 40345, 40344), 4 -> HashSet(40346, 40347))
  /* Beautified form:
  "GeneratorExpression0Evaluation0" (this, FormalParameters, GeneratorBody) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    app __x1__ = (GeneratorFunctionCreate CONST_Normal FormalParameters GeneratorBody scope)
    let closure = __x1__
    app __x2__ = (ObjectCreate INTRINSIC_GeneratorPrototype)
    let prototype = __x2__
    app __x3__ = (DefinePropertyOrThrow closure "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    __x3__
    closure["SourceText"] = (get-syntax this)
    app __x4__ = (WrapCompletion closure)
    return __x4__
  }
  */
}
