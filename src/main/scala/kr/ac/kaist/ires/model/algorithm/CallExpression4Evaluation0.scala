package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CallExpression4Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression4Evaluation0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""MemberExpression"""))), EStr("""Evaluation""")), ILet(Id("""baseReference"""), ERef(RefId(Id("""__x0__""")))), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""baseReference"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), ILet(Id("""baseValue"""), ERef(RefId(Id("""__x1__""")))), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")), ILet(Id("""propertyNameReference"""), ERef(RefId(Id("""__x2__""")))), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""propertyNameReference"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x3__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x3__"""))))), ISeq(List())), ILet(Id("""propertyNameValue"""), ERef(RefId(Id("""__x3__""")))), IApp(Id("""__x4__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""baseValue"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), ILet(Id("""bv"""), ERef(RefId(Id("""__x4__""")))), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToPropertyKey"""))), List(ERef(RefId(Id("""propertyNameValue"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x5__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x5__"""))))), ISeq(List())), ILet(Id("""propertyKey"""), ERef(RefId(Id("""__x5__""")))), IIf(EBool(true), ILet(Id("""strict"""), EBool(true)), ILet(Id("""strict"""), EBool(false))), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Reference"""), List((EStr("""BaseValue"""), ERef(RefId(Id("""bv""")))), (EStr("""ReferencedName"""), ERef(RefId(Id("""propertyKey""")))), (EStr("""StrictReference"""), ERef(RefId(Id("""strict""")))))))), IReturn(ERef(RefId(Id("""__x6__""")))))))
  /* Beautified form:
  "CallExpression4Evaluation0" (this, MemberExpression, Expression) => {
    access __x0__ = (MemberExpression "Evaluation")
    let baseReference = __x0__
    app __x1__ = (GetValue baseReference)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let baseValue = __x1__
    access __x2__ = (Expression "Evaluation")
    let propertyNameReference = __x2__
    app __x3__ = (GetValue propertyNameReference)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let propertyNameValue = __x3__
    app __x4__ = (RequireObjectCoercible baseValue)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let bv = __x4__
    app __x5__ = (ToPropertyKey propertyNameValue)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let propertyKey = __x5__
    if true let strict = true else let strict = false
    app __x6__ = (WrapCompletion (new Reference("BaseValue" -> bv, "ReferencedName" -> propertyKey, "StrictReference" -> strict)))
    return __x6__
  }
  */
}
