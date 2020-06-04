package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTlocaleCompare {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.localeCompare""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(71773), ILet(Id("""that"""), ERef(RefId(Id("""__x0__""")))).setId(71774), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(71776), ILet(Id("""reserved1"""), ERef(RefId(Id("""__x1__""")))).setId(71777), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(2L))).setId(71779), ILet(Id("""reserved2"""), ERef(RefId(Id("""__x2__""")))).setId(71780), IApp(Id("""__x3__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(71782), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(71783), IReturn(ERef(RefId(Id("""__x3__""")))).setId(71784)).setId(71785), ISeq(List()).setId(71786)).setId(71787), ILet(Id("""O"""), ERef(RefId(Id("""__x3__""")))).setId(71788), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(71790), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(71791), IReturn(ERef(RefId(Id("""__x4__""")))).setId(71792)).setId(71793), ISeq(List()).setId(71786)).setId(71794), ILet(Id("""S"""), ERef(RefId(Id("""__x4__""")))).setId(71795), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""that"""))))).setId(71797), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(71798), IReturn(ERef(RefId(Id("""__x5__""")))).setId(71799)).setId(71800), ISeq(List()).setId(71786)).setId(71801), ILet(Id("""That"""), ERef(RefId(Id("""__x5__""")))).setId(71802))).setId(-1))
  /* Beautified form:
  "GLOBAL.String.prototype.localeCompare" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let that = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let reserved1 = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let reserved2 = __x2__
    app __x3__ = (RequireObjectCoercible this)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let O = __x3__
    app __x4__ = (ToString O)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let S = __x4__
    app __x5__ = (ToString that)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let That = __x5__
  }
  */
}
