package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SpeciesConstructor {
  val length: Int = 2
  val func: Func = Func("""SpeciesConstructor""", List(Id("""O"""), Id("""defaultConstructor""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), EStr("""constructor"""))).setId(6431), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(6432), IReturn(ERef(RefId(Id("""__x0__""")))).setId(6433)).setId(6434), ISeq(List()).setId(6430)).setId(6435), ILet(Id("""C"""), ERef(RefId(Id("""__x0__""")))).setId(6436), IIf(EBOp(OEq, ERef(RefId(Id("""C"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""defaultConstructor"""))))).setId(6438), IReturn(ERef(RefId(Id("""__x1__""")))).setId(6439))).setId(6440), ISeq(List()).setId(6430)).setId(6441), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""C"""))))).setId(6443), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(6444), IReturn(ERef(RefId(Id("""__x3__""")))).setId(6445))).setId(6446), ISeq(List()).setId(6430)).setId(6447), IApp(Id("""__x4__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""C"""))), ERef(RefId(Id("""SYMBOL_species"""))))).setId(6449), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(6450), IReturn(ERef(RefId(Id("""__x4__""")))).setId(6451)).setId(6452), ISeq(List()).setId(6430)).setId(6453), ILet(Id("""S"""), ERef(RefId(Id("""__x4__""")))).setId(6454), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""S"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""S"""))), ENull)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""defaultConstructor"""))))).setId(6456), IReturn(ERef(RefId(Id("""__x5__""")))).setId(6457))).setId(6458), ISeq(List()).setId(6430)).setId(6459), IApp(Id("""__x6__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""S"""))))).setId(6461), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""S"""))))).setId(6462), IReturn(ERef(RefId(Id("""__x7__""")))).setId(6463))).setId(6464), ISeq(List()).setId(6430)).setId(6465), IApp(Id("""__x8__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(6467), IReturn(ERef(RefId(Id("""__x8__""")))).setId(6468))).setId(-1))
  /* Beautified form:
  "SpeciesConstructor" (O, defaultConstructor) => {
    app __x0__ = (Get O "constructor")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let C = __x0__
    if (= C undefined) {
      app __x1__ = (WrapCompletion defaultConstructor)
      return __x1__
    } else {}
    app __x2__ = (Type C)
    if (! (= __x2__ Object)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    app __x4__ = (Get C SYMBOL_species)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let S = __x4__
    if (|| (= S undefined) (= S null)) {
      app __x5__ = (WrapCompletion defaultConstructor)
      return __x5__
    } else {}
    app __x6__ = (IsConstructor S)
    if (= __x6__ true) {
      app __x7__ = (WrapCompletion S)
      return __x7__
    } else {}
    app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x8__
  }
  */
}
