package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTgetSymbolDOTprototypeDOTdescription {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.getSymbol.prototype.description""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""s"""), ERef(RefId(Id("""this""")))).setId(67773), IApp(Id("""__x0__"""), ERef(RefId(Id("""thisSymbolValue"""))), List(ERef(RefId(Id("""s"""))))).setId(67775), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(67776), IReturn(ERef(RefId(Id("""__x0__""")))).setId(67777)).setId(67778), ISeq(List()).setId(67779)).setId(67780), ILet(Id("""sym"""), ERef(RefId(Id("""__x0__""")))).setId(67781), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""sym""")), EStr("""Description"""))))).setId(67783), IReturn(ERef(RefId(Id("""__x1__""")))).setId(67784))).setId(-1))
  /* Beautified form:
  "GLOBAL.getSymbol.prototype.description" (this, argumentsList, NewTarget) => {
    let s = this
    app __x0__ = (thisSymbolValue s)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let sym = __x0__
    app __x1__ = (WrapCompletion sym["Description"])
    return __x1__
  }
  */
}
