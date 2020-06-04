package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTflat {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Array.prototype.flat""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(77931), ILet(Id("""depth"""), ERef(RefId(Id("""__x0__""")))).setId(77932), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(77934), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(77935), IReturn(ERef(RefId(Id("""__x1__""")))).setId(77936)).setId(77937), ISeq(List()).setId(77938)).setId(77939), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(77940), IApp(Id("""__x2__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(77942), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(77943), IReturn(ERef(RefId(Id("""__x2__""")))).setId(77944)).setId(77945), ISeq(List()).setId(77938)).setId(77946), ILet(Id("""sourceLen"""), ERef(RefId(Id("""__x2__""")))).setId(77947), ILet(Id("""depthNum"""), EINum(1L)).setId(77949), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""depth"""))), EUndef)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""depth"""))))).setId(77951), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(77952), IReturn(ERef(RefId(Id("""__x3__""")))).setId(77953)).setId(77954), ISeq(List()).setId(77938)).setId(77955), IAssign(RefId(Id("""depthNum""")), ERef(RefId(Id("""__x3__""")))).setId(77956))).setId(77958), ISeq(List()).setId(77938)).setId(77959), IApp(Id("""__x4__"""), ERef(RefId(Id("""ArraySpeciesCreate"""))), List(ERef(RefId(Id("""O"""))), EINum(0L))).setId(77961), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(77962), IReturn(ERef(RefId(Id("""__x4__""")))).setId(77963)).setId(77964), ISeq(List()).setId(77938)).setId(77965), ILet(Id("""A"""), ERef(RefId(Id("""__x4__""")))).setId(77966), IApp(Id("""__x5__"""), ERef(RefId(Id("""FlattenIntoArray"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""O"""))), ERef(RefId(Id("""sourceLen"""))), EINum(0L), ERef(RefId(Id("""depthNum"""))))).setId(77968), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(77969), IReturn(ERef(RefId(Id("""__x5__""")))).setId(77970)).setId(77971), ISeq(List()).setId(77938)).setId(77972), IExpr(ERef(RefId(Id("""__x5__""")))).setId(77973), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(77975), IReturn(ERef(RefId(Id("""__x6__""")))).setId(77976))).setId(-1))
  /* Beautified form:
  "GLOBAL.Array.prototype.flat" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let depth = __x0__
    app __x1__ = (ToObject this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    app __x2__ = (LengthOfArrayLike O)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let sourceLen = __x2__
    let depthNum = 1i
    if (! (= depth undefined)) {
      app __x3__ = (ToInteger depth)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      depthNum = __x3__
    } else {}
    app __x4__ = (ArraySpeciesCreate O 0i)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let A = __x4__
    app __x5__ = (FlattenIntoArray A O sourceLen 0i depthNum)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    app __x6__ = (WrapCompletion A)
    return __x6__
  }
  */
}
