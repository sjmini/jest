package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorYield {
  val length: Int = 1
  val func: Func = Func("""AsyncGeneratorYield""", List(Id("""value""")), None, ISeq(List(ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(11672), ILet(Id("""generator"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")))).setId(11675), IApp(Id("""__x0__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefId(Id("""value"""))))).setId(11677), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(11678), IReturn(ERef(RefId(Id("""__x0__""")))).setId(11679)).setId(11680), ISeq(List()).setId(11751)).setId(11681), IAssign(RefId(Id("""value""")), ERef(RefId(Id("""__x0__""")))).setId(11682), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""suspendedYield""")).setId(11684), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""genContext""")))), ISeq(List(IAssign(RefId(Id("""__x1__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(11686), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x1__"""))))).setId(11687))).setId(11757), ISeq(List()).setId(11758)).setId(11690), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(11691), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont""")), ECont(List(Id("""resumptionValue""")), ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""resumptionValue""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""resumptionValue"""))))).setId(11712), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(11713), IReturn(ERef(RefId(Id("""__x3__""")))).setId(11714))).setId(11764), ISeq(List()).setId(11765)).setId(11717), IApp(Id("""__x4__"""), ERef(RefId(Id("""Await"""))), List(ERef(RefProp(RefId(Id("""resumptionValue""")), EStr("""Value"""))))).setId(11719), ILet(Id("""awaited"""), ERef(RefId(Id("""__x4__""")))).setId(11720), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""awaited""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""awaited"""))))).setId(11722), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(11723), IReturn(ERef(RefId(Id("""__x6__""")))).setId(11724))).setId(11772), ISeq(List()).setId(11773)).setId(11727), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_return""")))), (EStr("""Value"""), ERef(RefProp(RefId(Id("""awaited""")), EStr("""Value""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))).setId(11730), IReturn(ERef(RefId(Id("""__x7__""")))).setId(11731))).setId(11777))).setId(11735), IApp(Id("""__x8__"""), ERef(RefId(Id("""AsyncGeneratorResolve"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefId(Id("""value"""))), EBool(false))).setId(11736), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(11737), IReturn(ERef(RefId(Id("""__x8__""")))).setId(11738)).setId(11739), ISeq(List()).setId(11783)).setId(11740), IApp(Id("""__x9__"""), EPop(ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont"""))), EINum(0L)), List(ERef(RefId(Id("""__x8__"""))))).setId(11741))).setId(11786))
  val instToStepMap: Map[Int, Int] = HashMap(11736 -> 17, 11742 -> 17, 11673 -> 0, 11706 -> 16, 11674 -> 18, 11681 -> 4, 11707 -> 16, 11675 -> 2, 11684 -> 5, 11699 -> 16, 11696 -> 9, 11741 -> 17, 11740 -> 17, 11676 -> 2, 11691 -> 6, 11709 -> 16, 11708 -> 16, 11677 -> 4, 11672 -> 0, 11704 -> 12, 11698 -> 16, 11683 -> 4, 11702 -> 12, 11692 -> 6, 11710 -> 16, 11705 -> 12, 11693 -> 9, 11682 -> 4, 11703 -> 12, 11697 -> 16, 11735 -> 16, 11711 -> 16, 11701 -> 16, 11694 -> 9, 11743 -> 17, 11685 -> 5, 11700 -> 16, 11690 -> 6, 11695 -> 9)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(11672, 11673), 5 -> HashSet(11684, 11685), 10 -> HashSet(11698, 11697), 14 -> HashSet(11674), 1 -> HashSet(11674), 6 -> HashSet(11691, 11692, 11690), 9 -> HashSet(11696, 11693, 11694, 11695), 13 -> HashSet(11706, 11707), 2 -> HashSet(11676, 11675), 17 -> HashSet(11736, 11742, 11743, 11741, 11740), 12 -> HashSet(11704, 11702, 11705, 11703), 3 -> HashSet(11674), 18 -> HashSet(11674), 16 -> HashSet(11699, 11698, 11710, 11706, 11674, 11700, 11707, 11709, 11708, 11697, 11735, 11711, 11701), 11 -> HashSet(11699, 11701, 11700), 4 -> HashSet(11677, 11683, 11682, 11681), 15 -> HashSet(11710, 11709, 11708))
  /* Beautified form:
  "AsyncGeneratorYield" (value) => {
    let genContext = GLOBAL_context
    let generator = genContext["Generator"]
    app __x0__ = (Await value)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    value = __x0__
    generator["AsyncGeneratorState"] = "suspendedYield"
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] genContext) {
      __x1__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x1__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    genContext["ResumeCont"] = (resumptionValue) [=>] {
      if (! (= resumptionValue["Type"] CONST_return)) {
        app __x2__ = (Completion resumptionValue)
        app __x3__ = (WrapCompletion __x2__)
        return __x3__
      } else {}
      app __x4__ = (Await resumptionValue["Value"])
      let awaited = __x4__
      if (= awaited["Type"] CONST_throw) {
        app __x5__ = (Completion awaited)
        app __x6__ = (WrapCompletion __x5__)
        return __x6__
      } else {}
      app __x7__ = (WrapCompletion (new Completion("Type" -> CONST_return, "Value" -> awaited["Value"], "Target" -> CONST_empty)))
      return __x7__
    }
    app __x8__ = (AsyncGeneratorResolve generator value false)
    if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    app __x9__ = ((pop genContext["ReturnCont"] 0i) __x8__)
  }
  */
}
