package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToLength {
  val length: Int = 1
  val func: Func = Func("""ToLength""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""argument"""))))).setId(3100), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(3101), IReturn(ERef(RefId(Id("""__x0__""")))).setId(3102)).setId(3103), ISeq(List()).setId(3104)).setId(3105), ILet(Id("""len"""), ERef(RefId(Id("""__x0__""")))).setId(3106), IIf(EUOp(ONot, EBOp(OLt, EINum(0L), ERef(RefId(Id("""len"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EINum(0L))).setId(3108), IReturn(ERef(RefId(Id("""__x1__""")))).setId(3109))).setId(3110), ISeq(List()).setId(3104)).setId(3111), IApp(Id("""__x2__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""len"""))), EBOp(OSub, EINum(9007199254740992L), EINum(1L)))).setId(3113), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(3114), IReturn(ERef(RefId(Id("""__x3__""")))).setId(3115))).setId(-1))
  /* Beautified form:
  "ToLength" (argument) => {
    app __x0__ = (ToInteger argument)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let len = __x0__
    if (! (< 0i len)) {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    } else {}
    app __x2__ = (min len (- 9007199254740992i 1i))
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
