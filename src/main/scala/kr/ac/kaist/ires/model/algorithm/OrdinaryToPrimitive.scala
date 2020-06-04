package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryToPrimitive {
  val length: Int = 2
  val func: Func = Func("""OrdinaryToPrimitive""", List(Id("""O"""), Id("""hint""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""hint"""))), EStr("""string""")), ILet(Id("""methodNames"""), EList(List(EStr("""toString"""), EStr("""valueOf""")))).setId(2266), ILet(Id("""methodNames"""), EList(List(EStr("""valueOf"""), EStr("""toString""")))).setId(2269)).setId(2272), ILet(Id("""__x0__"""), ERef(RefId(Id("""methodNames""")))).setId(2299), ILet(Id("""__x1__"""), EINum(0L)).setId(2300), IWhile(EBOp(OLt, ERef(RefId(Id("""__x1__"""))), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""length""")))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""__x0__""")), ERef(RefId(Id("""__x1__""")))))).setId(2301), IApp(Id("""__x2__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""name"""))))).setId(2274), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(2275), IReturn(ERef(RefId(Id("""__x2__""")))).setId(2276)).setId(2277), ISeq(List()).setId(2265)).setId(2278), ILet(Id("""method"""), ERef(RefId(Id("""__x2__""")))).setId(2279), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""method"""))))).setId(2281), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""method"""))), ERef(RefId(Id("""O"""))))).setId(2282), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(2283), IReturn(ERef(RefId(Id("""__x4__""")))).setId(2284)).setId(2285), ISeq(List()).setId(2265)).setId(2286), ILet(Id("""result"""), ERef(RefId(Id("""__x4__""")))).setId(2287), IApp(Id("""__x5__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""result"""))))).setId(2289), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(2290), IReturn(ERef(RefId(Id("""__x6__""")))).setId(2291))).setId(2292), ISeq(List()).setId(2265)).setId(2293))).setId(2295), ISeq(List()).setId(2265)).setId(2296), IAssign(RefId(Id("""__x1__""")), EBOp(OPlus, ERef(RefId(Id("""__x1__"""))), EINum(1L))).setId(2302))).setId(2303)).setId(2304), IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(2307), IReturn(ERef(RefId(Id("""__x7__""")))).setId(2308))).setId(-1))
  /* Beautified form:
  "OrdinaryToPrimitive" (O, hint) => {
    if (= hint "string") let methodNames = (new ["toString", "valueOf"]) else let methodNames = (new ["valueOf", "toString"])
    let __x0__ = methodNames
    let __x1__ = 0i
    while (< __x1__ __x0__["length"]) {
      let name = __x0__[__x1__]
      app __x2__ = (Get O name)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let method = __x2__
      app __x3__ = (IsCallable method)
      if (= __x3__ true) {
        app __x4__ = (Call method O)
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        let result = __x4__
        app __x5__ = (Type result)
        if (! (= __x5__ Object)) {
          app __x6__ = (WrapCompletion result)
          return __x6__
        } else {}
      } else {}
      __x1__ = (+ __x1__ 1i)
    }
    app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x7__
  }
  */
}
