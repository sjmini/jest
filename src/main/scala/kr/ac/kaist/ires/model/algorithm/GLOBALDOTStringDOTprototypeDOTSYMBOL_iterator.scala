package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTSYMBOL_iterator {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.String.prototype.SYMBOL_iterator""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(74459), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(74460), IReturn(ERef(RefId(Id("""__x0__""")))).setId(74461)).setId(74462), ISeq(List()).setId(74463)).setId(74464), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(74465), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(74467), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(74468), IReturn(ERef(RefId(Id("""__x1__""")))).setId(74469)).setId(74470), ISeq(List()).setId(74463)).setId(74471), ILet(Id("""S"""), ERef(RefId(Id("""__x1__""")))).setId(74472), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateStringIterator"""))), List(ERef(RefId(Id("""S"""))))).setId(74474), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(74475), IReturn(ERef(RefId(Id("""__x3__""")))).setId(74476))).setId(-1))
  /* Beautified form:
  "GLOBAL.String.prototype.SYMBOL_iterator" (this, argumentsList, NewTarget) => {
    app __x0__ = (RequireObjectCoercible this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (ToString O)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let S = __x1__
    app __x2__ = (CreateStringIterator S)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
