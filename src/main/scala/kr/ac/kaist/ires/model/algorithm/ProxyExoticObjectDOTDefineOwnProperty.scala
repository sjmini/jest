package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ProxyExoticObjectDOTDefineOwnProperty {
  val length: Int = 2
  val func: Func = Func("""ProxyExoticObject.DefineOwnProperty""", List(Id("""O"""), Id("""P"""), Id("""Desc""")), None, ISeq(List(ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))).setId(59415), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59417), IReturn(ERef(RefId(Id("""__x0__""")))).setId(59418))).setId(59515), ISeq(List()).setId(59516)).setId(59420), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))).setId(59422), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""defineProperty"""))).setId(59424), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(59425), IReturn(ERef(RefId(Id("""__x1__""")))).setId(59426)).setId(59427), ISeq(List()).setId(59523)).setId(59428), ILet(Id("""trap"""), ERef(RefId(Id("""__x1__""")))).setId(59429), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""DefineOwnProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Desc"""))))).setId(59431), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(59432), IReturn(ERef(RefId(Id("""__x2__""")))).setId(59433)).setId(59434), ISeq(List()).setId(59530)).setId(59435), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(59436), IReturn(ERef(RefId(Id("""__x3__""")))).setId(59437))).setId(59534), ISeq(List()).setId(59535)).setId(59440), IApp(Id("""__x4__"""), ERef(RefId(Id("""FromPropertyDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))).setId(59442), ILet(Id("""descObj"""), ERef(RefId(Id("""__x4__""")))).setId(59443), IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""descObj"""))))))).setId(59445), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(59446), IReturn(ERef(RefId(Id("""__x5__""")))).setId(59447)).setId(59448), ISeq(List()).setId(59543)).setId(59449), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(59450), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(59451), IReturn(ERef(RefId(Id("""__x6__""")))).setId(59452)).setId(59453), ISeq(List()).setId(59549)).setId(59454), ILet(Id("""booleanTrapResult"""), ERef(RefId(Id("""__x6__""")))).setId(59455), IIf(EBOp(OEq, ERef(RefId(Id("""booleanTrapResult"""))), EBool(false)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(59457), IReturn(ERef(RefId(Id("""__x7__""")))).setId(59458))).setId(59554), ISeq(List()).setId(59555)).setId(59460), IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))))).setId(59462), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(59463), IReturn(ERef(RefId(Id("""__x8__""")))).setId(59464)).setId(59465), ISeq(List()).setId(59561)).setId(59466), ILet(Id("""targetDesc"""), ERef(RefId(Id("""__x8__""")))).setId(59467), IApp(Id("""__x9__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""target"""))))).setId(59469), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(59470), IReturn(ERef(RefId(Id("""__x9__""")))).setId(59471)).setId(59472), ISeq(List()).setId(59568)).setId(59473), ILet(Id("""extensibleTarget"""), ERef(RefId(Id("""__x9__""")))).setId(59474), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))), EAbsent)), EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))), EBool(false))), ILet(Id("""settingConfigFalse"""), EBool(true)).setId(59476), ILet(Id("""settingConfigFalse"""), EBool(false)).setId(59479)).setId(59481), IIf(EBOp(OEq, ERef(RefId(Id("""targetDesc"""))), EUndef), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""extensibleTarget"""))), EBool(false)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59483), IReturn(ERef(RefId(Id("""__x10__""")))).setId(59484))).setId(59576), ISeq(List()).setId(59577)).setId(59486), IIf(EBOp(OEq, ERef(RefId(Id("""settingConfigFalse"""))), EBool(true)), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59488), IReturn(ERef(RefId(Id("""__x11__""")))).setId(59489))).setId(59581), ISeq(List()).setId(59582)).setId(59491))).setId(59584), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""IsCompatiblePropertyDescriptor"""))), List(ERef(RefId(Id("""extensibleTarget"""))), ERef(RefId(Id("""Desc"""))), ERef(RefId(Id("""targetDesc"""))))).setId(59494), IIf(EBOp(OEq, ERef(RefId(Id("""__x12__"""))), EBool(false)), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59495), IReturn(ERef(RefId(Id("""__x13__""")))).setId(59496))).setId(59588), ISeq(List()).setId(59589)).setId(59498), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""settingConfigFalse"""))), EBool(true)), EBOp(OEq, ERef(RefProp(RefId(Id("""targetDesc""")), EStr("""Configurable"""))), EBool(true))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59500), IReturn(ERef(RefId(Id("""__x14__""")))).setId(59501))).setId(59593), ISeq(List()).setId(59594)).setId(59503))).setId(59596)).setId(59506), IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(59508), IReturn(ERef(RefId(Id("""__x15__""")))).setId(59509))).setId(59600))
  val instToStepMap: Map[Int, Int] = HashMap(59431 -> 9, 59492 -> 25, 59435 -> 9, 59474 -> 16, 59429 -> 6, 59437 -> 9, 59487 -> 25, 59504 -> 30, 59440 -> 10, 59476 -> 19, 59491 -> 25, 59459 -> 13, 59444 -> 11, 59508 -> 31, 59414 -> 4, 59436 -> 9, 59439 -> 9, 59495 -> 28, 59454 -> 12, 59419 -> 2, 59478 -> 19, 59468 -> 15, 59483 -> 23, 59509 -> 31, 59422 -> 5, 59500 -> 30, 59473 -> 16, 59428 -> 6, 59415 -> 1, 59441 -> 10, 59503 -> 30, 59505 -> 30, 59486 -> 25, 59460 -> 14, 59482 -> 20, 59485 -> 23, 59479 -> 20, 59418 -> 2, 59496 -> 28, 59467 -> 15, 59438 -> 9, 59499 -> 30, 59421 -> 3, 59450 -> 12, 59493 -> 25, 59457 -> 13, 59442 -> 11, 59506 -> 30, 59489 -> 25, 59502 -> 30, 59501 -> 30, 59498 -> 30, 59480 -> 20, 59417 -> 2, 59466 -> 15, 59481 -> 20, 59461 -> 14, 59449 -> 12, 59416 -> 1, 59456 -> 12, 59445 -> 12, 59490 -> 25, 59488 -> 25, 59458 -> 13, 59469 -> 16, 59424 -> 6, 59443 -> 11, 59475 -> 16, 59430 -> 6, 59507 -> 30, 59423 -> 5, 59420 -> 3, 59497 -> 28, 59510 -> 31, 59494 -> 30, 59455 -> 12, 59484 -> 23, 59462 -> 15, 59477 -> 19)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(59414), 5 -> HashSet(59422, 59423), 10 -> HashSet(59440, 59441), 14 -> HashSet(59460, 59461), 1 -> HashSet(59415, 59416), 6 -> HashSet(59428, 59429, 59424, 59430), 28 -> HashSet(59495, 59496, 59497), 9 -> HashSet(59431, 59435, 59438, 59437, 59436, 59439), 13 -> HashSet(59459, 59457, 59458), 2 -> HashSet(59419, 59418, 59417), 12 -> HashSet(59454, 59450, 59445, 59455, 59449, 59456), 3 -> HashSet(59421, 59420), 11 -> HashSet(59444, 59442, 59443), 23 -> HashSet(59483, 59485, 59484), 4 -> HashSet(59414), 15 -> HashSet(59468, 59467, 59466, 59462), 24 -> HashSet(59487, 59486), 25 -> HashSet(59487, 59491, 59486, 59492, 59493, 59489, 59490, 59488), 20 -> HashSet(59480, 59481, 59479, 59482), 29 -> HashSet(59499, 59498, 59494), 16 -> HashSet(59473, 59474, 59469, 59475), 31 -> HashSet(59508, 59509, 59510), 30 -> HashSet(59504, 59500, 59503, 59505, 59499, 59506, 59502, 59507, 59494, 59501, 59498), 19 -> HashSet(59476, 59478, 59477))
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
