package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FulfillPromise {
  val length: Int = 2
  val func: Func = Func("""FulfillPromise""", List(Id("""promise"""), Id("""value""")), None, ISeq(List(ILet(Id("""reactions"""), ERef(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")))).setId(12144), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseResult""")), ERef(RefId(Id("""value""")))).setId(12146), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")), EUndef).setId(12148), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")), EUndef).setId(12150), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseState""")), EStr("""fulfilled""")).setId(12152), IApp(Id("""__x0__"""), ERef(RefId(Id("""TriggerPromiseReactions"""))), List(ERef(RefId(Id("""reactions"""))), ERef(RefId(Id("""value"""))))).setId(12154), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(12155), IReturn(ERef(RefId(Id("""__x1__""")))).setId(12156))).setId(-1))
  /* Beautified form:
  "FulfillPromise" (promise, value) => {
    let reactions = promise["PromiseFulfillReactions"]
    promise["PromiseResult"] = value
    promise["PromiseFulfillReactions"] = undefined
    promise["PromiseRejectReactions"] = undefined
    promise["PromiseState"] = "fulfilled"
    app __x0__ = (TriggerPromiseReactions reactions value)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
