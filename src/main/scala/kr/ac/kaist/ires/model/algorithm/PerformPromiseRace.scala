package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PerformPromiseRace {
  val length: Int = 3
  val func: Func = Func("""PerformPromiseRace""", List(Id("""iteratorRecord"""), Id("""constructor"""), Id("""resultCapability""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""constructor"""))), EStr("""resolve"""))).setId(92482), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(92483), IReturn(ERef(RefId(Id("""__x0__""")))).setId(92484)).setId(92485), ISeq(List()).setId(92481)).setId(92486), ILet(Id("""promiseResolve"""), ERef(RefId(Id("""__x0__""")))).setId(92487), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""promiseResolve"""))))).setId(92489), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(92490), IReturn(ERef(RefId(Id("""__x1__""")))).setId(92491)).setId(92492), ISeq(List()).setId(92481)).setId(92493), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(92494), IReturn(ERef(RefId(Id("""__x2__""")))).setId(92495))).setId(92496), ISeq(List()).setId(92481)).setId(92497), IWhile(EBool(true), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(92499), ILet(Id("""next"""), ERef(RefId(Id("""__x3__""")))).setId(92500), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(92502), IIf(ERef(RefId(Id("""__x4__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(92503), ISeq(List()).setId(92481)).setId(92505), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(92507), IReturn(ERef(RefId(Id("""next""")))).setId(92508)).setId(92509), ISeq(List()).setId(92481)).setId(92510), IExpr(ERef(RefId(Id("""next""")))).setId(92511), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), ISeq(List(IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(92513), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Promise"""))))).setId(92515), IReturn(ERef(RefId(Id("""__x5__""")))).setId(92516))).setId(92518), ISeq(List()).setId(92481)).setId(92519), IApp(Id("""__x6__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(92521), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x6__""")))).setId(92522), IApp(Id("""__x7__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""nextValue"""))))).setId(92524), IIf(ERef(RefId(Id("""__x7__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(92525), ISeq(List()).setId(92481)).setId(92527), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""nextValue""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""nextValue""")), ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Value""")))).setId(92529), IReturn(ERef(RefId(Id("""nextValue""")))).setId(92530)).setId(92531), ISeq(List()).setId(92481)).setId(92532), IExpr(ERef(RefId(Id("""nextValue""")))).setId(92533), IApp(Id("""__x8__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""promiseResolve"""))), ERef(RefId(Id("""constructor"""))), EList(List(ERef(RefId(Id("""nextValue"""))))))).setId(92535), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(92536), IReturn(ERef(RefId(Id("""__x8__""")))).setId(92537)).setId(92538), ISeq(List()).setId(92481)).setId(92539), ILet(Id("""nextPromise"""), ERef(RefId(Id("""__x8__""")))).setId(92540), IApp(Id("""__x9__"""), ERef(RefId(Id("""Invoke"""))), List(ERef(RefId(Id("""nextPromise"""))), EStr("""then"""), EList(List(ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Resolve"""))), ERef(RefProp(RefId(Id("""resultCapability""")), EStr("""Reject"""))))))).setId(92542), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(92543), IReturn(ERef(RefId(Id("""__x9__""")))).setId(92544)).setId(92545), ISeq(List()).setId(92481)).setId(92546), IExpr(ERef(RefId(Id("""__x9__""")))).setId(92547))).setId(92549)).setId(92550))).setId(-1))
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
