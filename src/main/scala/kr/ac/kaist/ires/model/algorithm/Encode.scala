package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Encode {
  val length: Int = 2
  val func: Func = Func("""Encode""", List(Id("""string"""), Id("""unescapedSet""")), None, ISeq(List(ILet(Id("""strLen"""), ERef(RefProp(RefId(Id("""string""")), EStr("""length""")))).setId(63110), ILet(Id("""R"""), EStr("""""")).setId(63112), ILet(Id("""k"""), EINum(0L)).setId(63114), IWhile(EBool(true), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""strLen""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""R"""))))).setId(63116), IReturn(ERef(RefId(Id("""__x0__""")))).setId(63117))).setId(63162), ISeq(List()).setId(63163)).setId(63120), IExpr(ENotSupported("""Etc""")).setId(63122), IIf(EContains(ERef(RefId(Id("""unescapedSet"""))), ERef(RefId(Id("""C""")))), ISeq(List(IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(63123), IAssign(RefId(Id("""R""")), EBOp(OPlus, ERef(RefId(Id("""R"""))), ERef(RefId(Id("""C"""))))).setId(63125))).setId(63168), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CodePointAt"""))), List(ERef(RefId(Id("""string"""))), ERef(RefId(Id("""k"""))))).setId(63128), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(63129), IReturn(ERef(RefId(Id("""__x1__""")))).setId(63130)).setId(63131), ISeq(List()).setId(63173)).setId(63132), ILet(Id("""cp"""), ERef(RefId(Id("""__x1__""")))).setId(63133), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""cp""")), EStr("""IsUnpairedSurrogate"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_URIErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(63135), IReturn(ERef(RefId(Id("""__x2__""")))).setId(63136))).setId(63178), ISeq(List()).setId(63179)).setId(63138), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), ERef(RefProp(RefId(Id("""cp""")), EStr("""CodeUnitCount"""))))).setId(63140), IExpr(ENotSupported("""Etc""")).setId(63122), ILet(Id("""__x3__"""), ERef(RefId(Id("""Octets""")))).setId(63143), ILet(Id("""__x4__"""), EINum(0L)).setId(63144), IWhile(EBOp(OLt, ERef(RefId(Id("""__x4__"""))), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""length""")))), ISeq(List(ILet(Id("""octet"""), ERef(RefProp(RefId(Id("""__x3__""")), ERef(RefId(Id("""__x4__""")))))).setId(63145), IExpr(ENotSupported("""Etc""")).setId(63122), IAssign(RefId(Id("""__x4__""")), EBOp(OPlus, ERef(RefId(Id("""__x4__"""))), EINum(1L))).setId(63146))).setId(63188)).setId(63148))).setId(63190)).setId(63152))).setId(63192)).setId(63155))).setId(63194))
  val instToStepMap: Map[Int, Int] = HashMap(63138 -> 24, 63135 -> 15, 63110 -> 0, 63154 -> 24, 63125 -> 11, 63140 -> 24, 63113 -> 1, 63149 -> 24, 63128 -> 24, 63124 -> 11, 63133 -> 24, 63139 -> 24, 63115 -> 2, 63111 -> 0, 63148 -> 24, 63123 -> 11, 63116 -> 5, 63126 -> 11, 63155 -> 24, 63141 -> 24, 63152 -> 24, 63120 -> 24, 63127 -> 11, 63122 -> 24, 63132 -> 24, 63137 -> 15, 63144 -> 24, 63112 -> 1, 63117 -> 5, 63136 -> 15, 63153 -> 24, 63118 -> 5, 63121 -> 24, 63150 -> 24, 63114 -> 2, 63142 -> 24, 63151 -> 24, 63134 -> 24, 63143 -> 24)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(63110, 63111), 5 -> HashSet(63116, 63117, 63118), 10 -> HashSet(63123, 63124), 24 -> HashSet(63148, 63138, 63154, 63144, 63140, 63149, 63128, 63133, 63150, 63139, 63155, 63141, 63152, 63120, 63122, 63132, 63153, 63121, 63142, 63151, 63134, 63143), 14 -> HashSet(63132, 63128, 63133, 63134), 1 -> HashSet(63112, 63113), 6 -> HashSet(63120, 63121), 2 -> HashSet(63114, 63115), 17 -> HashSet(63141, 63140), 7 -> HashSet(63122), 18 -> HashSet(63122), 16 -> HashSet(63138, 63139), 11 -> HashSet(63123, 63126, 63127, 63125, 63124), 15 -> HashSet(63135, 63137, 63136))
  /* Beautified form:
  "Encode" (string, unescapedSet) => {
    let strLen = string["length"]
    let R = ""
    let k = 0i
    while true {
      if (= k strLen) {
        app __x0__ = (WrapCompletion R)
        return __x0__
      } else {}
      !!! "Etc"
      if (contains unescapedSet C) {
        k = (+ k 1i)
        R = (+ R C)
      } else {
        app __x1__ = (CodePointAt string k)
        if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
        let cp = __x1__
        if (= cp["IsUnpairedSurrogate"] true) {
          app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_URIErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x2__
        } else {}
        k = (+ k cp["CodeUnitCount"])
        !!! "Etc"
        let __x3__ = Octets
        let __x4__ = 0i
        while (< __x4__ __x3__["length"]) {
          let octet = __x3__[__x4__]
          !!! "Etc"
          __x4__ = (+ __x4__ 1i)
        }
      }
    }
  }
  */
}
