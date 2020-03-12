package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTCreateResolvingFunctions {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.CreateResolvingFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(90688), ILet(Id("""promise"""), ERef(RefId(Id("""__x0__""")))).setId(90689), ILet(Id("""alreadyResolved"""), EMap(Ty("""Record"""), List((EStr("""Value"""), EBool(false))))).setId(90691), ILet(Id("""stepsResolve"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(1L)), (EStr("""step"""), ERef(RefId(Id("""GLOBALDOTPromiseResolveFunctions"""))))))).setId(90693), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsResolve"""))), EList(List(EStr("""Promise"""), EStr("""AlreadyResolved"""))))).setId(90695), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(90696), IReturn(ERef(RefId(Id("""__x1__""")))).setId(90697)).setId(90698), ISeq(List()).setId(90732)).setId(90700), ILet(Id("""resolve"""), ERef(RefId(Id("""__x1__""")))).setId(90701), IAssign(RefProp(RefId(Id("""resolve""")), EStr("""Promise""")), ERef(RefId(Id("""promise""")))).setId(90703), IAssign(RefProp(RefId(Id("""resolve""")), EStr("""AlreadyResolved""")), ERef(RefId(Id("""alreadyResolved""")))).setId(90705), ILet(Id("""stepsReject"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(1L)), (EStr("""step"""), ERef(RefId(Id("""GLOBALDOTPromiseRejectFunctions"""))))))).setId(90707), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsReject"""))), EList(List(EStr("""Promise"""), EStr("""AlreadyResolved"""))))).setId(90709), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(90710), IReturn(ERef(RefId(Id("""__x2__""")))).setId(90711)).setId(90712), ISeq(List()).setId(90742)).setId(90713), ILet(Id("""reject"""), ERef(RefId(Id("""__x2__""")))).setId(90714), IAssign(RefProp(RefId(Id("""reject""")), EStr("""Promise""")), ERef(RefId(Id("""promise""")))).setId(90716), IAssign(RefProp(RefId(Id("""reject""")), EStr("""AlreadyResolved""")), ERef(RefId(Id("""alreadyResolved""")))).setId(90718), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Record"""), List((EStr("""Resolve"""), ERef(RefId(Id("""resolve""")))), (EStr("""Reject"""), ERef(RefId(Id("""reject""")))))))).setId(90720), IReturn(ERef(RefId(Id("""__x3__""")))).setId(90721))).setId(90749))
  val instToStepMap: Map[Int, Int] = HashMap(90718 -> 9, 90703 -> 4, 90709 -> 7, 90694 -> 2, 90716 -> 8, 90715 -> 7, 90700 -> 3, 90721 -> 10, 90692 -> 1, 90693 -> 2, 90708 -> 6, 90690 -> 0, 90722 -> 10, 90717 -> 8, 90702 -> 3, 90713 -> 7, 90705 -> 5, 90688 -> 0, 90720 -> 10, 90701 -> 3, 90691 -> 1, 90706 -> 5, 90695 -> 3, 90707 -> 6, 90704 -> 4, 90689 -> 0, 90714 -> 7, 90719 -> 9)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(90690, 90688, 90689), 5 -> HashSet(90705, 90706), 10 -> HashSet(90722, 90720, 90721), 1 -> HashSet(90691, 90692), 6 -> HashSet(90707, 90708), 9 -> HashSet(90718, 90719), 2 -> HashSet(90694, 90693), 7 -> HashSet(90709, 90713, 90715, 90714), 3 -> HashSet(90702, 90701, 90695, 90700), 8 -> HashSet(90717, 90716), 4 -> HashSet(90703, 90704))
  /* Beautified form:
  "GLOBAL.CreateResolvingFunctions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let promise = __x0__
    let alreadyResolved = (new Record("Value" -> false))
    let stepsResolve = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTPromiseResolveFunctions))
    app __x1__ = (CreateBuiltinFunction stepsResolve (new ["Promise", "AlreadyResolved"]))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let resolve = __x1__
    resolve["Promise"] = promise
    resolve["AlreadyResolved"] = alreadyResolved
    let stepsReject = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTPromiseRejectFunctions))
    app __x2__ = (CreateBuiltinFunction stepsReject (new ["Promise", "AlreadyResolved"]))
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let reject = __x2__
    reject["Promise"] = promise
    reject["AlreadyResolved"] = alreadyResolved
    app __x3__ = (WrapCompletion (new Record("Resolve" -> resolve, "Reject" -> reject)))
    return __x3__
  }
  */
}
