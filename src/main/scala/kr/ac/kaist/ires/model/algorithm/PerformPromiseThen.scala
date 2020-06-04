package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PerformPromiseThen {
  val length: Int = 3
  val func: Func = Func("""PerformPromiseThen""", List(Id("""promise"""), Id("""onFulfilled"""), Id("""onRejected"""), Id("""resultCapability""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""resultCapability"""))), EAbsent)), ISeq(List()).setId(12759), IAssign(RefId(Id("""resultCapability""")), EUndef).setId(12760)).setId(12763), IApp(Id("""__x0__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""onFulfilled"""))))).setId(12765), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false)), IAssign(RefId(Id("""onFulfilled""")), EUndef).setId(12766), ISeq(List()).setId(12758)).setId(12769), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""onRejected"""))))).setId(12771), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), IAssign(RefId(Id("""onRejected""")), EUndef).setId(12772), ISeq(List()).setId(12758)).setId(12775), ILet(Id("""fulfillReaction"""), EMap(Ty("""PromiseReaction"""), List((EStr("""Capability"""), ERef(RefId(Id("""resultCapability""")))), (EStr("""Type"""), EStr("""Fulfill""")), (EStr("""Handler"""), ERef(RefId(Id("""onFulfilled"""))))))).setId(12777), ILet(Id("""rejectReaction"""), EMap(Ty("""PromiseReaction"""), List((EStr("""Capability"""), ERef(RefId(Id("""resultCapability""")))), (EStr("""Type"""), EStr("""Reject""")), (EStr("""Handler"""), ERef(RefId(Id("""onRejected"""))))))).setId(12779), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseState"""))), EStr("""pending""")), ISeq(List(IAppend(ERef(RefId(Id("""fulfillReaction"""))), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")))).setId(12781), IAppend(ERef(RefId(Id("""rejectReaction"""))), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")))).setId(12783))).setId(12785), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseState"""))), EStr("""fulfilled""")), ISeq(List(ILet(Id("""value"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")))).setId(12786), IApp(Id("""__x2__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""PromiseJobs"""), ERef(RefId(Id("""PromiseReactionJob"""))), EList(List(ERef(RefId(Id("""fulfillReaction"""))), ERef(RefId(Id("""value"""))))))).setId(12788), IExpr(ERef(RefId(Id("""__x2__""")))).setId(12789))).setId(12791), ISeq(List(ILet(Id("""reason"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")))).setId(12792), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseIsHandled"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""HostPromiseRejectionTracker"""))), List(ERef(RefId(Id("""promise"""))), EStr("""handle"""))).setId(12794), IExpr(ERef(RefId(Id("""__x3__""")))).setId(12795))).setId(12796), ISeq(List()).setId(12758)).setId(12797), IApp(Id("""__x4__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""PromiseJobs"""), ERef(RefId(Id("""PromiseReactionJob"""))), EList(List(ERef(RefId(Id("""rejectReaction"""))), ERef(RefId(Id("""reason"""))))))).setId(12799), IExpr(ERef(RefId(Id("""__x4__""")))).setId(12800))).setId(12802)).setId(12803)).setId(12805), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseIsHandled""")), EBool(true)).setId(12807), IIf(EBOp(OEq, ERef(RefId(Id("""resultCapability"""))), EUndef), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(12809), IReturn(ERef(RefId(Id("""__x5__""")))).setId(12810))).setId(12812), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Promise"""))))).setId(12813), IReturn(ERef(RefId(Id("""__x6__""")))).setId(12814))).setId(12816)).setId(12817))).setId(-1))
  /* Beautified form:
  "PerformPromiseThen" (promise, onFulfilled, onRejected, resultCapability) => {
    if (! (= resultCapability absent)) {} else resultCapability = undefined
    app __x0__ = (IsCallable onFulfilled)
    if (= __x0__ false) onFulfilled = undefined else {}
    app __x1__ = (IsCallable onRejected)
    if (= __x1__ false) onRejected = undefined else {}
    let fulfillReaction = (new PromiseReaction("Capability" -> resultCapability, "Type" -> "Fulfill", "Handler" -> onFulfilled))
    let rejectReaction = (new PromiseReaction("Capability" -> resultCapability, "Type" -> "Reject", "Handler" -> onRejected))
    if (= promise["PromiseState"] "pending") {
      append fulfillReaction -> promise["PromiseFulfillReactions"]
      append rejectReaction -> promise["PromiseRejectReactions"]
    } else if (= promise["PromiseState"] "fulfilled") {
      let value = promise["PromiseResult"]
      app __x2__ = (EnqueueJob "PromiseJobs" PromiseReactionJob (new [fulfillReaction, value]))
      __x2__
    } else {
      let reason = promise["PromiseResult"]
      if (= promise["PromiseIsHandled"] false) {
        app __x3__ = (HostPromiseRejectionTracker promise "handle")
        __x3__
      } else {}
      app __x4__ = (EnqueueJob "PromiseJobs" PromiseReactionJob (new [rejectReaction, reason]))
      __x4__
    }
    promise["PromiseIsHandled"] = true
    if (= resultCapability undefined) {
      app __x5__ = (WrapCompletion undefined)
      return __x5__
    } else {
      app __x6__ = (WrapCompletion resultCapability["Promise"])
      return __x6__
    }
  }
  */
}
