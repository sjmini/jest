package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ScriptEvaluation {
  val length: Int = 1
  val func: Func = Func("""ScriptEvaluation""", List(Id("""scriptRecord""")), None, ISeq(List(ILet(Id("""globalEnv"""), ERef(RefProp(RefProp(RefId(Id("""scriptRecord""")), EStr("""Realm""")), EStr("""GlobalEnv""")))).setId(46331), ILet(Id("""scriptCxt"""), EMap(Ty("""ExecutionContext"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(46333), IAssign(RefProp(RefId(Id("""scriptCxt""")), EStr("""Function""")), ENull).setId(46335), IAssign(RefProp(RefId(Id("""scriptCxt""")), EStr("""Realm""")), ERef(RefProp(RefId(Id("""scriptRecord""")), EStr("""Realm""")))).setId(46337), IAssign(RefProp(RefId(Id("""scriptCxt""")), EStr("""ScriptOrModule""")), ERef(RefId(Id("""scriptRecord""")))).setId(46339), IAssign(RefProp(RefId(Id("""scriptCxt""")), EStr("""VariableEnvironment""")), ERef(RefId(Id("""globalEnv""")))).setId(46341), IAssign(RefProp(RefId(Id("""scriptCxt""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""globalEnv""")))).setId(46343), IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(46345), IAppend(ERef(RefId(Id("""scriptCxt"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(46346), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(46347), ILet(Id("""scriptBody"""), ERef(RefProp(RefId(Id("""scriptRecord""")), EStr("""ECMAScriptCode""")))).setId(46349), IApp(Id("""__x0__"""), ERef(RefId(Id("""GlobalDeclarationInstantiation"""))), List(ERef(RefId(Id("""scriptBody"""))), ERef(RefId(Id("""globalEnv"""))))).setId(46351), ILet(Id("""result"""), ERef(RefId(Id("""__x0__""")))).setId(46352), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""scriptBody"""))), EStr("""Evaluation""")).setId(46355), IAssign(RefId(Id("""result""")), ERef(RefId(Id("""__x1__""")))).setId(46356))).setId(46396), ISeq(List()).setId(46397)).setId(46360), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(46362), IAssign(RefId(Id("""result""")), ERef(RefId(Id("""__x2__""")))).setId(46363))).setId(46401), ISeq(List()).setId(46402)).setId(46366), IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(46368), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""scriptCxt""")))), ISeq(List(IAssign(RefId(Id("""__x3__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(46369), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x3__"""))))).setId(46370))).setId(46407), ISeq(List()).setId(46408)).setId(46373), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(46375), IApp(Id("""__x4__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))).setId(46376), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(46377), IReturn(ERef(RefId(Id("""__x5__""")))).setId(46378))).setId(46414))
  val instToStepMap: Map[Int, Int] = HashMap(46360 -> 14, 46363 -> 17, 46368 -> 19, 46334 -> 1, 46374 -> 19, 46333 -> 1, 46348 -> 8, 46332 -> 0, 46347 -> 8, 46335 -> 2, 46350 -> 9, 46361 -> 14, 46331 -> 0, 46356 -> 13, 46351 -> 10, 46378 -> 22, 46341 -> 5, 46346 -> 8, 46373 -> 19, 46345 -> 7, 46366 -> 18, 46349 -> 9, 46338 -> 3, 46337 -> 3, 46377 -> 22, 46342 -> 5, 46357 -> 13, 46367 -> 18, 46343 -> 6, 46365 -> 17, 46339 -> 4, 46375 -> 21, 46353 -> 10, 46358 -> 13, 46362 -> 17, 46359 -> 20, 46344 -> 6, 46340 -> 4, 46355 -> 13, 46376 -> 22, 46336 -> 2, 46364 -> 17, 46379 -> 22, 46352 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(46331, 46332), 5 -> HashSet(46341, 46342), 10 -> HashSet(46351, 46353, 46352), 14 -> HashSet(46360, 46361), 20 -> HashSet(46359), 1 -> HashSet(46334, 46333), 6 -> HashSet(46343, 46344), 21 -> HashSet(46375), 9 -> HashSet(46350, 46349), 13 -> HashSet(46356, 46357, 46358, 46355), 2 -> HashSet(46335, 46336), 17 -> HashSet(46363, 46365, 46362, 46364), 22 -> HashSet(46378, 46377, 46376, 46379), 7 -> HashSet(46345), 3 -> HashSet(46338, 46337), 18 -> HashSet(46366, 46367), 8 -> HashSet(46346, 46348, 46347), 19 -> HashSet(46368, 46373, 46374), 4 -> HashSet(46339, 46340))
  /* Beautified form:
  "ScriptEvaluation" (scriptRecord) => {
    let globalEnv = scriptRecord["Realm"]["GlobalEnv"]
    let scriptCxt = (new ExecutionContext("SubMap" -> (new SubMap())))
    scriptCxt["Function"] = null
    scriptCxt["Realm"] = scriptRecord["Realm"]
    scriptCxt["ScriptOrModule"] = scriptRecord
    scriptCxt["VariableEnvironment"] = globalEnv
    scriptCxt["LexicalEnvironment"] = globalEnv
    GLOBAL_context = null
    append scriptCxt -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    let scriptBody = scriptRecord["ECMAScriptCode"]
    app __x0__ = (GlobalDeclarationInstantiation scriptBody globalEnv)
    let result = __x0__
    if (= result["Type"] CONST_normal) {
      access __x1__ = (scriptBody "Evaluation")
      result = __x1__
    } else {}
    if (&& (= result["Type"] CONST_normal) (= result["Value"] CONST_empty)) {
      app __x2__ = (NormalCompletion undefined)
      result = __x2__
    } else {}
    GLOBAL_context = null
    if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] scriptCxt) {
      __x3__ = (- GLOBAL_executionStack["length"] 1i)
      (pop GLOBAL_executionStack __x3__)
    } else {}
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x4__ = (Completion result)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
