package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PromiseReactionJob {
  val length: Int = 2
  val func: Func = Func("""PromiseReactionJob""", List(Id("""reaction"""), Id("""argument""")), None, ISeq(List(ILet(Id("""promiseCapability"""), ERef(RefProp(RefId(Id("""reaction""")), EStr("""Capability""")))).setId(12489), ILet(Id("""type"""), ERef(RefProp(RefId(Id("""reaction""")), EStr("""Type""")))).setId(12491), ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""reaction""")), EStr("""Handler""")))).setId(12493), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), EUndef), IIf(EBOp(OEq, ERef(RefId(Id("""type"""))), EStr("""Fulfill""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""argument"""))))).setId(12495), ILet(Id("""handlerResult"""), ERef(RefId(Id("""__x0__""")))).setId(12496))).setId(12538), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(ERef(RefId(Id("""argument"""))))).setId(12498), ILet(Id("""handlerResult"""), ERef(RefId(Id("""__x1__""")))).setId(12499))).setId(12541)).setId(12502), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""handler"""))), EUndef, EList(List(ERef(RefId(Id("""argument"""))))))).setId(12505), ILet(Id("""handlerResult"""), ERef(RefId(Id("""__x2__""")))).setId(12506))).setId(12545)).setId(12508), IIf(EBOp(OEq, ERef(RefId(Id("""promiseCapability"""))), EUndef), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(12510), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(12511), IReturn(ERef(RefId(Id("""__x4__""")))).setId(12512))).setId(12550), ISeq(List()).setId(12551)).setId(12515), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""handlerResult"""))))).setId(12517), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""handlerResult""")), EStr("""Value"""))))))).setId(12518), ILet(Id("""status"""), ERef(RefId(Id("""__x6__""")))).setId(12519))).setId(12556), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""handlerResult""")), EStr("""Value"""))))))).setId(12522), ILet(Id("""status"""), ERef(RefId(Id("""__x7__""")))).setId(12523))).setId(12559)).setId(12526), IApp(Id("""__x8__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))).setId(12528), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(12529), IReturn(ERef(RefId(Id("""__x9__""")))).setId(12530))).setId(12564))
  val instToStepMap: Map[Int, Int] = HashMap(12500 -> 10, 12531 -> 23, 12517 -> 22, 12489 -> 1, 12518 -> 19, 12501 -> 10, 12513 -> 15, 12497 -> 6, 12492 -> 2, 12495 -> 6, 12491 -> 2, 12503 -> 10, 12488 -> 15, 12490 -> 1, 12526 -> 22, 12507 -> 11, 12522 -> 22, 12511 -> 15, 12494 -> 3, 12504 -> 10, 12499 -> 10, 12510 -> 15, 12525 -> 22, 12521 -> 19, 12493 -> 3, 12506 -> 11, 12524 -> 22, 12509 -> 11, 12528 -> 23, 12496 -> 6, 12505 -> 11, 12502 -> 10, 12519 -> 19, 12514 -> 15, 12529 -> 23, 12523 -> 22, 12512 -> 15, 12527 -> 22, 12516 -> 16, 12498 -> 10, 12520 -> 19, 12515 -> 16, 12530 -> 23, 12508 -> 11)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(12488), 10 -> HashSet(12500, 12501, 12502, 12498, 12503, 12488, 12504, 12499), 14 -> HashSet(12488), 1 -> HashSet(12490, 12489), 6 -> HashSet(12496, 12497, 12495), 9 -> HashSet(12488), 2 -> HashSet(12492, 12491), 22 -> HashSet(12526, 12522, 12517, 12525, 12524, 12523, 12527), 3 -> HashSet(12494, 12493), 16 -> HashSet(12516, 12515), 11 -> HashSet(12507, 12506, 12509, 12505, 12508), 23 -> HashSet(12531, 12528, 12529, 12530), 19 -> HashSet(12521, 12518, 12519, 12520), 15 -> HashSet(12511, 12510, 12513, 12514, 12512, 12488))
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
