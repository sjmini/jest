package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryDefineOwnProperty {
  val length: Int = 3
  val func: Func = Func("""OrdinaryDefineOwnProperty""", List(Id("""O"""), Id("""P"""), Id("""Desc""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(49544), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(49545), IReturn(ERef(RefId(Id("""__x0__""")))).setId(49546)).setId(49547), ISeq(List()).setId(49548)).setId(49549), ILet(Id("""current"""), ERef(RefId(Id("""__x0__""")))).setId(49550), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""O"""))))).setId(49552), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(49553), IReturn(ERef(RefId(Id("""__x1__""")))).setId(49554)).setId(49555), ISeq(List()).setId(49548)).setId(49556), ILet(Id("""extensible"""), ERef(RefId(Id("""__x1__""")))).setId(49557), IApp(Id("""__x2__"""), ERef(RefId(Id("""ValidateAndApplyPropertyDescriptor"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""extensible"""))), ERef(RefId(Id("""Desc"""))), ERef(RefId(Id("""current"""))))).setId(49559), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(49560), IReturn(ERef(RefId(Id("""__x3__""")))).setId(49561))).setId(-1))
  /* Beautified form:
  "OrdinaryDefineOwnProperty" (O, P, Desc) => {
    app __x0__ = (O["GetOwnProperty"] O P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let current = __x0__
    app __x1__ = (IsExtensible O)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let extensible = __x1__
    app __x2__ = (ValidateAndApplyPropertyDescriptor O P extensible Desc current)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
