package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ProxyExoticObjectDOTGetPrototypeOf {
  val length: Int = 0
  val func: Func = Func("""ProxyExoticObject.GetPrototypeOf""", List(Id("""O""")), None, ISeq(List(ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))).setId(58336), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(58338), IReturn(ERef(RefId(Id("""__x0__""")))).setId(58339))).setId(58340), ISeq(List()).setId(58341)).setId(58342), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))).setId(58344), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""getPrototypeOf"""))).setId(58346), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(58347), IReturn(ERef(RefId(Id("""__x1__""")))).setId(58348)).setId(58349), ISeq(List()).setId(58341)).setId(58350), ILet(Id("""trap"""), ERef(RefId(Id("""__x1__""")))).setId(58351), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""target"""))))).setId(58353), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(58354), IReturn(ERef(RefId(Id("""__x2__""")))).setId(58355)).setId(58356), ISeq(List()).setId(58341)).setId(58357), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(58358), IReturn(ERef(RefId(Id("""__x3__""")))).setId(58359))).setId(58361), ISeq(List()).setId(58341)).setId(58362), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))))))).setId(58364), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(58365), IReturn(ERef(RefId(Id("""__x4__""")))).setId(58366)).setId(58367), ISeq(List()).setId(58341)).setId(58368), ILet(Id("""handlerProto"""), ERef(RefId(Id("""__x4__""")))).setId(58369), IApp(Id("""__x5__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""handlerProto"""))))).setId(58371), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""Object""")))), EBOp(OEq, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""Null""")))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(58372), IReturn(ERef(RefId(Id("""__x6__""")))).setId(58373))).setId(58374), ISeq(List()).setId(58341)).setId(58375), IApp(Id("""__x7__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""target"""))))).setId(58377), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(58378), IReturn(ERef(RefId(Id("""__x7__""")))).setId(58379)).setId(58380), ISeq(List()).setId(58341)).setId(58381), ILet(Id("""extensibleTarget"""), ERef(RefId(Id("""__x7__""")))).setId(58382), IIf(EBOp(OEq, ERef(RefId(Id("""extensibleTarget"""))), EBool(true)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""handlerProto"""))))).setId(58384), IReturn(ERef(RefId(Id("""__x8__""")))).setId(58385))).setId(58386), ISeq(List()).setId(58341)).setId(58387), IApp(Id("""__x9__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""target"""))))).setId(58389), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(58390), IReturn(ERef(RefId(Id("""__x9__""")))).setId(58391)).setId(58392), ISeq(List()).setId(58341)).setId(58393), ILet(Id("""targetProto"""), ERef(RefId(Id("""__x9__""")))).setId(58394), IApp(Id("""__x10__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""handlerProto"""))), ERef(RefId(Id("""targetProto"""))))).setId(58396), IIf(EBOp(OEq, ERef(RefId(Id("""__x10__"""))), EBool(false)), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(58397), IReturn(ERef(RefId(Id("""__x11__""")))).setId(58398))).setId(58399), ISeq(List()).setId(58341)).setId(58400), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""handlerProto"""))))).setId(58402), IReturn(ERef(RefId(Id("""__x12__""")))).setId(58403))).setId(-1))
  /* Beautified form:
  "ProxyExoticObject.GetPrototypeOf" (O) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    let target = O["ProxyTarget"]
    app __x1__ = (GetMethod handler "getPrototypeOf")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let trap = __x1__
    if (= trap undefined) {
      app __x2__ = (target["GetPrototypeOf"] target)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Call trap handler (new [target]))
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let handlerProto = __x4__
    app __x5__ = (Type handlerProto)
    if (! (|| (= __x5__ Object) (= __x5__ Null))) {
      app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x6__
    } else {}
    app __x7__ = (IsExtensible target)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let extensibleTarget = __x7__
    if (= extensibleTarget true) {
      app __x8__ = (WrapCompletion handlerProto)
      return __x8__
    } else {}
    app __x9__ = (target["GetPrototypeOf"] target)
    if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    let targetProto = __x9__
    app __x10__ = (SameValue handlerProto targetProto)
    if (= __x10__ false) {
      app __x11__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x11__
    } else {}
    app __x12__ = (WrapCompletion handlerProto)
    return __x12__
  }
  */
}
