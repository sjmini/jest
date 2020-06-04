package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClauses1VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""CaseClauses1VarDeclaredNames0""", List(Id("""this"""), Id("""CaseClauses"""), Id("""CaseClause""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses"""))), EStr("""VarDeclaredNames""")).setId(35184), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(35185), IAccess(Id("""__x1__"""), ERef(RefId(Id("""CaseClause"""))), EStr("""VarDeclaredNames""")).setId(35187), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(35189), ILet(Id("""__x3__"""), EINum(0L)).setId(35190), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(35191), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(35188), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(35192))).setId(35193)).setId(35194), IReturn(ERef(RefId(Id("""names""")))).setId(35197))).setId(-1))
  /* Beautified form:
  "CaseClauses1VarDeclaredNames0" (this, CaseClauses, CaseClause) => {
    access __x0__ = (CaseClauses "VarDeclaredNames")
    let names = __x0__
    access __x1__ = (CaseClause "VarDeclaredNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> names
      __x3__ = (+ __x3__ 1i)
    }
    return names
  }
  */
}
