package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObjectDOTprototypeDOTpropertyIsEnumerable {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Object.prototype.propertyIsEnumerable""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(65754), ILet(Id("""V"""), ERef(RefId(Id("""__x0__""")))).setId(65755), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToPropertyKey"""))), List(ERef(RefId(Id("""V"""))))).setId(65757), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(65758), IReturn(ERef(RefId(Id("""__x1__""")))).setId(65759)).setId(65760), ISeq(List()).setId(65761)).setId(65762), ILet(Id("""P"""), ERef(RefId(Id("""__x1__""")))).setId(65763), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(65765), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(65766), IReturn(ERef(RefId(Id("""__x2__""")))).setId(65767)).setId(65768), ISeq(List()).setId(65761)).setId(65769), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(65770), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(65772), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(65773), IReturn(ERef(RefId(Id("""__x3__""")))).setId(65774)).setId(65775), ISeq(List()).setId(65761)).setId(65776), ILet(Id("""desc"""), ERef(RefId(Id("""__x3__""")))).setId(65777), IIf(EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(65779), IReturn(ERef(RefId(Id("""__x4__""")))).setId(65780))).setId(65781), ISeq(List()).setId(65761)).setId(65782), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""desc""")), EStr("""Enumerable"""))))).setId(65784), IReturn(ERef(RefId(Id("""__x5__""")))).setId(65785))).setId(-1))
  /* Beautified form:
  "GLOBAL.Object.prototype.propertyIsEnumerable" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let V = __x0__
    app __x1__ = (ToPropertyKey V)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let P = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (O["GetOwnProperty"] O P)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let desc = __x3__
    if (= desc undefined) {
      app __x4__ = (WrapCompletion false)
      return __x4__
    } else {}
    app __x5__ = (WrapCompletion desc["Enumerable"])
    return __x5__
  }
  */
}
