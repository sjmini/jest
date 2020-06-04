package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object thisStringValue {
  val length: Int = 0
  val func: Func = Func("""thisStringValue""", List(Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(70674), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""String""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(70675), IReturn(ERef(RefId(Id("""__x1__""")))).setId(70676))).setId(70677), ISeq(List()).setId(70678)).setId(70679), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(70681), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""value""")), EStr("""StringData"""))), EAbsent))), ISeq(List(ILet(Id("""s"""), ERef(RefProp(RefId(Id("""value""")), EStr("""StringData""")))).setId(70682), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""s"""))))).setId(70684), IReturn(ERef(RefId(Id("""__x3__""")))).setId(70685))).setId(70687), ISeq(List()).setId(70678)).setId(70688), IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(70690), IReturn(ERef(RefId(Id("""__x4__""")))).setId(70691))).setId(-1))
  /* Beautified form:
  "thisStringValue" (value) => {
    app __x0__ = (Type value)
    if (= __x0__ String) {
      app __x1__ = (WrapCompletion value)
      return __x1__
    } else {}
    app __x2__ = (Type value)
    if (&& (= __x2__ Object) (! (= value["StringData"] absent))) {
      let s = value["StringData"]
      app __x3__ = (WrapCompletion s)
      return __x3__
    } else {}
    app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x4__
  }
  */
}
