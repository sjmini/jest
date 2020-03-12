package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorDeclaration1InstantiateFunctionObject0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorDeclaration1InstantiateFunctionObject0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""GeneratorBody"""), Id("""scope""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GeneratorFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""GeneratorBody"""))), ERef(RefId(Id("""scope"""))))).setId(40166), ILet(Id("""F"""), ERef(RefId(Id("""__x0__""")))).setId(40167), IApp(Id("""__x1__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_GeneratorPrototype"""))))).setId(40169), ILet(Id("""prototype"""), ERef(RefId(Id("""__x1__""")))).setId(40170), IApp(Id("""__x2__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(40172), IExpr(ERef(RefId(Id("""__x2__""")))).setId(40173), IApp(Id("""__x3__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""F"""))), EStr("""default"""))).setId(40175), IExpr(ERef(RefId(Id("""__x3__""")))).setId(40176), IAssign(RefProp(RefId(Id("""F""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(40178), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(40180), IReturn(ERef(RefId(Id("""__x4__""")))).setId(40181))).setId(40195))
  val instToStepMap: Map[Int, Int] = HashMap(40179 -> 4, 40166 -> 0, 40171 -> 1, 40180 -> 5, 40170 -> 1, 40177 -> 3, 40169 -> 1, 40178 -> 4, 40172 -> 2, 40174 -> 2, 40167 -> 0, 40168 -> 0, 40173 -> 2, 40176 -> 3, 40181 -> 5, 40182 -> 5, 40175 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(40166, 40167, 40168), 5 -> HashSet(40180, 40181, 40182), 1 -> HashSet(40171, 40170, 40169), 2 -> HashSet(40174, 40173, 40172), 3 -> HashSet(40177, 40176, 40175), 4 -> HashSet(40179, 40178))
  /* Beautified form:
  "GeneratorDeclaration1InstantiateFunctionObject0" (this, FormalParameters, GeneratorBody, scope) => {
    app __x0__ = (GeneratorFunctionCreate CONST_Normal FormalParameters GeneratorBody scope)
    let F = __x0__
    app __x1__ = (ObjectCreate INTRINSIC_GeneratorPrototype)
    let prototype = __x1__
    app __x2__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    __x2__
    app __x3__ = (SetFunctionName F "default")
    __x3__
    F["SourceText"] = (get-syntax this)
    app __x4__ = (WrapCompletion F)
    return __x4__
  }
  */
}
