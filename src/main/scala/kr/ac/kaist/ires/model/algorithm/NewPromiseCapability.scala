package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NewPromiseCapability {
  val length: Int = 1
  val func: Func = Func("""NewPromiseCapability""", List(Id("""C""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""C"""))))).setId(12177), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(12178), IReturn(ERef(RefId(Id("""__x1__""")))).setId(12179))).setId(12180), ISeq(List()).setId(12181)).setId(12182), ILet(Id("""promiseCapability"""), EMap(Ty("""PromiseCapability"""), List((EStr("""Promise"""), EUndef), (EStr("""Resolve"""), EUndef), (EStr("""Reject"""), EUndef)))).setId(12184), ILet(Id("""steps"""), EMap(Ty("""algorithm"""), List((EStr("""name"""), EStr("""""")), (EStr("""length"""), EINum(2L)), (EStr("""step"""), ERef(RefId(Id("""GLOBALDOTGetCapabilitiesExecutorFunctions"""))))))).setId(12186), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""steps"""))), EList(List(EStr("""Capability"""))))).setId(12188), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(12189), IReturn(ERef(RefId(Id("""__x2__""")))).setId(12190)).setId(12191), ISeq(List()).setId(12181)).setId(12192), ILet(Id("""executor"""), ERef(RefId(Id("""__x2__""")))).setId(12193), IAssign(RefProp(RefId(Id("""executor""")), EStr("""Capability""")), ERef(RefId(Id("""promiseCapability""")))).setId(12195), IApp(Id("""__x3__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""C"""))), EList(List(ERef(RefId(Id("""executor"""))))))).setId(12197), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(12198), IReturn(ERef(RefId(Id("""__x3__""")))).setId(12199)).setId(12200), ISeq(List()).setId(12181)).setId(12201), ILet(Id("""promise"""), ERef(RefId(Id("""__x3__""")))).setId(12202), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))))).setId(12204), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(12205), IReturn(ERef(RefId(Id("""__x5__""")))).setId(12206))).setId(12207), ISeq(List()).setId(12181)).setId(12208), IApp(Id("""__x6__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))))).setId(12210), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(false)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(12211), IReturn(ERef(RefId(Id("""__x7__""")))).setId(12212))).setId(12213), ISeq(List()).setId(12181)).setId(12214), IAssign(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")), ERef(RefId(Id("""promise""")))).setId(12216), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""promiseCapability"""))))).setId(12218), IReturn(ERef(RefId(Id("""__x8__""")))).setId(12219))).setId(-1))
  /* Beautified form:
  "NewPromiseCapability" (C) => {
    app __x0__ = (IsConstructor C)
    if (= __x0__ false) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    let promiseCapability = (new PromiseCapability("Promise" -> undefined, "Resolve" -> undefined, "Reject" -> undefined))
    let steps = (new algorithm("name" -> "", "length" -> 2i, "step" -> GLOBALDOTGetCapabilitiesExecutorFunctions))
    app __x2__ = (CreateBuiltinFunction steps (new ["Capability"]))
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let executor = __x2__
    executor["Capability"] = promiseCapability
    app __x3__ = (Construct C (new [executor]))
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let promise = __x3__
    app __x4__ = (IsCallable promiseCapability["Resolve"])
    if (= __x4__ false) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    app __x6__ = (IsCallable promiseCapability["Reject"])
    if (= __x6__ false) {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}
    promiseCapability["Promise"] = promise
    app __x8__ = (WrapCompletion promiseCapability)
    return __x8__
  }
  */
}
