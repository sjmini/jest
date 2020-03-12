package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BuiltinFunctionObjectDOTCall {
  val length: Int = 2
  val func: Func = Func("""BuiltinFunctionObject.Call""", List(Id("""F"""), Id("""thisArgument"""), Id("""argumentsList""")), None, ISeq(List(ILet(Id("""callerContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(53401), IIf(EBOp(OEq, ERef(RefId(Id("""callerContext"""))), ENull), ISeq(List(IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(53403), IAssign(RefId(Id("""callerContext""")), ENull).setId(53404))).setId(53443), ISeq(List()).setId(53444)).setId(53407), ILet(Id("""calleeContext"""), EMap(Ty("""ExecutionContext"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(53409), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""Function""")), ERef(RefId(Id("""F""")))).setId(53411), ILet(Id("""calleeRealm"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Realm""")))).setId(53413), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""Realm""")), ERef(RefId(Id("""calleeRealm""")))).setId(53415), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""ScriptOrModule""")), ERef(RefProp(RefId(Id("""F""")), EStr("""ScriptOrModule""")))).setId(53417), IApp(Id("""localEnv"""), ERef(RefId(Id("""NewFunctionEnvironment"""))), List(ERef(RefId(Id("""F"""))), EUndef)).setId(53419), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""localEnv""")))).setId(53420), IAssign(RefProp(RefId(Id("""calleeContext""")), EStr("""VariableEnvironment""")), ERef(RefId(Id("""localEnv""")))).setId(53421), IAppend(ERef(RefId(Id("""calleeContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(53423), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(53424), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Code"""))), List(ERef(RefId(Id("""thisArgument"""))), ERef(RefId(Id("""argumentsList"""))), EUndef, ERef(RefId(Id("""F"""))))).setId(53426), ILet(Id("""result"""), ERef(RefId(Id("""__x0__""")))).setId(53427), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""calleeContext""")))), ISeq(List(IAssign(RefId(Id("""__x1__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(53429), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x1__"""))))).setId(53430))).setId(53460), ISeq(List()).setId(53461)).setId(53433), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(53434), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(53436), IReturn(ERef(RefId(Id("""__x2__""")))).setId(53437))).setId(53466))
  val instToStepMap: Map[Int, Int] = HashMap(53409 -> 3, 53402 -> 0, 53436 -> 12, 53427 -> 10, 53412 -> 4, 53435 -> 11, 53404 -> 1, 53415 -> 6, 53419 -> 8, 53425 -> 9, 53405 -> 1, 53433 -> 11, 53414 -> 5, 53401 -> 0, 53438 -> 12, 53421 -> 8, 53417 -> 7, 53434 -> 11, 53413 -> 5, 53428 -> 10, 53407 -> 2, 53422 -> 8, 53418 -> 7, 53416 -> 6, 53403 -> 1, 53411 -> 4, 53408 -> 2, 53426 -> 10, 53423 -> 9, 53420 -> 8, 53437 -> 12, 53410 -> 3, 53424 -> 9)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(53402, 53401), 5 -> HashSet(53413, 53414), 10 -> HashSet(53428, 53427, 53426), 1 -> HashSet(53403, 53404, 53405), 6 -> HashSet(53416, 53415), 9 -> HashSet(53423, 53425, 53424), 2 -> HashSet(53407, 53408), 12 -> HashSet(53438, 53436, 53437), 7 -> HashSet(53417, 53418), 3 -> HashSet(53409, 53410), 11 -> HashSet(53434, 53435, 53433), 8 -> HashSet(53421, 53422, 53420, 53419), 4 -> HashSet(53412, 53411))
  /* Beautified form:
  "BuiltinFunctionObject.Call" (F, thisArgument, argumentsList) => {
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
    app __x0__ = (F["Code"] thisArgument argumentsList undefined F)
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
