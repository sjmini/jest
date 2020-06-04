package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeletePropertyOrThrow {
  val length: Int = 2
  val func: Func = Func("""DeletePropertyOrThrow""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Delete"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(5248), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(5249), IReturn(ERef(RefId(Id("""__x0__""")))).setId(5250)).setId(5251), ISeq(List()).setId(5247)).setId(5252), ILet(Id("""success"""), ERef(RefId(Id("""__x0__""")))).setId(5253), IIf(EBOp(OEq, ERef(RefId(Id("""success"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(5255), IReturn(ERef(RefId(Id("""__x1__""")))).setId(5256))).setId(5257), ISeq(List()).setId(5247)).setId(5258), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""success"""))))).setId(5260), IReturn(ERef(RefId(Id("""__x2__""")))).setId(5261))).setId(-1))
  /* Beautified form:
  "DeletePropertyOrThrow" (O, P) => {
    app __x0__ = (O["Delete"] O P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let success = __x0__
    if (= success false) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (WrapCompletion success)
    return __x2__
  }
  */
}
