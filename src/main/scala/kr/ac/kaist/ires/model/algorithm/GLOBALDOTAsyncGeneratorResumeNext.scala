package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAsyncGeneratorResumeNext {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.AsyncGeneratorResumeNext""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(89972), ILet(Id("""generator"""), ERef(RefId(Id("""__x0__""")))).setId(89973), ILet(Id("""state"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")))).setId(89976), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""awaiting-return""")), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(89978), IReturn(ERef(RefId(Id("""__x1__""")))).setId(89979))).setId(89980), ISeq(List()).setId(89975)).setId(89981), ILet(Id("""queue"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorQueue""")))).setId(89983), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""queue""")), EStr("""length"""))), EINum(0L)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(89985), IReturn(ERef(RefId(Id("""__x2__""")))).setId(89986))).setId(89987), ISeq(List()).setId(89975)).setId(89988), ILet(Id("""next"""), ERef(RefProp(RefId(Id("""queue""")), EINum(0L)))).setId(89990), ILet(Id("""completion"""), ERef(RefProp(RefId(Id("""next""")), EStr("""Completion""")))).setId(89992), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""completion"""))))).setId(89994), IIf(ERef(RefId(Id("""__x3__"""))), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""suspendedStart""")), ISeq(List(IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""completed""")).setId(89995), IAssign(RefId(Id("""state""")), EStr("""completed""")).setId(89997))).setId(89999), ISeq(List()).setId(89975)).setId(90000), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""completed""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""completion""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ISeq(List(IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""awaiting-return""")).setId(90002), IApp(Id("""__x4__"""), ERef(RefId(Id("""PromiseResolve"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))), ERef(RefProp(RefId(Id("""completion""")), EStr("""Value"""))))).setId(90004), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(90005), IReturn(ERef(RefId(Id("""__x4__""")))).setId(90006)).setId(90007), ISeq(List()).setId(89975)).setId(90008), ILet(Id("""promise"""), ERef(RefId(Id("""__x4__""")))).setId(90009), ILet(Id("""stepsFulfilled"""), ENotSupported("""Algorithms""")).setId(90011), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsFulfilled"""))), EList(List(EStr("""Generator"""))))).setId(90013), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(90014), IReturn(ERef(RefId(Id("""__x5__""")))).setId(90015)).setId(90016), ISeq(List()).setId(89975)).setId(90017), ILet(Id("""onFulfilled"""), ERef(RefId(Id("""__x5__""")))).setId(90018), IAssign(RefProp(RefId(Id("""onFulfilled""")), EStr("""Generator""")), ERef(RefId(Id("""generator""")))).setId(90020), ILet(Id("""stepsRejected"""), ENotSupported("""Algorithms""")).setId(90022), IApp(Id("""__x6__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsRejected"""))), EList(List(EStr("""Generator"""))))).setId(90024), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(90025), IReturn(ERef(RefId(Id("""__x6__""")))).setId(90026)).setId(90027), ISeq(List()).setId(89975)).setId(90028), ILet(Id("""onRejected"""), ERef(RefId(Id("""__x6__""")))).setId(90029), IAssign(RefProp(RefId(Id("""onRejected""")), EStr("""Generator""")), ERef(RefId(Id("""generator""")))).setId(90031), IApp(Id("""__x7__"""), ERef(RefId(Id("""PerformPromiseThen"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""onFulfilled"""))), ERef(RefId(Id("""onRejected"""))))).setId(90033), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(90034), IReturn(ERef(RefId(Id("""__x7__""")))).setId(90035)).setId(90036), ISeq(List()).setId(89975)).setId(90037), IExpr(ERef(RefId(Id("""__x7__""")))).setId(90038), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(90040), IReturn(ERef(RefId(Id("""__x8__""")))).setId(90041))).setId(90043), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""AsyncGeneratorReject"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefProp(RefId(Id("""completion""")), EStr("""Value"""))))).setId(90044), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(90045), IReturn(ERef(RefId(Id("""__x9__""")))).setId(90046)).setId(90047), ISeq(List()).setId(89975)).setId(90048), IExpr(ERef(RefId(Id("""__x9__""")))).setId(90049), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(90051), IReturn(ERef(RefId(Id("""__x10__""")))).setId(90052))).setId(90054)).setId(90055), ISeq(List()).setId(89975)).setId(90058))).setId(90060), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""completed""")), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""AsyncGeneratorResolve"""))), List(ERef(RefId(Id("""generator"""))), EUndef, EBool(true))).setId(90061), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(90062), IReturn(ERef(RefId(Id("""__x11__""")))).setId(90063)).setId(90064), ISeq(List()).setId(89975)).setId(90065), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))).setId(90066), IReturn(ERef(RefId(Id("""__x12__""")))).setId(90067))).setId(90068), ISeq(List()).setId(89975)).setId(90069)).setId(90071), ILet(Id("""genContext"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorContext""")))).setId(90073), ILet(Id("""callerContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(90075), IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(90077), IAssign(RefId(Id("""callerContext""")), ENull).setId(90078), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""executing""")).setId(90080), IAppend(ERef(RefId(Id("""genContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(90082), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(90083), IWithCont(Id("""__x13__"""), List(Id("""result""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")), EList(List())).setId(90085), ISeq(List()).setId(90087)).setId(90088), IAppend(ERef(RefId(Id("""__x13__"""))), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")))).setId(90089), IApp(Id("""__x14__"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont"""))), List(ERef(RefId(Id("""completion"""))))).setId(90090))).setId(90091)).setId(90092), IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(90094), IReturn(ERef(RefId(Id("""__x15__""")))).setId(90095))).setId(-1))
  /* Beautified form:
  "GLOBAL.AsyncGeneratorResumeNext" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let generator = __x0__
    let state = generator["AsyncGeneratorState"]
    if (= state "awaiting-return") {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    } else {}
    let queue = generator["AsyncGeneratorQueue"]
    if (= queue["length"] 0i) {
      app __x2__ = (WrapCompletion undefined)
      return __x2__
    } else {}
    let next = queue[0i]
    let completion = next["Completion"]
    app __x3__ = (IsAbruptCompletion completion)
    if __x3__ {
      if (= state "suspendedStart") {
        generator["AsyncGeneratorState"] = "completed"
        state = "completed"
      } else {}
      if (= state "completed") if (= completion["Type"] CONST_return) {
        generator["AsyncGeneratorState"] = "awaiting-return"
        app __x4__ = (PromiseResolve INTRINSIC_Promise completion["Value"])
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        let promise = __x4__
        let stepsFulfilled = !!! "Algorithms"
        app __x5__ = (CreateBuiltinFunction stepsFulfilled (new ["Generator"]))
        if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        let onFulfilled = __x5__
        onFulfilled["Generator"] = generator
        let stepsRejected = !!! "Algorithms"
        app __x6__ = (CreateBuiltinFunction stepsRejected (new ["Generator"]))
        if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        let onRejected = __x6__
        onRejected["Generator"] = generator
        app __x7__ = (PerformPromiseThen promise onFulfilled onRejected)
        if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        __x7__
        app __x8__ = (WrapCompletion undefined)
        return __x8__
      } else {
        app __x9__ = (AsyncGeneratorReject generator completion["Value"])
        if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        __x9__
        app __x10__ = (WrapCompletion undefined)
        return __x10__
      } else {}
    } else if (= state "completed") {
      app __x11__ = (AsyncGeneratorResolve generator undefined true)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      app __x12__ = (WrapCompletion __x11__)
      return __x12__
    } else {}
    let genContext = generator["AsyncGeneratorContext"]
    let callerContext = GLOBAL_context
    GLOBAL_context = null
    callerContext = null
    generator["AsyncGeneratorState"] = "executing"
    append genContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    withcont __x13__ (result) ={
      if (= genContext["ReturnCont"] absent) genContext["ReturnCont"] = (new []) else {}
      append __x13__ -> genContext["ReturnCont"]
      app __x14__ = (genContext["ResumeCont"] completion)
    }
    app __x15__ = (WrapCompletion undefined)
    return __x15__
  }
  */
}
