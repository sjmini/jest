package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object RunJobs {
  val length: Int = 0
  val func: Func = Func("""RunJobs""", List(), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""InitializeHostDefinedRealm"""))), List()).setId(8719), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(8720), IReturn(ERef(RefId(Id("""__x0__""")))).setId(8721)).setId(8722), ISeq(List()).setId(8723)).setId(8724), IExpr(ERef(RefId(Id("""__x0__""")))).setId(8725), IApp(Id("""__x1__"""), ERef(RefId(Id("""EnqueueJob"""))), List(EStr("""ScriptJobs"""), ERef(RefId(Id("""ScriptEvaluationJob"""))), EList(List(ERef(RefId(Id("""script"""))), ERef(RefId(Id("""hostDefined"""))))))).setId(8727), IWhile(EBool(true), ISeq(List(IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(8728), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""GLOBAL_context""")))), ISeq(List(IAssign(RefId(Id("""__x2__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(8729), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x2__"""))))).setId(8730))).setId(8731), ISeq(List()).setId(8732)).setId(8733), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_jobQueue""")), EStr("""length"""))), ENum(0.0)), IReturn(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_normal""")))), (EStr("""Value"""), EUndef), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty"""))))))).setId(8735), ISeq(List()).setId(8737)).setId(8738), ILet(Id("""nextQueue"""), ERef(RefId(Id("""GLOBAL_jobQueue""")))).setId(8739), ILet(Id("""nextPending"""), EPop(ERef(RefId(Id("""nextQueue"""))), EINum(0L))).setId(8741), ILet(Id("""newContext"""), EMap(Ty("""ExecutionContext"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(8743), IAssign(RefProp(RefId(Id("""newContext""")), EStr("""Function""")), ENull).setId(8745), IAssign(RefProp(RefId(Id("""newContext""")), EStr("""Realm""")), ERef(RefProp(RefId(Id("""nextPending""")), EStr("""Realm""")))).setId(8747), IAssign(RefProp(RefId(Id("""newContext""")), EStr("""ScriptOrModule""")), ERef(RefProp(RefId(Id("""nextPending""")), EStr("""ScriptOrModule""")))).setId(8749), IAppend(ERef(RefId(Id("""newContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(8751), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(8752), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""nextPending""")), EStr("""Job"""))), List(ERef(RefProp(RefProp(RefId(Id("""nextPending""")), EStr("""Arguments""")), EINum(0L))), ERef(RefProp(RefProp(RefId(Id("""nextPending""")), EStr("""Arguments""")), EINum(1L))), ERef(RefProp(RefProp(RefId(Id("""nextPending""")), EStr("""Arguments""")), EINum(2L))))).setId(8754), ILet(Id("""result"""), ERef(RefId(Id("""__x3__""")))).setId(8755), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(8757), IIf(ERef(RefId(Id("""__x4__"""))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""HostReportErrors"""))), List(EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))).setId(8758), IExpr(ERef(RefId(Id("""__x5__""")))).setId(8759))).setId(8760), ISeq(List()).setId(8723)).setId(8761))).setId(8763)).setId(8764))).setId(-1))
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
