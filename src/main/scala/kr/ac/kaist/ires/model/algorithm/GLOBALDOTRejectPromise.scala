package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTRejectPromise {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.RejectPromise""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(91287), ILet(Id("""promise"""), ERef(RefId(Id("""__x0__""")))).setId(91288), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(91290), ILet(Id("""reason"""), ERef(RefId(Id("""__x1__""")))).setId(91291), ILet(Id("""reactions"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")))).setId(91294), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")), ERef(RefId(Id("""reason""")))).setId(91296), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")), EUndef).setId(91298), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")), EUndef).setId(91300), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseState""")), EStr("""rejected""")).setId(91302), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseIsHandled"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""HostPromiseRejectionTracker"""))), List(ERef(RefId(Id("""promise"""))), EStr("""reject"""))).setId(91304), IExpr(ERef(RefId(Id("""__x2__""")))).setId(91305))).setId(91306), ISeq(List()).setId(91293)).setId(91307), IApp(Id("""__x3__"""), ERef(RefId(Id("""TriggerPromiseReactions"""))), List(ERef(RefId(Id("""reactions"""))), ERef(RefId(Id("""reason"""))))).setId(91309), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(91310), IReturn(ERef(RefId(Id("""__x4__""")))).setId(91311))).setId(-1))
  /* Beautified form:
  "GLOBAL.RejectPromise" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let promise = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let reason = __x1__
    let reactions = promise["PromiseRejectReactions"]
    promise["PromiseResult"] = reason
    promise["PromiseFulfillReactions"] = undefined
    promise["PromiseRejectReactions"] = undefined
    promise["PromiseState"] = "rejected"
    if (= promise["PromiseIsHandled"] false) {
      app __x2__ = (HostPromiseRejectionTracker promise "reject")
      __x2__
    } else {}
    app __x3__ = (TriggerPromiseReactions reactions reason)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
