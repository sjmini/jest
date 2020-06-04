package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseBlock1VarScopedDeclarations3 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock1VarScopedDeclarations3""", List(Id("""this"""), Id("""CaseClauses0"""), Id("""DefaultClause"""), Id("""CaseClauses1""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses0"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses0"""))), EStr("""VarScopedDeclarations""")).setId(35285), ILet(Id("""declarations"""), ERef(RefId(Id("""__x0__""")))).setId(35286))).setId(35287), ILet(Id("""declarations"""), EList(List())).setId(35288)).setId(35290), IAccess(Id("""__x1__"""), ERef(RefId(Id("""DefaultClause"""))), EStr("""VarScopedDeclarations""")).setId(35292), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(35294), ILet(Id("""__x3__"""), EINum(0L)).setId(35295), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(35296), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""declarations""")))).setId(35293), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(35297))).setId(35298)).setId(35299), IIf(EBOp(OEq, ERef(RefId(Id("""CaseClauses1"""))), EAbsent), IReturn(ERef(RefId(Id("""declarations""")))).setId(35302), ISeq(List()).setId(35304)).setId(35305), IExpr(ENotSupported("""Etc""")).setId(35307))).setId(-1))
  /* Beautified form:
  "CaseBlock1VarScopedDeclarations3" (this, CaseClauses0, DefaultClause, CaseClauses1) => {
    if (! (= CaseClauses0 absent)) {
      access __x0__ = (CaseClauses0 "VarScopedDeclarations")
      let declarations = __x0__
    } else let declarations = (new [])
    access __x1__ = (DefaultClause "VarScopedDeclarations")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> declarations
      __x3__ = (+ __x3__ 1i)
    }
    if (= CaseClauses1 absent) return declarations else {}
    !!! "Etc"
  }
  */
}
