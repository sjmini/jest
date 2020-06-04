package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTtoLowerCase {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.String.prototype.toLowerCase""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(74171), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(74172), IReturn(ERef(RefId(Id("""__x0__""")))).setId(74173)).setId(74174), ISeq(List()).setId(74175)).setId(74176), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(74177), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(74179), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(74180), IReturn(ERef(RefId(Id("""__x1__""")))).setId(74181)).setId(74182), ISeq(List()).setId(74175)).setId(74183), ILet(Id("""S"""), ERef(RefId(Id("""__x1__""")))).setId(74184), IExpr(ENotSupported("""Etc""")).setId(74186), IExpr(ENotSupported("""Etc""")).setId(74186), ILet(Id("""L"""), ENotSupported("""StringOp""")).setId(74187), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""L"""))))).setId(74189), IReturn(ERef(RefId(Id("""__x2__""")))).setId(74190))).setId(-1))
  /* Beautified form:
  "GLOBAL.String.prototype.toLowerCase" (this, argumentsList, NewTarget) => {
    app __x0__ = (RequireObjectCoercible this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (ToString O)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let S = __x1__
    !!! "Etc"
    !!! "Etc"
    let L = !!! "StringOp"
    app __x2__ = (WrapCompletion L)
    return __x2__
  }
  */
}
