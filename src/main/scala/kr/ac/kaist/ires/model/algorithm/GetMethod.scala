package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetMethod {
  val length: Int = 2
  val func: Func = Func("""GetMethod""", List(Id("""V"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetV"""))), List(ERef(RefId(Id("""V"""))), ERef(RefId(Id("""P"""))))).setId(5295), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(5296), IReturn(ERef(RefId(Id("""__x0__""")))).setId(5297)).setId(5298), ISeq(List()).setId(5294)).setId(5299), ILet(Id("""func"""), ERef(RefId(Id("""__x0__""")))).setId(5300), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""func"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""func"""))), ENull)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(5302), IReturn(ERef(RefId(Id("""__x1__""")))).setId(5303))).setId(5304), ISeq(List()).setId(5294)).setId(5305), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""func"""))))).setId(5307), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(5308), IReturn(ERef(RefId(Id("""__x3__""")))).setId(5309))).setId(5310), ISeq(List()).setId(5294)).setId(5311), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""func"""))))).setId(5313), IReturn(ERef(RefId(Id("""__x4__""")))).setId(5314))).setId(-1))
  /* Beautified form:
  "GetMethod" (V, P) => {
    app __x0__ = (GetV V P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let func = __x0__
    if (|| (= func undefined) (= func null)) {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    } else {}
    app __x2__ = (IsCallable func)
    if (= __x2__ false) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion func)
    return __x4__
  }
  */
}
