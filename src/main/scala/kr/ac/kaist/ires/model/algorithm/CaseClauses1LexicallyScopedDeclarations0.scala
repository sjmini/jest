package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClauses1LexicallyScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""CaseClauses1LexicallyScopedDeclarations0""", List(Id("""this"""), Id("""CaseClauses"""), Id("""CaseClause""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses"""))), EStr("""LexicallyScopedDeclarations""")).setId(35023), ILet(Id("""declarations"""), ERef(RefId(Id("""__x0__""")))).setId(35024), IAccess(Id("""__x1__"""), ERef(RefId(Id("""CaseClause"""))), EStr("""LexicallyScopedDeclarations""")).setId(35026), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(35028), ILet(Id("""__x3__"""), EINum(0L)).setId(35029), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(35030), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""declarations""")))).setId(35027), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(35031))).setId(35032)).setId(35033), IReturn(ERef(RefId(Id("""declarations""")))).setId(35036))).setId(-1))
  /* Beautified form:
  "CaseClauses1LexicallyScopedDeclarations0" (this, CaseClauses, CaseClause) => {
    access __x0__ = (CaseClauses "LexicallyScopedDeclarations")
    let declarations = __x0__
    access __x1__ = (CaseClause "LexicallyScopedDeclarations")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> declarations
      __x3__ = (+ __x3__ 1i)
    }
    return declarations
  }
  */
}
