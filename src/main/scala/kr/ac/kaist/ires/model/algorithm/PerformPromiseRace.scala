package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PerformPromiseRace {
  val length: Int = 3
  val func: Func = Func("""PerformPromiseRace""", List(Id("""iteratorRecord"""), Id("""constructor"""), Id("""resultCapability""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""constructor"""))), EStr("""resolve"""))).setId(92482), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(92483), IReturn(ERef(RefId(Id("""__x0__""")))).setId(92484)).setId(92485), ISeq(List()).setId(92556)).setId(92486), ILet(Id("""promiseResolve"""), ERef(RefId(Id("""__x0__""")))).setId(92487), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""promiseResolve"""))))).setId(92489), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(92490), IReturn(ERef(RefId(Id("""__x1__""")))).setId(92491)).setId(92492), ISeq(List()).setId(92563)).setId(92493), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(92494), IReturn(ERef(RefId(Id("""__x2__""")))).setId(92495))).setId(92567), ISeq(List()).setId(92568)).setId(92497), IWhile(EBool(true), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(92499), ILet(Id("""next"""), ERef(RefId(Id("""__x3__""")))).setId(92500), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(92502), IIf(ERef(RefId(Id("""__x4__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(92503), ISeq(List()).setId(92574)).setId(92505), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(92507), IReturn(ERef(RefId(Id("""next""")))).setId(92508)).setId(92509), ISeq(List()).setId(92579)).setId(92510), IExpr(ERef(RefId(Id("""next""")))).setId(92511), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), ISeq(List(IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(92513), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Promise"""))))).setId(92515), IReturn(ERef(RefId(Id("""__x5__""")))).setId(92516))).setId(92585), ISeq(List()).setId(92586)).setId(92519), IApp(Id("""__x6__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(92521), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x6__""")))).setId(92522), IApp(Id("""__x7__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""nextValue"""))))).setId(92524), IIf(ERef(RefId(Id("""__x7__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(92525), ISeq(List()).setId(92592)).setId(92527), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""nextValue""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""nextValue""")), ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Value""")))).setId(92529), IReturn(ERef(RefId(Id("""nextValue""")))).setId(92530)).setId(92531), ISeq(List()).setId(92597)).setId(92532), IExpr(ERef(RefId(Id("""nextValue""")))).setId(92533), IApp(Id("""__x8__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""promiseResolve"""))), ERef(RefId(Id("""constructor"""))), EList(List(ERef(RefId(Id("""nextValue"""))))))).setId(92535), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(92536), IReturn(ERef(RefId(Id("""__x8__""")))).setId(92537)).setId(92538), ISeq(List()).setId(92604)).setId(92539), ILet(Id("""nextPromise"""), ERef(RefId(Id("""__x8__""")))).setId(92540), IApp(Id("""__x9__"""), ERef(RefId(Id("""Invoke"""))), List(ERef(RefId(Id("""nextPromise"""))), EStr("""then"""), EList(List(ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Resolve"""))), ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Reject"""))))))).setId(92542), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(92543), IReturn(ERef(RefId(Id("""__x9__""")))).setId(92544)).setId(92545), ISeq(List()).setId(92611)).setId(92546), IExpr(ERef(RefId(Id("""__x9__""")))).setId(92547))).setId(92614)).setId(92550))).setId(92616))
  val instToStepMap: Map[Int, Int] = HashMap(92541 -> 21, 92487 -> 2, 92495 -> 3, 92518 -> 14, 92533 -> 21, 92514 -> 14, 92525 -> 17, 92493 -> 4, 92489 -> 4, 92494 -> 3, 92548 -> 21, 92526 -> 17, 92505 -> 21, 92502 -> 21, 92534 -> 21, 92516 -> 14, 92519 -> 21, 92497 -> 4, 92523 -> 21, 92510 -> 21, 92547 -> 21, 92542 -> 21, 92506 -> 21, 92527 -> 21, 92486 -> 2, 92501 -> 21, 92500 -> 21, 92515 -> 14, 92532 -> 21, 92546 -> 21, 92524 -> 21, 92496 -> 3, 92539 -> 21, 92528 -> 21, 92550 -> 21, 92511 -> 21, 92517 -> 14, 92499 -> 21, 92504 -> 8, 92482 -> 2, 92521 -> 21, 92540 -> 21, 92512 -> 21, 92549 -> 21, 92535 -> 21, 92522 -> 21, 92498 -> 4, 92513 -> 14, 92481 -> 1, 92488 -> 2, 92503 -> 8, 92520 -> 21)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(92481), 10 -> HashSet(92510, 92511, 92512), 14 -> HashSet(92516, 92515, 92518, 92514, 92517, 92513), 20 -> HashSet(92541, 92539, 92540, 92535), 1 -> HashSet(92481), 21 -> HashSet(92548, 92505, 92541, 92519, 92501, 92533, 92499, 92520, 92502, 92534, 92523, 92510, 92547, 92542, 92506, 92527, 92500, 92532, 92546, 92524, 92539, 92528, 92550, 92511, 92521, 92540, 92512, 92549, 92535, 92522), 9 -> HashSet(92505, 92502, 92506), 13 -> HashSet(92514, 92513), 2 -> HashSet(92487, 92486, 92482, 92488), 17 -> HashSet(92526, 92525), 7 -> HashSet(92501, 92500, 92499), 3 -> HashSet(92494, 92495, 92496), 18 -> HashSet(92527, 92524, 92528), 16 -> HashSet(92523, 92521, 92522), 8 -> HashSet(92504, 92503), 19 -> HashSet(92534, 92532, 92533), 4 -> HashSet(92497, 92493, 92489, 92498), 15 -> HashSet(92519, 92520))
  /* Beautified form:
  "PerformPromiseRace" (iteratorRecord, constructor, resultCapability) => {
    app __x0__ = (Get constructor "resolve")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let promiseResolve = __x0__
    app __x1__ = (IsCallable promiseResolve)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    if (= __x1__ false) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    while true {
      app __x3__ = (IteratorStep iteratorRecord)
      let next = __x3__
      app __x4__ = (IsAbruptCompletion next)
      if __x4__ iteratorRecord["Done"] = true else {}
      if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) {
        iteratorRecord["Done"] = true
        app __x5__ = (WrapCompletion resultCapability["Promise"])
        return __x5__
      } else {}
      app __x6__ = (IteratorValue next)
      let nextValue = __x6__
      app __x7__ = (IsAbruptCompletion nextValue)
      if __x7__ iteratorRecord["Done"] = true else {}
      if (= (typeof nextValue) "Completion") if (= nextValue["Type"] CONST_normal) nextValue = nextValue["Value"] else return nextValue else {}
      nextValue
      app __x8__ = (Call promiseResolve constructor (new [nextValue]))
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let nextPromise = __x8__
      app __x9__ = (Invoke nextPromise "then" (new [resultCapability["Resolve"], resultCapability["Reject"]]))
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      __x9__
    }
  }
  */
}
