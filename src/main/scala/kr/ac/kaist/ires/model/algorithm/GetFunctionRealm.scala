package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetFunctionRealm {
  val length: Int = 1
  val func: Func = Func("""GetFunctionRealm""", List(Id("""obj""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""Realm"""))), EAbsent)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""obj""")), EStr("""Realm"""))))).setId(6715), IReturn(ERef(RefId(Id("""__x0__""")))).setId(6716))).setId(6718), ISeq(List()).setId(6714)).setId(6719), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""obj""")))), EStr("""BoundFunctionExoticObject""")), ISeq(List(ILet(Id("""target"""), ERef(RefProp(RefId(Id("""obj""")), EStr("""BoundTargetFunction""")))).setId(6721), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetFunctionRealm"""))), List(ERef(RefId(Id("""target"""))))).setId(6723), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(6724), IReturn(ERef(RefId(Id("""__x1__""")))).setId(6725)).setId(6726), ISeq(List()).setId(6714)).setId(6727), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(6728), IReturn(ERef(RefId(Id("""__x2__""")))).setId(6729))).setId(6731), ISeq(List()).setId(6714)).setId(6732), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""obj""")))), EStr("""ProxyExoticObject""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""obj""")), EStr("""ProxyHandler"""))), ENull), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(6734), IReturn(ERef(RefId(Id("""__x3__""")))).setId(6735))).setId(6736), ISeq(List()).setId(6714)).setId(6737), ILet(Id("""proxyTarget"""), ERef(RefProp(RefId(Id("""obj""")), EStr("""ProxyTarget""")))).setId(6739), IApp(Id("""__x4__"""), ERef(RefId(Id("""GetFunctionRealm"""))), List(ERef(RefId(Id("""proxyTarget"""))))).setId(6741), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(6742), IReturn(ERef(RefId(Id("""__x4__""")))).setId(6743)).setId(6744), ISeq(List()).setId(6714)).setId(6745), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(6746), IReturn(ERef(RefId(Id("""__x5__""")))).setId(6747))).setId(6749), ISeq(List()).setId(6714)).setId(6750), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""REALM"""))))).setId(6752), IReturn(ERef(RefId(Id("""__x6__""")))).setId(6753))).setId(-1))
  /* Beautified form:
  "GetFunctionRealm" (obj) => {
    if (! (= obj["Realm"] absent)) {
      app __x0__ = (WrapCompletion obj["Realm"])
      return __x0__
    } else {}
    if (= (typeof obj) "BoundFunctionExoticObject") {
      let target = obj["BoundTargetFunction"]
      app __x1__ = (GetFunctionRealm target)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    if (= (typeof obj) "ProxyExoticObject") {
      if (= obj["ProxyHandler"] null) {
        app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x3__
      } else {}
      let proxyTarget = obj["ProxyTarget"]
      app __x4__ = (GetFunctionRealm proxyTarget)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (WrapCompletion REALM)
    return __x6__
  }
  */
}
