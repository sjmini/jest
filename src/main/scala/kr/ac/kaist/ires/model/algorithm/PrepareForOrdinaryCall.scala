package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrepareForOrdinaryCall {
  val length: Int = 2
  val func: Func = Func("""PrepareForOrdinaryCall""", List(Id("""F"""), Id("""newTarget""")), None, ISeq(List(ILet(Id("""callerContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(51432), ILet(Id("""calleeContext"""), EMap(Ty("""ExecutionContext"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(51434), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""Function""")), ERef(RefId(Id("""F""")))).setId(51436), ILet(Id("""calleeRealm"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Realm""")))).setId(51438), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""Realm""")), ERef(RefId(Id("""calleeRealm""")))).setId(51440), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""ScriptOrModule""")), ERef(RefProp(RefId(Id("""F""")), EStr("""ScriptOrModule""")))).setId(51442), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewFunctionEnvironment"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""newTarget"""))))).setId(51444), ILet(Id("""localEnv"""), ERef(RefId(Id("""__x0__""")))).setId(51445), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""localEnv""")))).setId(51447), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""VariableEnvironment""")), ERef(RefId(Id("""localEnv""")))).setId(51449), IIf(EBOp(OEq, ERef(RefId(Id("""callerContext"""))), ENull), ISeq(List(IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(51451), IAssign(RefId(Id("""callerContext""")), ENull).setId(51452))).setId(51453), ISeq(List()).setId(51431)).setId(51454), IAppend(ERef(RefId(Id("""calleeContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(51456), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(51457), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""calleeContext"""))))).setId(51459), IReturn(ERef(RefId(Id("""__x1__""")))).setId(51460))).setId(-1))
  /* Beautified form:
  "PrepareForOrdinaryCall" (F, newTarget) => {
    let callerContext = GLOBAL_context
    let calleeContext = (new ExecutionContext("SubMap" -> (new SubMap())))
    calleeContext["Function"] = F
    let calleeRealm = F["Realm"]
    calleeContext["Realm"] = calleeRealm
    calleeContext["ScriptOrModule"] = F["ScriptOrModule"]
    app __x0__ = (NewFunctionEnvironment F newTarget)
    let localEnv = __x0__
    calleeContext["LexicalEnvironment"] = localEnv
    calleeContext["VariableEnvironment"] = localEnv
    if (= callerContext null) {
      GLOBAL_context = null
      callerContext = null
    } else {}
    append calleeContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x1__ = (WrapCompletion calleeContext)
    return __x1__
  }
  */
}
