package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentProperty0PropertyDestructuringAssignmentEvaluation1 {
  val length: Int = 0
  val func: Func = Func("""AssignmentProperty0PropertyDestructuringAssignmentEvaluation1""", List(Id("""this"""), Id("""IdentifierReference"""), Id("""Initializer"""), Id("""value""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""IdentifierReference"""))), EStr("""StringValue""")).setId(24342), ILet(Id("""P"""), ERef(RefId(Id("""__x0__""")))).setId(24343), IApp(Id("""__x1__"""), ERef(RefId(Id("""ResolveBinding"""))), List(ERef(RefId(Id("""P"""))))).setId(24345), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(24346), IReturn(ERef(RefId(Id("""__x1__""")))).setId(24347)).setId(24348), ISeq(List()).setId(24349)).setId(24350), ILet(Id("""lref"""), ERef(RefId(Id("""__x1__""")))).setId(24351), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetV"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""P"""))))).setId(24353), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(24354), IReturn(ERef(RefId(Id("""__x2__""")))).setId(24355)).setId(24356), ISeq(List()).setId(24349)).setId(24357), ILet(Id("""v"""), ERef(RefId(Id("""__x2__""")))).setId(24358), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Initializer"""))), EAbsent)), EBOp(OEq, ERef(RefId(Id("""v"""))), EUndef)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAnonymousFunctionDefinition"""))), List(ERef(RefId(Id("""Initializer"""))))).setId(24360), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IAccess(Id("""__x4__"""), ERef(RefId(Id("""Initializer"""))), EStr("""NamedEvaluation""")).setId(24361), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""P"""))))).setId(24362), IAssign(RefId(Id("""v""")), ERef(RefId(Id("""__x5__""")))).setId(24363))).setId(24365), ISeq(List(IAccess(Id("""__x6__"""), ERef(RefId(Id("""Initializer"""))), EStr("""Evaluation""")).setId(24367), ILet(Id("""defaultValue"""), ERef(RefId(Id("""__x6__""")))).setId(24368), IApp(Id("""__x7__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""defaultValue"""))))).setId(24370), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(24371), IReturn(ERef(RefId(Id("""__x7__""")))).setId(24372)).setId(24373), ISeq(List()).setId(24349)).setId(24374), IAssign(RefId(Id("""v""")), ERef(RefId(Id("""__x7__""")))).setId(24375))).setId(24377)).setId(24378))).setId(24380), ISeq(List()).setId(24349)).setId(24381), IApp(Id("""__x8__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lref"""))), ERef(RefId(Id("""v"""))))).setId(24383), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(24384), IReturn(ERef(RefId(Id("""__x8__""")))).setId(24385)).setId(24386), ISeq(List()).setId(24349)).setId(24387), IExpr(ERef(RefId(Id("""__x8__""")))).setId(24388), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List(ERef(RefId(Id("""P"""))))))).setId(24390), IReturn(ERef(RefId(Id("""__x9__""")))).setId(24391))).setId(-1))
  /* Beautified form:
  "AssignmentProperty0PropertyDestructuringAssignmentEvaluation1" (this, IdentifierReference, Initializer, value) => {
    access __x0__ = (IdentifierReference "StringValue")
    let P = __x0__
    app __x1__ = (ResolveBinding P)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lref = __x1__
    app __x2__ = (GetV value P)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let v = __x2__
    if (&& (! (= Initializer absent)) (= v undefined)) {
      app __x3__ = (IsAnonymousFunctionDefinition Initializer)
      if (= __x3__ true) {
        access __x4__ = (Initializer "NamedEvaluation")
        app __x5__ = (__x4__ P)
        v = __x5__
      } else {
        access __x6__ = (Initializer "Evaluation")
        let defaultValue = __x6__
        app __x7__ = (GetValue defaultValue)
        if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        v = __x7__
      }
    } else {}
    app __x8__ = (PutValue lref v)
    if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    __x8__
    app __x9__ = (WrapCompletion (new [P]))
    return __x9__
  }
  */
}
