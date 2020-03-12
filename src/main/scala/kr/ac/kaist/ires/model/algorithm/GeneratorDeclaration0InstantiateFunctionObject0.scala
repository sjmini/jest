package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorDeclaration0InstantiateFunctionObject0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorDeclaration0InstantiateFunctionObject0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""GeneratorBody"""), Id("""scope""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(40117), ILet(Id("""name"""), ERef(RefId(Id("""__x0__""")))).setId(40118), IApp(Id("""__x1__"""), ERef(RefId(Id("""GeneratorFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""GeneratorBody"""))), ERef(RefId(Id("""scope"""))))).setId(40120), ILet(Id("""F"""), ERef(RefId(Id("""__x1__""")))).setId(40121), IApp(Id("""__x2__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_GeneratorPrototype"""))))).setId(40123), ILet(Id("""prototype"""), ERef(RefId(Id("""__x2__""")))).setId(40124), IApp(Id("""__x3__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(40126), IExpr(ERef(RefId(Id("""__x3__""")))).setId(40127), IApp(Id("""__x4__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""name"""))))).setId(40129), IExpr(ERef(RefId(Id("""__x4__""")))).setId(40130), IAssign(RefProp(RefId(Id("""F""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(40132), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(40134), IReturn(ERef(RefId(Id("""__x5__""")))).setId(40135))).setId(40151))
  val instToStepMap: Map[Int, Int] = HashMap(40124 -> 2, 40130 -> 4, 40119 -> 0, 40123 -> 2, 40128 -> 3, 40131 -> 4, 40127 -> 3, 40135 -> 6, 40120 -> 1, 40117 -> 0, 40118 -> 0, 40133 -> 5, 40125 -> 2, 40121 -> 1, 40134 -> 6, 40129 -> 4, 40126 -> 3, 40132 -> 5, 40136 -> 6, 40122 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(40119, 40117, 40118), 5 -> HashSet(40132, 40133), 1 -> HashSet(40120, 40122, 40121), 6 -> HashSet(40134, 40135, 40136), 2 -> HashSet(40124, 40123, 40125), 3 -> HashSet(40128, 40127, 40126), 4 -> HashSet(40129, 40130, 40131))
  /* Beautified form:
  "GeneratorDeclaration0InstantiateFunctionObject0" (this, BindingIdentifier, FormalParameters, GeneratorBody, scope) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let name = __x0__
    app __x1__ = (GeneratorFunctionCreate CONST_Normal FormalParameters GeneratorBody scope)
    let F = __x1__
    app __x2__ = (ObjectCreate INTRINSIC_GeneratorPrototype)
    let prototype = __x2__
    app __x3__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    __x3__
    app __x4__ = (SetFunctionName F name)
    __x4__
    F["SourceText"] = (get-syntax this)
    app __x5__ = (WrapCompletion F)
    return __x5__
  }
  */
}
