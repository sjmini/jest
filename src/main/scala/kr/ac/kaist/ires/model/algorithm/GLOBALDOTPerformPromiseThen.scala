package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPerformPromiseThen {
  val length: Int = 3
  val func: Func = Func("""GLOBAL.PerformPromiseThen""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(93397), ILet(Id("""promise"""), ERef(RefId(Id("""__x0__""")))).setId(93398), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(93400), ILet(Id("""onFulfilled"""), ERef(RefId(Id("""__x1__""")))).setId(93401), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(2L))).setId(93403), ILet(Id("""onRejected"""), ERef(RefId(Id("""__x2__""")))).setId(93404), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(3L))).setId(93406), ILet(Id("""resultCapability"""), ERef(RefId(Id("""__x3__""")))).setId(93407), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(3L))), EAbsent)), ISeq(List()).setId(93410), IAssign(RefId(Id("""resultCapability""")), EUndef).setId(93411)).setId(93414), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""onFulfilled"""))))).setId(93416), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), IAssign(RefId(Id("""onFulfilled""")), EUndef).setId(93417), ISeq(List()).setId(93409)).setId(93420), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""onRejected"""))))).setId(93422), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(false)), IAssign(RefId(Id("""onRejected""")), EUndef).setId(93423), ISeq(List()).setId(93409)).setId(93426), ILet(Id("""fulfillReaction"""), EMap(Ty("""PromiseReaction"""), List((EStr("""Capability"""), ERef(RefId(Id("""resultCapability""")))), (EStr("""Type"""), EStr("""Fulfill""")), (EStr("""Handler"""), ERef(RefId(Id("""onFulfilled"""))))))).setId(93428), ILet(Id("""rejectReaction"""), EMap(Ty("""PromiseReaction"""), List((EStr("""Capability"""), ERef(RefId(Id("""resultCapability""")))), (EStr("""Type"""), EStr("""Reject""")), (EStr("""Handler"""), ERef(RefId(Id("""onRejected"""))))))).setId(93430), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseState"""))), EStr("""pending""")), ISeq(List(IAppend(ERef(RefId(Id("""fulfillReaction"""))), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")))).setId(93432), IAppend(ERef(RefId(Id("""rejectReaction"""))), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")))).setId(93434))).setId(93436), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseState"""))), EStr("""fulfilled""")), ISeq(List(ILet(Id("""value"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")))).setId(93437), IApp(Id("""__x6__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""PromiseJobs"""), ERef(RefId(Id("""PromiseReactionJob"""))), EList(List(ERef(RefId(Id("""fulfillReaction"""))), ERef(RefId(Id("""value"""))))))).setId(93439), IExpr(ERef(RefId(Id("""__x6__""")))).setId(93440))).setId(93442), ISeq(List(ILet(Id("""reason"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")))).setId(93443), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseIsHandled"""))), EBool(false)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""HostPromiseRejectionTracker"""))), List(ERef(RefId(Id("""promise"""))), EStr("""handle"""))).setId(93445), IExpr(ERef(RefId(Id("""__x7__""")))).setId(93446))).setId(93447), ISeq(List()).setId(93409)).setId(93448), IApp(Id("""__x8__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""PromiseJobs"""), ERef(RefId(Id("""PromiseReactionJob"""))), EList(List(ERef(RefId(Id("""rejectReaction"""))), ERef(RefId(Id("""reason"""))))))).setId(93450), IExpr(ERef(RefId(Id("""__x8__""")))).setId(93451))).setId(93453)).setId(93454)).setId(93456), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseIsHandled""")), EBool(true)).setId(93458), IIf(EBOp(OEq, ERef(RefId(Id("""resultCapability"""))), EUndef), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(93460), IReturn(ERef(RefId(Id("""__x9__""")))).setId(93461))).setId(93463), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Promise"""))))).setId(93464), IReturn(ERef(RefId(Id("""__x10__""")))).setId(93465))).setId(93467)).setId(93468))).setId(-1))
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
