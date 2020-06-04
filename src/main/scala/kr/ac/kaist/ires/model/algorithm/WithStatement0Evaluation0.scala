package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object WithStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""WithStatement0Evaluation0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(34183), ILet(Id("""val"""), ERef(RefId(Id("""__x0__""")))).setId(34184), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""val"""))))).setId(34186), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(34187), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34188)).setId(34189), ISeq(List()).setId(34190)).setId(34191), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(34192), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(34193), IReturn(ERef(RefId(Id("""__x2__""")))).setId(34194)).setId(34195), ISeq(List()).setId(34190)).setId(34196), ILet(Id("""obj"""), ERef(RefId(Id("""__x2__""")))).setId(34197), ILet(Id("""oldEnv"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(34199), IApp(Id("""__x3__"""), ERef(RefId(Id("""NewObjectEnvironment"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""oldEnv"""))))).setId(34201), ILet(Id("""newEnv"""), ERef(RefId(Id("""__x3__""")))).setId(34202), IAssign(RefProp(RefProp(RefId(Id("""newEnv""")), EStr("""EnvironmentRecord""")), EStr("""withEnvironment""")), EBool(true)).setId(34204), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""newEnv""")))).setId(34206), IAccess(Id("""__x4__"""), ERef(RefId(Id("""Statement"""))), EStr("""Evaluation""")).setId(34209), ILet(Id("""C"""), ERef(RefId(Id("""__x4__""")))).setId(34210), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""oldEnv""")))).setId(34212), IApp(Id("""__x5__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""C"""))), EUndef)).setId(34214), IApp(Id("""__x6__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(34215), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(34216), IReturn(ERef(RefId(Id("""__x7__""")))).setId(34217))).setId(-1))
  /* Beautified form:
  "WithStatement0Evaluation0" (this, Expression, Statement) => {
    access __x0__ = (Expression "Evaluation")
    let val = __x0__
    app __x1__ = (GetValue val)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToObject __x1__)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let obj = __x2__
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    app __x3__ = (NewObjectEnvironment obj oldEnv)
    let newEnv = __x3__
    newEnv["EnvironmentRecord"]["withEnvironment"] = true
    GLOBAL_context["LexicalEnvironment"] = newEnv
    access __x4__ = (Statement "Evaluation")
    let C = __x4__
    GLOBAL_context["LexicalEnvironment"] = oldEnv
    app __x5__ = (UpdateEmpty C undefined)
    app __x6__ = (Completion __x5__)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
