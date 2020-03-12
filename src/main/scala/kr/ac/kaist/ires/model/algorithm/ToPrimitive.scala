package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ToPrimitive {
  val length: Int = 1
  val func: Func = Func("""ToPrimitive""", List(Id("""input"""), Id("""PreferredType""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""input"""))))).setId(2112), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object""")))), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""PreferredType"""))), EAbsent), ILet(Id("""hint"""), EStr("""default""")).setId(2113), IIf(EBOp(OEq, ERef(RefId(Id("""PreferredType"""))), ERef(RefId(Id("""String""")))), ILet(Id("""hint"""), EStr("""string""")).setId(2115), ILet(Id("""hint"""), EStr("""number""")).setId(2117)).setId(2120)).setId(2122), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""input"""))), ERef(RefId(Id("""SYMBOL_toPrimitive"""))))).setId(2124), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(2125), IReturn(ERef(RefId(Id("""__x1__""")))).setId(2126)).setId(2127), ISeq(List()).setId(2179)).setId(2128), ILet(Id("""exoticToPrim"""), ERef(RefId(Id("""__x1__""")))).setId(2129), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""exoticToPrim"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""exoticToPrim"""))), ERef(RefId(Id("""input"""))), EList(List(ERef(RefId(Id("""hint"""))))))).setId(2131), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(2132), IReturn(ERef(RefId(Id("""__x2__""")))).setId(2133)).setId(2134), ISeq(List()).setId(2186)).setId(2135), ILet(Id("""result"""), ERef(RefId(Id("""__x2__""")))).setId(2136), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""result"""))))).setId(2138), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(2139), IReturn(ERef(RefId(Id("""__x4__""")))).setId(2140))).setId(2192), ISeq(List()).setId(2193)).setId(2142), IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(2144), IReturn(ERef(RefId(Id("""__x5__""")))).setId(2145))).setId(2197), ISeq(List()).setId(2198)).setId(2148), IIf(EBOp(OEq, ERef(RefId(Id("""hint"""))), EStr("""default""")), IAssign(RefId(Id("""hint""")), EStr("""number""")).setId(2150), ISeq(List()).setId(2201)).setId(2152), IApp(Id("""__x6__"""), ERef(RefId(Id("""OrdinaryToPrimitive"""))), List(ERef(RefId(Id("""input"""))), ERef(RefId(Id("""hint"""))))).setId(2154), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(2155), IReturn(ERef(RefId(Id("""__x6__""")))).setId(2156)).setId(2157), ISeq(List()).setId(2207)).setId(2158), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(2159), IReturn(ERef(RefId(Id("""__x7__""")))).setId(2160))).setId(2211), ISeq(List()).setId(2212)).setId(2163), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""input"""))))).setId(2165), IReturn(ERef(RefId(Id("""__x8__""")))).setId(2166))).setId(2216))
  val instToStepMap: Map[Int, Int] = HashMap(2136 -> 15, 2158 -> 19, 2122 -> 19, 2112 -> 20, 2115 -> 4, 2139 -> 13, 2124 -> 19, 2163 -> 20, 2131 -> 15, 2117 -> 8, 2114 -> 3, 2141 -> 13, 2146 -> 15, 2137 -> 15, 2154 -> 19, 2164 -> 20, 2118 -> 8, 2147 -> 15, 2150 -> 17, 2153 -> 19, 2140 -> 13, 2149 -> 19, 2121 -> 8, 2144 -> 15, 2161 -> 19, 2166 -> 21, 2148 -> 19, 2119 -> 8, 2151 -> 17, 2116 -> 4, 2129 -> 19, 2111 -> 8, 2143 -> 15, 2160 -> 19, 2165 -> 21, 2128 -> 19, 2113 -> 3, 2145 -> 15, 2167 -> 21, 2135 -> 15, 2130 -> 19, 2152 -> 19, 2162 -> 19, 2120 -> 8, 2142 -> 15, 2123 -> 19, 2159 -> 19, 2138 -> 15)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(2111), 14 -> HashSet(2143, 2142, 2138), 20 -> HashSet(2163, 2164, 2112), 21 -> HashSet(2166, 2165, 2167), 9 -> HashSet(2129, 2124, 2128, 2130), 13 -> HashSet(2141, 2140, 2139), 17 -> HashSet(2150, 2151), 12 -> HashSet(2131, 2136, 2137, 2135), 7 -> HashSet(2111), 3 -> HashSet(2114, 2113), 18 -> HashSet(2153, 2152), 16 -> HashSet(2149, 2148), 8 -> HashSet(2117, 2122, 2118, 2121, 2119, 2111, 2120, 2123), 19 -> HashSet(2158, 2122, 2154, 2153, 2149, 2129, 2124, 2160, 2128, 2162, 2123, 2159, 2161, 2148, 2130, 2152), 4 -> HashSet(2115, 2116), 15 -> HashSet(2131, 2146, 2136, 2137, 2147, 2144, 2143, 2145, 2135, 2142, 2138))
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
