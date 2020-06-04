package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentElement0KeyedDestructuringAssignmentEvaluation1 {
  val length: Int = 0
  val func: Func = Func("""AssignmentElement0KeyedDestructuringAssignmentEvaluation1""", List(Id("""this"""), Id("""DestructuringAssignmentTarget"""), Id("""Initializer"""), Id("""value"""), Id("""propertyName""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ObjectLiteral"""), EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ArrayLiteral"""))), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""Evaluation""")).setId(25394), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(25395), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""lref""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""lref""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""lref""")), ERef(RefProp(RefId(Id("""lref""")), EStr("""Value""")))).setId(25397), IReturn(ERef(RefId(Id("""lref""")))).setId(25398)).setId(25399), ISeq(List()).setId(25400)).setId(25401), IExpr(ERef(RefId(Id("""lref""")))).setId(25402))).setId(25404), ISeq(List()).setId(25400)).setId(25405), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetV"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""propertyName"""))))).setId(25407), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(25408), IReturn(ERef(RefId(Id("""__x1__""")))).setId(25409)).setId(25410), ISeq(List()).setId(25400)).setId(25411), ILet(Id("""v"""), ERef(RefId(Id("""__x1__""")))).setId(25412), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Initializer"""))), EAbsent)), EBOp(OEq, ERef(RefId(Id("""v"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAnonymousFunctionDefinition"""))), List(ERef(RefId(Id("""Initializer"""))))).setId(25414), IAccess(Id("""__x3__"""), ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""IsIdentifierRef""")).setId(25415), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""lref"""))))).setId(25416), IAccess(Id("""__x5__"""), ERef(RefId(Id("""Initializer"""))), EStr("""NamedEvaluation""")).setId(25417), IApp(Id("""__x6__"""), ERef(RefId(Id("""__x5__"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(25418), ILet(Id("""rhsValue"""), ERef(RefId(Id("""__x6__""")))).setId(25419))).setId(25421), ISeq(List(IAccess(Id("""__x7__"""), ERef(RefId(Id("""Initializer"""))), EStr("""Evaluation""")).setId(25423), ILet(Id("""defaultValue"""), ERef(RefId(Id("""__x7__""")))).setId(25424), IApp(Id("""__x8__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""defaultValue"""))))).setId(25426), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(25427), IReturn(ERef(RefId(Id("""__x8__""")))).setId(25428)).setId(25429), ISeq(List()).setId(25400)).setId(25430), ILet(Id("""rhsValue"""), ERef(RefId(Id("""__x8__""")))).setId(25431))).setId(25433)).setId(25434))).setId(25436), ILet(Id("""rhsValue"""), ERef(RefId(Id("""v""")))).setId(25437)).setId(25439), IIf(EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ObjectLiteral"""), EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ArrayLiteral""")), ISeq(List(ILet(Id("""assignmentPattern"""), EParseSyntax(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""AssignmentPattern"""), List())).setId(25441), IAccess(Id("""__x9__"""), ERef(RefId(Id("""assignmentPattern"""))), EStr("""DestructuringAssignmentEvaluation""")).setId(25443), IApp(Id("""__x10__"""), ERef(RefId(Id("""__x9__"""))), List(ERef(RefId(Id("""rhsValue"""))))).setId(25444), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(25445), IReturn(ERef(RefId(Id("""__x11__""")))).setId(25446))).setId(25448), ISeq(List()).setId(25400)).setId(25449), IApp(Id("""__x12__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lref"""))), ERef(RefId(Id("""rhsValue"""))))).setId(25451), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(25452), IReturn(ERef(RefId(Id("""__x12__""")))).setId(25453)).setId(25454), ISeq(List()).setId(25400)).setId(25455), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x12__"""))))).setId(25456), IReturn(ERef(RefId(Id("""__x13__""")))).setId(25457))).setId(-1))
  /* Beautified form:
  "AssignmentElement0KeyedDestructuringAssignmentEvaluation1" (this, DestructuringAssignmentTarget, Initializer, value, propertyName) => {
    if (! (|| (is-instance-of DestructuringAssignmentTarget ObjectLiteral) (is-instance-of DestructuringAssignmentTarget ArrayLiteral))) {
      access __x0__ = (DestructuringAssignmentTarget "Evaluation")
      let lref = __x0__
      if (= (typeof lref) "Completion") if (= lref["Type"] CONST_normal) lref = lref["Value"] else return lref else {}
      lref
    } else {}
    app __x1__ = (GetV value propertyName)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let v = __x1__
    if (&& (! (= Initializer absent)) (= v undefined)) {
      app __x2__ = (IsAnonymousFunctionDefinition Initializer)
      access __x3__ = (DestructuringAssignmentTarget "IsIdentifierRef")
      if (&& (= __x2__ true) (= __x3__ true)) {
        app __x4__ = (GetReferencedName lref)
        access __x5__ = (Initializer "NamedEvaluation")
        app __x6__ = (__x5__ __x4__)
        let rhsValue = __x6__
      } else {
        access __x7__ = (Initializer "Evaluation")
        let defaultValue = __x7__
        app __x8__ = (GetValue defaultValue)
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let rhsValue = __x8__
      }
    } else let rhsValue = v
    if (|| (is-instance-of DestructuringAssignmentTarget ObjectLiteral) (is-instance-of DestructuringAssignmentTarget ArrayLiteral)) {
      let assignmentPattern = (parse-syntax DestructuringAssignmentTarget "AssignmentPattern" )
      access __x9__ = (assignmentPattern "DestructuringAssignmentEvaluation")
      app __x10__ = (__x9__ rhsValue)
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    app __x12__ = (PutValue lref rhsValue)
    if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    app __x13__ = (WrapCompletion __x12__)
    return __x13__
  }
  */
}
