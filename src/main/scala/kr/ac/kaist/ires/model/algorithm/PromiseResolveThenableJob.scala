package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PromiseResolveThenableJob {
  val length: Int = 3
  val func: Func = Func("""PromiseResolveThenableJob""", List(Id("""promiseToResolve"""), Id("""thenable"""), Id("""then""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateResolvingFunctions"""))), List(ERef(RefId(Id("""promiseToResolve"""))))).setId(12597), ILet(Id("""resolvingFunctions"""), ERef(RefId(Id("""__x0__""")))).setId(12598), IApp(Id("""__x1__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""then"""))), ERef(RefId(Id("""thenable"""))), EList(List(ERef(RefProp(RefId(Id("""resolvingFunctions""")), EStr("""Resolve"""))), ERef(RefProp(RefId(Id("""resolvingFunctions""")), EStr("""Reject"""))))))).setId(12600), ILet(Id("""thenCallResult"""), ERef(RefId(Id("""__x1__""")))).setId(12601), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""thenCallResult"""))))).setId(12603), IIf(ERef(RefId(Id("""__x2__"""))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""resolvingFunctions""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""thenCallResult""")), EStr("""Value"""))))))).setId(12604), ILet(Id("""status"""), ERef(RefId(Id("""__x3__""")))).setId(12605), IApp(Id("""__x4__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))).setId(12607), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(12608), IReturn(ERef(RefId(Id("""__x5__""")))).setId(12609))).setId(12630), ISeq(List()).setId(12631)).setId(12613), IApp(Id("""__x6__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""thenCallResult"""))))).setId(12615), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(12616), IReturn(ERef(RefId(Id("""__x7__""")))).setId(12617))).setId(12636))
  val instToStepMap: Map[Int, Int] = HashMap(12602 -> 1, 12617 -> 7, 12606 -> 5, 12610 -> 5, 12600 -> 1, 12609 -> 5, 12604 -> 5, 12598 -> 0, 12601 -> 1, 12615 -> 7, 12605 -> 5, 12611 -> 5, 12614 -> 6, 12597 -> 0, 12607 -> 5, 12613 -> 6, 12608 -> 5, 12618 -> 7, 12603 -> 6, 12599 -> 0, 12616 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(12597, 12599, 12598), 5 -> HashSet(12607, 12606, 12610, 12608, 12609, 12604, 12605, 12611), 1 -> HashSet(12602, 12600, 12601), 6 -> HashSet(12614, 12613, 12603), 7 -> HashSet(12617, 12618, 12616, 12615), 4 -> HashSet(12606, 12604, 12605))
  /* Beautified form:
  "PromiseResolveThenableJob" (promiseToResolve, thenable, then) => {
    app __x0__ = (CreateResolvingFunctions promiseToResolve)
    let resolvingFunctions = __x0__
    app __x1__ = (Call then thenable (new [resolvingFunctions["Resolve"], resolvingFunctions["Reject"]]))
    let thenCallResult = __x1__
    app __x2__ = (IsAbruptCompletion thenCallResult)
    if __x2__ {
      app __x3__ = (Call resolvingFunctions["Reject"] undefined (new [thenCallResult["Value"]]))
      let status = __x3__
      app __x4__ = (Completion status)
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (Completion thenCallResult)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
