package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ProxyExoticObjectDOTHasProperty {
  val length: Int = 1
  val func: Func = Func("""ProxyExoticObject.HasProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))).setId(59691), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59693), IReturn(ERef(RefId(Id("""__x0__""")))).setId(59694))).setId(59767), ISeq(List()).setId(59768)).setId(59696), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))).setId(59698), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""has"""))).setId(59700), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(59701), IReturn(ERef(RefId(Id("""__x1__""")))).setId(59702)).setId(59703), ISeq(List()).setId(59775)).setId(59704), ILet(Id("""trap"""), ERef(RefId(Id("""__x1__""")))).setId(59705), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""HasProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))))).setId(59707), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(59708), IReturn(ERef(RefId(Id("""__x2__""")))).setId(59709)).setId(59710), ISeq(List()).setId(59782)).setId(59711), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(59712), IReturn(ERef(RefId(Id("""__x3__""")))).setId(59713))).setId(59786), ISeq(List()).setId(59787)).setId(59716), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))))))).setId(59718), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(59719), IReturn(ERef(RefId(Id("""__x4__""")))).setId(59720)).setId(59721), ISeq(List()).setId(59793)).setId(59722), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(59723), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(59724), IReturn(ERef(RefId(Id("""__x5__""")))).setId(59725)).setId(59726), ISeq(List()).setId(59799)).setId(59727), ILet(Id("""booleanTrapResult"""), ERef(RefId(Id("""__x5__""")))).setId(59728), IIf(EBOp(OEq, ERef(RefId(Id("""booleanTrapResult"""))), EBool(false)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))))).setId(59730), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(59731), IReturn(ERef(RefId(Id("""__x6__""")))).setId(59732)).setId(59733), ISeq(List()).setId(59806)).setId(59734), ILet(Id("""targetDesc"""), ERef(RefId(Id("""__x6__""")))).setId(59735), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""targetDesc"""))), EUndef)), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""targetDesc""")), EStr("""Configurable"""))), EBool(false)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59737), IReturn(ERef(RefId(Id("""__x7__""")))).setId(59738))).setId(59811), ISeq(List()).setId(59812)).setId(59740), IApp(Id("""__x8__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""target"""))))).setId(59742), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(59743), IReturn(ERef(RefId(Id("""__x8__""")))).setId(59744)).setId(59745), ISeq(List()).setId(59818)).setId(59746), ILet(Id("""extensibleTarget"""), ERef(RefId(Id("""__x8__""")))).setId(59747), IIf(EBOp(OEq, ERef(RefId(Id("""extensibleTarget"""))), EBool(false)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59749), IReturn(ERef(RefId(Id("""__x9__""")))).setId(59750))).setId(59823), ISeq(List()).setId(59824)).setId(59752))).setId(59826), ISeq(List()).setId(59827)).setId(59755))).setId(59829), ISeq(List()).setId(59830)).setId(59758), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""booleanTrapResult"""))))).setId(59760), IReturn(ERef(RefId(Id("""__x10__""")))).setId(59761))).setId(59834))
  val instToStepMap: Map[Int, Int] = HashMap(59739 -> 17, 59692 -> 1, 59707 -> 9, 59704 -> 6, 59693 -> 2, 59753 -> 20, 59712 -> 9, 59690 -> 4, 59761 -> 22, 59759 -> 21, 59747 -> 20, 59695 -> 2, 59756 -> 20, 59728 -> 11, 59760 -> 22, 59717 -> 10, 59699 -> 5, 59711 -> 9, 59749 -> 20, 59714 -> 9, 59746 -> 20, 59736 -> 20, 59696 -> 3, 59757 -> 20, 59740 -> 20, 59735 -> 20, 59713 -> 9, 59698 -> 5, 59762 -> 22, 59730 -> 20, 59752 -> 20, 59705 -> 6, 59758 -> 21, 59741 -> 20, 59754 -> 20, 59722 -> 11, 59737 -> 17, 59716 -> 10, 59697 -> 3, 59694 -> 2, 59734 -> 20, 59729 -> 11, 59748 -> 20, 59751 -> 20, 59742 -> 20, 59755 -> 20, 59706 -> 6, 59723 -> 11, 59691 -> 1, 59727 -> 11, 59738 -> 17, 59750 -> 20, 59715 -> 9, 59700 -> 6, 59718 -> 11)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(59690), 5 -> HashSet(59699, 59698), 10 -> HashSet(59717, 59716), 14 -> HashSet(59736, 59735, 59730, 59734), 20 -> HashSet(59756, 59749, 59753, 59735, 59730, 59752, 59741, 59754, 59734, 59747, 59750, 59746, 59736, 59757, 59740, 59748, 59751, 59742, 59755), 1 -> HashSet(59692, 59691), 6 -> HashSet(59704, 59705, 59706, 59700), 21 -> HashSet(59758, 59759), 9 -> HashSet(59707, 59711, 59714, 59712, 59713, 59715), 2 -> HashSet(59693, 59694, 59695), 17 -> HashSet(59739, 59737, 59738), 22 -> HashSet(59760, 59762, 59761), 3 -> HashSet(59696, 59697), 18 -> HashSet(59740, 59741), 11 -> HashSet(59728, 59722, 59729, 59723, 59727, 59718), 19 -> HashSet(59746, 59748, 59742, 59747), 4 -> HashSet(59690))
  /* Beautified form:
  "ProxyExoticObject.HasProperty" (O, P) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    let target = O["ProxyTarget"]
    app __x1__ = (GetMethod handler "has")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let trap = __x1__
    if (= trap undefined) {
      app __x2__ = (target["HasProperty"] target P)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Call trap handler (new [target, P]))
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (ToBoolean __x4__)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let booleanTrapResult = __x5__
    if (= booleanTrapResult false) {
      app __x6__ = (target["GetOwnProperty"] target P)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let targetDesc = __x6__
      if (! (= targetDesc undefined)) {
        if (= targetDesc["Configurable"] false) {
          app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x7__
        } else {}
        app __x8__ = (IsExtensible target)
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let extensibleTarget = __x8__
        if (= extensibleTarget false) {
          app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x9__
        } else {}
      } else {}
    } else {}
    app __x10__ = (WrapCompletion booleanTrapResult)
    return __x10__
  }
  */
}
