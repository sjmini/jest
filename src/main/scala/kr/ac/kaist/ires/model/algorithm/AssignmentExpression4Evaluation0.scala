package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentExpression4Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression4Evaluation0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentExpression""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""LeftHandSideExpression"""))), """ObjectLiteral"""), EIsInstanceOf(ERef(RefId(Id("""LeftHandSideExpression"""))), """ArrayLiteral"""))), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LeftHandSideExpression"""))), EStr("""Evaluation""")).setId(22679), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(22680), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""lref""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""lref""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""lref""")), ERef(RefProp(RefId(Id("""lref""")), EStr("""Value""")))).setId(22682), IReturn(ERef(RefId(Id("""lref""")))).setId(22683)).setId(22684), ISeq(List()).setId(22685)).setId(22686), IExpr(ERef(RefId(Id("""lref""")))).setId(22687), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsAnonymousFunctionDefinition"""))), List(ERef(RefId(Id("""AssignmentExpression"""))))).setId(22689), IAccess(Id("""__x2__"""), ERef(RefId(Id("""LeftHandSideExpression"""))), EStr("""IsIdentifierRef""")).setId(22690), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""lref"""))))).setId(22691), IAccess(Id("""__x4__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""NamedEvaluation""")).setId(22692), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(22693), ILet(Id("""rval"""), ERef(RefId(Id("""__x5__""")))).setId(22694))).setId(22696), ISeq(List(IAccess(Id("""__x6__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(22698), ILet(Id("""rref"""), ERef(RefId(Id("""__x6__""")))).setId(22699), IApp(Id("""__x7__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(22701), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(22702), IReturn(ERef(RefId(Id("""__x7__""")))).setId(22703)).setId(22704), ISeq(List()).setId(22685)).setId(22705), ILet(Id("""rval"""), ERef(RefId(Id("""__x7__""")))).setId(22706))).setId(22708)).setId(22709), IApp(Id("""__x8__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lref"""))), ERef(RefId(Id("""rval"""))))).setId(22711), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(22712), IReturn(ERef(RefId(Id("""__x8__""")))).setId(22713)).setId(22714), ISeq(List()).setId(22685)).setId(22715), IExpr(ERef(RefId(Id("""__x8__""")))).setId(22716), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""rval"""))))).setId(22718), IReturn(ERef(RefId(Id("""__x9__""")))).setId(22719))).setId(22721), ISeq(List()).setId(22685)).setId(22722), ILet(Id("""assignmentPattern"""), EParseSyntax(ERef(RefId(Id("""LeftHandSideExpression"""))), EStr("""AssignmentPattern"""), List())).setId(22724), IAccess(Id("""__x10__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(22727), ILet(Id("""rref"""), ERef(RefId(Id("""__x10__""")))).setId(22728), IApp(Id("""__x11__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(22730), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(22731), IReturn(ERef(RefId(Id("""__x11__""")))).setId(22732)).setId(22733), ISeq(List()).setId(22685)).setId(22734), ILet(Id("""rval"""), ERef(RefId(Id("""__x11__""")))).setId(22735), IAccess(Id("""__x12__"""), ERef(RefId(Id("""assignmentPattern"""))), EStr("""DestructuringAssignmentEvaluation""")).setId(22737), IApp(Id("""__x13__"""), ERef(RefId(Id("""__x12__"""))), List(ERef(RefId(Id("""rval"""))))).setId(22738), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(22739), IReturn(ERef(RefId(Id("""__x13__""")))).setId(22740)).setId(22741), ISeq(List()).setId(22685)).setId(22742), IExpr(ERef(RefId(Id("""__x13__""")))).setId(22743), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""rval"""))))).setId(22745), IReturn(ERef(RefId(Id("""__x14__""")))).setId(22746))).setId(-1))
  /* Beautified form:
  "AssignmentExpression4Evaluation0" (this, LeftHandSideExpression, AssignmentExpression) => {
    if (! (|| (is-instance-of LeftHandSideExpression ObjectLiteral) (is-instance-of LeftHandSideExpression ArrayLiteral))) {
      access __x0__ = (LeftHandSideExpression "Evaluation")
      let lref = __x0__
      if (= (typeof lref) "Completion") if (= lref["Type"] CONST_normal) lref = lref["Value"] else return lref else {}
      lref
      app __x1__ = (IsAnonymousFunctionDefinition AssignmentExpression)
      access __x2__ = (LeftHandSideExpression "IsIdentifierRef")
      if (&& (= __x1__ true) (= __x2__ true)) {
        app __x3__ = (GetReferencedName lref)
        access __x4__ = (AssignmentExpression "NamedEvaluation")
        app __x5__ = (__x4__ __x3__)
        let rval = __x5__
      } else {
        access __x6__ = (AssignmentExpression "Evaluation")
        let rref = __x6__
        app __x7__ = (GetValue rref)
        if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        let rval = __x7__
      }
      app __x8__ = (PutValue lref rval)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      __x8__
      app __x9__ = (WrapCompletion rval)
      return __x9__
    } else {}
    let assignmentPattern = (parse-syntax LeftHandSideExpression "AssignmentPattern" )
    access __x10__ = (AssignmentExpression "Evaluation")
    let rref = __x10__
    app __x11__ = (GetValue rref)
    if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    let rval = __x11__
    access __x12__ = (assignmentPattern "DestructuringAssignmentEvaluation")
    app __x13__ = (__x12__ rval)
    if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    __x13__
    app __x14__ = (WrapCompletion rval)
    return __x14__
  }
  */
}
