package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RunJobs {
  val length: Int = 0
  val func: Func = Func("""RunJobs""", List(), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""InitializeHostDefinedRealm"""))), List()).setId(8719), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(8720), IReturn(ERef(RefId(Id("""__x0__""")))).setId(8721)).setId(8722), ISeq(List()).setId(8770)).setId(8724), IExpr(ERef(RefId(Id("""__x0__""")))).setId(8725), IApp(Id("""__x1__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""ScriptJobs"""), ERef(RefId(Id("""ScriptEvaluationJob"""))), EList(List(ERef(RefId(Id("""script"""))), ERef(RefId(Id("""hostDefined"""))))))).setId(8727), IWhile(EBool(true), ISeq(List(IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(8728), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""GLOBAL_context""")))), ISeq(List(IAssign(RefId(Id("""__x2__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(8729), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x2__"""))))).setId(8730))).setId(8777), ISeq(List()).setId(8778)).setId(8733), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_jobQueue""")), EStr("""length"""))), ENum(0.0)), IReturn(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_normal""")))), (EStr("""Value"""), EUndef), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty"""))))))).setId(8735), ISeq(List()).setId(8781)).setId(8738), ILet(Id("""nextQueue"""), ERef(RefId(Id("""GLOBAL_jobQueue""")))).setId(8739), ILet(Id("""nextPending"""), EPop(ERef(RefId(Id("""nextQueue"""))), EINum(0L))).setId(8741), ILet(Id("""newContext"""), EMap(Ty("""ExecutionContext"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(8743), IAssign(RefProp(RefId(Id("""newContext""")), EStr("""Function""")), ENull).setId(8745), IAssign(RefProp(RefId(Id("""newContext""")), EStr("""Realm""")), ERef(RefProp(RefId(Id("""nextPending""")), EStr("""Realm""")))).setId(8747), IAssign(RefProp(RefId(Id("""newContext""")), EStr("""ScriptOrModule""")), ERef(RefProp(RefId(Id("""nextPending""")), EStr("""ScriptOrModule""")))).setId(8749), IAppend(ERef(RefId(Id("""newContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(8751), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(8752), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""nextPending""")), EStr("""Job"""))), List(ERef(RefProp(RefProp(RefId(Id("""nextPending""")), EStr("""Arguments""")), EINum(0L))), ERef(RefProp(RefProp(RefId(Id("""nextPending""")), EStr("""Arguments""")), EINum(1L))), ERef(RefProp(RefProp(RefId(Id("""nextPending""")), EStr("""Arguments""")), EINum(2L))))).setId(8754), ILet(Id("""result"""), ERef(RefId(Id("""__x3__""")))).setId(8755), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(8757), IIf(ERef(RefId(Id("""__x4__"""))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""HostReportErrors"""))), List(EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))).setId(8758), IExpr(ERef(RefId(Id("""__x5__""")))).setId(8759))).setId(8796), ISeq(List()).setId(8797)).setId(8761))).setId(8799)).setId(8764))).setId(8801))
  val instToStepMap: Map[Int, Int] = HashMap(8755 -> 20, 8723 -> 20, 8738 -> 20, 8759 -> 20, 8751 -> 20, 8743 -> 20, 8764 -> 20, 8739 -> 20, 8745 -> 20, 8750 -> 20, 8757 -> 20, 8734 -> 20, 8761 -> 20, 8749 -> 20, 8758 -> 20, 8741 -> 20, 8733 -> 20, 8747 -> 20, 8752 -> 20, 8753 -> 20, 8748 -> 20, 8727 -> 6, 8742 -> 20, 8756 -> 20, 8724 -> 0, 8746 -> 20, 8760 -> 20, 8728 -> 20, 8762 -> 20, 8740 -> 20, 8719 -> 0, 8763 -> 20, 8725 -> 0, 8744 -> 20, 8754 -> 20, 8726 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(8724, 8719, 8725, 8726), 10 -> HashSet(8723), 14 -> HashSet(8746, 8745), 20 -> HashSet(8755, 8723, 8738, 8759, 8742, 8751, 8743, 8764, 8739, 8745, 8750, 8763, 8744, 8757, 8734, 8761, 8749, 8754, 8758, 8741, 8733, 8747, 8752, 8753, 8748, 8756, 8746, 8760, 8728, 8762, 8740), 6 -> HashSet(8727), 9 -> HashSet(8733, 8728, 8734), 13 -> HashSet(8743, 8744), 17 -> HashSet(8752, 8753, 8751), 12 -> HashSet(8742, 8741), 18 -> HashSet(8723), 16 -> HashSet(8750, 8749), 11 -> HashSet(8738, 8739, 8740), 19 -> HashSet(8755, 8756, 8754), 15 -> HashSet(8747, 8748))
  /* Beautified form:
  "RunJobs" () => {
    app __x0__ = (InitializeHostDefinedRealm )
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (EnqueueJob "ScriptJobs" ScriptEvaluationJob (new [script, hostDefined]))
    while true {
      GLOBAL_context = null
      if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] GLOBAL_context) {
        __x2__ = (- GLOBAL_executionStack["length"] 1i)
        (pop GLOBAL_executionStack __x2__)
      } else {}
      if (= GLOBAL_jobQueue["length"] 0.0) return (new Completion("Type" -> CONST_normal, "Value" -> undefined, "Target" -> CONST_empty)) else {}
      let nextQueue = GLOBAL_jobQueue
      let nextPending = (pop nextQueue 0i)
      let newContext = (new ExecutionContext("SubMap" -> (new SubMap())))
      newContext["Function"] = null
      newContext["Realm"] = nextPending["Realm"]
      newContext["ScriptOrModule"] = nextPending["ScriptOrModule"]
      append newContext -> GLOBAL_executionStack
      GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
      app __x3__ = (nextPending["Job"] nextPending["Arguments"][0i] nextPending["Arguments"][1i] nextPending["Arguments"][2i])
      let result = __x3__
      app __x4__ = (IsAbruptCompletion result)
      if __x4__ {
        app __x5__ = (HostReportErrors (new [result["Value"]]))
        __x5__
      } else {}
    }
  }
  */
}
