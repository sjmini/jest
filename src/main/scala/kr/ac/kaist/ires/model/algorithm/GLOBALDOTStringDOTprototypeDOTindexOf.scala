package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTindexOf {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.indexOf""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(71488), ILet(Id("""searchString"""), ERef(RefId(Id("""__x0__""")))).setId(71489), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(71491), ILet(Id("""position"""), ERef(RefId(Id("""__x1__""")))).setId(71492), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(71494), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(71495), IReturn(ERef(RefId(Id("""__x2__""")))).setId(71496)).setId(71497), ISeq(List()).setId(71498)).setId(71499), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(71500), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(71502), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(71503), IReturn(ERef(RefId(Id("""__x3__""")))).setId(71504)).setId(71505), ISeq(List()).setId(71498)).setId(71506), ILet(Id("""S"""), ERef(RefId(Id("""__x3__""")))).setId(71507), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""searchString"""))))).setId(71509), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(71510), IReturn(ERef(RefId(Id("""__x4__""")))).setId(71511)).setId(71512), ISeq(List()).setId(71498)).setId(71513), ILet(Id("""searchStr"""), ERef(RefId(Id("""__x4__""")))).setId(71514), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""position"""))))).setId(71516), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(71517), IReturn(ERef(RefId(Id("""__x5__""")))).setId(71518)).setId(71519), ISeq(List()).setId(71498)).setId(71520), ILet(Id("""pos"""), ERef(RefId(Id("""__x5__""")))).setId(71521), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))).setId(71523), IApp(Id("""__x6__"""), ERef(RefId(Id("""max"""))), List(ERef(RefId(Id("""pos"""))), EINum(0L))).setId(71525), IApp(Id("""__x7__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""len"""))))).setId(71526), ILet(Id("""start"""), ERef(RefId(Id("""__x7__""")))).setId(71527), ILet(Id("""searchLen"""), ERef(RefProp(RefId(Id("""searchStr""")), EStr("""length""")))).setId(71529), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENotSupported("""NumberOp"""))).setId(71531), IReturn(ERef(RefId(Id("""__x8__""")))).setId(71532))).setId(-1))
  /* Beautified form:
  "GLOBAL.String.prototype.indexOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let searchString = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let position = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (ToString O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let S = __x3__
    app __x4__ = (ToString searchString)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let searchStr = __x4__
    app __x5__ = (ToInteger position)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let pos = __x5__
    let len = S["length"]
    app __x6__ = (max pos 0i)
    app __x7__ = (min __x6__ len)
    let start = __x7__
    let searchLen = searchStr["length"]
    app __x8__ = (WrapCompletion !!! "NumberOp")
    return __x8__
  }
  */
}
