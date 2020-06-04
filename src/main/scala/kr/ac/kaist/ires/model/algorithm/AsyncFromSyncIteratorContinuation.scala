package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncFromSyncIteratorContinuation {
  val length: Int = 2
  val func: Func = Func("""AsyncFromSyncIteratorContinuation""", List(Id("""result"""), Id("""promiseCapability""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IteratorComplete"""))), List(ERef(RefId(Id("""result"""))))).setId(10101), ILet(Id("""done"""), ERef(RefId(Id("""__x0__""")))).setId(10102), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""done""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""done""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""done""")), ERef(RefProp(RefId(Id("""done""")), EStr("""Value""")))).setId(10104), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""done""")), EStr("""Value"""))))))).setId(10105), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x1__""")))).setId(10106), ISeq(List()).setId(10107)).setId(10108), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(10109))).setId(10110)).setId(10111), ISeq(List()).setId(10107)).setId(10112), IExpr(ERef(RefId(Id("""done""")))).setId(10113), IApp(Id("""__x2__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""result"""))))).setId(10115), ILet(Id("""value"""), ERef(RefId(Id("""__x2__""")))).setId(10116), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""value""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""value""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""value""")), ERef(RefProp(RefId(Id("""value""")), EStr("""Value""")))).setId(10118), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""value""")), EStr("""Value"""))))))).setId(10119), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x3__""")))).setId(10120), ISeq(List()).setId(10107)).setId(10121), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(10122))).setId(10123)).setId(10124), ISeq(List()).setId(10107)).setId(10125), IExpr(ERef(RefId(Id("""value""")))).setId(10126), IApp(Id("""__x4__"""), ERef(RefId(Id("""PromiseResolve"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))), ERef(RefId(Id("""value"""))))).setId(10128), ILet(Id("""valueWrapper"""), ERef(RefId(Id("""__x4__""")))).setId(10129), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""valueWrapper""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""valueWrapper""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""valueWrapper""")), ERef(RefProp(RefId(Id("""valueWrapper""")), EStr("""Value""")))).setId(10131), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""valueWrapper""")), EStr("""Value"""))))))).setId(10132), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x5__""")))).setId(10133), ISeq(List()).setId(10107)).setId(10134), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(10135))).setId(10136)).setId(10137), ISeq(List()).setId(10107)).setId(10138), IExpr(ERef(RefId(Id("""valueWrapper""")))).setId(10139), ILet(Id("""steps"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(1L)), (EStr("""step"""), ERef(RefId(Id("""GLOBALDOTAsyncfromSyncIteratorValueUnwrapFunctions"""))))))).setId(10141), IApp(Id("""__x6__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""steps"""))), EList(List(EStr("""Done"""))))).setId(10143), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(10144), IReturn(ERef(RefId(Id("""__x6__""")))).setId(10145)).setId(10146), ISeq(List()).setId(10107)).setId(10147), ILet(Id("""onFulfilled"""), ERef(RefId(Id("""__x6__""")))).setId(10148), IAssign(RefProp(RefId(Id("""onFulfilled""")), EStr("""Done""")), ERef(RefId(Id("""done""")))).setId(10150), IApp(Id("""__x7__"""), ERef(RefId(Id("""PerformPromiseThen"""))), List(ERef(RefId(Id("""valueWrapper"""))), ERef(RefId(Id("""onFulfilled"""))), EUndef, ERef(RefId(Id("""promiseCapability"""))))).setId(10152), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(10153), IReturn(ERef(RefId(Id("""__x7__""")))).setId(10154)).setId(10155), ISeq(List()).setId(10107)).setId(10156), IExpr(ERef(RefId(Id("""__x7__""")))).setId(10157), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(10159), IReturn(ERef(RefId(Id("""__x8__""")))).setId(10160))).setId(-1))
  /* Beautified form:
  "AsyncFromSyncIteratorContinuation" (result, promiseCapability) => {
    app __x0__ = (IteratorComplete result)
    let done = __x0__
    if (= (typeof done) "Completion") if (= done["Type"] CONST_normal) done = done["Value"] else {
      app __x1__ = (Call promiseCapability["Reject"] undefined (new [done["Value"]]))
      if (&& (= (typeof __x1__) "Completion") (! (= __x1__["Type"] CONST_normal))) return __x1__ else {}
      return promiseCapability["Promise"]
    } else {}
    done
    app __x2__ = (IteratorValue result)
    let value = __x2__
    if (= (typeof value) "Completion") if (= value["Type"] CONST_normal) value = value["Value"] else {
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [value["Value"]]))
      if (&& (= (typeof __x3__) "Completion") (! (= __x3__["Type"] CONST_normal))) return __x3__ else {}
      return promiseCapability["Promise"]
    } else {}
    value
    app __x4__ = (PromiseResolve INTRINSIC_Promise value)
    let valueWrapper = __x4__
    if (= (typeof valueWrapper) "Completion") if (= valueWrapper["Type"] CONST_normal) valueWrapper = valueWrapper["Value"] else {
      app __x5__ = (Call promiseCapability["Reject"] undefined (new [valueWrapper["Value"]]))
      if (&& (= (typeof __x5__) "Completion") (! (= __x5__["Type"] CONST_normal))) return __x5__ else {}
      return promiseCapability["Promise"]
    } else {}
    valueWrapper
    let steps = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTAsyncfromSyncIteratorValueUnwrapFunctions))
    app __x6__ = (CreateBuiltinFunction steps (new ["Done"]))
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let onFulfilled = __x6__
    onFulfilled["Done"] = done
    app __x7__ = (PerformPromiseThen valueWrapper onFulfilled undefined promiseCapability)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    __x7__
    app __x8__ = (WrapCompletion promiseCapability["Promise"])
    return __x8__
  }
  */
}
