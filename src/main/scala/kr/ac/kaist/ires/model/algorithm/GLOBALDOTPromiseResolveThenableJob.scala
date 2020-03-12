package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTPromiseResolveThenableJob {
  val length: Int = 3
  val func: Func = Func("""GLOBAL.PromiseResolveThenableJob""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(91525), ILet(Id("""promiseToResolve"""), ERef(RefId(Id("""__x0__""")))).setId(91526), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(91528), ILet(Id("""thenable"""), ERef(RefId(Id("""__x1__""")))).setId(91529), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(2L))).setId(91531), ILet(Id("""then"""), ERef(RefId(Id("""__x2__""")))).setId(91532), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateResolvingFunctions"""))), List(ERef(RefId(Id("""promiseToResolve"""))))).setId(91534), ILet(Id("""resolvingFunctions"""), ERef(RefId(Id("""__x3__""")))).setId(91535), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""then"""))), ERef(RefId(Id("""thenable"""))), EList(List(ERef(RefProp(RefId(Id("""resolvingFunctions""")), EStr("""Resolve"""))), ERef(RefProp(RefId(Id("""resolvingFunctions""")), EStr("""Reject"""))))))).setId(91537), ILet(Id("""thenCallResult"""), ERef(RefId(Id("""__x4__""")))).setId(91538), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""thenCallResult"""))))).setId(91540), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""resolvingFunctions""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""thenCallResult""")), EStr("""Value"""))))))).setId(91541), ILet(Id("""status"""), ERef(RefId(Id("""__x6__""")))).setId(91542), IApp(Id("""__x7__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))).setId(91544), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(91545), IReturn(ERef(RefId(Id("""__x8__""")))).setId(91546))).setId(91573), ISeq(List()).setId(91574)).setId(91550), IApp(Id("""__x9__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""thenCallResult"""))))).setId(91552), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(91553), IReturn(ERef(RefId(Id("""__x10__""")))).setId(91554))).setId(91579))
  val instToStepMap: Map[Int, Int] = HashMap(91554 -> 10, 91525 -> 0, 91529 -> 1, 91553 -> 10, 91540 -> 9, 91555 -> 10, 91546 -> 8, 91526 -> 0, 91531 -> 2, 91532 -> 2, 91547 -> 8, 91536 -> 3, 91551 -> 9, 91533 -> 2, 91548 -> 8, 91538 -> 4, 91544 -> 8, 91552 -> 10, 91530 -> 1, 91545 -> 8, 91543 -> 8, 91534 -> 3, 91528 -> 1, 91537 -> 4, 91542 -> 8, 91539 -> 4, 91550 -> 9, 91527 -> 0, 91541 -> 8, 91535 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(91525, 91527, 91526), 10 -> HashSet(91554, 91553, 91552, 91555), 1 -> HashSet(91529, 91530, 91528), 9 -> HashSet(91551, 91540, 91550), 2 -> HashSet(91532, 91533, 91531), 7 -> HashSet(91543, 91542, 91541), 3 -> HashSet(91536, 91534, 91535), 8 -> HashSet(91547, 91548, 91544, 91545, 91543, 91542, 91546, 91541), 4 -> HashSet(91538, 91537, 91539))
  /* Beautified form:
  "GLOBAL.PromiseResolveThenableJob" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let promiseToResolve = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let thenable = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let then = __x2__
    app __x3__ = (CreateResolvingFunctions promiseToResolve)
    let resolvingFunctions = __x3__
    app __x4__ = (Call then thenable (new [resolvingFunctions["Resolve"], resolvingFunctions["Reject"]]))
    let thenCallResult = __x4__
    app __x5__ = (IsAbruptCompletion thenCallResult)
    if __x5__ {
      app __x6__ = (Call resolvingFunctions["Reject"] undefined (new [thenCallResult["Value"]]))
      let status = __x6__
      app __x7__ = (Completion status)
      app __x8__ = (WrapCompletion __x7__)
      return __x8__
    } else {}
    app __x9__ = (Completion thenCallResult)
    app __x10__ = (WrapCompletion __x9__)
    return __x10__
  }
  */
}
