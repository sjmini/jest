package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionInitialize {
  val length: Int = 5
  val func: Func = Func("""FunctionInitialize""", List(Id("""F"""), Id("""kind"""), Id("""ParameterList"""), Id("""Body"""), Id("""Scope""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ParameterList"""))), EStr("""ExpectedArgumentCount""")).setId(52010), ILet(Id("""len"""), ERef(RefId(Id("""__x0__""")))).setId(52011), IApp(Id("""__x1__"""), ERef(RefId(Id("""SetFunctionLength"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""len"""))))).setId(52013), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(52014), IReturn(ERef(RefId(Id("""__x1__""")))).setId(52015)).setId(52016), ISeq(List()).setId(52058)).setId(52018), IExpr(ERef(RefId(Id("""__x1__""")))).setId(52019), IIf(EBool(true), ILet(Id("""Strict"""), EBool(true)).setId(52021), ILet(Id("""Strict"""), EBool(false)).setId(52023)).setId(52025), IAssign(RefProp(RefId(Id("""F""")), EStr("""Strict""")), ERef(RefId(Id("""Strict""")))).setId(52027), IAssign(RefProp(RefId(Id("""F""")), EStr("""Environment""")), ERef(RefId(Id("""Scope""")))).setId(52029), IAssign(RefProp(RefId(Id("""F""")), EStr("""FormalParameters""")), ERef(RefId(Id("""ParameterList""")))).setId(52031), IAssign(RefProp(RefId(Id("""F""")), EStr("""ECMAScriptCode""")), ERef(RefId(Id("""Body""")))).setId(52033), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetActiveScriptOrModule"""))), List()).setId(52035), IAssign(RefProp(RefId(Id("""F""")), EStr("""ScriptOrModule""")), ERef(RefId(Id("""__x2__""")))).setId(52036), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), ERef(RefId(Id("""CONST_Arrow""")))), IAssign(RefProp(RefId(Id("""F""")), EStr("""ThisMode""")), ERef(RefId(Id("""CONST_lexical""")))).setId(52038), IIf(EBOp(OEq, ERef(RefId(Id("""Strict"""))), EBool(true)), IAssign(RefProp(RefId(Id("""F""")), EStr("""ThisMode""")), ERef(RefId(Id("""CONST_strict""")))).setId(52040), IAssign(RefProp(RefId(Id("""F""")), EStr("""ThisMode""")), ERef(RefId(Id("""CONST_global""")))).setId(52042)).setId(52044)).setId(52046), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(52048), IReturn(ERef(RefId(Id("""__x3__""")))).setId(52049))).setId(52077))
  val instToStepMap: Map[Int, Int] = HashMap(52021 -> 2, 52029 -> 4, 52039 -> 8, 52037 -> 7, 52019 -> 1, 52023 -> 2, 52026 -> 2, 52033 -> 6, 52048 -> 11, 52035 -> 7, 52010 -> 0, 52049 -> 11, 52032 -> 5, 52034 -> 6, 52040 -> 9, 52046 -> 10, 52043 -> 10, 52011 -> 0, 52028 -> 3, 52020 -> 1, 52025 -> 2, 52024 -> 2, 52044 -> 10, 52012 -> 0, 52047 -> 10, 52038 -> 8, 52036 -> 7, 52013 -> 1, 52045 -> 10, 52030 -> 4, 52041 -> 9, 52022 -> 2, 52031 -> 5, 52018 -> 1, 52050 -> 11, 52027 -> 3, 52042 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(52011, 52012, 52010), 5 -> HashSet(52032, 52031), 10 -> HashSet(52044, 52047, 52045, 52042, 52046, 52043), 1 -> HashSet(52020, 52013, 52019, 52018), 6 -> HashSet(52034, 52033), 9 -> HashSet(52040, 52041), 2 -> HashSet(52021, 52025, 52024, 52023, 52026, 52022), 7 -> HashSet(52037, 52036, 52035), 3 -> HashSet(52028, 52027), 11 -> HashSet(52049, 52048, 52050), 8 -> HashSet(52039, 52038), 4 -> HashSet(52029, 52030))
  /* Beautified form:
  "FunctionInitialize" (F, kind, ParameterList, Body, Scope) => {
    access __x0__ = (ParameterList "ExpectedArgumentCount")
    let len = __x0__
    app __x1__ = (SetFunctionLength F len)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    if true let Strict = true else let Strict = false
    F["Strict"] = Strict
    F["Environment"] = Scope
    F["FormalParameters"] = ParameterList
    F["ECMAScriptCode"] = Body
    app __x2__ = (GetActiveScriptOrModule )
    F["ScriptOrModule"] = __x2__
    if (= kind CONST_Arrow) F["ThisMode"] = CONST_lexical else if (= Strict true) F["ThisMode"] = CONST_strict else F["ThisMode"] = CONST_global
    app __x3__ = (WrapCompletion F)
    return __x3__
  }
  */
}
