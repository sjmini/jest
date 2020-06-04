package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayLiteral0Evaluation1 {
  val length: Int = 0
  val func: Func = Func("""ArrayLiteral0Evaluation1""", List(Id("""this"""), Id("""Elision""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ArrayCreate"""))), List(EINum(0L))).setId(14178), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(14179), IReturn(ERef(RefId(Id("""__x0__""")))).setId(14180)).setId(14181), ISeq(List()).setId(14182)).setId(14183), ILet(Id("""array"""), ERef(RefId(Id("""__x0__""")))).setId(14184), IIf(EBOp(OEq, ERef(RefId(Id("""Elision"""))), EAbsent), ILet(Id("""pad"""), EINum(0L)).setId(14187), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""Elision"""))), EStr("""ElisionWidth""")).setId(14186), ILet(Id("""pad"""), ERef(RefId(Id("""__x1__""")))).setId(14189))).setId(14190)).setId(14191), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""pad"""))))).setId(14193), IApp(Id("""__x3__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""array"""))), EStr("""length"""), ERef(RefId(Id("""__x2__"""))), EBool(false))).setId(14194), IExpr(ERef(RefId(Id("""__x3__""")))).setId(14195), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""array"""))))).setId(14197), IReturn(ERef(RefId(Id("""__x4__""")))).setId(14198))).setId(-1))
  /* Beautified form:
  "ArrayLiteral0Evaluation1" (this, Elision) => {
    app __x0__ = (ArrayCreate 0i)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let array = __x0__
    if (= Elision absent) let pad = 0i else {
      access __x1__ = (Elision "ElisionWidth")
      let pad = __x1__
    }
    app __x2__ = (ToUint32 pad)
    app __x3__ = (Set array "length" __x2__ false)
    __x3__
    app __x4__ = (WrapCompletion array)
    return __x4__
  }
  */
}
