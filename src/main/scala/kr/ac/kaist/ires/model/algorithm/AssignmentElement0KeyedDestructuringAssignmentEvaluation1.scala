package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentElement0KeyedDestructuringAssignmentEvaluation1 {
  val length: Int = 0
  val func: Func = Func("""AssignmentElement0KeyedDestructuringAssignmentEvaluation1""", List(Id("""this"""), Id("""DestructuringAssignmentTarget"""), Id("""Initializer"""), Id("""value"""), Id("""propertyName""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ObjectLiteral"""), EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ArrayLiteral"""))), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""Evaluation""")).setId(25394), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(25395), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""lref""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""lref""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""lref""")), ERef(RefProp(RefId(Id("""lref""")), EStr("""Value""")))).setId(25397), IReturn(ERef(RefId(Id("""lref""")))).setId(25398)).setId(25399), ISeq(List()).setId(25465)).setId(25401), IExpr(ERef(RefId(Id("""lref""")))).setId(25402))).setId(25468), ISeq(List()).setId(25469)).setId(25405), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetV"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""propertyName"""))))).setId(25407), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(25408), IReturn(ERef(RefId(Id("""__x1__""")))).setId(25409)).setId(25410), ISeq(List()).setId(25475)).setId(25411), ILet(Id("""v"""), ERef(RefId(Id("""__x1__""")))).setId(25412), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Initializer"""))), EAbsent)), EBOp(OEq, ERef(RefId(Id("""v"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAnonymousFunctionDefinition"""))), List(ERef(RefId(Id("""Initializer"""))))).setId(25414), IAccess(Id("""__x3__"""), ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""IsIdentifierRef""")).setId(25415), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""lref"""))))).setId(25416), IAccess(Id("""__x5__"""), ERef(RefId(Id("""Initializer"""))), EStr("""NamedEvaluation""")).setId(25417), IApp(Id("""__x6__"""), ERef(RefId(Id("""__x5__"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(25418), ILet(Id("""rhsValue"""), ERef(RefId(Id("""__x6__""")))).setId(25419))).setId(25484), ISeq(List(IAccess(Id("""__x7__"""), ERef(RefId(Id("""Initializer"""))), EStr("""Evaluation""")).setId(25423), ILet(Id("""defaultValue"""), ERef(RefId(Id("""__x7__""")))).setId(25424), IApp(Id("""__x8__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""defaultValue"""))))).setId(25426), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(25427), IReturn(ERef(RefId(Id("""__x8__""")))).setId(25428)).setId(25429), ISeq(List()).setId(25491)).setId(25430), ILet(Id("""rhsValue"""), ERef(RefId(Id("""__x8__""")))).setId(25431))).setId(25494)).setId(25434))).setId(25496), ILet(Id("""rhsValue"""), ERef(RefId(Id("""v""")))).setId(25437)).setId(25439), IIf(EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ObjectLiteral"""), EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ArrayLiteral""")), ISeq(List(ILet(Id("""assignmentPattern"""), EParseSyntax(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""AssignmentPattern"""), List())).setId(25441), IAccess(Id("""__x9__"""), ERef(RefId(Id("""assignmentPattern"""))), EStr("""DestructuringAssignmentEvaluation""")).setId(25443), IApp(Id("""__x10__"""), ERef(RefId(Id("""__x9__"""))), List(ERef(RefId(Id("""rhsValue"""))))).setId(25444), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(25445), IReturn(ERef(RefId(Id("""__x11__""")))).setId(25446))).setId(25504), ISeq(List()).setId(25505)).setId(25449), IApp(Id("""__x12__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lref"""))), ERef(RefId(Id("""rhsValue"""))))).setId(25451), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(25452), IReturn(ERef(RefId(Id("""__x12__""")))).setId(25453)).setId(25454), ISeq(List()).setId(25511)).setId(25455), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x12__"""))))).setId(25456), IReturn(ERef(RefId(Id("""__x13__""")))).setId(25457))).setId(25515))
  val instToStepMap: Map[Int, Int] = HashMap(25457 -> 21, 25407 -> 5, 25439 -> 15, 25448 -> 19, 25431 -> 14, 25441 -> 19, 25445 -> 19, 25442 -> 19, 25432 -> 14, 25437 -> 15, 25405 -> 4, 25426 -> 14, 25443 -> 19, 25417 -> 10, 25420 -> 10, 25447 -> 19, 25415 -> 14, 25425 -> 14, 25430 -> 14, 25395 -> 3, 25444 -> 19, 25403 -> 3, 25424 -> 14, 25394 -> 3, 25456 -> 21, 25435 -> 14, 25416 -> 10, 25402 -> 3, 25434 -> 14, 25413 -> 5, 25455 -> 21, 25412 -> 5, 25423 -> 14, 25406 -> 4, 25451 -> 21, 25419 -> 10, 25438 -> 15, 25450 -> 20, 25433 -> 14, 25401 -> 3, 25418 -> 10, 25396 -> 3, 25436 -> 14, 25404 -> 3, 25458 -> 21, 25411 -> 5, 25414 -> 14, 25446 -> 19, 25449 -> 20, 25421 -> 10, 25440 -> 15)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(5 -> HashSet(25407, 25411, 25413, 25412), 10 -> HashSet(25420, 25416, 25419, 25418, 25417, 25421), 14 -> HashSet(25430, 25424, 25435, 25431, 25432, 25433, 25426, 25436, 25414, 25415, 25425, 25434, 25423), 20 -> HashSet(25450, 25449), 21 -> HashSet(25457, 25456, 25455, 25451, 25458), 13 -> HashSet(25425, 25424, 25423), 2 -> HashSet(25395, 25394, 25396), 3 -> HashSet(25395, 25402, 25404, 25403, 25394, 25401, 25396), 18 -> HashSet(25441, 25442), 19 -> HashSet(25447, 25444, 25448, 25441, 25445, 25442, 25443, 25446), 4 -> HashSet(25406, 25405), 15 -> HashSet(25439, 25438, 25437, 25440))
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
