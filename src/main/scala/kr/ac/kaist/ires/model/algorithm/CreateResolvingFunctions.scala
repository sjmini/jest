package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateResolvingFunctions {
  val length: Int = 1
  val func: Func = Func("""CreateResolvingFunctions""", List(Id("""promise""")), None, ISeq(List(ILet(Id("""alreadyResolved"""), EMap(Ty("""Record"""), List((EStr("""Value"""), EBool(false))))).setId(11865), ILet(Id("""stepsResolve"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(1L)), (EStr("""step"""), ERef(RefId(Id("""GLOBALDOTPromiseResolveFunctions"""))))))).setId(11867), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsResolve"""))), EList(List(EStr("""Promise"""), EStr("""AlreadyResolved"""))))).setId(11869), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(11870), IReturn(ERef(RefId(Id("""__x0__""")))).setId(11871)).setId(11872), ISeq(List()).setId(11873)).setId(11874), ILet(Id("""resolve"""), ERef(RefId(Id("""__x0__""")))).setId(11875), IAssign(RefProp(RefId(Id("""resolve""")), EStr("""Promise""")), ERef(RefId(Id("""promise""")))).setId(11877), IAssign(RefProp(RefId(Id("""resolve""")), EStr("""AlreadyResolved""")), ERef(RefId(Id("""alreadyResolved""")))).setId(11879), ILet(Id("""stepsReject"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(1L)), (EStr("""step"""), ERef(RefId(Id("""GLOBALDOTPromiseRejectFunctions"""))))))).setId(11881), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsReject"""))), EList(List(EStr("""Promise"""), EStr("""AlreadyResolved"""))))).setId(11883), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(11884), IReturn(ERef(RefId(Id("""__x1__""")))).setId(11885)).setId(11886), ISeq(List()).setId(11873)).setId(11887), ILet(Id("""reject"""), ERef(RefId(Id("""__x1__""")))).setId(11888), IAssign(RefProp(RefId(Id("""reject""")), EStr("""Promise""")), ERef(RefId(Id("""promise""")))).setId(11890), IAssign(RefProp(RefId(Id("""reject""")), EStr("""AlreadyResolved""")), ERef(RefId(Id("""alreadyResolved""")))).setId(11892), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Record"""), List((EStr("""Resolve"""), ERef(RefId(Id("""resolve""")))), (EStr("""Reject"""), ERef(RefId(Id("""reject""")))))))).setId(11894), IReturn(ERef(RefId(Id("""__x2__""")))).setId(11895))).setId(-1))
  /* Beautified form:
  "CreateResolvingFunctions" (promise) => {
    let alreadyResolved = (new Record("Value" -> false))
    let stepsResolve = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTPromiseResolveFunctions))
    app __x0__ = (CreateBuiltinFunction stepsResolve (new ["Promise", "AlreadyResolved"]))
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let resolve = __x0__
    resolve["Promise"] = promise
    resolve["AlreadyResolved"] = alreadyResolved
    let stepsReject = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTPromiseRejectFunctions))
    app __x1__ = (CreateBuiltinFunction stepsReject (new ["Promise", "AlreadyResolved"]))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let reject = __x1__
    reject["Promise"] = promise
    reject["AlreadyResolved"] = alreadyResolved
    app __x2__ = (WrapCompletion (new Record("Resolve" -> resolve, "Reject" -> reject)))
    return __x2__
  }
  */
}
