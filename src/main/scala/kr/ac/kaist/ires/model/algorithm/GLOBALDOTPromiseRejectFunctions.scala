package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTPromiseRejectFunctions {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.PromiseRejectFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(90776), ILet(Id("""reason"""), ERef(RefId(Id("""__x0__""")))).setId(90777), ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(90779), ILet(Id("""promise"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Promise""")))).setId(90782), ILet(Id("""alreadyResolved"""), ERef(RefProp(RefId(Id("""F""")), EStr("""AlreadyResolved""")))).setId(90784), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""alreadyResolved""")), EStr("""Value"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(90786), IReturn(ERef(RefId(Id("""__x1__""")))).setId(90787))).setId(90805), ISeq(List()).setId(90806)).setId(90789), IAssign(RefProp(RefId(Id("""alreadyResolved""")), EStr("""Value""")), EBool(true)).setId(90791), IApp(Id("""__x2__"""), ERef(RefId(Id("""RejectPromise"""))), List(ERef(RefId(Id("""promise"""))), ERef(RefId(Id("""reason"""))))).setId(90793), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(90794), IReturn(ERef(RefId(Id("""__x3__""")))).setId(90795))).setId(90812))
  val instToStepMap: Map[Int, Int] = HashMap(90786 -> 5, 90782 -> 3, 90795 -> 8, 90787 -> 5, 90794 -> 8, 90791 -> 7, 90784 -> 4, 90792 -> 7, 90785 -> 4, 90788 -> 5, 90789 -> 6, 90778 -> 0, 90783 -> 3, 90776 -> 0, 90779 -> 1, 90790 -> 6, 90781 -> 2, 90777 -> 0, 90780 -> 1, 90793 -> 8, 90796 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(90777, 90778, 90776), 5 -> HashSet(90786, 90787, 90788), 1 -> HashSet(90780, 90779), 6 -> HashSet(90790, 90789), 2 -> HashSet(90781), 7 -> HashSet(90791, 90792), 3 -> HashSet(90782, 90783), 8 -> HashSet(90795, 90794, 90793, 90796), 4 -> HashSet(90784, 90785))
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
