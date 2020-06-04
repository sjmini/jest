package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MemberExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression1Evaluation0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""MemberExpression"""))), EStr("""Evaluation""")).setId(16648), ILet(Id("""baseReference"""), ERef(RefId(Id("""__x0__""")))).setId(16649), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""baseReference"""))))).setId(16651), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(16652), IReturn(ERef(RefId(Id("""__x1__""")))).setId(16653)).setId(16654), ISeq(List()).setId(16655)).setId(16656), ILet(Id("""baseValue"""), ERef(RefId(Id("""__x1__""")))).setId(16657), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(16660), ILet(Id("""propertyNameReference"""), ERef(RefId(Id("""__x2__""")))).setId(16661), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""propertyNameReference"""))))).setId(16663), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(16664), IReturn(ERef(RefId(Id("""__x3__""")))).setId(16665)).setId(16666), ISeq(List()).setId(16655)).setId(16667), ILet(Id("""propertyNameValue"""), ERef(RefId(Id("""__x3__""")))).setId(16668), IApp(Id("""__x4__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""baseValue"""))))).setId(16670), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(16671), IReturn(ERef(RefId(Id("""__x4__""")))).setId(16672)).setId(16673), ISeq(List()).setId(16655)).setId(16674), ILet(Id("""bv"""), ERef(RefId(Id("""__x4__""")))).setId(16675), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToPropertyKey"""))), List(ERef(RefId(Id("""propertyNameValue"""))))).setId(16677), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(16678), IReturn(ERef(RefId(Id("""__x5__""")))).setId(16679)).setId(16680), ISeq(List()).setId(16655)).setId(16681), ILet(Id("""propertyKey"""), ERef(RefId(Id("""__x5__""")))).setId(16682), IIf(EBool(true), ILet(Id("""strict"""), EBool(true)).setId(16684), ILet(Id("""strict"""), EBool(false)).setId(16686)).setId(16688), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Reference"""), List((EStr("""BaseValue"""), ERef(RefId(Id("""bv""")))), (EStr("""ReferencedName"""), ERef(RefId(Id("""propertyKey""")))), (EStr("""StrictReference"""), ERef(RefId(Id("""strict""")))))))).setId(16690), IReturn(ERef(RefId(Id("""__x6__""")))).setId(16691))).setId(-1))
  /* Beautified form:
  "MemberExpression1Evaluation0" (this, MemberExpression, Expression) => {
    access __x0__ = (MemberExpression "Evaluation")
    let baseReference = __x0__
    app __x1__ = (GetValue baseReference)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let baseValue = __x1__
    access __x2__ = (Expression "Evaluation")
    let propertyNameReference = __x2__
    app __x3__ = (GetValue propertyNameReference)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let propertyNameValue = __x3__
    app __x4__ = (RequireObjectCoercible baseValue)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let bv = __x4__
    app __x5__ = (ToPropertyKey propertyNameValue)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let propertyKey = __x5__
    if true let strict = true else let strict = false
    app __x6__ = (WrapCompletion (new Reference("BaseValue" -> bv, "ReferencedName" -> propertyKey, "StrictReference" -> strict)))
    return __x6__
  }
  */
}
