package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MethodDefinition0PropertyDefinitionEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition0PropertyDefinitionEvaluation0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""FunctionBody"""), Id("""object"""), Id("""enumerable""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""this"""))), EStr("""DefineMethod""")).setId(39706), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""object"""))))).setId(39707), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(39708), IReturn(ERef(RefId(Id("""__x1__""")))).setId(39709)).setId(39710), ISeq(List()).setId(39711)).setId(39712), ILet(Id("""methodDef"""), ERef(RefId(Id("""__x1__""")))).setId(39713), IApp(Id("""__x2__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefProp(RefId(Id("""methodDef""")), EStr("""Closure"""))), ERef(RefProp(RefId(Id("""methodDef""")), EStr("""Key"""))))).setId(39715), IExpr(ERef(RefId(Id("""__x2__""")))).setId(39716), ILet(Id("""desc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefProp(RefId(Id("""methodDef""")), EStr("""Closure""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), ERef(RefId(Id("""enumerable""")))), (EStr("""Configurable"""), EBool(true))))).setId(39718), IApp(Id("""__x3__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""object"""))), ERef(RefProp(RefId(Id("""methodDef""")), EStr("""Key"""))), ERef(RefId(Id("""desc"""))))).setId(39720), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(39721), IReturn(ERef(RefId(Id("""__x3__""")))).setId(39722)).setId(39723), ISeq(List()).setId(39711)).setId(39724), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(39725), IReturn(ERef(RefId(Id("""__x4__""")))).setId(39726))).setId(-1))
  /* Beautified form:
  "MethodDefinition0PropertyDefinitionEvaluation0" (this, PropertyName, UniqueFormalParameters, FunctionBody, object, enumerable) => {
    access __x0__ = (this "DefineMethod")
    app __x1__ = (__x0__ object)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let methodDef = __x1__
    app __x2__ = (SetFunctionName methodDef["Closure"] methodDef["Key"])
    __x2__
    let desc = (new PropertyDescriptor("Value" -> methodDef["Closure"], "Writable" -> true, "Enumerable" -> enumerable, "Configurable" -> true))
    app __x3__ = (DefinePropertyOrThrow object methodDef["Key"] desc)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
