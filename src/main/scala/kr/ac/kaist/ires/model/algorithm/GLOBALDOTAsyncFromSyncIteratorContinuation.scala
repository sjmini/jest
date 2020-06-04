package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAsyncFromSyncIteratorContinuation {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.AsyncFromSyncIteratorContinuation""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(88444), ILet(Id("""result"""), ERef(RefId(Id("""__x0__""")))).setId(88445), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(88447), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x1__""")))).setId(88448), IApp(Id("""__x2__"""), ERef(RefId(Id("""IteratorComplete"""))), List(ERef(RefId(Id("""result"""))))).setId(88450), ILet(Id("""done"""), ERef(RefId(Id("""__x2__""")))).setId(88451), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""done""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""done""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""done""")), ERef(RefProp(RefId(Id("""done""")), EStr("""Value""")))).setId(88453), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""done""")), EStr("""Value"""))))))).setId(88454), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x3__""")))).setId(88455), ISeq(List()).setId(88456)).setId(88457), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(88458))).setId(88459)).setId(88460), ISeq(List()).setId(88456)).setId(88461), IExpr(ERef(RefId(Id("""done""")))).setId(88462), IApp(Id("""__x4__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""result"""))))).setId(88464), ILet(Id("""value"""), ERef(RefId(Id("""__x4__""")))).setId(88465), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""value""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""value""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""value""")), ERef(RefProp(RefId(Id("""value""")), EStr("""Value""")))).setId(88467), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""value""")), EStr("""Value"""))))))).setId(88468), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x5__""")))).setId(88469), ISeq(List()).setId(88456)).setId(88470), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(88471))).setId(88472)).setId(88473), ISeq(List()).setId(88456)).setId(88474), IExpr(ERef(RefId(Id("""value""")))).setId(88475), IApp(Id("""__x6__"""), ERef(RefId(Id("""PromiseResolve"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))), ERef(RefId(Id("""value"""))))).setId(88477), ILet(Id("""valueWrapper"""), ERef(RefId(Id("""__x6__""")))).setId(88478), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""valueWrapper""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""valueWrapper""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""valueWrapper""")), ERef(RefProp(RefId(Id("""valueWrapper""")), EStr("""Value""")))).setId(88480), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""valueWrapper""")), EStr("""Value"""))))))).setId(88481), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x7__""")))).setId(88482), ISeq(List()).setId(88456)).setId(88483), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(88484))).setId(88485)).setId(88486), ISeq(List()).setId(88456)).setId(88487), IExpr(ERef(RefId(Id("""valueWrapper""")))).setId(88488), ILet(Id("""steps"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(1L)), (EStr("""step"""), ERef(RefId(Id("""GLOBALDOTAsyncfromSyncIteratorValueUnwrapFunctions"""))))))).setId(88490), IApp(Id("""__x8__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""steps"""))), EList(List(EStr("""Done"""))))).setId(88492), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(88493), IReturn(ERef(RefId(Id("""__x8__""")))).setId(88494)).setId(88495), ISeq(List()).setId(88456)).setId(88496), ILet(Id("""onFulfilled"""), ERef(RefId(Id("""__x8__""")))).setId(88497), IAssign(RefProp(RefId(Id("""onFulfilled""")), EStr("""Done""")), ERef(RefId(Id("""done""")))).setId(88499), IApp(Id("""__x9__"""), ERef(RefId(Id("""PerformPromiseThen"""))), List(ERef(RefId(Id("""valueWrapper"""))), ERef(RefId(Id("""onFulfilled"""))), EUndef, ERef(RefId(Id("""promiseCapability"""))))).setId(88501), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(88502), IReturn(ERef(RefId(Id("""__x9__""")))).setId(88503)).setId(88504), ISeq(List()).setId(88456)).setId(88505), IExpr(ERef(RefId(Id("""__x9__""")))).setId(88506), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(88508), IReturn(ERef(RefId(Id("""__x10__""")))).setId(88509))).setId(-1))
  /* Beautified form:
  "GLOBAL.AsyncFromSyncIteratorContinuation" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let result = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let promiseCapability = __x1__
    app __x2__ = (IteratorComplete result)
    let done = __x2__
    if (= (typeof done) "Completion") if (= done["Type"] CONST_normal) done = done["Value"] else {
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [done["Value"]]))
      if (&& (= (typeof __x3__) "Completion") (! (= __x3__["Type"] CONST_normal))) return __x3__ else {}
      return promiseCapability["Promise"]
    } else {}
    done
    app __x4__ = (IteratorValue result)
    let value = __x4__
    if (= (typeof value) "Completion") if (= value["Type"] CONST_normal) value = value["Value"] else {
      app __x5__ = (Call promiseCapability["Reject"] undefined (new [value["Value"]]))
      if (&& (= (typeof __x5__) "Completion") (! (= __x5__["Type"] CONST_normal))) return __x5__ else {}
      return promiseCapability["Promise"]
    } else {}
    value
    app __x6__ = (PromiseResolve INTRINSIC_Promise value)
    let valueWrapper = __x6__
    if (= (typeof valueWrapper) "Completion") if (= valueWrapper["Type"] CONST_normal) valueWrapper = valueWrapper["Value"] else {
      app __x7__ = (Call promiseCapability["Reject"] undefined (new [valueWrapper["Value"]]))
      if (&& (= (typeof __x7__) "Completion") (! (= __x7__["Type"] CONST_normal))) return __x7__ else {}
      return promiseCapability["Promise"]
    } else {}
    valueWrapper
    let steps = (new algorithm("name" -> "", "length" -> 1i, "step" -> GLOBALDOTAsyncfromSyncIteratorValueUnwrapFunctions))
    app __x8__ = (CreateBuiltinFunction steps (new ["Done"]))
    if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    let onFulfilled = __x8__
    onFulfilled["Done"] = done
    app __x9__ = (PerformPromiseThen valueWrapper onFulfilled undefined promiseCapability)
    if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    __x9__
    app __x10__ = (WrapCompletion promiseCapability["Promise"])
    return __x10__
  }
  */
}
