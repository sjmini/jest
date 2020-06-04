package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Encode {
  val length: Int = 2
  val func: Func = Func("""Encode""", List(Id("""string"""), Id("""unescapedSet""")), None, ISeq(List(ILet(Id("""strLen"""), ERef(RefProp(RefId(Id("""string""")), EStr("""length""")))).setId(63110), ILet(Id("""R"""), EStr("""""")).setId(63112), ILet(Id("""k"""), EINum(0L)).setId(63114), IWhile(EBool(true), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""strLen""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""R"""))))).setId(63116), IReturn(ERef(RefId(Id("""__x0__""")))).setId(63117))).setId(63118), ISeq(List()).setId(63119)).setId(63120), IExpr(ENotSupported("""Etc""")).setId(63122), IIf(EContains(ERef(RefId(Id("""unescapedSet"""))), ERef(RefId(Id("""C""")))), ISeq(List(IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(63123), IAssign(RefId(Id("""R""")), EBOp(OPlus, ERef(RefId(Id("""R"""))), ERef(RefId(Id("""C"""))))).setId(63125))).setId(63127), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CodePointAt"""))), List(ERef(RefId(Id("""string"""))), ERef(RefId(Id("""k"""))))).setId(63128), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(63129), IReturn(ERef(RefId(Id("""__x1__""")))).setId(63130)).setId(63131), ISeq(List()).setId(63119)).setId(63132), ILet(Id("""cp"""), ERef(RefId(Id("""__x1__""")))).setId(63133), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""cp""")), EStr("""IsUnpairedSurrogate"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_URIErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(63135), IReturn(ERef(RefId(Id("""__x2__""")))).setId(63136))).setId(63137), ISeq(List()).setId(63119)).setId(63138), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), ERef(RefProp(RefId(Id("""cp""")), EStr("""CodeUnitCount"""))))).setId(63140), IExpr(ENotSupported("""Etc""")).setId(63122), ILet(Id("""__x3__"""), ERef(RefId(Id("""Octets""")))).setId(63143), ILet(Id("""__x4__"""), EINum(0L)).setId(63144), IWhile(EBOp(OLt, ERef(RefId(Id("""__x4__"""))), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""length""")))), ISeq(List(ILet(Id("""octet"""), ERef(RefProp(RefId(Id("""__x3__""")), ERef(RefId(Id("""__x4__""")))))).setId(63145), IExpr(ENotSupported("""Etc""")).setId(63122), IAssign(RefId(Id("""__x4__""")), EBOp(OPlus, ERef(RefId(Id("""__x4__"""))), EINum(1L))).setId(63146))).setId(63147)).setId(63148))).setId(63151)).setId(63152))).setId(63154)).setId(63155))).setId(-1))
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
