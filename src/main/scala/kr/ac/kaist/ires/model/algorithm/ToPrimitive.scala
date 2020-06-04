package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToPrimitive {
  val length: Int = 1
  val func: Func = Func("""ToPrimitive""", List(Id("""input"""), Id("""PreferredType""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""input"""))))).setId(2112), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object""")))), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""PreferredType"""))), EAbsent), ILet(Id("""hint"""), EStr("""default""")).setId(2113), IIf(EBOp(OEq, ERef(RefId(Id("""PreferredType"""))), ERef(RefId(Id("""String""")))), ILet(Id("""hint"""), EStr("""string""")).setId(2115), ILet(Id("""hint"""), EStr("""number""")).setId(2117)).setId(2120)).setId(2122), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""input"""))), ERef(RefId(Id("""SYMBOL_toPrimitive"""))))).setId(2124), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(2125), IReturn(ERef(RefId(Id("""__x1__""")))).setId(2126)).setId(2127), ISeq(List()).setId(2111)).setId(2128), ILet(Id("""exoticToPrim"""), ERef(RefId(Id("""__x1__""")))).setId(2129), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""exoticToPrim"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""exoticToPrim"""))), ERef(RefId(Id("""input"""))), EList(List(ERef(RefId(Id("""hint"""))))))).setId(2131), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(2132), IReturn(ERef(RefId(Id("""__x2__""")))).setId(2133)).setId(2134), ISeq(List()).setId(2111)).setId(2135), ILet(Id("""result"""), ERef(RefId(Id("""__x2__""")))).setId(2136), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""result"""))))).setId(2138), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(2139), IReturn(ERef(RefId(Id("""__x4__""")))).setId(2140))).setId(2141), ISeq(List()).setId(2111)).setId(2142), IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(2144), IReturn(ERef(RefId(Id("""__x5__""")))).setId(2145))).setId(2147), ISeq(List()).setId(2111)).setId(2148), IIf(EBOp(OEq, ERef(RefId(Id("""hint"""))), EStr("""default""")), IAssign(RefId(Id("""hint""")), EStr("""number""")).setId(2150), ISeq(List()).setId(2111)).setId(2152), IApp(Id("""__x6__"""), ERef(RefId(Id("""OrdinaryToPrimitive"""))), List(ERef(RefId(Id("""input"""))), ERef(RefId(Id("""hint"""))))).setId(2154), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(2155), IReturn(ERef(RefId(Id("""__x6__""")))).setId(2156)).setId(2157), ISeq(List()).setId(2111)).setId(2158), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(2159), IReturn(ERef(RefId(Id("""__x7__""")))).setId(2160))).setId(2162), ISeq(List()).setId(2111)).setId(2163), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""input"""))))).setId(2165), IReturn(ERef(RefId(Id("""__x8__""")))).setId(2166))).setId(-1))
  /* Beautified form:
  "ToPrimitive" (input, PreferredType) => {
    app __x0__ = (Type input)
    if (= __x0__ Object) {
      if (= PreferredType absent) let hint = "default" else if (= PreferredType String) let hint = "string" else let hint = "number"
      app __x1__ = (GetMethod input SYMBOL_toPrimitive)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let exoticToPrim = __x1__
      if (! (= exoticToPrim undefined)) {
        app __x2__ = (Call exoticToPrim input (new [hint]))
        if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        let result = __x2__
        app __x3__ = (Type result)
        if (! (= __x3__ Object)) {
          app __x4__ = (WrapCompletion result)
          return __x4__
        } else {}
        app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x5__
      } else {}
      if (= hint "default") hint = "number" else {}
      app __x6__ = (OrdinaryToPrimitive input hint)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    app __x8__ = (WrapCompletion input)
    return __x8__
  }
  */
}
