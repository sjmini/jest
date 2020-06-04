package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ProxyExoticObjectDOTConstruct {
  val length: Int = 2
  val func: Func = Func("""ProxyExoticObject.Construct""", List(Id("""O"""), Id("""argumentsList"""), Id("""newTarget""")), None, ISeq(List(ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))).setId(61007), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(61009), IReturn(ERef(RefId(Id("""__x0__""")))).setId(61010))).setId(61011), ISeq(List()).setId(61012)).setId(61013), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))).setId(61015), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""construct"""))).setId(61017), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(61018), IReturn(ERef(RefId(Id("""__x1__""")))).setId(61019)).setId(61020), ISeq(List()).setId(61012)).setId(61021), ILet(Id("""trap"""), ERef(RefId(Id("""__x1__""")))).setId(61022), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""argumentsList"""))), ERef(RefId(Id("""newTarget"""))))).setId(61024), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(61025), IReturn(ERef(RefId(Id("""__x2__""")))).setId(61026)).setId(61027), ISeq(List()).setId(61012)).setId(61028), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(61029), IReturn(ERef(RefId(Id("""__x3__""")))).setId(61030))).setId(61032), ISeq(List()).setId(61012)).setId(61033), IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(ERef(RefId(Id("""argumentsList"""))))).setId(61035), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(61036), IReturn(ERef(RefId(Id("""__x4__""")))).setId(61037)).setId(61038), ISeq(List()).setId(61012)).setId(61039), ILet(Id("""argArray"""), ERef(RefId(Id("""__x4__""")))).setId(61040), IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""argArray"""))), ERef(RefId(Id("""newTarget"""))))))).setId(61042), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(61043), IReturn(ERef(RefId(Id("""__x5__""")))).setId(61044)).setId(61045), ISeq(List()).setId(61012)).setId(61046), ILet(Id("""newObj"""), ERef(RefId(Id("""__x5__""")))).setId(61047), IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""newObj"""))))).setId(61049), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(61050), IReturn(ERef(RefId(Id("""__x7__""")))).setId(61051))).setId(61052), ISeq(List()).setId(61012)).setId(61053), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""newObj"""))))).setId(61055), IReturn(ERef(RefId(Id("""__x8__""")))).setId(61056))).setId(-1))
  /* Beautified form:
  "ProxyExoticObject.Construct" (O, argumentsList, newTarget) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    let target = O["ProxyTarget"]
    app __x1__ = (GetMethod handler "construct")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let trap = __x1__
    if (= trap undefined) {
      app __x2__ = (Construct target argumentsList newTarget)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (CreateArrayFromList argumentsList)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let argArray = __x4__
    app __x5__ = (Call trap handler (new [target, argArray, newTarget]))
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let newObj = __x5__
    app __x6__ = (Type newObj)
    if (! (= __x6__ Object)) {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}
    app __x8__ = (WrapCompletion newObj)
    return __x8__
  }
  */
}
