package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorResumeNext {
  val length: Int = 1
  val func: Func = Func("""AsyncGeneratorResumeNext""", List(Id("""generator""")), None, ISeq(List(ILet(Id("""state"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")))).setId(11158), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""awaiting-return""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(11160), IReturn(ERef(RefId(Id("""__x0__""")))).setId(11161))).setId(11162), ISeq(List()).setId(11157)).setId(11163), ILet(Id("""queue"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorQueue""")))).setId(11165), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""queue""")), EStr("""length"""))), EINum(0L)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(11167), IReturn(ERef(RefId(Id("""__x1__""")))).setId(11168))).setId(11169), ISeq(List()).setId(11157)).setId(11170), ILet(Id("""next"""), ERef(RefProp(RefId(Id("""queue""")), EINum(0L)))).setId(11172), ILet(Id("""completion"""), ERef(RefProp(RefId(Id("""next""")), EStr("""Completion""")))).setId(11174), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""completion"""))))).setId(11176), IIf(ERef(RefId(Id("""__x2__"""))), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""suspendedStart""")), ISeq(List(IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""completed""")).setId(11177), IAssign(RefId(Id("""state""")), EStr("""completed""")).setId(11179))).setId(11181), ISeq(List()).setId(11157)).setId(11182), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""completed""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""completion""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ISeq(List(IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""awaiting-return""")).setId(11184), IApp(Id("""__x3__"""), ERef(RefId(Id("""PromiseResolve"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))), ERef(RefProp(RefId(Id("""completion""")), EStr("""Value"""))))).setId(11186), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(11187), IReturn(ERef(RefId(Id("""__x3__""")))).setId(11188)).setId(11189), ISeq(List()).setId(11157)).setId(11190), ILet(Id("""promise"""), ERef(RefId(Id("""__x3__""")))).setId(11191), ILet(Id("""stepsFulfilled"""), ENotSupported("""Algorithms""")).setId(11193), IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsFulfilled"""))), EList(List(EStr("""Generator"""))))).setId(11195), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(11196), IReturn(ERef(RefId(Id("""__x4__""")))).setId(11197)).setId(11198), ISeq(List()).setId(11157)).setId(11199), ILet(Id("""onFulfilled"""), ERef(RefId(Id("""__x4__""")))).setId(11200), IAssign(RefProp(RefId(Id("""onFulfilled""")), EStr("""Generator""")), ERef(RefId(Id("""generator""")))).setId(11202), ILet(Id("""stepsRejected"""), ENotSupported("""Algorithms""")).setId(11204), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsRejected"""))), EList(List(EStr("""Generator"""))))).setId(11206), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(11207), IReturn(ERef(RefId(Id("""__x5__""")))).setId(11208)).setId(11209), ISeq(List()).setId(11157)).setId(11210), ILet(Id("""onRejected"""), ERef(RefId(Id("""__x5__""")))).setId(11211), IAssign(RefProp(RefId(Id("""onRejected""")), EStr("""Generator""")), ERef(RefId(Id("""generator""")))).setId(11213), IApp(Id("""__x6__"""), ERef(RefId(Id("""PerformPromiseThen"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""onFulfilled"""))), ERef(RefId(Id("""onRejected"""))))).setId(11215), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(11216), IReturn(ERef(RefId(Id("""__x6__""")))).setId(11217)).setId(11218), ISeq(List()).setId(11157)).setId(11219), IExpr(ERef(RefId(Id("""__x6__""")))).setId(11220), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(11222), IReturn(ERef(RefId(Id("""__x7__""")))).setId(11223))).setId(11225), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""AsyncGeneratorReject"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefProp(RefId(Id("""completion""")), EStr("""Value"""))))).setId(11226), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(11227), IReturn(ERef(RefId(Id("""__x8__""")))).setId(11228)).setId(11229), ISeq(List()).setId(11157)).setId(11230), IExpr(ERef(RefId(Id("""__x8__""")))).setId(11231), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(11233), IReturn(ERef(RefId(Id("""__x9__""")))).setId(11234))).setId(11236)).setId(11237), ISeq(List()).setId(11157)).setId(11240))).setId(11242), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""completed""")), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""AsyncGeneratorResolve"""))), List(ERef(RefId(Id("""generator"""))), EUndef, EBool(true))).setId(11243), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(11244), IReturn(ERef(RefId(Id("""__x10__""")))).setId(11245)).setId(11246), ISeq(List()).setId(11157)).setId(11247), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(11248), IReturn(ERef(RefId(Id("""__x11__""")))).setId(11249))).setId(11250), ISeq(List()).setId(11157)).setId(11251)).setId(11253), ILet(Id("""genContext"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorContext""")))).setId(11255), ILet(Id("""callerContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(11257), IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(11259), IAssign(RefId(Id("""callerContext""")), ENull).setId(11260), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""executing""")).setId(11262), IAppend(ERef(RefId(Id("""genContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(11264), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(11265), IWithCont(Id("""__x12__"""), List(Id("""result""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")), EList(List())).setId(11267), ISeq(List()).setId(11269)).setId(11270), IAppend(ERef(RefId(Id("""__x12__"""))), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")))).setId(11271), IApp(Id("""__x13__"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont"""))), List(ERef(RefId(Id("""completion"""))))).setId(11272))).setId(11273)).setId(11274), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(11276), IReturn(ERef(RefId(Id("""__x14__""")))).setId(11277))).setId(-1))
  /* Beautified form:
  "AsyncGeneratorResumeNext" (generator) => {
    let state = generator["AsyncGeneratorState"]
    if (= state "awaiting-return") {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    let queue = generator["AsyncGeneratorQueue"]
    if (= queue["length"] 0i) {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    } else {}
    let next = queue[0i]
    let completion = next["Completion"]
    app __x2__ = (IsAbruptCompletion completion)
    if __x2__ {
      if (= state "suspendedStart") {
        generator["AsyncGeneratorState"] = "completed"
        state = "completed"
      } else {}
      if (= state "completed") if (= completion["Type"] CONST_return) {
        generator["AsyncGeneratorState"] = "awaiting-return"
        app __x3__ = (PromiseResolve INTRINSIC_Promise completion["Value"])
        if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        let promise = __x3__
        let stepsFulfilled = !!! "Algorithms"
        app __x4__ = (CreateBuiltinFunction stepsFulfilled (new ["Generator"]))
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        let onFulfilled = __x4__
        onFulfilled["Generator"] = generator
        let stepsRejected = !!! "Algorithms"
        app __x5__ = (CreateBuiltinFunction stepsRejected (new ["Generator"]))
        if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        let onRejected = __x5__
        onRejected["Generator"] = generator
        app __x6__ = (PerformPromiseThen promise onFulfilled onRejected)
        if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        __x6__
        app __x7__ = (WrapCompletion undefined)
        return __x7__
      } else {
        app __x8__ = (AsyncGeneratorReject generator completion["Value"])
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        __x8__
        app __x9__ = (WrapCompletion undefined)
        return __x9__
      } else {}
    } else if (= state "completed") {
      app __x10__ = (AsyncGeneratorResolve generator undefined true)
      if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    let genContext = generator["AsyncGeneratorContext"]
    let callerContext = GLOBAL_context
    GLOBAL_context = null
    callerContext = null
    generator["AsyncGeneratorState"] = "executing"
    append genContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    withcont __x12__ (result) ={
      if (= genContext["ReturnCont"] absent) genContext["ReturnCont"] = (new []) else {}
      append __x12__ -> genContext["ReturnCont"]
      app __x13__ = (genContext["ResumeCont"] completion)
    }
    app __x14__ = (WrapCompletion undefined)
    return __x14__
  }
  */
}
