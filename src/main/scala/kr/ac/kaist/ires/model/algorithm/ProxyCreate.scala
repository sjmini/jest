package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ProxyCreate {
  val length: Int = 2
  val func: Func = Func("""ProxyCreate""", List(Id("""target"""), Id("""handler""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""target"""))))).setId(61155), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(61156), IReturn(ERef(RefId(Id("""__x1__""")))).setId(61157))).setId(61228), ISeq(List()).setId(61229)).setId(61160), IExpr(ENotSupported("""Etc""")).setId(61162), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""handler"""))))).setId(61163), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(61164), IReturn(ERef(RefId(Id("""__x3__""")))).setId(61165))).setId(61235), ISeq(List()).setId(61236)).setId(61167), IExpr(ENotSupported("""Etc""")).setId(61162), ILet(Id("""P"""), EMap(Ty("""ProxyExoticObject"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())), (EStr("""ProxyTarget"""), EUndef), (EStr("""ProxyHandler"""), EUndef)))).setId(61169), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))).setId(61171), ISeq(List()).setId(61241)).setId(61173), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))).setId(61174), ISeq(List()).setId(61244)).setId(61176), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))).setId(61177), ISeq(List()).setId(61247)).setId(61179), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))).setId(61180), ISeq(List()).setId(61250)).setId(61182), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))).setId(61183), ISeq(List()).setId(61253)).setId(61185), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))).setId(61186), ISeq(List()).setId(61256)).setId(61188), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))).setId(61189), ISeq(List()).setId(61259)).setId(61191), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))).setId(61192), ISeq(List()).setId(61262)).setId(61194), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))).setId(61195), ISeq(List()).setId(61265)).setId(61197), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))).setId(61198), ISeq(List()).setId(61268)).setId(61200), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))).setId(61201), ISeq(List()).setId(61271)).setId(61203), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""target"""))))).setId(61205), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(true)), ISeq(List(IAssign(RefProp(RefId(Id("""P""")), EStr("""Call""")), ERef(RefId(Id("""ProxyExoticObjectDOTCall""")))).setId(61206), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""target"""))))).setId(61208), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true)), IAssign(RefProp(RefId(Id("""P""")), EStr("""Construct""")), ERef(RefId(Id("""ProxyExoticObjectDOTConstruct""")))).setId(61209), ISeq(List()).setId(61277)).setId(61212))).setId(61279), ISeq(List()).setId(61280)).setId(61215), IAssign(RefProp(RefId(Id("""P""")), EStr("""ProxyTarget""")), ERef(RefId(Id("""target""")))).setId(61217), IAssign(RefProp(RefId(Id("""P""")), EStr("""ProxyHandler""")), ERef(RefId(Id("""handler""")))).setId(61219), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""P"""))))).setId(61221), IReturn(ERef(RefId(Id("""__x6__""")))).setId(61222))).setId(61286))
  val instToStepMap: Map[Int, Int] = HashMap(61164 -> 3, 61206 -> 13, 61168 -> 4, 61176 -> 7, 61205 -> 14, 61170 -> 6, 61194 -> 7, 61162 -> 5, 61218 -> 15, 61210 -> 13, 61208 -> 13, 61185 -> 7, 61179 -> 7, 61157 -> 0, 61221 -> 17, 61214 -> 13, 61217 -> 15, 61211 -> 13, 61160 -> 1, 61173 -> 7, 61165 -> 3, 61215 -> 14, 61188 -> 7, 61161 -> 1, 61156 -> 0, 61200 -> 7, 61220 -> 16, 61216 -> 14, 61223 -> 17, 61191 -> 7, 61169 -> 6, 61212 -> 13, 61219 -> 16, 61166 -> 3, 61209 -> 13, 61204 -> 7, 61197 -> 7, 61167 -> 4, 61207 -> 13, 61158 -> 0, 61182 -> 7, 61222 -> 17, 61155 -> 1, 61203 -> 7, 61163 -> 4, 61213 -> 13)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(61157, 61156, 61158), 5 -> HashSet(61162), 10 -> HashSet(61206, 61207), 14 -> HashSet(61205, 61215, 61216), 1 -> HashSet(61160, 61161, 61155), 6 -> HashSet(61170, 61169), 13 -> HashSet(61206, 61212, 61209, 61207, 61210, 61208, 61213, 61214, 61211), 2 -> HashSet(61162), 17 -> HashSet(61221, 61223, 61222), 7 -> HashSet(61176, 61173, 61188, 61200, 61191, 61194, 61182, 61203, 61185, 61179, 61204, 61197), 3 -> HashSet(61164, 61165, 61166), 16 -> HashSet(61220, 61219), 4 -> HashSet(61168, 61167, 61163), 15 -> HashSet(61217, 61218))
  /* Beautified form:
  "ProxyCreate" (target, handler) => {
    app __x0__ = (Type target)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    !!! "Etc"
    app __x2__ = (Type handler)
    if (! (= __x2__ Object)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    !!! "Etc"
    let P = (new ProxyExoticObject("SubMap" -> (new SubMap()), "ProxyTarget" -> undefined, "ProxyHandler" -> undefined))
    if (= P["HasProperty"] absent) P["HasProperty"] = OrdinaryObjectDOTHasProperty else {}
    if (= P["DefineOwnProperty"] absent) P["DefineOwnProperty"] = OrdinaryObjectDOTDefineOwnProperty else {}
    if (= P["Set"] absent) P["Set"] = OrdinaryObjectDOTSet else {}
    if (= P["SetPrototypeOf"] absent) P["SetPrototypeOf"] = OrdinaryObjectDOTSetPrototypeOf else {}
    if (= P["Get"] absent) P["Get"] = OrdinaryObjectDOTGet else {}
    if (= P["PreventExtensions"] absent) P["PreventExtensions"] = OrdinaryObjectDOTPreventExtensions else {}
    if (= P["Delete"] absent) P["Delete"] = OrdinaryObjectDOTDelete else {}
    if (= P["GetOwnProperty"] absent) P["GetOwnProperty"] = OrdinaryObjectDOTGetOwnProperty else {}
    if (= P["OwnPropertyKeys"] absent) P["OwnPropertyKeys"] = OrdinaryObjectDOTOwnPropertyKeys else {}
    if (= P["GetPrototypeOf"] absent) P["GetPrototypeOf"] = OrdinaryObjectDOTGetPrototypeOf else {}
    if (= P["IsExtensible"] absent) P["IsExtensible"] = OrdinaryObjectDOTIsExtensible else {}
    app __x4__ = (IsCallable target)
    if (= __x4__ true) {
      P["Call"] = ProxyExoticObjectDOTCall
      app __x5__ = (IsConstructor target)
      if (= __x5__ true) P["Construct"] = ProxyExoticObjectDOTConstruct else {}
    } else {}
    P["ProxyTarget"] = target
    P["ProxyHandler"] = handler
    app __x6__ = (WrapCompletion P)
    return __x6__
  }
  */
}
