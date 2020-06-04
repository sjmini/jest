package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentElement0IteratorDestructuringAssignmentEvaluation1 {
  val length: Int = 0
  val func: Func = Func("""AssignmentElement0IteratorDestructuringAssignmentEvaluation1""", List(Id("""this"""), Id("""DestructuringAssignmentTarget"""), Id("""Initializer"""), Id("""iteratorRecord""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ObjectLiteral"""), EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ArrayLiteral"""))), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""Evaluation""")).setId(24894), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(24895), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""lref""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""lref""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""lref""")), ERef(RefProp(RefId(Id("""lref""")), EStr("""Value""")))).setId(24897), IReturn(ERef(RefId(Id("""lref""")))).setId(24898)).setId(24899), ISeq(List()).setId(24900)).setId(24901), IExpr(ERef(RefId(Id("""lref""")))).setId(24902))).setId(24904), ISeq(List()).setId(24900)).setId(24905), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(24907), ILet(Id("""next"""), ERef(RefId(Id("""__x1__""")))).setId(24908), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(24910), IIf(ERef(RefId(Id("""__x2__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(24911), ISeq(List()).setId(24900)).setId(24913), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(24915), IReturn(ERef(RefId(Id("""next""")))).setId(24916)).setId(24917), ISeq(List()).setId(24900)).setId(24918), IExpr(ERef(RefId(Id("""next""")))).setId(24919), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(24921), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(24923), ILet(Id("""value"""), ERef(RefId(Id("""__x3__""")))).setId(24924), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(24926), IIf(ERef(RefId(Id("""__x4__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(24927), ISeq(List()).setId(24900)).setId(24929), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""value""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""value""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""value""")), ERef(RefProp(RefId(Id("""value""")), EStr("""Value""")))).setId(24931), IReturn(ERef(RefId(Id("""value""")))).setId(24932)).setId(24933), ISeq(List()).setId(24900)).setId(24934), IExpr(ERef(RefId(Id("""value""")))).setId(24935))).setId(24937)).setId(24938))).setId(24940), ISeq(List()).setId(24900)).setId(24941), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(true)), ILet(Id("""value"""), EUndef).setId(24943), ISeq(List()).setId(24900)).setId(24945), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Initializer"""))), EAbsent)), EBOp(OEq, ERef(RefId(Id("""value"""))), EUndef)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""IsAnonymousFunctionDefinition"""))), List(ERef(RefId(Id("""Initializer"""))))).setId(24947), IAccess(Id("""__x6__"""), ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""IsIdentifierRef""")).setId(24948), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""GetReferencedName"""))), List(ERef(RefId(Id("""lref"""))))).setId(24949), IAccess(Id("""__x8__"""), ERef(RefId(Id("""Initializer"""))), EStr("""NamedEvaluation""")).setId(24950), IApp(Id("""__x9__"""), ERef(RefId(Id("""__x8__"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(24951), ILet(Id("""v"""), ERef(RefId(Id("""__x9__""")))).setId(24952))).setId(24954), ISeq(List(IAccess(Id("""__x10__"""), ERef(RefId(Id("""Initializer"""))), EStr("""Evaluation""")).setId(24956), ILet(Id("""defaultValue"""), ERef(RefId(Id("""__x10__""")))).setId(24957), IApp(Id("""__x11__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""defaultValue"""))))).setId(24959), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(24960), IReturn(ERef(RefId(Id("""__x11__""")))).setId(24961)).setId(24962), ISeq(List()).setId(24900)).setId(24963), ILet(Id("""v"""), ERef(RefId(Id("""__x11__""")))).setId(24964))).setId(24966)).setId(24967))).setId(24969), ILet(Id("""v"""), ERef(RefId(Id("""value""")))).setId(24970)).setId(24972), IIf(EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ObjectLiteral"""), EIsInstanceOf(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), """ArrayLiteral""")), ISeq(List(ILet(Id("""nestedAssignmentPattern"""), EParseSyntax(ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""AssignmentPattern"""), List())).setId(24974), IAccess(Id("""__x12__"""), ERef(RefId(Id("""nestedAssignmentPattern"""))), EStr("""DestructuringAssignmentEvaluation""")).setId(24976), IApp(Id("""__x13__"""), ERef(RefId(Id("""__x12__"""))), List(ERef(RefId(Id("""v"""))))).setId(24977), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))).setId(24978), IReturn(ERef(RefId(Id("""__x14__""")))).setId(24979))).setId(24981), ISeq(List()).setId(24900)).setId(24982), IApp(Id("""__x15__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lref"""))), ERef(RefId(Id("""v"""))))).setId(24984), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))).setId(24985), IReturn(ERef(RefId(Id("""__x15__""")))).setId(24986)).setId(24987), ISeq(List()).setId(24900)).setId(24988), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x15__"""))))).setId(24989), IReturn(ERef(RefId(Id("""__x16__""")))).setId(24990))).setId(-1))
  /* Beautified form:
  "AssignmentElement0IteratorDestructuringAssignmentEvaluation1" (this, DestructuringAssignmentTarget, Initializer, iteratorRecord) => {
    if (! (|| (is-instance-of DestructuringAssignmentTarget ObjectLiteral) (is-instance-of DestructuringAssignmentTarget ArrayLiteral))) {
      access __x0__ = (DestructuringAssignmentTarget "Evaluation")
      let lref = __x0__
      if (= (typeof lref) "Completion") if (= lref["Type"] CONST_normal) lref = lref["Value"] else return lref else {}
      lref
    } else {}
    if (= iteratorRecord["Done"] false) {
      app __x1__ = (IteratorStep iteratorRecord)
      let next = __x1__
      app __x2__ = (IsAbruptCompletion next)
      if __x2__ iteratorRecord["Done"] = true else {}
      if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) iteratorRecord["Done"] = true else {
        app __x3__ = (IteratorValue next)
        let value = __x3__
        app __x4__ = (IsAbruptCompletion value)
        if __x4__ iteratorRecord["Done"] = true else {}
        if (= (typeof value) "Completion") if (= value["Type"] CONST_normal) value = value["Value"] else return value else {}
        value
      }
    } else {}
    if (= iteratorRecord["Done"] true) let value = undefined else {}
    if (&& (! (= Initializer absent)) (= value undefined)) {
      app __x5__ = (IsAnonymousFunctionDefinition Initializer)
      access __x6__ = (DestructuringAssignmentTarget "IsIdentifierRef")
      if (&& (= __x5__ true) (= __x6__ true)) {
        app __x7__ = (GetReferencedName lref)
        access __x8__ = (Initializer "NamedEvaluation")
        app __x9__ = (__x8__ __x7__)
        let v = __x9__
      } else {
        access __x10__ = (Initializer "Evaluation")
        let defaultValue = __x10__
        app __x11__ = (GetValue defaultValue)
        if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        let v = __x11__
      }
    } else let v = value
    if (|| (is-instance-of DestructuringAssignmentTarget ObjectLiteral) (is-instance-of DestructuringAssignmentTarget ArrayLiteral)) {
      let nestedAssignmentPattern = (parse-syntax DestructuringAssignmentTarget "AssignmentPattern" )
      access __x12__ = (nestedAssignmentPattern "DestructuringAssignmentEvaluation")
      app __x13__ = (__x12__ v)
      app __x14__ = (WrapCompletion __x13__)
      return __x14__
    } else {}
    app __x15__ = (PutValue lref v)
    if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
    app __x16__ = (WrapCompletion __x15__)
    return __x16__
  }
  */
}
