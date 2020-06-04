package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ProxyCreate {
  val length: Int = 2
  val func: Func = Func("""ProxyCreate""", List(Id("""target"""), Id("""handler""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""target"""))))).setId(61155), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(61156), IReturn(ERef(RefId(Id("""__x1__""")))).setId(61157))).setId(61158), ISeq(List()).setId(61159)).setId(61160), IExpr(ENotSupported("""Etc""")).setId(61162), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""handler"""))))).setId(61163), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(61164), IReturn(ERef(RefId(Id("""__x3__""")))).setId(61165))).setId(61166), ISeq(List()).setId(61159)).setId(61167), IExpr(ENotSupported("""Etc""")).setId(61162), ILet(Id("""P"""), EMap(Ty("""ProxyExoticObject"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())), (EStr("""ProxyTarget"""), EUndef), (EStr("""ProxyHandler"""), EUndef)))).setId(61169), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""HasProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""HasProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTHasProperty""")))).setId(61171), ISeq(List()).setId(61172)).setId(61173), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""DefineOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""DefineOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTDefineOwnProperty""")))).setId(61174), ISeq(List()).setId(61175)).setId(61176), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""Set"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""Set""")), ERef(RefId(Id("""OrdinaryObjectDOTSet""")))).setId(61177), ISeq(List()).setId(61178)).setId(61179), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""SetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""SetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTSetPrototypeOf""")))).setId(61180), ISeq(List()).setId(61181)).setId(61182), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""Get"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""Get""")), ERef(RefId(Id("""OrdinaryObjectDOTGet""")))).setId(61183), ISeq(List()).setId(61184)).setId(61185), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""PreventExtensions"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""PreventExtensions""")), ERef(RefId(Id("""OrdinaryObjectDOTPreventExtensions""")))).setId(61186), ISeq(List()).setId(61187)).setId(61188), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""Delete"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""Delete""")), ERef(RefId(Id("""OrdinaryObjectDOTDelete""")))).setId(61189), ISeq(List()).setId(61190)).setId(61191), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""GetOwnProperty"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""GetOwnProperty""")), ERef(RefId(Id("""OrdinaryObjectDOTGetOwnProperty""")))).setId(61192), ISeq(List()).setId(61193)).setId(61194), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""OwnPropertyKeys"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""OwnPropertyKeys""")), ERef(RefId(Id("""OrdinaryObjectDOTOwnPropertyKeys""")))).setId(61195), ISeq(List()).setId(61196)).setId(61197), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""GetPrototypeOf"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""GetPrototypeOf""")), ERef(RefId(Id("""OrdinaryObjectDOTGetPrototypeOf""")))).setId(61198), ISeq(List()).setId(61199)).setId(61200), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""P""")), EStr("""IsExtensible"""))), EAbsent), IAssign(RefProp(RefId(Id("""P""")), EStr("""IsExtensible""")), ERef(RefId(Id("""OrdinaryObjectDOTIsExtensible""")))).setId(61201), ISeq(List()).setId(61202)).setId(61203), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""target"""))))).setId(61205), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(true)), ISeq(List(IAssign(RefProp(RefId(Id("""P""")), EStr("""Call""")), ERef(RefId(Id("""ProxyExoticObjectDOTCall""")))).setId(61206), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""target"""))))).setId(61208), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true)), IAssign(RefProp(RefId(Id("""P""")), EStr("""Construct""")), ERef(RefId(Id("""ProxyExoticObjectDOTConstruct""")))).setId(61209), ISeq(List()).setId(61159)).setId(61212))).setId(61214), ISeq(List()).setId(61159)).setId(61215), IAssign(RefProp(RefId(Id("""P""")), EStr("""ProxyTarget""")), ERef(RefId(Id("""target""")))).setId(61217), IAssign(RefProp(RefId(Id("""P""")), EStr("""ProxyHandler""")), ERef(RefId(Id("""handler""")))).setId(61219), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""P"""))))).setId(61221), IReturn(ERef(RefId(Id("""__x6__""")))).setId(61222))).setId(-1))
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
