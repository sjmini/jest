package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SymbolDescriptiveString {
  val length: Int = 1
  val func: Func = Func("""SymbolDescriptiveString""", List(Id("""sym""")), None, ISeq(List(ILet(Id("""desc"""), ERef(RefProp(RefId(Id("""sym""")), EStr("""Description""")))).setId(67845), IIf(EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef), IAssign(RefId(Id("""desc""")), EStr("""""")).setId(67847), ISeq(List()).setId(67844)).setId(67849), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EBOp(OPlus, EStr("""Symbol("""), ERef(RefId(Id("""desc""")))), EStr(""")""")))).setId(67851), IReturn(ERef(RefId(Id("""__x0__""")))).setId(67852))).setId(-1))
  /* Beautified form:
  "SymbolDescriptiveString" (sym) => {
    let desc = sym["Description"]
    if (= desc undefined) desc = "" else {}
    app __x0__ = (WrapCompletion (+ (+ "Symbol(" desc) ")"))
    return __x0__
  }
  */
}
