package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTdecodeURIComponent {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.decodeURIComponent""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(63458), ILet(Id("""encodedURIComponent"""), ERef(RefId(Id("""__x0__""")))).setId(63459), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""encodedURIComponent"""))))).setId(63461), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(63462), IReturn(ERef(RefId(Id("""__x1__""")))).setId(63463)).setId(63464), ISeq(List()).setId(63465)).setId(63466), ILet(Id("""componentString"""), ERef(RefId(Id("""__x1__""")))).setId(63467), ILet(Id("""reservedURIComponentSet"""), EStr("""""")).setId(63469), IApp(Id("""__x2__"""), ERef(RefId(Id("""Decode"""))), List(ERef(RefId(Id("""componentString"""))), ERef(RefId(Id("""reservedURIComponentSet"""))))).setId(63471), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(63472), IReturn(ERef(RefId(Id("""__x2__""")))).setId(63473)).setId(63474), ISeq(List()).setId(63465)).setId(63475), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(63476), IReturn(ERef(RefId(Id("""__x3__""")))).setId(63477))).setId(-1))
  /* Beautified form:
  "GLOBAL.decodeURIComponent" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let encodedURIComponent = __x0__
    app __x1__ = (ToString encodedURIComponent)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let componentString = __x1__
    let reservedURIComponentSet = ""
    app __x2__ = (Decode componentString reservedURIComponentSet)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
