package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTpadEnd {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.padEnd""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(72293), ILet(Id("""maxLength"""), ERef(RefId(Id("""__x0__""")))).setId(72294), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(72296), ILet(Id("""fillString"""), ERef(RefId(Id("""__x1__""")))).setId(72297), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(72299), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(72300), IReturn(ERef(RefId(Id("""__x2__""")))).setId(72301)).setId(72302), ISeq(List()).setId(72303)).setId(72304), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(72305), IApp(Id("""__x3__"""), ERef(RefId(Id("""StringPad"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""maxLength"""))), ERef(RefId(Id("""fillString"""))), EStr("""end"""))).setId(72307), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(72308), IReturn(ERef(RefId(Id("""__x3__""")))).setId(72309)).setId(72310), ISeq(List()).setId(72303)).setId(72311), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(72312), IReturn(ERef(RefId(Id("""__x4__""")))).setId(72313))).setId(-1))
  /* Beautified form:
  "GLOBAL.String.prototype.padEnd" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let maxLength = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let fillString = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (StringPad O maxLength fillString "end")
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
