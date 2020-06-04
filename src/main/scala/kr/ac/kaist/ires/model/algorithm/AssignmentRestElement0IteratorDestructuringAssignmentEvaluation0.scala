package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentRestElement0IteratorDestructuringAssignmentEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentRestElement0IteratorDestructuringAssignmentEvaluation0""", List(Id("""this"""), Id("""DestructuringAssignmentTarget"""), Id("""iteratorRecord""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ObjectLiteral"""), EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ArrayLiteral"""))), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""Evaluation""")).setId(25158), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(25159), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""lref""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""lref""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""lref""")), ERef(RefProp(RefId(Id("""lref""")), EStr("""Value""")))).setId(25161), IReturn(ERef(RefId(Id("""lref""")))).setId(25162)).setId(25163), ISeq(List()).setId(25164)).setId(25165), IExpr(ERef(RefId(Id("""lref""")))).setId(25166))).setId(25168), ISeq(List()).setId(25164)).setId(25169), IApp(Id("""__x1__"""), ERef(RefId(Id("""ArrayCreate"""))), List(EINum(0L))).setId(25171), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(25172), IReturn(ERef(RefId(Id("""__x1__""")))).setId(25173)).setId(25174), ISeq(List()).setId(25164)).setId(25175), ILet(Id("""A"""), ERef(RefId(Id("""__x1__""")))).setId(25176), ILet(Id("""n"""), EINum(0L)).setId(25178), IWhile(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(25180), ILet(Id("""next"""), ERef(RefId(Id("""__x2__""")))).setId(25181), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(25183), IIf(ERef(RefId(Id("""__x3__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(25184), ISeq(List()).setId(25164)).setId(25186), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(25188), IReturn(ERef(RefId(Id("""next""")))).setId(25189)).setId(25190), ISeq(List()).setId(25164)).setId(25191), IExpr(ERef(RefId(Id("""next""")))).setId(25192), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(25194), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(25196), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x4__""")))).setId(25197), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""nextValue"""))))).setId(25199), IIf(ERef(RefId(Id("""__x5__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(25200), ISeq(List()).setId(25164)).setId(25202), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""nextValue""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""nextValue""")), ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Value""")))).setId(25204), IReturn(ERef(RefId(Id("""nextValue""")))).setId(25205)).setId(25206), ISeq(List()).setId(25164)).setId(25207), IExpr(ERef(RefId(Id("""nextValue""")))).setId(25208), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""n"""))))).setId(25210), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(25211), IReturn(ERef(RefId(Id("""__x6__""")))).setId(25212)).setId(25213), ISeq(List()).setId(25164)).setId(25214), IApp(Id("""__x7__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""nextValue"""))))).setId(25215), ILet(Id("""status"""), ERef(RefId(Id("""__x7__""")))).setId(25216), IAssign(RefId(Id("""n""")), EBOp(OPlus, ERef(RefId(Id("""n"""))), EINum(1L))).setId(25218))).setId(25220)).setId(25221))).setId(25223)).setId(25224), IIf(EUOp(ONot, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ObjectLiteral"""), EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ArrayLiteral"""))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lref"""))), ERef(RefId(Id("""A"""))))).setId(25226), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(25227), IReturn(ERef(RefId(Id("""__x8__""")))).setId(25228)).setId(25229), ISeq(List()).setId(25164)).setId(25230), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(25231), IReturn(ERef(RefId(Id("""__x9__""")))).setId(25232))).setId(25234), ISeq(List()).setId(25164)).setId(25235), ILet(Id("""nestedAssignmentPattern"""), EParseSyntax(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""AssignmentPattern"""), List())).setId(25237), IAccess(Id("""__x10__"""), ERef(RefId(Id("""nestedAssignmentPattern"""))), EStr("""DestructuringAssignmentEvaluation""")).setId(25239), IApp(Id("""__x11__"""), ERef(RefId(Id("""__x10__"""))), List(ERef(RefId(Id("""A"""))))).setId(25240), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))).setId(25241), IReturn(ERef(RefId(Id("""__x12__""")))).setId(25242))).setId(-1))
  /* Beautified form:
  "AssignmentRestElement0IteratorDestructuringAssignmentEvaluation0" (this, DestructuringAssignmentTarget, iteratorRecord) => {
    if (! (|| (is-instance-of DestructuringAssignmentTarget ObjectLiteral) (is-instance-of DestructuringAssignmentTarget ArrayLiteral))) {
      access __x0__ = (DestructuringAssignmentTarget "Evaluation")
      let lref = __x0__
      if (= (typeof lref) "Completion") if (= lref["Type"] CONST_normal) lref = lref["Value"] else return lref else {}
      lref
    } else {}
    app __x1__ = (ArrayCreate 0i)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let A = __x1__
    let n = 0i
    while (= iteratorRecord["Done"] false) {
      app __x2__ = (IteratorStep iteratorRecord)
      let next = __x2__
      app __x3__ = (IsAbruptCompletion next)
      if __x3__ iteratorRecord["Done"] = true else {}
      if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) iteratorRecord["Done"] = true else {
        app __x4__ = (IteratorValue next)
        let nextValue = __x4__
        app __x5__ = (IsAbruptCompletion nextValue)
        if __x5__ iteratorRecord["Done"] = true else {}
        if (= (typeof nextValue) "Completion") if (= nextValue["Type"] CONST_normal) nextValue = nextValue["Value"] else return nextValue else {}
        nextValue
        app __x6__ = (ToString n)
        if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        app __x7__ = (CreateDataProperty A __x6__ nextValue)
        let status = __x7__
        n = (+ n 1i)
      }
    }
    if (! (|| (is-instance-of DestructuringAssignmentTarget ObjectLiteral) (is-instance-of DestructuringAssignmentTarget ArrayLiteral))) {
      app __x8__ = (PutValue lref A)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {}
    let nestedAssignmentPattern = (parse-syntax DestructuringAssignmentTarget "AssignmentPattern" )
    access __x10__ = (nestedAssignmentPattern "DestructuringAssignmentEvaluation")
    app __x11__ = (__x10__ A)
    app __x12__ = (WrapCompletion __x11__)
    return __x12__
  }
  */
}
