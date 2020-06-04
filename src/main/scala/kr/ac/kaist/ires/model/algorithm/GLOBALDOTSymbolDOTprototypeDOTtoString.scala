package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTSymbolDOTprototypeDOTtoString {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Symbol.prototype.toString""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""thisSymbolValue"""))), List(ERef(RefId(Id("""this"""))))).setId(67809), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(67810), IReturn(ERef(RefId(Id("""__x0__""")))).setId(67811)).setId(67812), ISeq(List()).setId(67813)).setId(67814), ILet(Id("""sym"""), ERef(RefId(Id("""__x0__""")))).setId(67815), IApp(Id("""__x1__"""), ERef(RefId(Id("""SymbolDescriptiveString"""))), List(ERef(RefId(Id("""sym"""))))).setId(67817), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(67818), IReturn(ERef(RefId(Id("""__x2__""")))).setId(67819))).setId(-1))
  /* Beautified form:
  "GLOBAL.Symbol.prototype.toString" (this, argumentsList, NewTarget) => {
    app __x0__ = (thisSymbolValue this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let sym = __x0__
    app __x1__ = (SymbolDescriptiveString sym)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
