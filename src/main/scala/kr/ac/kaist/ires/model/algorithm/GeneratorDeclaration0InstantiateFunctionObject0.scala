package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorDeclaration0InstantiateFunctionObject0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorDeclaration0InstantiateFunctionObject0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""GeneratorBody"""), Id("""scope""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(40117), ILet(Id("""name"""), ERef(RefId(Id("""__x0__""")))).setId(40118), IApp(Id("""__x1__"""), ERef(RefId(Id("""GeneratorFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""GeneratorBody"""))), ERef(RefId(Id("""scope"""))))).setId(40120), ILet(Id("""F"""), ERef(RefId(Id("""__x1__""")))).setId(40121), IApp(Id("""__x2__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_GeneratorPrototype"""))))).setId(40123), ILet(Id("""prototype"""), ERef(RefId(Id("""__x2__""")))).setId(40124), IApp(Id("""__x3__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(40126), IExpr(ERef(RefId(Id("""__x3__""")))).setId(40127), IApp(Id("""__x4__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""name"""))))).setId(40129), IExpr(ERef(RefId(Id("""__x4__""")))).setId(40130), IAssign(RefProp(RefId(Id("""F""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(40132), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(40134), IReturn(ERef(RefId(Id("""__x5__""")))).setId(40135))).setId(-1))
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
