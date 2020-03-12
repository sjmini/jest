package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTeval {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.eval""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(61499), ILet(Id("""x"""), ERef(RefId(Id("""__x0__""")))).setId(61500), ILet(Id("""callerContext"""), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(2L))))).setId(61503), ILet(Id("""callerRealm"""), ERef(RefProp(RefId(Id("""callerContext""")), EStr("""Realm""")))).setId(61505), IApp(Id("""__x1__"""), ERef(RefId(Id("""PerformEval"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""callerRealm"""))), EBool(false), EBool(false))).setId(61507), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(61508), IReturn(ERef(RefId(Id("""__x1__""")))).setId(61509)).setId(61510), ISeq(List()).setId(61524)).setId(61511), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(61512), IReturn(ERef(RefId(Id("""__x2__""")))).setId(61513))).setId(61528))
  val instToStepMap: Map[Int, Int] = HashMap(61499 -> 0, 61503 -> 2, 61511 -> 4, 61502 -> 1, 61512 -> 4, 61505 -> 3, 61501 -> 0, 61514 -> 4, 61506 -> 3, 61500 -> 0, 61504 -> 2, 61507 -> 4, 61513 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(61499, 61501, 61500), 1 -> HashSet(61502), 2 -> HashSet(61503, 61504), 3 -> HashSet(61505, 61506), 4 -> HashSet(61511, 61512, 61514, 61507, 61513))
  /* Beautified form:
  "GLOBAL.eval" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let x = __x0__
    let callerContext = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 2i)]
    let callerRealm = callerContext["Realm"]
    app __x1__ = (PerformEval x callerRealm false false)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
