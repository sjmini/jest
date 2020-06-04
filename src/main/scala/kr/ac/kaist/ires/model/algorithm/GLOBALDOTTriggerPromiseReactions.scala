package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTTriggerPromiseReactions {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.TriggerPromiseReactions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(91350), ILet(Id("""reactions"""), ERef(RefId(Id("""__x0__""")))).setId(91351), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(91353), ILet(Id("""argument"""), ERef(RefId(Id("""__x1__""")))).setId(91354), ILet(Id("""__x2__"""), ERef(RefId(Id("""reactions""")))).setId(91360), ILet(Id("""__x3__"""), EINum(0L)).setId(91361), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""reaction"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(91362), IApp(Id("""__x4__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""PromiseJobs"""), ERef(RefId(Id("""PromiseReactionJob"""))), EList(List(ERef(RefId(Id("""reaction"""))), ERef(RefId(Id("""argument"""))))))).setId(91356), IExpr(ERef(RefId(Id("""__x4__""")))).setId(91357), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(91363))).setId(91364)).setId(91365), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(91368), IReturn(ERef(RefId(Id("""__x5__""")))).setId(91369))).setId(-1))
  /* Beautified form:
  "GLOBAL.TriggerPromiseReactions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let reactions = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let argument = __x1__
    let __x2__ = reactions
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let reaction = __x2__[__x3__]
      app __x4__ = (EnqueueJob "PromiseJobs" PromiseReactionJob (new [reaction, argument]))
      __x4__
      __x3__ = (+ __x3__ 1i)
    }
    app __x5__ = (WrapCompletion undefined)
    return __x5__
  }
  */
}
