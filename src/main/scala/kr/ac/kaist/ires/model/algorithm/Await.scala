package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Await {
  val length: Int = 0
  val func: Func = Func("""Await""", List(Id("""value""")), None, ISeq(List(ILet(Id("""asyncContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(147), IApp(Id("""__x0__"""), ERef(RefId(Id("""PromiseResolve"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))), ERef(RefId(Id("""value"""))))).setId(149), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(150), IReturn(ERef(RefId(Id("""__x0__""")))).setId(151)).setId(152), ISeq(List()).setId(207)).setId(154), ILet(Id("""promise"""), ERef(RefId(Id("""__x0__""")))).setId(155), ILet(Id("""stepsFulfilled"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(1L)), (EStr("""step"""), ERef(RefId(Id("""GLOBALDOTAwaitFulfilledFunctions"""))))))).setId(157), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsFulfilled"""))), EList(List(EStr("""AsyncContext"""))))).setId(159), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(160), IReturn(ERef(RefId(Id("""__x1__""")))).setId(161)).setId(162), ISeq(List()).setId(215)).setId(163), ILet(Id("""onFulfilled"""), ERef(RefId(Id("""__x1__""")))).setId(164), IAssign(RefProp(RefId(Id("""onFulfilled""")), EStr("""AsyncContext""")), ERef(RefId(Id("""asyncContext""")))).setId(166), ILet(Id("""stepsRejected"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(1L)), (EStr("""step"""), ERef(RefId(Id("""GLOBALDOTAwaitRejectedFunctions"""))))))).setId(168), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsRejected"""))), EList(List(EStr("""AsyncContext"""))))).setId(170), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(171), IReturn(ERef(RefId(Id("""__x2__""")))).setId(172)).setId(173), ISeq(List()).setId(224)).setId(174), ILet(Id("""onRejected"""), ERef(RefId(Id("""__x2__""")))).setId(175), IAssign(RefProp(RefId(Id("""onRejected""")), EStr("""AsyncContext""")), ERef(RefId(Id("""asyncContext""")))).setId(177), IApp(Id("""__x3__"""), ERef(RefId(Id("""PerformPromiseThen"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""onFulfilled"""))), ERef(RefId(Id("""onRejected"""))))).setId(179), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(180), IReturn(ERef(RefId(Id("""__x3__""")))).setId(181)).setId(182), ISeq(List()).setId(232)).setId(183), IExpr(ERef(RefId(Id("""__x3__""")))).setId(184), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""asyncContext""")))), ISeq(List(IAssign(RefId(Id("""__x4__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(186), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x4__"""))))).setId(187))).setId(237), ISeq(List()).setId(238)).setId(190), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(191), IAccess(Id("""__ret__"""), ERef(RefId(Id("""asyncContext"""))), EStr("""ReturnCont""")).setId(193), IAssign(RefId(Id("""__ret__""")), EPop(ERef(RefId(Id("""__ret__"""))), EINum(0L))).setId(194), IAssign(RefProp(RefId(Id("""asyncContext""")), EStr("""ResumeCont""")), ECont(List(Id("""completion""")), IReturn(ERef(RefId(Id("""completion""")))).setId(195))).setId(196), IApp(Id("""__x5__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(198), IApp(Id("""__x6__"""), ERef(RefId(Id("""__ret__"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(199))).setId(247))
  val instToStepMap: Map[Int, Int] = HashMap(170 -> 6, 153 -> 12, 147 -> 0, 197 -> 10, 193 -> 10, 159 -> 3, 167 -> 4, 194 -> 10, 158 -> 2, 174 -> 6, 185 -> 8, 184 -> 8, 196 -> 10, 157 -> 2, 164 -> 3, 179 -> 8, 192 -> 9, 165 -> 3, 156 -> 1, 169 -> 5, 166 -> 4, 148 -> 0, 149 -> 1, 176 -> 6, 191 -> 9, 155 -> 1, 198 -> 11, 199 -> 11, 177 -> 7, 154 -> 1, 175 -> 6, 168 -> 5, 190 -> 9, 183 -> 8, 178 -> 7, 163 -> 3, 200 -> 11)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(147, 148), 5 -> HashSet(169, 168), 10 -> HashSet(196, 197, 193, 194), 1 -> HashSet(156, 149, 155, 154), 6 -> HashSet(170, 174, 176, 175), 9 -> HashSet(192, 191, 190), 2 -> HashSet(157, 158), 12 -> HashSet(153), 7 -> HashSet(177, 178), 3 -> HashSet(164, 165, 159, 163), 11 -> HashSet(198, 199, 200), 8 -> HashSet(185, 184, 179, 183), 4 -> HashSet(166, 167))
  /* Beautified form:
  "Await" (value) => {
    let asyncContext = GLOBAL_context
    app __x0__ = (PromiseResolve INTRINSIC_Promise value)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let promise = __x0__
    let stepsFulfilled = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTAwaitFulfilledFunctions))
    app __x1__ = (CreateBuiltinFunction stepsFulfilled (new ["AsyncContext"]))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let onFulfilled = __x1__
    onFulfilled["AsyncContext"] = asyncContext
    let stepsRejected = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTAwaitRejectedFunctions))
    app __x2__ = (CreateBuiltinFunction stepsRejected (new ["AsyncContext"]))
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let onRejected = __x2__
    onRejected["AsyncContext"] = asyncContext
    app __x3__ = (PerformPromiseThen promise onFulfilled onRejected)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] asyncContext) {
      __x4__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x4__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    access __ret__ = (asyncContext "ReturnCont")
    __ret__ = (pop __ret__ 0i)
    asyncContext["ResumeCont"] = (completion) [=>] return completion
    app __x5__ = (NormalCompletion undefined)
    app __x6__ = (__ret__ __x5__)
  }
  */
}
