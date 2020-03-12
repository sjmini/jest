package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorResumeNext {
  val length: Int = 1
  val func: Func = Func("""AsyncGeneratorResumeNext""", List(Id("""generator""")), None, ISeq(List(ILet(Id("""state"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")))).setId(11158), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""awaiting-return""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(11160), IReturn(ERef(RefId(Id("""__x0__""")))).setId(11161))).setId(11283), ISeq(List()).setId(11284)).setId(11163), ILet(Id("""queue"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorQueue""")))).setId(11165), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""queue""")), EStr("""length"""))), EINum(0L)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(11167), IReturn(ERef(RefId(Id("""__x1__""")))).setId(11168))).setId(11289), ISeq(List()).setId(11290)).setId(11170), ILet(Id("""next"""), ERef(RefProp(RefId(Id("""queue""")), EINum(0L)))).setId(11172), ILet(Id("""completion"""), ERef(RefProp(RefId(Id("""next""")), EStr("""Completion""")))).setId(11174), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""completion"""))))).setId(11176), IIf(ERef(RefId(Id("""__x2__"""))), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""suspendedStart""")), ISeq(List(IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""completed""")).setId(11177), IAssign(RefId(Id("""state""")), EStr("""completed""")).setId(11179))).setId(11297), ISeq(List()).setId(11298)).setId(11182), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""completed""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""completion""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ISeq(List(IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""awaiting-return""")).setId(11184), IApp(Id("""__x3__"""), ERef(RefId(Id("""PromiseResolve"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))), ERef(RefProp(RefId(Id("""completion""")), EStr("""Value"""))))).setId(11186), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(11187), IReturn(ERef(RefId(Id("""__x3__""")))).setId(11188)).setId(11189), ISeq(List()).setId(11305)).setId(11190), ILet(Id("""promise"""), ERef(RefId(Id("""__x3__""")))).setId(11191), ILet(Id("""stepsFulfilled"""), ENotSupported("""Algorithms""")).setId(11193), IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsFulfilled"""))), EList(List(EStr("""Generator"""))))).setId(11195), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(11196), IReturn(ERef(RefId(Id("""__x4__""")))).setId(11197)).setId(11198), ISeq(List()).setId(11313)).setId(11199), ILet(Id("""onFulfilled"""), ERef(RefId(Id("""__x4__""")))).setId(11200), IAssign(RefProp(RefId(Id("""onFulfilled""")), EStr("""Generator""")), ERef(RefId(Id("""generator""")))).setId(11202), ILet(Id("""stepsRejected"""), ENotSupported("""Algorithms""")).setId(11204), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsRejected"""))), EList(List(EStr("""Generator"""))))).setId(11206), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(11207), IReturn(ERef(RefId(Id("""__x5__""")))).setId(11208)).setId(11209), ISeq(List()).setId(11322)).setId(11210), ILet(Id("""onRejected"""), ERef(RefId(Id("""__x5__""")))).setId(11211), IAssign(RefProp(RefId(Id("""onRejected""")), EStr("""Generator""")), ERef(RefId(Id("""generator""")))).setId(11213), IApp(Id("""__x6__"""), ERef(RefId(Id("""PerformPromiseThen"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""onFulfilled"""))), ERef(RefId(Id("""onRejected"""))))).setId(11215), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(11216), IReturn(ERef(RefId(Id("""__x6__""")))).setId(11217)).setId(11218), ISeq(List()).setId(11330)).setId(11219), IExpr(ERef(RefId(Id("""__x6__""")))).setId(11220), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(11222), IReturn(ERef(RefId(Id("""__x7__""")))).setId(11223))).setId(11335), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""AsyncGeneratorReject"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefProp(RefId(Id("""completion""")), EStr("""Value"""))))).setId(11226), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(11227), IReturn(ERef(RefId(Id("""__x8__""")))).setId(11228)).setId(11229), ISeq(List()).setId(11340)).setId(11230), IExpr(ERef(RefId(Id("""__x8__""")))).setId(11231), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(11233), IReturn(ERef(RefId(Id("""__x9__""")))).setId(11234))).setId(11345)).setId(11237), ISeq(List()).setId(11347)).setId(11240))).setId(11349), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""completed""")), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""AsyncGeneratorResolve"""))), List(ERef(RefId(Id("""generator"""))), EUndef, EBool(true))).setId(11243), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(11244), IReturn(ERef(RefId(Id("""__x10__""")))).setId(11245)).setId(11246), ISeq(List()).setId(11354)).setId(11247), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(11248), IReturn(ERef(RefId(Id("""__x11__""")))).setId(11249))).setId(11358), ISeq(List()).setId(11359)).setId(11251)).setId(11253), ILet(Id("""genContext"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorContext""")))).setId(11255), ILet(Id("""callerContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(11257), IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(11259), IAssign(RefId(Id("""callerContext""")), ENull).setId(11260), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""executing""")).setId(11262), IAppend(ERef(RefId(Id("""genContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(11264), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(11265), IWithCont(Id("""__x12__"""), List(Id("""result""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")), EList(List())).setId(11267), ISeq(List()).setId(11370)).setId(11270), IAppend(ERef(RefId(Id("""__x12__"""))), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")))).setId(11271), IApp(Id("""__x13__"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont"""))), List(ERef(RefId(Id("""completion"""))))).setId(11272))).setId(11374)).setId(11274), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(11276), IReturn(ERef(RefId(Id("""__x14__""")))).setId(11277))).setId(11378))
  val instToStepMap: Map[Int, Int] = HashMap(11161 -> 3, 11176 -> 38, 11259 -> 42, 11211 -> 31, 11235 -> 36, 11164 -> 4, 11192 -> 31, 11186 -> 31, 11175 -> 10, 11224 -> 31, 11256 -> 40, 11277 -> 48, 11266 -> 44, 11160 -> 3, 11239 -> 36, 11171 -> 7, 11260 -> 42, 11273 -> 45, 11250 -> 37, 11203 -> 31, 11178 -> 16, 11200 -> 31, 11183 -> 36, 11232 -> 36, 11264 -> 44, 11247 -> 37, 11163 -> 4, 11215 -> 31, 11168 -> 6, 11242 -> 36, 11265 -> 44, 11270 -> 45, 11195 -> 31, 11159 -> 1, 11170 -> 7, 11202 -> 31, 11253 -> 38, 11255 -> 40, 11238 -> 36, 11223 -> 31, 11212 -> 31, 11191 -> 31, 11185 -> 31, 11249 -> 37, 11174 -> 10, 11206 -> 31, 11234 -> 36, 11221 -> 31, 11278 -> 48, 11157 -> 47, 11243 -> 37, 11248 -> 37, 11184 -> 31, 11261 -> 42, 11274 -> 45, 11165 -> 5, 11179 -> 16, 11226 -> 36, 11254 -> 38, 11201 -> 31, 11237 -> 36, 11169 -> 6, 11222 -> 31, 11190 -> 31, 11205 -> 31, 11233 -> 36, 11158 -> 1, 11173 -> 8, 11220 -> 31, 11262 -> 43, 11193 -> 31, 11272 -> 45, 11230 -> 36, 11275 -> 45, 11252 -> 38, 11225 -> 31, 11166 -> 5, 11180 -> 16, 11257 -> 41, 11213 -> 31, 11181 -> 16, 11240 -> 36, 11210 -> 31, 11172 -> 8, 11167 -> 6, 11271 -> 45, 11219 -> 31, 11263 -> 43, 11194 -> 31, 11162 -> 3, 11231 -> 36, 11204 -> 31, 11214 -> 31, 11199 -> 31, 11236 -> 36, 11177 -> 16, 11258 -> 41, 11182 -> 36, 11276 -> 48, 11251 -> 38, 11241 -> 36)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(11157), 5 -> HashSet(11165, 11166), 10 -> HashSet(11175, 11174), 1 -> HashSet(11159, 11158), 6 -> HashSet(11168, 11169, 11167), 9 -> HashSet(11157), 41 -> HashSet(11257, 11258), 2 -> HashSet(11157), 48 -> HashSet(11277, 11278, 11276), 43 -> HashSet(11262, 11263), 8 -> HashSet(11173, 11172), 4 -> HashSet(11164, 11163), 42 -> HashSet(11260, 11261, 11259), 24 -> HashSet(11193, 11194), 37 -> HashSet(11250, 11247, 11249, 11243, 11248), 25 -> HashSet(11200, 11195, 11201, 11199), 46 -> HashSet(11157), 29 -> HashSet(11213, 11214), 28 -> HashSet(11211, 11212, 11206, 11210), 38 -> HashSet(11253, 11254, 11252, 11176, 11251), 34 -> HashSet(11157), 45 -> HashSet(11273, 11270, 11274, 11272, 11275, 11271), 17 -> HashSet(11183, 11182), 22 -> HashSet(11185, 11184), 44 -> HashSet(11266, 11264, 11265), 27 -> HashSet(11205, 11204), 7 -> HashSet(11171, 11170), 39 -> HashSet(11157), 3 -> HashSet(11160, 11161, 11162), 35 -> HashSet(11232, 11226, 11230, 11231), 16 -> HashSet(11178, 11179, 11180, 11181, 11177), 31 -> HashSet(11224, 11215, 11195, 11202, 11206, 11221, 11184, 11201, 11222, 11225, 11213, 11210, 11219, 11211, 11192, 11186, 11203, 11200, 11223, 11212, 11191, 11185, 11190, 11205, 11220, 11193, 11194, 11204, 11214, 11199), 40 -> HashSet(11256, 11255), 26 -> HashSet(11203, 11202), 23 -> HashSet(11191, 11190, 11192, 11186), 36 -> HashSet(11235, 11239, 11242, 11238, 11234, 11157, 11226, 11237, 11233, 11230, 11240, 11231, 11241, 11183, 11232, 11236, 11182), 30 -> HashSet(11215, 11221, 11220, 11219), 47 -> HashSet(11157), 15 -> HashSet(11178, 11177))
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
