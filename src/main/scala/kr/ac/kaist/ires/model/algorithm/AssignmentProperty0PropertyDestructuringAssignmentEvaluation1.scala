package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentProperty0PropertyDestructuringAssignmentEvaluation1 {
  val length: Int = 0
  val func: Func = Func("""AssignmentProperty0PropertyDestructuringAssignmentEvaluation1""", List(Id("""this"""), Id("""IdentifierReference"""), Id("""Initializer"""), Id("""value""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""IdentifierReference"""))), EStr("""StringValue""")).setId(24342), ILet(Id("""P"""), ERef(RefId(Id("""__x0__""")))).setId(24343), IApp(Id("""__x1__"""), ERef(RefId(Id("""ResolveBinding"""))), List(ERef(RefId(Id("""P"""))))).setId(24345), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(24346), IReturn(ERef(RefId(Id("""__x1__""")))).setId(24347)).setId(24348), ISeq(List()).setId(24400)).setId(24350), ILet(Id("""lref"""), ERef(RefId(Id("""__x1__""")))).setId(24351), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetV"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""P"""))))).setId(24353), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(24354), IReturn(ERef(RefId(Id("""__x2__""")))).setId(24355)).setId(24356), ISeq(List()).setId(24407)).setId(24357), ILet(Id("""v"""), ERef(RefId(Id("""__x2__""")))).setId(24358), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Initializer"""))), EAbsent)), EBOp(OEq, ERef(RefId(Id("""v"""))), EUndef)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAnonymousFunctionDefinition"""))), List(ERef(RefId(Id("""Initializer"""))))).setId(24360), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IAccess(Id("""__x4__"""), ERef(RefId(Id("""Initializer"""))), EStr("""NamedEvaluation""")).setId(24361), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""P"""))))).setId(24362), IAssign(RefId(Id("""v""")), ERef(RefId(Id("""__x5__""")))).setId(24363))).setId(24414), ISeq(List(IAccess(Id("""__x6__"""), ERef(RefId(Id("""Initializer"""))), EStr("""Evaluation""")).setId(24367), ILet(Id("""defaultValue"""), ERef(RefId(Id("""__x6__""")))).setId(24368), IApp(Id("""__x7__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""defaultValue"""))))).setId(24370), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(24371), IReturn(ERef(RefId(Id("""__x7__""")))).setId(24372)).setId(24373), ISeq(List()).setId(24421)).setId(24374), IAssign(RefId(Id("""v""")), ERef(RefId(Id("""__x7__""")))).setId(24375))).setId(24424)).setId(24378))).setId(24426), ISeq(List()).setId(24427)).setId(24381), IApp(Id("""__x8__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lref"""))), ERef(RefId(Id("""v"""))))).setId(24383), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(24384), IReturn(ERef(RefId(Id("""__x8__""")))).setId(24385)).setId(24386), ISeq(List()).setId(24433)).setId(24387), IExpr(ERef(RefId(Id("""__x8__""")))).setId(24388), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List(ERef(RefId(Id("""P"""))))))).setId(24390), IReturn(ERef(RefId(Id("""__x9__""")))).setId(24391))).setId(24438))
  val instToStepMap: Map[Int, Int] = HashMap(24378 -> 11, 24368 -> 11, 24345 -> 1, 24359 -> 2, 24370 -> 11, 24374 -> 11, 24353 -> 2, 24351 -> 1, 24380 -> 11, 24364 -> 7, 24392 -> 14, 24357 -> 2, 24388 -> 13, 24389 -> 13, 24379 -> 11, 24361 -> 7, 24383 -> 13, 24342 -> 0, 24390 -> 14, 24362 -> 7, 24369 -> 11, 24352 -> 1, 24358 -> 2, 24367 -> 11, 24350 -> 1, 24377 -> 11, 24391 -> 14, 24381 -> 12, 24387 -> 13, 24363 -> 7, 24344 -> 0, 24375 -> 11, 24382 -> 12, 24360 -> 11, 24365 -> 7, 24376 -> 11, 24343 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(24342, 24344, 24343), 10 -> HashSet(24368, 24369, 24367), 14 -> HashSet(24390, 24391, 24392), 1 -> HashSet(24345, 24352, 24350, 24351), 13 -> HashSet(24387, 24388, 24389, 24383), 2 -> HashSet(24359, 24358, 24353, 24357), 12 -> HashSet(24381, 24382), 7 -> HashSet(24362, 24363, 24364, 24365, 24361), 11 -> HashSet(24378, 24368, 24369, 24367, 24377, 24370, 24374, 24375, 24380, 24360, 24379, 24376))
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
