package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SpeciesConstructor {
  val length: Int = 2
  val func: Func = Func("""SpeciesConstructor""", List(Id("""O"""), Id("""defaultConstructor""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), EStr("""constructor"""))).setId(6431), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(6432), IReturn(ERef(RefId(Id("""__x0__""")))).setId(6433)).setId(6434), ISeq(List()).setId(6475)).setId(6435), ILet(Id("""C"""), ERef(RefId(Id("""__x0__""")))).setId(6436), IIf(EBOp(OEq, ERef(RefId(Id("""C"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""defaultConstructor"""))))).setId(6438), IReturn(ERef(RefId(Id("""__x1__""")))).setId(6439))).setId(6480), ISeq(List()).setId(6481)).setId(6441), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""C"""))))).setId(6443), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(6444), IReturn(ERef(RefId(Id("""__x3__""")))).setId(6445))).setId(6486), ISeq(List()).setId(6487)).setId(6447), IApp(Id("""__x4__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""C"""))), ERef(RefId(Id("""SYMBOL_species"""))))).setId(6449), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(6450), IReturn(ERef(RefId(Id("""__x4__""")))).setId(6451)).setId(6452), ISeq(List()).setId(6493)).setId(6453), ILet(Id("""S"""), ERef(RefId(Id("""__x4__""")))).setId(6454), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""S"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""S"""))), ENull)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""defaultConstructor"""))))).setId(6456), IReturn(ERef(RefId(Id("""__x5__""")))).setId(6457))).setId(6498), ISeq(List()).setId(6499)).setId(6459), IApp(Id("""__x6__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""S"""))))).setId(6461), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""S"""))))).setId(6462), IReturn(ERef(RefId(Id("""__x7__""")))).setId(6463))).setId(6504), ISeq(List()).setId(6505)).setId(6465), IApp(Id("""__x8__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(6467), IReturn(ERef(RefId(Id("""__x8__""")))).setId(6468))).setId(6509))
  val instToStepMap: Map[Int, Int] = HashMap(6466 -> 10, 6455 -> 6, 6438 -> 2, 6445 -> 4, 6459 -> 8, 6465 -> 10, 6468 -> 11, 6446 -> 4, 6449 -> 6, 6440 -> 2, 6453 -> 6, 6436 -> 1, 6447 -> 5, 6435 -> 1, 6431 -> 1, 6448 -> 5, 6463 -> 9, 6458 -> 7, 6441 -> 3, 6442 -> 3, 6464 -> 9, 6437 -> 1, 6469 -> 11, 6454 -> 6, 6443 -> 5, 6461 -> 10, 6460 -> 8, 6457 -> 7, 6467 -> 11, 6430 -> 0, 6444 -> 4, 6462 -> 9, 6439 -> 2, 6456 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(6430), 5 -> HashSet(6448, 6443, 6447), 10 -> HashSet(6466, 6465, 6461), 1 -> HashSet(6431, 6437, 6436, 6435), 6 -> HashSet(6455, 6454, 6449, 6453), 9 -> HashSet(6463, 6464, 6462), 2 -> HashSet(6438, 6440, 6439), 7 -> HashSet(6458, 6457, 6456), 3 -> HashSet(6441, 6442), 11 -> HashSet(6469, 6468, 6467), 8 -> HashSet(6459, 6460), 4 -> HashSet(6445, 6446, 6444))
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
