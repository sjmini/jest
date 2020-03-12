package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PerformPromiseThen {
  val length: Int = 3
  val func: Func = Func("""PerformPromiseThen""", List(Id("""promise"""), Id("""onFulfilled"""), Id("""onRejected"""), Id("""resultCapability""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""resultCapability"""))), EAbsent)), ISeq(List()).setId(12820), IAssign(RefId(Id("""resultCapability""")), EUndef).setId(12760)).setId(12763), IApp(Id("""__x0__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""onFulfilled"""))))).setId(12765), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false)), IAssign(RefId(Id("""onFulfilled""")), EUndef).setId(12766), ISeq(List()).setId(12825)).setId(12769), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""onRejected"""))))).setId(12771), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), IAssign(RefId(Id("""onRejected""")), EUndef).setId(12772), ISeq(List()).setId(12829)).setId(12775), ILet(Id("""fulfillReaction"""), EMap(Ty("""PromiseReaction"""), List((EStr("""Capability"""), ERef(RefId(Id("""resultCapability""")))), (EStr("""Type"""), EStr("""Fulfill""")), (EStr("""Handler"""), ERef(RefId(Id("""onFulfilled"""))))))).setId(12777), ILet(Id("""rejectReaction"""), EMap(Ty("""PromiseReaction"""), List((EStr("""Capability"""), ERef(RefId(Id("""resultCapability""")))), (EStr("""Type"""), EStr("""Reject""")), (EStr("""Handler"""), ERef(RefId(Id("""onRejected"""))))))).setId(12779), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseState"""))), EStr("""pending""")), ISeq(List(IAppend(ERef(RefId(Id("""fulfillReaction"""))), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")))).setId(12781), IAppend(ERef(RefId(Id("""rejectReaction"""))), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")))).setId(12783))).setId(12835), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseState"""))), EStr("""fulfilled""")), ISeq(List(ILet(Id("""value"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")))).setId(12786), IApp(Id("""__x2__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""PromiseJobs"""), ERef(RefId(Id("""PromiseReactionJob"""))), EList(List(ERef(RefId(Id("""fulfillReaction"""))), ERef(RefId(Id("""value"""))))))).setId(12788), IExpr(ERef(RefId(Id("""__x2__""")))).setId(12789))).setId(12839), ISeq(List(ILet(Id("""reason"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")))).setId(12792), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseIsHandled"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""HostPromiseRejectionTracker"""))), List(ERef(RefId(Id("""promise"""))), EStr("""handle"""))).setId(12794), IExpr(ERef(RefId(Id("""__x3__""")))).setId(12795))).setId(12843), ISeq(List()).setId(12844)).setId(12797), IApp(Id("""__x4__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""PromiseJobs"""), ERef(RefId(Id("""PromiseReactionJob"""))), EList(List(ERef(RefId(Id("""rejectReaction"""))), ERef(RefId(Id("""reason"""))))))).setId(12799), IExpr(ERef(RefId(Id("""__x4__""")))).setId(12800))).setId(12848)).setId(12803)).setId(12805), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseIsHandled""")), EBool(true)).setId(12807), IIf(EBOp(OEq, ERef(RefId(Id("""resultCapability"""))), EUndef), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(12809), IReturn(ERef(RefId(Id("""__x5__""")))).setId(12810))).setId(12854), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Promise"""))))).setId(12813), IReturn(ERef(RefId(Id("""__x6__""")))).setId(12814))).setId(12857)).setId(12817))).setId(12859))
  val instToStepMap: Map[Int, Int] = HashMap(12812 -> 35, 12816 -> 38, 12794 -> 29, 12764 -> 6, 12783 -> 20, 12810 -> 35, 12817 -> 38, 12805 -> 31, 12798 -> 31, 12774 -> 13, 12789 -> 24, 12763 -> 6, 12770 -> 10, 12785 -> 20, 12804 -> 31, 12767 -> 9, 12782 -> 20, 12762 -> 6, 12799 -> 31, 12777 -> 15, 12773 -> 13, 12788 -> 24, 12809 -> 35, 12760 -> 6, 12769 -> 10, 12792 -> 31, 12796 -> 29, 12768 -> 9, 12818 -> 38, 12803 -> 31, 12795 -> 29, 12800 -> 31, 12808 -> 32, 12813 -> 38, 12778 -> 15, 12776 -> 14, 12787 -> 24, 12759 -> 3, 12814 -> 38, 12806 -> 31, 12791 -> 24, 12780 -> 16, 12802 -> 31, 12779 -> 16, 12797 -> 31, 12765 -> 10, 12784 -> 20, 12807 -> 32, 12772 -> 13, 12771 -> 14, 12790 -> 24, 12811 -> 35, 12786 -> 24, 12775 -> 14, 12815 -> 38, 12758 -> 31, 12766 -> 9, 12781 -> 20, 12801 -> 31, 12793 -> 31, 12761 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(12758), 10 -> HashSet(12770, 12769, 12765), 24 -> HashSet(12789, 12788, 12787, 12791, 12790, 12786), 14 -> HashSet(12776, 12771, 12775), 6 -> HashSet(12763, 12762, 12764, 12760, 12761), 9 -> HashSet(12767, 12768, 12766), 13 -> HashSet(12774, 12773, 12772), 32 -> HashSet(12808, 12807), 27 -> HashSet(12758), 23 -> HashSet(12787, 12786), 15 -> HashSet(12777, 12778), 20 -> HashSet(12785, 12782, 12783, 12784, 12781), 29 -> HashSet(12794, 12796, 12795), 28 -> HashSet(12792, 12793), 38 -> HashSet(12816, 12818, 12813, 12814, 12817, 12815), 3 -> HashSet(12759, 12758), 35 -> HashSet(12812, 12809, 12810, 12811), 16 -> HashSet(12780, 12779), 31 -> HashSet(12804, 12799, 12792, 12803, 12800, 12806, 12758, 12805, 12798, 12801, 12793, 12802, 12797), 30 -> HashSet(12797, 12798), 19 -> HashSet(12782, 12781))
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
