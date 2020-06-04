package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ProxyExoticObjectDOTDefineOwnProperty {
  val length: Int = 2
  val func: Func = Func("""ProxyExoticObject.DefineOwnProperty""", List(Id("""O"""), Id("""P"""), Id("""Desc""")), None, ISeq(List(ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))).setId(59415), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59417), IReturn(ERef(RefId(Id("""__x0__""")))).setId(59418))).setId(59419), ISeq(List()).setId(59414)).setId(59420), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))).setId(59422), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""defineProperty"""))).setId(59424), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(59425), IReturn(ERef(RefId(Id("""__x1__""")))).setId(59426)).setId(59427), ISeq(List()).setId(59414)).setId(59428), ILet(Id("""trap"""), ERef(RefId(Id("""__x1__""")))).setId(59429), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""DefineOwnProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Desc"""))))).setId(59431), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(59432), IReturn(ERef(RefId(Id("""__x2__""")))).setId(59433)).setId(59434), ISeq(List()).setId(59414)).setId(59435), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(59436), IReturn(ERef(RefId(Id("""__x3__""")))).setId(59437))).setId(59439), ISeq(List()).setId(59414)).setId(59440), IApp(Id("""__x4__"""), ERef(RefId(Id("""FromPropertyDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))).setId(59442), ILet(Id("""descObj"""), ERef(RefId(Id("""__x4__""")))).setId(59443), IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""descObj"""))))))).setId(59445), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(59446), IReturn(ERef(RefId(Id("""__x5__""")))).setId(59447)).setId(59448), ISeq(List()).setId(59414)).setId(59449), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(59450), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(59451), IReturn(ERef(RefId(Id("""__x6__""")))).setId(59452)).setId(59453), ISeq(List()).setId(59414)).setId(59454), ILet(Id("""booleanTrapResult"""), ERef(RefId(Id("""__x6__""")))).setId(59455), IIf(EBOp(OEq, ERef(RefId(Id("""booleanTrapResult"""))), EBool(false)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(59457), IReturn(ERef(RefId(Id("""__x7__""")))).setId(59458))).setId(59459), ISeq(List()).setId(59414)).setId(59460), IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))))).setId(59462), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(59463), IReturn(ERef(RefId(Id("""__x8__""")))).setId(59464)).setId(59465), ISeq(List()).setId(59414)).setId(59466), ILet(Id("""targetDesc"""), ERef(RefId(Id("""__x8__""")))).setId(59467), IApp(Id("""__x9__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""target"""))))).setId(59469), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(59470), IReturn(ERef(RefId(Id("""__x9__""")))).setId(59471)).setId(59472), ISeq(List()).setId(59414)).setId(59473), ILet(Id("""extensibleTarget"""), ERef(RefId(Id("""__x9__""")))).setId(59474), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))), EAbsent)), EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))), EBool(false))), ILet(Id("""settingConfigFalse"""), EBool(true)).setId(59476), ILet(Id("""settingConfigFalse"""), EBool(false)).setId(59479)).setId(59481), IIf(EBOp(OEq, ERef(RefId(Id("""targetDesc"""))), EUndef), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""extensibleTarget"""))), EBool(false)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59483), IReturn(ERef(RefId(Id("""__x10__""")))).setId(59484))).setId(59485), ISeq(List()).setId(59414)).setId(59486), IIf(EBOp(OEq, ERef(RefId(Id("""settingConfigFalse"""))), EBool(true)), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59488), IReturn(ERef(RefId(Id("""__x11__""")))).setId(59489))).setId(59490), ISeq(List()).setId(59414)).setId(59491))).setId(59493), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""IsCompatiblePropertyDescriptor"""))), List(ERef(RefId(Id("""extensibleTarget"""))), ERef(RefId(Id("""Desc"""))), ERef(RefId(Id("""targetDesc"""))))).setId(59494), IIf(EBOp(OEq, ERef(RefId(Id("""__x12__"""))), EBool(false)), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59495), IReturn(ERef(RefId(Id("""__x13__""")))).setId(59496))).setId(59497), ISeq(List()).setId(59414)).setId(59498), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""settingConfigFalse"""))), EBool(true)), EBOp(OEq, ERef(RefProp(RefId(Id("""targetDesc""")), EStr("""Configurable"""))), EBool(true))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59500), IReturn(ERef(RefId(Id("""__x14__""")))).setId(59501))).setId(59502), ISeq(List()).setId(59414)).setId(59503))).setId(59505)).setId(59506), IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(59508), IReturn(ERef(RefId(Id("""__x15__""")))).setId(59509))).setId(-1))
  /* Beautified form:
  "ProxyExoticObject.DefineOwnProperty" (O, P, Desc) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    let target = O["ProxyTarget"]
    app __x1__ = (GetMethod handler "defineProperty")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let trap = __x1__
    if (= trap undefined) {
      app __x2__ = (target["DefineOwnProperty"] target P Desc)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (FromPropertyDescriptor Desc)
    let descObj = __x4__
    app __x5__ = (Call trap handler (new [target, P, descObj]))
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (ToBoolean __x5__)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let booleanTrapResult = __x6__
    if (= booleanTrapResult false) {
      app __x7__ = (WrapCompletion false)
      return __x7__
    } else {}
    app __x8__ = (target["GetOwnProperty"] target P)
    if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
    let targetDesc = __x8__
    app __x9__ = (IsExtensible target)
    if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    let extensibleTarget = __x9__
    if (&& (! (= Desc["Configurable"] absent)) (= Desc["Configurable"] false)) let settingConfigFalse = true else let settingConfigFalse = false
    if (= targetDesc undefined) {
      if (= extensibleTarget false) {
        app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x10__
      } else {}
      if (= settingConfigFalse true) {
        app __x11__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x11__
      } else {}
    } else {
      app __x12__ = (IsCompatiblePropertyDescriptor extensibleTarget Desc targetDesc)
      if (= __x12__ false) {
        app __x13__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x13__
      } else {}
      if (&& (= settingConfigFalse true) (= targetDesc["Configurable"] true)) {
        app __x14__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x14__
      } else {}
    }
    app __x15__ = (WrapCompletion true)
    return __x15__
  }
  */
}
