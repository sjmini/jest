package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ProxyExoticObjectDOTSet {
  val length: Int = 3
  val func: Func = Func("""ProxyExoticObject.Set""", List(Id("""O"""), Id("""P"""), Id("""V"""), Id("""Receiver""")), None, ISeq(List(ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))).setId(60101), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(60103), IReturn(ERef(RefId(Id("""__x0__""")))).setId(60104))).setId(60181), ISeq(List()).setId(60182)).setId(60106), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))).setId(60108), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""set"""))).setId(60110), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(60111), IReturn(ERef(RefId(Id("""__x1__""")))).setId(60112)).setId(60113), ISeq(List()).setId(60189)).setId(60114), ILet(Id("""trap"""), ERef(RefId(Id("""__x1__""")))).setId(60115), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""Set"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))), ERef(RefId(Id("""Receiver"""))))).setId(60117), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(60118), IReturn(ERef(RefId(Id("""__x2__""")))).setId(60119)).setId(60120), ISeq(List()).setId(60196)).setId(60121), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(60122), IReturn(ERef(RefId(Id("""__x3__""")))).setId(60123))).setId(60200), ISeq(List()).setId(60201)).setId(60126), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))), ERef(RefId(Id("""Receiver"""))))))).setId(60128), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(60129), IReturn(ERef(RefId(Id("""__x4__""")))).setId(60130)).setId(60131), ISeq(List()).setId(60207)).setId(60132), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(60133), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(60134), IReturn(ERef(RefId(Id("""__x5__""")))).setId(60135)).setId(60136), ISeq(List()).setId(60213)).setId(60137), ILet(Id("""booleanTrapResult"""), ERef(RefId(Id("""__x5__""")))).setId(60138), IIf(EBOp(OEq, ERef(RefId(Id("""booleanTrapResult"""))), EBool(false)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(60140), IReturn(ERef(RefId(Id("""__x6__""")))).setId(60141))).setId(60218), ISeq(List()).setId(60219)).setId(60143), IApp(Id("""__x7__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))))).setId(60145), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(60146), IReturn(ERef(RefId(Id("""__x7__""")))).setId(60147)).setId(60148), ISeq(List()).setId(60225)).setId(60149), ILet(Id("""targetDesc"""), ERef(RefId(Id("""__x7__""")))).setId(60150), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""targetDesc"""))), EUndef)), EBOp(OEq, ERef(RefProp(RefId(Id("""targetDesc""")), EStr("""Configurable"""))), EBool(false))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""targetDesc"""))))).setId(60152), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(true)), EBOp(OEq, ERef(RefProp(RefId(Id("""targetDesc""")), EStr("""Writable"""))), EBool(false))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""V"""))), ERef(RefProp(RefId(Id("""targetDesc""")), EStr("""Value"""))))).setId(60153), IIf(EBOp(OEq, ERef(RefId(Id("""__x9__"""))), EBool(false)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(60154), IReturn(ERef(RefId(Id("""__x10__""")))).setId(60155))).setId(60232), ISeq(List()).setId(60233)).setId(60157))).setId(60235), ISeq(List()).setId(60236)).setId(60160), IApp(Id("""__x11__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""targetDesc"""))))).setId(60162), IIf(EBOp(OEq, ERef(RefId(Id("""__x11__"""))), EBool(true)), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""targetDesc""")), EStr("""Set"""))), EUndef), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(60163), IReturn(ERef(RefId(Id("""__x12__""")))).setId(60164))).setId(60241), ISeq(List()).setId(60242)).setId(60166), ISeq(List()).setId(60244)).setId(60169))).setId(60246), ISeq(List()).setId(60247)).setId(60172), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(60174), IReturn(ERef(RefId(Id("""__x13__""")))).setId(60175))).setId(60251))
  val instToStepMap: Map[Int, Int] = HashMap(60132 -> 11, 60153 -> 19, 60125 -> 9, 60157 -> 19, 60159 -> 19, 60104 -> 2, 60109 -> 5, 60105 -> 2, 60106 -> 3, 60138 -> 11, 60103 -> 2, 60145 -> 14, 60150 -> 14, 60121 -> 9, 60166 -> 23, 60173 -> 24, 60116 -> 6, 60142 -> 12, 60110 -> 6, 60163 -> 23, 60149 -> 14, 60122 -> 9, 60158 -> 19, 60170 -> 23, 60174 -> 25, 60139 -> 11, 60102 -> 1, 60107 -> 3, 60162 -> 23, 60143 -> 13, 60126 -> 10, 60154 -> 19, 60115 -> 6, 60171 -> 23, 60161 -> 23, 60108 -> 5, 60165 -> 23, 60123 -> 9, 60127 -> 10, 60140 -> 12, 60114 -> 6, 60155 -> 19, 60144 -> 13, 60175 -> 25, 60152 -> 23, 60172 -> 24, 60160 -> 23, 60117 -> 9, 60156 -> 19, 60141 -> 12, 60124 -> 9, 60168 -> 23, 60164 -> 23, 60128 -> 11, 60169 -> 23, 60137 -> 11, 60167 -> 23, 60100 -> 4, 60101 -> 1, 60151 -> 14, 60133 -> 11, 60176 -> 25)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(60100), 5 -> HashSet(60108, 60109), 10 -> HashSet(60126, 60127), 14 -> HashSet(60145, 60150, 60149, 60151), 20 -> HashSet(60161, 60152, 60160), 1 -> HashSet(60102, 60101), 6 -> HashSet(60116, 60110, 60115, 60114), 9 -> HashSet(60125, 60121, 60122, 60123, 60117, 60124), 13 -> HashSet(60143, 60144), 2 -> HashSet(60103, 60104, 60105), 12 -> HashSet(60142, 60140, 60141), 3 -> HashSet(60106, 60107), 11 -> HashSet(60132, 60138, 60139, 60133, 60128, 60137), 23 -> HashSet(60166, 60163, 60170, 60162, 60165, 60152, 60160, 60168, 60171, 60161, 60164, 60169, 60167), 19 -> HashSet(60153, 60157, 60158, 60154, 60159, 60155, 60156), 4 -> HashSet(60100), 24 -> HashSet(60173, 60172), 25 -> HashSet(60174, 60175, 60176))
  /* Beautified form:
  "ProxyExoticObject.Set" (O, P, V, Receiver) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    let target = O["ProxyTarget"]
    app __x1__ = (GetMethod handler "set")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let trap = __x1__
    if (= trap undefined) {
      app __x2__ = (target["Set"] target P V Receiver)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Call trap handler (new [target, P, V, Receiver]))
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (ToBoolean __x4__)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let booleanTrapResult = __x5__
    if (= booleanTrapResult false) {
      app __x6__ = (WrapCompletion false)
      return __x6__
    } else {}
    app __x7__ = (target["GetOwnProperty"] target P)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let targetDesc = __x7__
    if (&& (! (= targetDesc undefined)) (= targetDesc["Configurable"] false)) {
      app __x8__ = (IsDataDescriptor targetDesc)
      if (&& (= __x8__ true) (= targetDesc["Writable"] false)) {
        app __x9__ = (SameValue V targetDesc["Value"])
        if (= __x9__ false) {
          app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x10__
        } else {}
      } else {}
      app __x11__ = (IsAccessorDescriptor targetDesc)
      if (= __x11__ true) if (= targetDesc["Set"] undefined) {
        app __x12__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x12__
      } else {} else {}
    } else {}
    app __x13__ = (WrapCompletion true)
    return __x13__
  }
  */
}
