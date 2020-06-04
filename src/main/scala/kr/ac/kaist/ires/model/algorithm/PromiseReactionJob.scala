package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PromiseReactionJob {
  val length: Int = 2
  val func: Func = Func("""PromiseReactionJob""", List(Id("""reaction"""), Id("""argument""")), None, ISeq(List(ILet(Id("""promiseCapability"""), ERef(RefProp(RefId(Id("""reaction""")), EStr("""Capability""")))).setId(12489), ILet(Id("""type"""), ERef(RefProp(RefId(Id("""reaction""")), EStr("""Type""")))).setId(12491), ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""reaction""")), EStr("""Handler""")))).setId(12493), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), EUndef), IIf(EBOp(OEq, ERef(RefId(Id("""type"""))), EStr("""Fulfill""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""argument"""))))).setId(12495), ILet(Id("""handlerResult"""), ERef(RefId(Id("""__x0__""")))).setId(12496))).setId(12497), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(ERef(RefId(Id("""argument"""))))).setId(12498), ILet(Id("""handlerResult"""), ERef(RefId(Id("""__x1__""")))).setId(12499))).setId(12501)).setId(12502), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""handler"""))), EUndef, EList(List(ERef(RefId(Id("""argument"""))))))).setId(12505), ILet(Id("""handlerResult"""), ERef(RefId(Id("""__x2__""")))).setId(12506))).setId(12507)).setId(12508), IIf(EBOp(OEq, ERef(RefId(Id("""promiseCapability"""))), EUndef), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(12510), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(12511), IReturn(ERef(RefId(Id("""__x4__""")))).setId(12512))).setId(12514), ISeq(List()).setId(12488)).setId(12515), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""handlerResult"""))))).setId(12517), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""handlerResult""")), EStr("""Value"""))))))).setId(12518), ILet(Id("""status"""), ERef(RefId(Id("""__x6__""")))).setId(12519))).setId(12521), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""handlerResult""")), EStr("""Value"""))))))).setId(12522), ILet(Id("""status"""), ERef(RefId(Id("""__x7__""")))).setId(12523))).setId(12525)).setId(12526), IApp(Id("""__x8__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))).setId(12528), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(12529), IReturn(ERef(RefId(Id("""__x9__""")))).setId(12530))).setId(-1))
  /* Beautified form:
  "PromiseReactionJob" (reaction, argument) => {
    let promiseCapability = reaction["Capability"]
    let type = reaction["Type"]
    let handler = reaction["Handler"]
    if (= handler undefined) if (= type "Fulfill") {
      app __x0__ = (NormalCompletion argument)
      let handlerResult = __x0__
    } else {
      app __x1__ = (ThrowCompletion argument)
      let handlerResult = __x1__
    } else {
      app __x2__ = (Call handler undefined (new [argument]))
      let handlerResult = __x2__
    }
    if (= promiseCapability undefined) {
      app __x3__ = (NormalCompletion CONST_empty)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (IsAbruptCompletion handlerResult)
    if __x5__ {
      app __x6__ = (Call promiseCapability["Reject"] undefined (new [handlerResult["Value"]]))
      let status = __x6__
    } else {
      app __x7__ = (Call promiseCapability["Resolve"] undefined (new [handlerResult["Value"]]))
      let status = __x7__
    }
    app __x8__ = (Completion status)
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }
  */
}
