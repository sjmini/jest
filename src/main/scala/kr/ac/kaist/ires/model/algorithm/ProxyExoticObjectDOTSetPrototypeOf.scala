package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ProxyExoticObjectDOTSetPrototypeOf {
  val length: Int = 1
  val func: Func = Func("""ProxyExoticObject.SetPrototypeOf""", List(Id("""O"""), Id("""V""")), None, ISeq(List(ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))).setId(58539), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(58541), IReturn(ERef(RefId(Id("""__x0__""")))).setId(58542))).setId(58615), ISeq(List()).setId(58616)).setId(58544), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))).setId(58546), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""setPrototypeOf"""))).setId(58548), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(58549), IReturn(ERef(RefId(Id("""__x1__""")))).setId(58550)).setId(58551), ISeq(List()).setId(58623)).setId(58552), ILet(Id("""trap"""), ERef(RefId(Id("""__x1__""")))).setId(58553), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""SetPrototypeOf"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""V"""))))).setId(58555), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(58556), IReturn(ERef(RefId(Id("""__x2__""")))).setId(58557)).setId(58558), ISeq(List()).setId(58630)).setId(58559), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(58560), IReturn(ERef(RefId(Id("""__x3__""")))).setId(58561))).setId(58634), ISeq(List()).setId(58635)).setId(58564), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""V"""))))))).setId(58566), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(58567), IReturn(ERef(RefId(Id("""__x4__""")))).setId(58568)).setId(58569), ISeq(List()).setId(58641)).setId(58570), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(58571), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(58572), IReturn(ERef(RefId(Id("""__x5__""")))).setId(58573)).setId(58574), ISeq(List()).setId(58647)).setId(58575), ILet(Id("""booleanTrapResult"""), ERef(RefId(Id("""__x5__""")))).setId(58576), IIf(EBOp(OEq, ERef(RefId(Id("""booleanTrapResult"""))), EBool(false)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(58578), IReturn(ERef(RefId(Id("""__x6__""")))).setId(58579))).setId(58652), ISeq(List()).setId(58653)).setId(58581), IApp(Id("""__x7__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""target"""))))).setId(58583), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(58584), IReturn(ERef(RefId(Id("""__x7__""")))).setId(58585)).setId(58586), ISeq(List()).setId(58659)).setId(58587), ILet(Id("""extensibleTarget"""), ERef(RefId(Id("""__x7__""")))).setId(58588), IIf(EBOp(OEq, ERef(RefId(Id("""extensibleTarget"""))), EBool(true)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(58590), IReturn(ERef(RefId(Id("""__x8__""")))).setId(58591))).setId(58664), ISeq(List()).setId(58665)).setId(58593), IApp(Id("""__x9__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""target"""))))).setId(58595), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(58596), IReturn(ERef(RefId(Id("""__x9__""")))).setId(58597)).setId(58598), ISeq(List()).setId(58671)).setId(58599), ILet(Id("""targetProto"""), ERef(RefId(Id("""__x9__""")))).setId(58600), IApp(Id("""__x10__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""V"""))), ERef(RefId(Id("""targetProto"""))))).setId(58602), IIf(EBOp(OEq, ERef(RefId(Id("""__x10__"""))), EBool(false)), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(58603), IReturn(ERef(RefId(Id("""__x11__""")))).setId(58604))).setId(58677), ISeq(List()).setId(58678)).setId(58606), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(58608), IReturn(ERef(RefId(Id("""__x12__""")))).setId(58609))).setId(58682))
  val instToStepMap: Map[Int, Int] = HashMap(58583 -> 14, 58590 -> 15, 58545 -> 3, 58555 -> 9, 58599 -> 17, 58544 -> 3, 58605 -> 18, 58601 -> 17, 58606 -> 19, 58602 -> 19, 58603 -> 18, 58546 -> 5, 58600 -> 17, 58578 -> 12, 58571 -> 11, 58561 -> 9, 58593 -> 16, 58539 -> 1, 58610 -> 20, 58547 -> 5, 58575 -> 11, 58554 -> 6, 58564 -> 10, 58579 -> 12, 58582 -> 13, 58543 -> 2, 58607 -> 19, 58604 -> 18, 58540 -> 1, 58609 -> 20, 58577 -> 11, 58587 -> 14, 58608 -> 20, 58595 -> 17, 58576 -> 11, 58591 -> 15, 58563 -> 9, 58566 -> 11, 58581 -> 13, 58588 -> 14, 58559 -> 9, 58592 -> 15, 58541 -> 2, 58565 -> 10, 58553 -> 6, 58594 -> 16, 58560 -> 9, 58562 -> 9, 58548 -> 6, 58538 -> 4, 58589 -> 14, 58552 -> 6, 58580 -> 12, 58542 -> 2, 58570 -> 11)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(58538), 5 -> HashSet(58546, 58547), 10 -> HashSet(58564, 58565), 14 -> HashSet(58583, 58587, 58588, 58589), 20 -> HashSet(58610, 58609, 58608), 1 -> HashSet(58539, 58540), 6 -> HashSet(58554, 58553, 58548, 58552), 9 -> HashSet(58561, 58555, 58563, 58559, 58560, 58562), 13 -> HashSet(58582, 58581), 2 -> HashSet(58543, 58541, 58542), 17 -> HashSet(58600, 58595, 58599, 58601), 12 -> HashSet(58578, 58579, 58580), 3 -> HashSet(58545, 58544), 18 -> HashSet(58603, 58604, 58605), 16 -> HashSet(58593, 58594), 11 -> HashSet(58571, 58575, 58577, 58576, 58566, 58570), 19 -> HashSet(58607, 58606, 58602), 4 -> HashSet(58538), 15 -> HashSet(58590, 58591, 58592))
  /* Beautified form:
  "ProxyExoticObject.SetPrototypeOf" (O, V) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    let target = O["ProxyTarget"]
    app __x1__ = (GetMethod handler "setPrototypeOf")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let trap = __x1__
    if (= trap undefined) {
      app __x2__ = (target["SetPrototypeOf"] target V)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Call trap handler (new [target, V]))
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (ToBoolean __x4__)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let booleanTrapResult = __x5__
    if (= booleanTrapResult false) {
      app __x6__ = (WrapCompletion false)
      return __x6__
    } else {}
    app __x7__ = (IsExtensible target)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let extensibleTarget = __x7__
    if (= extensibleTarget true) {
      app __x8__ = (WrapCompletion true)
      return __x8__
    } else {}
    app __x9__ = (target["GetPrototypeOf"] target)
    if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    let targetProto = __x9__
    app __x10__ = (SameValue V targetProto)
    if (= __x10__ false) {
      app __x11__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x11__
    } else {}
    app __x12__ = (WrapCompletion true)
    return __x12__
  }
  */
}
