package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ECMAScriptFunctionObjectDOTCall {
  val length: Int = 2
  val func: Func = Func("""ECMAScriptFunctionObject.Call""", List(Id("""F"""), Id("""thisArgument"""), Id("""argumentsList""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""FunctionKind"""))), EStr("""classConstructor""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(51323), IReturn(ERef(RefId(Id("""__x0__""")))).setId(51324))).setId(51325), ISeq(List()).setId(51322)).setId(51326), ILet(Id("""callerContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(51328), IApp(Id("""__x1__"""), ERef(RefId(Id("""PrepareForOrdinaryCall"""))), List(ERef(RefId(Id("""F"""))), EUndef)).setId(51330), ILet(Id("""calleeContext"""), ERef(RefId(Id("""__x1__""")))).setId(51331), IApp(Id("""__x2__"""), ERef(RefId(Id("""OrdinaryCallBindThis"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""calleeContext"""))), ERef(RefId(Id("""thisArgument"""))))).setId(51333), IExpr(ERef(RefId(Id("""__x2__""")))).setId(51334), IApp(Id("""__x3__"""), ERef(RefId(Id("""OrdinaryCallEvaluateBody"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""argumentsList"""))))).setId(51336), ILet(Id("""result"""), ERef(RefId(Id("""__x3__""")))).setId(51337), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""calleeContext""")))), ISeq(List(IAssign(RefId(Id("""__x4__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(51339), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x4__"""))))).setId(51340))).setId(51341), ISeq(List()).setId(51342)).setId(51343), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(51344), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))).setId(51346), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(51347), IReturn(ERef(RefId(Id("""__x6__""")))).setId(51348))).setId(51349), ISeq(List()).setId(51322)).setId(51350), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""result""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""result""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))).setId(51352), IReturn(ERef(RefId(Id("""result""")))).setId(51353)).setId(51354), ISeq(List()).setId(51322)).setId(51355), IExpr(ERef(RefId(Id("""result""")))).setId(51356), IApp(Id("""__x7__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(51358), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(51359), IReturn(ERef(RefId(Id("""__x8__""")))).setId(51360))).setId(-1))
  /* Beautified form:
  "ECMAScriptFunctionObject.Call" (F, thisArgument, argumentsList) => {
    if (= F["FunctionKind"] "classConstructor") {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    let callerContext = GLOBAL_context
    app __x1__ = (PrepareForOrdinaryCall F undefined)
    let calleeContext = __x1__
    app __x2__ = (OrdinaryCallBindThis F calleeContext thisArgument)
    __x2__
    app __x3__ = (OrdinaryCallEvaluateBody F argumentsList)
    let result = __x3__
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] calleeContext) {
      __x4__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x4__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    if (= result["Type"] CONST_return) {
      app __x5__ = (NormalCompletion result["Value"])
      app __x6__ = (WrapCompletion __x5__)
      return __x6__
    } else {}
    if (= (typeof result) "Completion") if (= result["Type"] CONST_normal) result = result["Value"] else return result else {}
    result
    app __x7__ = (NormalCompletion undefined)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
