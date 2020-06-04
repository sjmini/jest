package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ImportCall0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ImportCall0Evaluation0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetActiveScriptOrModule"""))), List()).setId(18364), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(18365), IReturn(ERef(RefId(Id("""__x0__""")))).setId(18366)).setId(18367), ISeq(List()).setId(18368)).setId(18369), ILet(Id("""referencingScriptOrModule"""), ERef(RefId(Id("""__x0__""")))).setId(18370), IAccess(Id("""__x1__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(18373), ILet(Id("""argRef"""), ERef(RefId(Id("""__x1__""")))).setId(18374), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""argRef"""))))).setId(18376), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(18377), IReturn(ERef(RefId(Id("""__x2__""")))).setId(18378)).setId(18379), ISeq(List()).setId(18368)).setId(18380), ILet(Id("""specifier"""), ERef(RefId(Id("""__x2__""")))).setId(18381), IApp(Id("""__x3__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))))).setId(18383), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(18384), IReturn(ERef(RefId(Id("""__x3__""")))).setId(18385)).setId(18386), ISeq(List()).setId(18368)).setId(18387), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x3__""")))).setId(18388), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""specifier"""))))).setId(18390), ILet(Id("""specifierString"""), ERef(RefId(Id("""__x4__""")))).setId(18391), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""specifierString""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""specifierString""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""specifierString""")), ERef(RefProp(RefId(Id("""specifierString""")), EStr("""Value""")))).setId(18393), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""specifierString""")), EStr("""Value"""))))))).setId(18394), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x5__""")))).setId(18395), ISeq(List()).setId(18368)).setId(18396), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(18397))).setId(18398)).setId(18399), ISeq(List()).setId(18368)).setId(18400), IExpr(ERef(RefId(Id("""specifierString""")))).setId(18401), IApp(Id("""__x6__"""), ERef(RefId(Id("""HostImportModuleDynamically"""))), List(ERef(RefId(Id("""referencingScriptOrModule"""))), ERef(RefId(Id("""specifierString"""))), ERef(RefId(Id("""promiseCapability"""))))).setId(18403), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(18404), IReturn(ERef(RefId(Id("""__x6__""")))).setId(18405)).setId(18406), ISeq(List()).setId(18368)).setId(18407), IExpr(ERef(RefId(Id("""__x6__""")))).setId(18408), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(18410), IReturn(ERef(RefId(Id("""__x7__""")))).setId(18411))).setId(-1))
  /* Beautified form:
  "ImportCall0Evaluation0" (this, AssignmentExpression) => {
    app __x0__ = (GetActiveScriptOrModule )
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let referencingScriptOrModule = __x0__
    access __x1__ = (AssignmentExpression "Evaluation")
    let argRef = __x1__
    app __x2__ = (GetValue argRef)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let specifier = __x2__
    app __x3__ = (NewPromiseCapability INTRINSIC_Promise)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let promiseCapability = __x3__
    app __x4__ = (ToString specifier)
    let specifierString = __x4__
    if (= (typeof specifierString) "Completion") if (= specifierString["Type"] CONST_normal) specifierString = specifierString["Value"] else {
      app __x5__ = (Call promiseCapability["Reject"] undefined (new [specifierString["Value"]]))
      if (&& (= (typeof __x5__) "Completion") (! (= __x5__["Type"] CONST_normal))) return __x5__ else {}
      return promiseCapability["Promise"]
    } else {}
    specifierString
    app __x6__ = (HostImportModuleDynamically referencingScriptOrModule specifierString promiseCapability)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    __x6__
    app __x7__ = (WrapCompletion promiseCapability["Promise"])
    return __x7__
  }
  */
}
