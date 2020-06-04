package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumberDOTisSafeInteger {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Number.isSafeInteger""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(69067), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))).setId(69068), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsInteger"""))), List(ERef(RefId(Id("""number"""))))).setId(69070), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(69071), IReturn(ERef(RefId(Id("""__x1__""")))).setId(69072)).setId(69073), ISeq(List()).setId(69074)).setId(69075), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""abs"""))), List(ERef(RefId(Id("""number"""))))).setId(69076), IIf(EUOp(ONot, EBOp(OLt, EBOp(OSub, EINum(9007199254740992L), EINum(1L)), ERef(RefId(Id("""__x2__"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(69077), IReturn(ERef(RefId(Id("""__x3__""")))).setId(69078))).setId(69079), ISeq(List()).setId(69074)).setId(69080))).setId(69082), ISeq(List()).setId(69074)).setId(69083), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(69085), IReturn(ERef(RefId(Id("""__x4__""")))).setId(69086))).setId(-1))
  /* Beautified form:
  "GLOBAL.Number.isSafeInteger" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let number = __x0__
    app __x1__ = (IsInteger number)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    if (= __x1__ true) {
      app __x2__ = (abs number)
      if (! (< (- 9007199254740992i 1i) __x2__)) {
        app __x3__ = (WrapCompletion true)
        return __x3__
      } else {}
    } else {}
    app __x4__ = (WrapCompletion false)
    return __x4__
  }
  */
}
