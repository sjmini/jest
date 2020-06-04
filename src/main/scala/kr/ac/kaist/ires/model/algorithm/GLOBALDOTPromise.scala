package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromise {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Promise""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(91603), ILet(Id("""executor"""), ERef(RefId(Id("""__x0__""")))).setId(91604), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(91606), IReturn(ERef(RefId(Id("""__x1__""")))).setId(91607))).setId(91608), ISeq(List()).setId(91609)).setId(91610), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""executor"""))))).setId(91612), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(91613), IReturn(ERef(RefId(Id("""__x3__""")))).setId(91614))).setId(91615), ISeq(List()).setId(91609)).setId(91616), IApp(Id("""__x4__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""NewTarget"""))), EStr("""%PromisePrototype%"""), EList(List(EStr("""PromiseState"""), EStr("""PromiseResult"""), EStr("""PromiseFulfillReactions"""), EStr("""PromiseRejectReactions"""), EStr("""PromiseIsHandled"""))))).setId(91618), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(91619), IReturn(ERef(RefId(Id("""__x4__""")))).setId(91620)).setId(91621), ISeq(List()).setId(91609)).setId(91622), ILet(Id("""promise"""), ERef(RefId(Id("""__x4__""")))).setId(91623), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseState""")), EStr("""pending""")).setId(91625), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseFulfillReactions""")), EList(List())).setId(91627), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseRejectReactions""")), EList(List())).setId(91629), IAssign(RefProp(RefId(Id("""promise""")), EStr("""PromiseIsHandled""")), EBool(false)).setId(91631), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateResolvingFunctions"""))), List(ERef(RefId(Id("""promise"""))))).setId(91633), ILet(Id("""resolvingFunctions"""), ERef(RefId(Id("""__x5__""")))).setId(91634), IApp(Id("""__x6__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""executor"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""resolvingFunctions""")), EStr("""Resolve"""))), ERef(RefProp(RefId(Id("""resolvingFunctions""")), EStr("""Reject"""))))))).setId(91636), ILet(Id("""completion"""), ERef(RefId(Id("""__x6__""")))).setId(91637), IApp(Id("""__x7__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""completion"""))))).setId(91639), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""resolvingFunctions""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""completion""")), EStr("""Value"""))))))).setId(91640), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(91641), IReturn(ERef(RefId(Id("""__x8__""")))).setId(91642)).setId(91643), ISeq(List()).setId(91609)).setId(91644), IExpr(ERef(RefId(Id("""__x8__""")))).setId(91645))).setId(91647), ISeq(List()).setId(91609)).setId(91648), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""promise"""))))).setId(91650), IReturn(ERef(RefId(Id("""__x9__""")))).setId(91651))).setId(-1))
  /* Beautified form:
  "GLOBAL.Promise" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let executor = __x0__
    if (= NewTarget undefined) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (IsCallable executor)
    if (= __x2__ false) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    app __x4__ = (OrdinaryCreateFromConstructor NewTarget "%PromisePrototype%" (new ["PromiseState", "PromiseResult", "PromiseFulfillReactions", "PromiseRejectReactions", "PromiseIsHandled"]))
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let promise = __x4__
    promise["PromiseState"] = "pending"
    promise["PromiseFulfillReactions"] = (new [])
    promise["PromiseRejectReactions"] = (new [])
    promise["PromiseIsHandled"] = false
    app __x5__ = (CreateResolvingFunctions promise)
    let resolvingFunctions = __x5__
    app __x6__ = (Call executor undefined (new [resolvingFunctions["Resolve"], resolvingFunctions["Reject"]]))
    let completion = __x6__
    app __x7__ = (IsAbruptCompletion completion)
    if __x7__ {
      app __x8__ = (Call resolvingFunctions["Reject"] undefined (new [completion["Value"]]))
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      __x8__
    } else {}
    app __x9__ = (WrapCompletion promise)
    return __x9__
  }
  */
}
