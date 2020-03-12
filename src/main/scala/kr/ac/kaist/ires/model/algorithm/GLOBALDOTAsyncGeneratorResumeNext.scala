package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTAsyncGeneratorResumeNext {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.AsyncGeneratorResumeNext""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(89972), ILet(Id("""generator"""), ERef(RefId(Id("""__x0__""")))).setId(89973), ILet(Id("""state"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")))).setId(89976), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""awaiting-return""")), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(89978), IReturn(ERef(RefId(Id("""__x1__""")))).setId(89979))).setId(90103), ISeq(List()).setId(90104)).setId(89981), ILet(Id("""queue"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorQueue""")))).setId(89983), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""queue""")), EStr("""length"""))), EINum(0L)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(89985), IReturn(ERef(RefId(Id("""__x2__""")))).setId(89986))).setId(90109), ISeq(List()).setId(90110)).setId(89988), ILet(Id("""next"""), ERef(RefProp(RefId(Id("""queue""")), EINum(0L)))).setId(89990), ILet(Id("""completion"""), ERef(RefProp(RefId(Id("""next""")), EStr("""Completion""")))).setId(89992), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""completion"""))))).setId(89994), IIf(ERef(RefId(Id("""__x3__"""))), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""suspendedStart""")), ISeq(List(IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""completed""")).setId(89995), IAssign(RefId(Id("""state""")), EStr("""completed""")).setId(89997))).setId(90117), ISeq(List()).setId(90118)).setId(90000), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""completed""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""completion""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ISeq(List(IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""awaiting-return""")).setId(90002), IApp(Id("""__x4__"""), ERef(RefId(Id("""PromiseResolve"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))), ERef(RefProp(RefId(Id("""completion""")), EStr("""Value"""))))).setId(90004), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(90005), IReturn(ERef(RefId(Id("""__x4__""")))).setId(90006)).setId(90007), ISeq(List()).setId(90125)).setId(90008), ILet(Id("""promise"""), ERef(RefId(Id("""__x4__""")))).setId(90009), ILet(Id("""stepsFulfilled"""), ENotSupported("""Algorithms""")).setId(90011), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsFulfilled"""))), EList(List(EStr("""Generator"""))))).setId(90013), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(90014), IReturn(ERef(RefId(Id("""__x5__""")))).setId(90015)).setId(90016), ISeq(List()).setId(90133)).setId(90017), ILet(Id("""onFulfilled"""), ERef(RefId(Id("""__x5__""")))).setId(90018), IAssign(RefProp(RefId(Id("""onFulfilled""")), EStr("""Generator""")), ERef(RefId(Id("""generator""")))).setId(90020), ILet(Id("""stepsRejected"""), ENotSupported("""Algorithms""")).setId(90022), IApp(Id("""__x6__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsRejected"""))), EList(List(EStr("""Generator"""))))).setId(90024), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(90025), IReturn(ERef(RefId(Id("""__x6__""")))).setId(90026)).setId(90027), ISeq(List()).setId(90142)).setId(90028), ILet(Id("""onRejected"""), ERef(RefId(Id("""__x6__""")))).setId(90029), IAssign(RefProp(RefId(Id("""onRejected""")), EStr("""Generator""")), ERef(RefId(Id("""generator""")))).setId(90031), IApp(Id("""__x7__"""), ERef(RefId(Id("""PerformPromiseThen"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""onFulfilled"""))), ERef(RefId(Id("""onRejected"""))))).setId(90033), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(90034), IReturn(ERef(RefId(Id("""__x7__""")))).setId(90035)).setId(90036), ISeq(List()).setId(90150)).setId(90037), IExpr(ERef(RefId(Id("""__x7__""")))).setId(90038), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(90040), IReturn(ERef(RefId(Id("""__x8__""")))).setId(90041))).setId(90155), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""AsyncGeneratorReject"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefProp(RefId(Id("""completion""")), EStr("""Value"""))))).setId(90044), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(90045), IReturn(ERef(RefId(Id("""__x9__""")))).setId(90046)).setId(90047), ISeq(List()).setId(90160)).setId(90048), IExpr(ERef(RefId(Id("""__x9__""")))).setId(90049), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(90051), IReturn(ERef(RefId(Id("""__x10__""")))).setId(90052))).setId(90165)).setId(90055), ISeq(List()).setId(90167)).setId(90058))).setId(90169), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""completed""")), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""AsyncGeneratorResolve"""))), List(ERef(RefId(Id("""generator"""))), EUndef, EBool(true))).setId(90061), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(90062), IReturn(ERef(RefId(Id("""__x11__""")))).setId(90063)).setId(90064), ISeq(List()).setId(90174)).setId(90065), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))).setId(90066), IReturn(ERef(RefId(Id("""__x12__""")))).setId(90067))).setId(90178), ISeq(List()).setId(90179)).setId(90069)).setId(90071), ILet(Id("""genContext"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorContext""")))).setId(90073), ILet(Id("""callerContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(90075), IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(90077), IAssign(RefId(Id("""callerContext""")), ENull).setId(90078), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""executing""")).setId(90080), IAppend(ERef(RefId(Id("""genContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(90082), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(90083), IWithCont(Id("""__x13__"""), List(Id("""result""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")), EList(List())).setId(90085), ISeq(List()).setId(90190)).setId(90088), IAppend(ERef(RefId(Id("""__x13__"""))), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")))).setId(90089), IApp(Id("""__x14__"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont"""))), List(ERef(RefId(Id("""completion"""))))).setId(90090))).setId(90194)).setId(90092), IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(90094), IReturn(ERef(RefId(Id("""__x15__""")))).setId(90095))).setId(90198))
  val instToStepMap: Map[Int, Int] = HashMap(90083 -> 45, 90001 -> 37, 90044 -> 37, 90012 -> 32, 90091 -> 46, 89981 -> 5, 90072 -> 39, 90050 -> 37, 90082 -> 45, 90069 -> 39, 90040 -> 32, 90037 -> 32, 89993 -> 11, 90033 -> 32, 90013 -> 32, 89984 -> 6, 90094 -> 49, 89998 -> 17, 90065 -> 38, 90058 -> 37, 89991 -> 9, 90090 -> 46, 90096 -> 49, 90032 -> 32, 90023 -> 32, 90041 -> 32, 89977 -> 2, 89987 -> 7, 90054 -> 37, 89974 -> 0, 90073 -> 41, 90019 -> 32, 90002 -> 32, 90066 -> 38, 90009 -> 32, 89999 -> 17, 90022 -> 32, 89994 -> 39, 90031 -> 32, 90051 -> 37, 90000 -> 37, 89982 -> 5, 89986 -> 7, 90030 -> 32, 90076 -> 42, 90055 -> 37, 90048 -> 37, 90077 -> 43, 89976 -> 2, 90057 -> 37, 90038 -> 32, 90070 -> 39, 90008 -> 32, 89990 -> 9, 90018 -> 32, 90089 -> 46, 90080 -> 44, 89973 -> 0, 90010 -> 32, 89972 -> 0, 90004 -> 32, 90079 -> 43, 89983 -> 6, 90084 -> 45, 89978 -> 4, 90039 -> 32, 90067 -> 38, 89995 -> 17, 90061 -> 38, 90071 -> 39, 90028 -> 32, 89996 -> 17, 90017 -> 32, 90093 -> 46, 89985 -> 7, 90092 -> 46, 89992 -> 11, 90024 -> 32, 90021 -> 32, 90075 -> 42, 90043 -> 32, 90052 -> 37, 89989 -> 8, 90095 -> 49, 90020 -> 32, 89988 -> 8, 90053 -> 37, 90068 -> 38, 90056 -> 37, 90049 -> 37, 90078 -> 43, 90029 -> 32, 90011 -> 32, 90088 -> 46, 90060 -> 37, 89997 -> 17, 90081 -> 44, 89979 -> 4, 89975 -> 48, 90074 -> 41, 89980 -> 4, 90042 -> 32, 90059 -> 37, 90003 -> 32)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(89974, 89973, 89972), 5 -> HashSet(89981, 89982), 10 -> HashSet(89975), 1 -> HashSet(89975), 6 -> HashSet(89984, 89983), 9 -> HashSet(89991, 89990), 41 -> HashSet(90073, 90074), 2 -> HashSet(89977, 89976), 49 -> HashSet(90094, 90096, 90095), 8 -> HashSet(89989, 89988), 4 -> HashSet(89978, 89979, 89980), 47 -> HashSet(89975), 42 -> HashSet(90076, 90075), 24 -> HashSet(90009, 90008, 90010, 90004), 37 -> HashSet(90050, 90058, 90054, 90001, 90057, 90044, 90052, 90053, 90056, 90049, 90060, 89975, 90059, 90051, 90000, 90055, 90048), 25 -> HashSet(90011, 90012), 46 -> HashSet(90090, 90089, 90088, 90091, 90093, 90092), 29 -> HashSet(90030, 90028, 90024, 90029), 28 -> HashSet(90023, 90022), 38 -> HashSet(90065, 90066, 90067, 90061, 90068), 32 -> HashSet(90041, 90009, 90030, 90018, 90039, 90043, 90020, 90029, 90011, 90042, 90012, 90003, 90040, 90037, 90033, 90013, 90032, 90023, 90019, 90002, 90022, 90031, 90038, 90008, 90010, 90004, 90028, 90017, 90021, 90024), 45 -> HashSet(90082, 90083, 90084), 17 -> HashSet(89998, 89999, 89995, 89996, 89997), 44 -> HashSet(90080, 90081), 27 -> HashSet(90021, 90020), 7 -> HashSet(89987, 89986, 89985), 39 -> HashSet(90072, 90069, 89994, 90070, 90071), 3 -> HashSet(89975), 35 -> HashSet(89975), 48 -> HashSet(89975), 18 -> HashSet(90000, 90001), 16 -> HashSet(89995, 89996), 31 -> HashSet(90037, 90033, 90038, 90039), 11 -> HashSet(89993, 89992), 43 -> HashSet(90077, 90079, 90078), 40 -> HashSet(89975), 26 -> HashSet(90013, 90019, 90018, 90017), 23 -> HashSet(90002, 90003), 36 -> HashSet(90050, 90048, 90044, 90049), 30 -> HashSet(90032, 90031))
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
