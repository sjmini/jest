package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RejectPromise {
  val length: Int = 2
  val func: Func = Func("""RejectPromise""", List(Id("""promise"""), Id("""reason""")), None, ISeq(List(ILet(Id("""reactions"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")))).setId(12402), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")), ERef(RefId(Id("""reason""")))).setId(12404), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")), EUndef).setId(12406), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")), EUndef).setId(12408), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseState""")), EStr("""rejected""")).setId(12410), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseIsHandled"""))), EBool(false)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""HostPromiseRejectionTracker"""))), List(ERef(RefId(Id("""promise"""))), EStr("""reject"""))).setId(12412), IExpr(ERef(RefId(Id("""__x0__""")))).setId(12413))).setId(12429), ISeq(List()).setId(12430)).setId(12415), IApp(Id("""__x1__"""), ERef(RefId(Id("""TriggerPromiseReactions"""))), List(ERef(RefId(Id("""reactions"""))), ERef(RefId(Id("""reason"""))))).setId(12417), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(12418), IReturn(ERef(RefId(Id("""__x2__""")))).setId(12419))).setId(12435))
  val instToStepMap: Map[Int, Int] = HashMap(12415 -> 7, 12403 -> 1, 12411 -> 5, 12401 -> 0, 12413 -> 6, 12409 -> 4, 12407 -> 3, 12417 -> 8, 12414 -> 6, 12404 -> 2, 12418 -> 8, 12410 -> 5, 12408 -> 4, 12419 -> 8, 12405 -> 2, 12416 -> 7, 12402 -> 1, 12412 -> 6, 12420 -> 8, 12406 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(12401), 5 -> HashSet(12411, 12410), 1 -> HashSet(12403, 12402), 6 -> HashSet(12414, 12413, 12412), 2 -> HashSet(12404, 12405), 7 -> HashSet(12415, 12416), 3 -> HashSet(12407, 12406), 8 -> HashSet(12417, 12418, 12419, 12420), 4 -> HashSet(12408, 12409))
  /* Beautified form:
  "RejectPromise" (promise, reason) => {
    let reactions = promise["PromiseRejectReactions"]
    promise["PromiseResult"] = reason
    promise["PromiseFulfillReactions"] = undefined
    promise["PromiseRejectReactions"] = undefined
    promise["PromiseState"] = "rejected"
    if (= promise["PromiseIsHandled"] false) {
      app __x0__ = (HostPromiseRejectionTracker promise "reject")
      __x0__
    } else {}
    app __x1__ = (TriggerPromiseReactions reactions reason)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
