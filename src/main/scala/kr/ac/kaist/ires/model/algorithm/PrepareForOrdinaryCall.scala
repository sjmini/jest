package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrepareForOrdinaryCall {
  val length: Int = 2
  val func: Func = Func("""PrepareForOrdinaryCall""", List(Id("""F"""), Id("""newTarget""")), None, ISeq(List(ILet(Id("""callerContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(51432), ILet(Id("""calleeContext"""), EMap(Ty("""ExecutionContext"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(51434), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""Function""")), ERef(RefId(Id("""F""")))).setId(51436), ILet(Id("""calleeRealm"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Realm""")))).setId(51438), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""Realm""")), ERef(RefId(Id("""calleeRealm""")))).setId(51440), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""ScriptOrModule""")), ERef(RefProp(RefId(Id("""F""")), EStr("""ScriptOrModule""")))).setId(51442), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewFunctionEnvironment"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""newTarget"""))))).setId(51444), ILet(Id("""localEnv"""), ERef(RefId(Id("""__x0__""")))).setId(51445), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""localEnv""")))).setId(51447), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""VariableEnvironment""")), ERef(RefId(Id("""localEnv""")))).setId(51449), IIf(EBOp(OEq, ERef(RefId(Id("""callerContext"""))), ENull), ISeq(List(IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(51451), IAssign(RefId(Id("""callerContext""")), ENull).setId(51452))).setId(51475), ISeq(List()).setId(51476)).setId(51454), IAppend(ERef(RefId(Id("""calleeContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(51456), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(51457), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""calleeContext"""))))).setId(51459), IReturn(ERef(RefId(Id("""__x1__""")))).setId(51460))).setId(51482))
  val instToStepMap: Map[Int, Int] = HashMap(51451 -> 10, 51460 -> 14, 51447 -> 8, 51452 -> 10, 51435 -> 2, 51461 -> 14, 51456 -> 12, 51442 -> 6, 51432 -> 1, 51449 -> 9, 51441 -> 5, 51448 -> 8, 51457 -> 12, 51450 -> 9, 51433 -> 1, 51444 -> 7, 51431 -> 13, 51454 -> 11, 51437 -> 3, 51443 -> 6, 51434 -> 2, 51438 -> 4, 51455 -> 11, 51446 -> 7, 51459 -> 14, 51436 -> 3, 51439 -> 4, 51458 -> 12, 51445 -> 7, 51440 -> 5, 51453 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(51431), 5 -> HashSet(51440, 51441), 10 -> HashSet(51451, 51452, 51453), 14 -> HashSet(51460, 51459, 51461), 1 -> HashSet(51433, 51432), 6 -> HashSet(51443, 51442), 9 -> HashSet(51450, 51449), 13 -> HashSet(51431), 2 -> HashSet(51434, 51435), 12 -> HashSet(51457, 51456, 51458), 7 -> HashSet(51444, 51446, 51445), 3 -> HashSet(51437, 51436), 11 -> HashSet(51454, 51455), 8 -> HashSet(51448, 51447), 4 -> HashSet(51438, 51439))
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
