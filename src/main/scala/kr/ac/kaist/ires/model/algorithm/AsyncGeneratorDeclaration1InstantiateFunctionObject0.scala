package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorDeclaration1InstantiateFunctionObject0 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorDeclaration1InstantiateFunctionObject0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""AsyncGeneratorBody"""), Id("""scope""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""AsyncGeneratorFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""AsyncGeneratorBody"""))), ERef(RefId(Id("""scope"""))))).setId(41696), ILet(Id("""F"""), ERef(RefId(Id("""__x0__""")))).setId(41697), IApp(Id("""__x1__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_AsyncGeneratorPrototype"""))))).setId(41699), ILet(Id("""prototype"""), ERef(RefId(Id("""__x1__""")))).setId(41700), IApp(Id("""__x2__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(41702), IExpr(ERef(RefId(Id("""__x2__""")))).setId(41703), IApp(Id("""__x3__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""F"""))), EStr("""default"""))).setId(41705), IExpr(ERef(RefId(Id("""__x3__""")))).setId(41706), IAssign(RefProp(RefId(Id("""F""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(41708), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(41710), IReturn(ERef(RefId(Id("""__x4__""")))).setId(41711))).setId(41725))
  val instToStepMap: Map[Int, Int] = HashMap(41700 -> 1, 41705 -> 3, 41709 -> 4, 41704 -> 2, 41712 -> 5, 41708 -> 4, 41701 -> 1, 41698 -> 0, 41707 -> 3, 41699 -> 1, 41710 -> 5, 41703 -> 2, 41706 -> 3, 41711 -> 5, 41696 -> 0, 41697 -> 0, 41702 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(41696, 41698, 41697), 5 -> HashSet(41712, 41711, 41710), 1 -> HashSet(41700, 41701, 41699), 2 -> HashSet(41704, 41702, 41703), 3 -> HashSet(41705, 41707, 41706), 4 -> HashSet(41709, 41708))
  /* Beautified form:
  "AsyncGeneratorDeclaration1InstantiateFunctionObject0" (this, FormalParameters, AsyncGeneratorBody, scope) => {
    app __x0__ = (AsyncGeneratorFunctionCreate CONST_Normal FormalParameters AsyncGeneratorBody scope)
    let F = __x0__
    app __x1__ = (ObjectCreate INTRINSIC_AsyncGeneratorPrototype)
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
