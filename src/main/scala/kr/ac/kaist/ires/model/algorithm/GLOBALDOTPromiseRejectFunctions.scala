package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseRejectFunctions {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.PromiseRejectFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(90776), ILet(Id("""reason"""), ERef(RefId(Id("""__x0__""")))).setId(90777), ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(90779), ILet(Id("""promise"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Promise""")))).setId(90782), ILet(Id("""alreadyResolved"""), ERef(RefProp(RefId(Id("""F""")), EStr("""AlreadyResolved""")))).setId(90784), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""alreadyResolved""")), EStr("""Value"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(90786), IReturn(ERef(RefId(Id("""__x1__""")))).setId(90787))).setId(90788), ISeq(List()).setId(90781)).setId(90789), IAssign(RefProp(RefId(Id("""alreadyResolved""")), EStr("""Value""")), EBool(true)).setId(90791), IApp(Id("""__x2__"""), ERef(RefId(Id("""RejectPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""reason"""))))).setId(90793), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(90794), IReturn(ERef(RefId(Id("""__x3__""")))).setId(90795))).setId(-1))
  /* Beautified form:
  "GLOBAL.PromiseRejectFunctions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let reason = __x0__
    let F = GLOBAL_context["Function"]
    let promise = F["Promise"]
    let alreadyResolved = F["AlreadyResolved"]
    if (= alreadyResolved["Value"] true) {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    } else {}
    alreadyResolved["Value"] = true
    app __x2__ = (RejectPromise promise reason)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
