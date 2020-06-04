package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SuperProperty0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""SuperProperty0Evaluation0""", List(Id("""this"""), Id("""Expression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetThisEnvironment"""))), List()).setId(17567), ILet(Id("""env"""), ERef(RefId(Id("""__x0__""")))).setId(17568), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""env""")), EStr("""GetThisBinding"""))), List(ERef(RefId(Id("""env"""))))).setId(17570), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(17571), IReturn(ERef(RefId(Id("""__x1__""")))).setId(17572)).setId(17573), ISeq(List()).setId(17574)).setId(17575), ILet(Id("""actualThis"""), ERef(RefId(Id("""__x1__""")))).setId(17576), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(17579), ILet(Id("""propertyNameReference"""), ERef(RefId(Id("""__x2__""")))).setId(17580), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""propertyNameReference"""))))).setId(17582), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(17583), IReturn(ERef(RefId(Id("""__x3__""")))).setId(17584)).setId(17585), ISeq(List()).setId(17574)).setId(17586), ILet(Id("""propertyNameValue"""), ERef(RefId(Id("""__x3__""")))).setId(17587), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToPropertyKey"""))), List(ERef(RefId(Id("""propertyNameValue"""))))).setId(17589), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(17590), IReturn(ERef(RefId(Id("""__x4__""")))).setId(17591)).setId(17592), ISeq(List()).setId(17574)).setId(17593), ILet(Id("""propertyKey"""), ERef(RefId(Id("""__x4__""")))).setId(17594), IIf(EBool(true), ILet(Id("""strict"""), EBool(true)).setId(17596), ILet(Id("""strict"""), EBool(false)).setId(17598)).setId(17600), IApp(Id("""__x5__"""), ERef(RefId(Id("""MakeSuperPropertyReference"""))), List(ERef(RefId(Id("""actualThis"""))), ERef(RefId(Id("""propertyKey"""))), ERef(RefId(Id("""strict"""))))).setId(17602), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(17603), IReturn(ERef(RefId(Id("""__x5__""")))).setId(17604)).setId(17605), ISeq(List()).setId(17574)).setId(17606), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(17607), IReturn(ERef(RefId(Id("""__x6__""")))).setId(17608))).setId(-1))
  /* Beautified form:
  "SuperProperty0Evaluation0" (this, Expression) => {
    app __x0__ = (GetThisEnvironment )
    let env = __x0__
    app __x1__ = (env["GetThisBinding"] env)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let actualThis = __x1__
    access __x2__ = (Expression "Evaluation")
    let propertyNameReference = __x2__
    app __x3__ = (GetValue propertyNameReference)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let propertyNameValue = __x3__
    app __x4__ = (ToPropertyKey propertyNameValue)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let propertyKey = __x4__
    if true let strict = true else let strict = false
    app __x5__ = (MakeSuperPropertyReference actualThis propertyKey strict)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
