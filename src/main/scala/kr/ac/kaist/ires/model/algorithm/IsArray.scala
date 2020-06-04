package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsArray {
  val length: Int = 1
  val func: Func = Func("""IsArray""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""argument"""))))).setId(3330), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3331), IReturn(ERef(RefId(Id("""__x1__""")))).setId(3332))).setId(3333), ISeq(List()).setId(3334)).setId(3335), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""argument""")))), EStr("""ArrayExoticObject""")), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3337), IReturn(ERef(RefId(Id("""__x2__""")))).setId(3338))).setId(3339), ISeq(List()).setId(3334)).setId(3340), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""argument""")))), EStr("""ProxyExoticObject""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argument""")), EStr("""ProxyHandler"""))), ENull), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(3342), IReturn(ERef(RefId(Id("""__x3__""")))).setId(3343))).setId(3344), ISeq(List()).setId(3334)).setId(3345), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""argument""")), EStr("""ProxyTarget""")))).setId(3347), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsArray"""))), List(ERef(RefId(Id("""target"""))))).setId(3349), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(3350), IReturn(ERef(RefId(Id("""__x4__""")))).setId(3351)).setId(3352), ISeq(List()).setId(3334)).setId(3353), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(3354), IReturn(ERef(RefId(Id("""__x5__""")))).setId(3355))).setId(3357), ISeq(List()).setId(3334)).setId(3358), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3360), IReturn(ERef(RefId(Id("""__x6__""")))).setId(3361))).setId(-1))
  /* Beautified form:
  "IsArray" (argument) => {
    app __x0__ = (Type argument)
    if (! (= __x0__ Object)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (= (typeof argument) "ArrayExoticObject") {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    if (= (typeof argument) "ProxyExoticObject") {
      if (= argument["ProxyHandler"] null) {
        app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x3__
      } else {}
      let target = argument["ProxyTarget"]
      app __x4__ = (IsArray target)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (WrapCompletion false)
    return __x6__
  }
  */
}
