package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object RejectPromise {
  val length: Int = 2
  val func: Func = Func("""RejectPromise""", List(Id("""promise"""), Id("""reason""")), None, ISeq(List(ILet(Id("""reactions"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")))).setId(12402), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")), ERef(RefId(Id("""reason""")))).setId(12404), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")), EUndef).setId(12406), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")), EUndef).setId(12408), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseState""")), EStr("""rejected""")).setId(12410), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseIsHandled"""))), EBool(false)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""HostPromiseRejectionTracker"""))), List(ERef(RefId(Id("""promise"""))), EStr("""reject"""))).setId(12412), IExpr(ERef(RefId(Id("""__x0__""")))).setId(12413))).setId(12414), ISeq(List()).setId(12401)).setId(12415), IApp(Id("""__x1__"""), ERef(RefId(Id("""TriggerPromiseReactions"""))), List(ERef(RefId(Id("""reactions"""))), ERef(RefId(Id("""reason"""))))).setId(12417), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(12418), IReturn(ERef(RefId(Id("""__x2__""")))).setId(12419))).setId(-1))
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
