package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTcharCodeAt {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.charCodeAt""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(70826), ILet(Id("""pos"""), ERef(RefId(Id("""__x0__""")))).setId(70827), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(70829), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(70830), IReturn(ERef(RefId(Id("""__x1__""")))).setId(70831)).setId(70832), ISeq(List()).setId(70833)).setId(70834), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(70835), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(70837), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(70838), IReturn(ERef(RefId(Id("""__x2__""")))).setId(70839)).setId(70840), ISeq(List()).setId(70833)).setId(70841), ILet(Id("""S"""), ERef(RefId(Id("""__x2__""")))).setId(70842), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""pos"""))))).setId(70844), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(70845), IReturn(ERef(RefId(Id("""__x3__""")))).setId(70846)).setId(70847), ISeq(List()).setId(70833)).setId(70848), ILet(Id("""position"""), ERef(RefId(Id("""__x3__""")))).setId(70849), ILet(Id("""size"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))).setId(70851), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""position"""))), EINum(0L)), EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""position"""))), ERef(RefId(Id("""size""")))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENum(Double.NaN))).setId(70853), IReturn(ERef(RefId(Id("""__x4__""")))).setId(70854))).setId(70855), ISeq(List()).setId(70833)).setId(70856), IExpr(ENotSupported("""Etc""")).setId(70858))).setId(-1))
  /* Beautified form:
  "GLOBAL.String.prototype.charCodeAt" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let pos = __x0__
    app __x1__ = (RequireObjectCoercible this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    app __x2__ = (ToString O)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let S = __x2__
    app __x3__ = (ToInteger pos)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let position = __x3__
    let size = S["length"]
    if (|| (< position 0i) (! (< position size))) {
      app __x4__ = (WrapCompletion NaN)
      return __x4__
    } else {}
    !!! "Etc"
  }
  */
}
