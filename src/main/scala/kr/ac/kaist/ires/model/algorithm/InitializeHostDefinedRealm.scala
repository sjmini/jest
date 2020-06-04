package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object InitializeHostDefinedRealm {
  val length: Int = 0
  val func: Func = Func("""InitializeHostDefinedRealm""", List(), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateRealm"""))), List()).setId(8641), ILet(Id("""realm"""), ERef(RefId(Id("""__x0__""")))).setId(8642), ILet(Id("""newContext"""), EMap(Ty("""ExecutionContext"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(8644), IAssign(RefProp(RefId(Id("""newContext""")), EStr("""Function""")), ENull).setId(8646), IAssign(RefProp(RefId(Id("""newContext""")), EStr("""Realm""")), ERef(RefId(Id("""realm""")))).setId(8648), IAssign(RefProp(RefId(Id("""newContext""")), EStr("""ScriptOrModule""")), ENull).setId(8650), IAppend(ERef(RefId(Id("""newContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(8652), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(8653), ILet(Id("""global"""), EUndef).setId(8655), ILet(Id("""thisValue"""), EUndef).setId(8656), IApp(Id("""__x1__"""), ERef(RefId(Id("""SetRealmGlobalObject"""))), List(ERef(RefId(Id("""realm"""))), ERef(RefId(Id("""global"""))), ERef(RefId(Id("""thisValue"""))))).setId(8657), IExpr(ERef(RefId(Id("""__x1__""")))).setId(8658), IApp(Id("""__x2__"""), ERef(RefId(Id("""SetDefaultGlobalBindings"""))), List(ERef(RefId(Id("""realm"""))))).setId(8660), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(8661), IReturn(ERef(RefId(Id("""__x2__""")))).setId(8662)).setId(8663), ISeq(List()).setId(8664)).setId(8665), ILet(Id("""globalObj"""), ERef(RefId(Id("""__x2__""")))).setId(8666), IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(8668), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(8669), IReturn(ERef(RefId(Id("""__x4__""")))).setId(8670))).setId(-1))
  /* Beautified form:
  "InitializeHostDefinedRealm" () => {
    app __x0__ = (CreateRealm )
    let realm = __x0__
    let newContext = (new ExecutionContext("SubMap" -> (new SubMap())))
    newContext["Function"] = null
    newContext["Realm"] = realm
    newContext["ScriptOrModule"] = null
    append newContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    let global = undefined
    let thisValue = undefined
    app __x1__ = (SetRealmGlobalObject realm global thisValue)
    __x1__
    app __x2__ = (SetDefaultGlobalBindings realm)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let globalObj = __x2__
    app __x3__ = (NormalCompletion CONST_empty)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
