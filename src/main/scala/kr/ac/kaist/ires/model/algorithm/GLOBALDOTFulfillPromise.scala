package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTFulfillPromise {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.FulfillPromise""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(90987), ILet(Id("""promise"""), ERef(RefId(Id("""__x0__""")))).setId(90988), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(90990), ILet(Id("""value"""), ERef(RefId(Id("""__x1__""")))).setId(90991), ILet(Id("""reactions"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")))).setId(90994), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")), ERef(RefId(Id("""value""")))).setId(90996), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")), EUndef).setId(90998), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")), EUndef).setId(91000), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseState""")), EStr("""fulfilled""")).setId(91002), IApp(Id("""__x2__"""), ERef(RefId(Id("""TriggerPromiseReactions"""))), List(ERef(RefId(Id("""reactions"""))), ERef(RefId(Id("""value"""))))).setId(91004), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(91005), IReturn(ERef(RefId(Id("""__x3__""")))).setId(91006))).setId(-1))
  /* Beautified form:
  "GLOBAL.FulfillPromise" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let promise = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let value = __x1__
    let reactions = promise["PromiseFulfillReactions"]
    promise["PromiseResult"] = value
    promise["PromiseFulfillReactions"] = undefined
    promise["PromiseRejectReactions"] = undefined
    promise["PromiseState"] = "fulfilled"
    app __x2__ = (TriggerPromiseReactions reactions value)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
