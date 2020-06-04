package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Catch0CatchClauseEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""Catch0CatchClauseEvaluation0""", List(Id("""this"""), Id("""CatchParameter"""), Id("""Block"""), Id("""thrownValue""")), None, ISeq(List(ILet(Id("""oldEnv"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(37378), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""oldEnv"""))))).setId(37380), ILet(Id("""catchEnv"""), ERef(RefId(Id("""__x0__""")))).setId(37381), ILet(Id("""catchEnvRec"""), ERef(RefProp(RefId(Id("""catchEnv""")), EStr("""EnvironmentRecord""")))).setId(37383), IAccess(Id("""__x1__"""), ERef(RefId(Id("""CatchParameter"""))), EStr("""BoundNames""")).setId(37385), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(37395), ILet(Id("""__x3__"""), EINum(0L)).setId(37396), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""argName"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(37397), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""catchEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""catchEnvRec"""))), ERef(RefId(Id("""argName"""))), EBool(false))).setId(37386), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(37387), IReturn(ERef(RefId(Id("""__x4__""")))).setId(37388)).setId(37389), ISeq(List()).setId(37390)).setId(37391), IExpr(ERef(RefId(Id("""__x4__""")))).setId(37392), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(37398))).setId(37399)).setId(37400), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""catchEnv""")))).setId(37403), IAccess(Id("""__x5__"""), ERef(RefId(Id("""CatchParameter"""))), EStr("""BindingInitialization""")).setId(37405), IApp(Id("""__x6__"""), ERef(RefId(Id("""__x5__"""))), List(ERef(RefId(Id("""thrownValue"""))), ERef(RefId(Id("""catchEnv"""))))).setId(37406), ILet(Id("""status"""), ERef(RefId(Id("""__x6__""")))).setId(37407), IApp(Id("""__x7__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""status"""))))).setId(37409), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""oldEnv""")))).setId(37410), IApp(Id("""__x8__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))).setId(37412), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(37413), IReturn(ERef(RefId(Id("""__x9__""")))).setId(37414))).setId(37416), ISeq(List()).setId(37390)).setId(37417), IAccess(Id("""__x10__"""), ERef(RefId(Id("""Block"""))), EStr("""Evaluation""")).setId(37420), ILet(Id("""B"""), ERef(RefId(Id("""__x10__""")))).setId(37421), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""oldEnv""")))).setId(37423), IApp(Id("""__x11__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""B"""))))).setId(37425), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))).setId(37426), IReturn(ERef(RefId(Id("""__x12__""")))).setId(37427))).setId(-1))
  /* Beautified form:
  "Catch0CatchClauseEvaluation0" (this, CatchParameter, Block, thrownValue) => {
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment oldEnv)
    let catchEnv = __x0__
    let catchEnvRec = catchEnv["EnvironmentRecord"]
    access __x1__ = (CatchParameter "BoundNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let argName = __x2__[__x3__]
      app __x4__ = (catchEnvRec["CreateMutableBinding"] catchEnvRec argName false)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      __x4__
      __x3__ = (+ __x3__ 1i)
    }
    GLOBAL_context["LexicalEnvironment"] = catchEnv
    access __x5__ = (CatchParameter "BindingInitialization")
    app __x6__ = (__x5__ thrownValue catchEnv)
    let status = __x6__
    app __x7__ = (IsAbruptCompletion status)
    if __x7__ {
      GLOBAL_context["LexicalEnvironment"] = oldEnv
      app __x8__ = (Completion status)
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {}
    access __x10__ = (Block "Evaluation")
    let B = __x10__
    GLOBAL_context["LexicalEnvironment"] = oldEnv
    app __x11__ = (Completion B)
    app __x12__ = (WrapCompletion __x11__)
    return __x12__
  }
  */
}
