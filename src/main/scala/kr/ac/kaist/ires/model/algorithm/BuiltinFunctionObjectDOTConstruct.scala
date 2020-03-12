package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BuiltinFunctionObjectDOTConstruct {
  val length: Int = 2
  val func: Func = Func("""BuiltinFunctionObject.Construct""", List(Id("""F"""), Id("""argumentsList"""), Id("""newTarget""")), None, ISeq(List(ILet(Id("""callerContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(53494), IIf(EBOp(OEq, ERef(RefId(Id("""callerContext"""))), ENull), ISeq(List(IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(53496), IAssign(RefId(Id("""callerContext""")), ENull).setId(53497))).setId(53536), ISeq(List()).setId(53537)).setId(53500), ILet(Id("""calleeContext"""), EMap(Ty("""ExecutionContext"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(53502), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""Function""")), ERef(RefId(Id("""F""")))).setId(53504), ILet(Id("""calleeRealm"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Realm""")))).setId(53506), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""Realm""")), ERef(RefId(Id("""calleeRealm""")))).setId(53508), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""ScriptOrModule""")), ERef(RefProp(RefId(Id("""F""")), EStr("""ScriptOrModule""")))).setId(53510), IApp(Id("""localEnv"""), ERef(RefId(Id("""NewFunctionEnvironment"""))), List(ERef(RefId(Id("""F"""))), EUndef)).setId(53512), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""localEnv""")))).setId(53513), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""VariableEnvironment""")), ERef(RefId(Id("""localEnv""")))).setId(53514), IAppend(ERef(RefId(Id("""calleeContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(53516), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(53517), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Code"""))), List(EUndef, ERef(RefId(Id("""argumentsList"""))), ERef(RefId(Id("""newTarget"""))), ERef(RefId(Id("""F"""))))).setId(53519), ILet(Id("""result"""), ERef(RefId(Id("""__x0__""")))).setId(53520), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""calleeContext""")))), ISeq(List(IAssign(RefId(Id("""__x1__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(53522), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x1__"""))))).setId(53523))).setId(53553), ISeq(List()).setId(53554)).setId(53526), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(53527), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(53529), IReturn(ERef(RefId(Id("""__x2__""")))).setId(53530))).setId(53559))
  val instToStepMap: Map[Int, Int] = HashMap(53496 -> 1, 53514 -> 8, 53531 -> 12, 53518 -> 9, 53509 -> 6, 53502 -> 3, 53503 -> 3, 53500 -> 2, 53516 -> 9, 53529 -> 12, 53494 -> 0, 53520 -> 10, 53526 -> 11, 53517 -> 9, 53498 -> 1, 53501 -> 2, 53506 -> 5, 53521 -> 10, 53519 -> 10, 53495 -> 0, 53515 -> 8, 53528 -> 11, 53512 -> 8, 53527 -> 11, 53505 -> 4, 53497 -> 1, 53504 -> 4, 53511 -> 7, 53508 -> 6, 53513 -> 8, 53530 -> 12, 53510 -> 7, 53507 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(53495, 53494), 5 -> HashSet(53506, 53507), 10 -> HashSet(53521, 53519, 53520), 1 -> HashSet(53496, 53497, 53498), 6 -> HashSet(53509, 53508), 9 -> HashSet(53518, 53516, 53517), 2 -> HashSet(53500, 53501), 12 -> HashSet(53531, 53529, 53530), 7 -> HashSet(53511, 53510), 3 -> HashSet(53502, 53503), 11 -> HashSet(53528, 53527, 53526), 8 -> HashSet(53514, 53515, 53512, 53513), 4 -> HashSet(53505, 53504))
  /* Beautified form:
  "BuiltinFunctionObject.Construct" (F, argumentsList, newTarget) => {
    let callerContext = GLOBAL_context
    if (= callerContext null) {
      GLOBAL_context = null
      callerContext = null
    } else {}
    let calleeContext = (new ExecutionContext("SubMap" -> (new SubMap())))
    calleeContext["Function"] = F
    let calleeRealm = F["Realm"]
    calleeContext["Realm"] = calleeRealm
    calleeContext["ScriptOrModule"] = F["ScriptOrModule"]
    app localEnv = (NewFunctionEnvironment F undefined)
    calleeContext["LexicalEnvironment"] = localEnv
    calleeContext["VariableEnvironment"] = localEnv
    append calleeContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x0__ = (F["Code"] undefined argumentsList newTarget F)
    let result = __x0__
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] calleeContext) {
      __x1__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x1__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x2__ = (WrapCompletion result)
    return __x2__
  }
  */
}
