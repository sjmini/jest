package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseBlock1VarDeclaredNames3 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock1VarDeclaredNames3""", List(Id("""this"""), Id("""CaseClauses0"""), Id("""DefaultClause"""), Id("""CaseClauses1""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses0"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses0"""))), EStr("""VarDeclaredNames""")).setId(35124), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(35125))).setId(35126), ILet(Id("""names"""), EList(List())).setId(35127)).setId(35129), IAccess(Id("""__x1__"""), ERef(RefId(Id("""DefaultClause"""))), EStr("""VarDeclaredNames""")).setId(35131), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(35133), ILet(Id("""__x3__"""), EINum(0L)).setId(35134), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(35135), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(35132), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(35136))).setId(35137)).setId(35138), IIf(EBOp(OEq, ERef(RefId(Id("""CaseClauses1"""))), EAbsent), IReturn(ERef(RefId(Id("""names""")))).setId(35141), ISeq(List()).setId(35143)).setId(35144), IExpr(ENotSupported("""Etc""")).setId(35146))).setId(-1))
  /* Beautified form:
  "CaseBlock1VarDeclaredNames3" (this, CaseClauses0, DefaultClause, CaseClauses1) => {
    if (! (= CaseClauses0 absent)) {
      access __x0__ = (CaseClauses0 "VarDeclaredNames")
      let names = __x0__
    } else let names = (new [])
    access __x1__ = (DefaultClause "VarDeclaredNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> names
      __x3__ = (+ __x3__ 1i)
    }
    if (= CaseClauses1 absent) return names else {}
    !!! "Etc"
  }
  */
}
