package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTPerformPromiseThen {
  val length: Int = 3
  val func: Func = Func("""GLOBAL.PerformPromiseThen""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(93397), ILet(Id("""promise"""), ERef(RefId(Id("""__x0__""")))).setId(93398), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(93400), ILet(Id("""onFulfilled"""), ERef(RefId(Id("""__x1__""")))).setId(93401), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(2L))).setId(93403), ILet(Id("""onRejected"""), ERef(RefId(Id("""__x2__""")))).setId(93404), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(3L))).setId(93406), ILet(Id("""resultCapability"""), ERef(RefId(Id("""__x3__""")))).setId(93407), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(3L))), EAbsent)), ISeq(List()).setId(93479), IAssign(RefId(Id("""resultCapability""")), EUndef).setId(93411)).setId(93414), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""onFulfilled"""))))).setId(93416), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), IAssign(RefId(Id("""onFulfilled""")), EUndef).setId(93417), ISeq(List()).setId(93484)).setId(93420), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""onRejected"""))))).setId(93422), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(false)), IAssign(RefId(Id("""onRejected""")), EUndef).setId(93423), ISeq(List()).setId(93488)).setId(93426), ILet(Id("""fulfillReaction"""), EMap(Ty("""PromiseReaction"""), List((EStr("""Capability"""), ERef(RefId(Id("""resultCapability""")))), (EStr("""Type"""), EStr("""Fulfill""")), (EStr("""Handler"""), ERef(RefId(Id("""onFulfilled"""))))))).setId(93428), ILet(Id("""rejectReaction"""), EMap(Ty("""PromiseReaction"""), List((EStr("""Capability"""), ERef(RefId(Id("""resultCapability""")))), (EStr("""Type"""), EStr("""Reject""")), (EStr("""Handler"""), ERef(RefId(Id("""onRejected"""))))))).setId(93430), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseState"""))), EStr("""pending""")), ISeq(List(IAppend(ERef(RefId(Id("""fulfillReaction"""))), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")))).setId(93432), IAppend(ERef(RefId(Id("""rejectReaction"""))), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")))).setId(93434))).setId(93494), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseState"""))), EStr("""fulfilled""")), ISeq(List(ILet(Id("""value"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")))).setId(93437), IApp(Id("""__x6__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""PromiseJobs"""), ERef(RefId(Id("""PromiseReactionJob"""))), EList(List(ERef(RefId(Id("""fulfillReaction"""))), ERef(RefId(Id("""value"""))))))).setId(93439), IExpr(ERef(RefId(Id("""__x6__""")))).setId(93440))).setId(93498), ISeq(List(ILet(Id("""reason"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")))).setId(93443), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseIsHandled"""))), EBool(false)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""HostPromiseRejectionTracker"""))), List(ERef(RefId(Id("""promise"""))), EStr("""handle"""))).setId(93445), IExpr(ERef(RefId(Id("""__x7__""")))).setId(93446))).setId(93502), ISeq(List()).setId(93503)).setId(93448), IApp(Id("""__x8__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""PromiseJobs"""), ERef(RefId(Id("""PromiseReactionJob"""))), EList(List(ERef(RefId(Id("""rejectReaction"""))), ERef(RefId(Id("""reason"""))))))).setId(93450), IExpr(ERef(RefId(Id("""__x8__""")))).setId(93451))).setId(93507)).setId(93454)).setId(93456), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseIsHandled""")), EBool(true)).setId(93458), IIf(EBOp(OEq, ERef(RefId(Id("""resultCapability"""))), EUndef), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(93460), IReturn(ERef(RefId(Id("""__x9__""")))).setId(93461))).setId(93513), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Promise"""))))).setId(93464), IReturn(ERef(RefId(Id("""__x10__""")))).setId(93465))).setId(93516)).setId(93468))).setId(93518))
  val instToStepMap: Map[Int, Int] = HashMap(93428 -> 19, 93411 -> 10, 93440 -> 28, 93436 -> 24, 93414 -> 10, 93445 -> 33, 93406 -> 3, 93419 -> 13, 93412 -> 10, 93407 -> 3, 93442 -> 28, 93468 -> 42, 93421 -> 14, 93446 -> 33, 93464 -> 42, 93417 -> 13, 93439 -> 28, 93404 -> 2, 93459 -> 36, 93408 -> 3, 93456 -> 35, 93410 -> 7, 93405 -> 2, 93433 -> 24, 93432 -> 24, 93422 -> 18, 93458 -> 36, 93453 -> 35, 93400 -> 1, 93437 -> 28, 93427 -> 18, 93448 -> 35, 93401 -> 1, 93463 -> 39, 93418 -> 13, 93462 -> 39, 93441 -> 28, 93426 -> 18, 93409 -> 35, 93454 -> 35, 93449 -> 35, 93469 -> 42, 93434 -> 24, 93451 -> 35, 93438 -> 28, 93447 -> 33, 93457 -> 35, 93399 -> 0, 93402 -> 1, 93444 -> 35, 93398 -> 0, 93461 -> 39, 93413 -> 10, 93450 -> 35, 93430 -> 20, 93416 -> 14, 93465 -> 42, 93425 -> 17, 93431 -> 20, 93452 -> 35, 93423 -> 17, 93467 -> 42, 93420 -> 14, 93460 -> 39, 93466 -> 42, 93443 -> 35, 93415 -> 10, 93403 -> 2, 93397 -> 0, 93429 -> 19, 93435 -> 24, 93455 -> 35, 93424 -> 17)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(93399, 93398, 93397), 10 -> HashSet(93411, 93414, 93413, 93412, 93415), 14 -> HashSet(93421, 93416, 93420), 20 -> HashSet(93430, 93431), 1 -> HashSet(93402, 93401, 93400), 13 -> HashSet(93417, 93418, 93419), 2 -> HashSet(93404, 93405, 93403), 27 -> HashSet(93437, 93438), 18 -> HashSet(93422, 93427, 93426), 31 -> HashSet(93409), 23 -> HashSet(93433, 93432), 4 -> HashSet(93409), 42 -> HashSet(93468, 93464, 93469, 93465, 93467, 93466), 24 -> HashSet(93436, 93433, 93432, 93434, 93435), 28 -> HashSet(93442, 93439, 93440, 93437, 93441, 93438), 33 -> HashSet(93446, 93445, 93447), 17 -> HashSet(93425, 93423, 93424), 32 -> HashSet(93444, 93443), 34 -> HashSet(93448, 93449), 7 -> HashSet(93410, 93409), 39 -> HashSet(93461, 93460, 93463, 93462), 3 -> HashSet(93408, 93406, 93407), 35 -> HashSet(93456, 93453, 93448, 93451, 93457, 93444, 93450, 93452, 93443, 93455, 93409, 93454, 93449), 36 -> HashSet(93459, 93458), 19 -> HashSet(93428, 93429))
  /* Beautified form:
  "GLOBAL.PerformPromiseThen" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let promise = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let onFulfilled = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let onRejected = __x2__
    app __x3__ = (GetArgument argumentsList 3i)
    let resultCapability = __x3__
    if (! (= argumentsList[3i] absent)) {} else resultCapability = undefined
    app __x4__ = (IsCallable onFulfilled)
    if (= __x4__ false) onFulfilled = undefined else {}
    app __x5__ = (IsCallable onRejected)
    if (= __x5__ false) onRejected = undefined else {}
    let fulfillReaction = (new PromiseReaction("Capability" -> resultCapability, "Type" -> "Fulfill", "Handler" -> onFulfilled))
    let rejectReaction = (new PromiseReaction("Capability" -> resultCapability, "Type" -> "Reject", "Handler" -> onRejected))
    if (= promise["PromiseState"] "pending") {
      append fulfillReaction -> promise["PromiseFulfillReactions"]
      append rejectReaction -> promise["PromiseRejectReactions"]
    } else if (= promise["PromiseState"] "fulfilled") {
      let value = promise["PromiseResult"]
      app __x6__ = (EnqueueJob "PromiseJobs" PromiseReactionJob (new [fulfillReaction, value]))
      __x6__
    } else {
      let reason = promise["PromiseResult"]
      if (= promise["PromiseIsHandled"] false) {
        app __x7__ = (HostPromiseRejectionTracker promise "handle")
        __x7__
      } else {}
      app __x8__ = (EnqueueJob "PromiseJobs" PromiseReactionJob (new [rejectReaction, reason]))
      __x8__
    }
    promise["PromiseIsHandled"] = true
    if (= resultCapability undefined) {
      app __x9__ = (WrapCompletion undefined)
      return __x9__
    } else {
      app __x10__ = (WrapCompletion resultCapability["Promise"])
      return __x10__
    }
  }
  */
}
