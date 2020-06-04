package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObjectDOTdefineProperties {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.Object.defineProperties""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(63851), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(63852), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(63854), ILet(Id("""Properties"""), ERef(RefId(Id("""__x1__""")))).setId(63855), IApp(Id("""__x2__"""), ERef(RefId(Id("""ObjectDefineProperties"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Properties"""))))).setId(63857), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(63858), IReturn(ERef(RefId(Id("""__x2__""")))).setId(63859)).setId(63860), ISeq(List()).setId(63861)).setId(63862), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(63863), IReturn(ERef(RefId(Id("""__x3__""")))).setId(63864))).setId(-1))
  /* Beautified form:
  "GLOBAL.Object.defineProperties" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let Properties = __x1__
    app __x2__ = (ObjectDefineProperties O Properties)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
