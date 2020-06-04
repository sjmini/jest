package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object thisBooleanValue {
  val length: Int = 0
  val func: Func = Func("""thisBooleanValue""", List(Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(67443), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Boolean""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(67444), IReturn(ERef(RefId(Id("""__x1__""")))).setId(67445))).setId(67446), ISeq(List()).setId(67447)).setId(67448), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(67450), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""value""")), EStr("""BooleanData"""))), EAbsent))), ISeq(List(ILet(Id("""b"""), ERef(RefProp(RefId(Id("""value""")), EStr("""BooleanData""")))).setId(67451), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""b"""))))).setId(67453), IReturn(ERef(RefId(Id("""__x3__""")))).setId(67454))).setId(67456), ISeq(List()).setId(67447)).setId(67457), IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(67459), IReturn(ERef(RefId(Id("""__x4__""")))).setId(67460))).setId(-1))
  /* Beautified form:
  "thisBooleanValue" (value) => {
    app __x0__ = (Type value)
    if (= __x0__ Boolean) {
      app __x1__ = (WrapCompletion value)
      return __x1__
    } else {}
    app __x2__ = (Type value)
    if (&& (= __x2__ Object) (! (= value["BooleanData"] absent))) {
      let b = value["BooleanData"]
      app __x3__ = (WrapCompletion b)
      return __x3__
    } else {}
    app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x4__
  }
  */
}
