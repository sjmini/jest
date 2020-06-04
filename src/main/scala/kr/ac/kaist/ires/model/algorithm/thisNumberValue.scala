package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object thisNumberValue {
  val length: Int = 0
  val func: Func = Func("""thisNumberValue""", List(Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(69129), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Number""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(69130), IReturn(ERef(RefId(Id("""__x1__""")))).setId(69131))).setId(69132), ISeq(List()).setId(69133)).setId(69134), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(69136), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""value""")), EStr("""NumberData"""))), EAbsent))), ISeq(List(ILet(Id("""n"""), ERef(RefProp(RefId(Id("""value""")), EStr("""NumberData""")))).setId(69137), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""n"""))))).setId(69139), IReturn(ERef(RefId(Id("""__x3__""")))).setId(69140))).setId(69142), ISeq(List()).setId(69133)).setId(69143), IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(69145), IReturn(ERef(RefId(Id("""__x4__""")))).setId(69146))).setId(-1))
  /* Beautified form:
  "thisNumberValue" (value) => {
    app __x0__ = (Type value)
    if (= __x0__ Number) {
      app __x1__ = (WrapCompletion value)
      return __x1__
    } else {}
    app __x2__ = (Type value)
    if (&& (= __x2__ Object) (! (= value["NumberData"] absent))) {
      let n = value["NumberData"]
      app __x3__ = (WrapCompletion n)
      return __x3__
    } else {}
    app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x4__
  }
  */
}
