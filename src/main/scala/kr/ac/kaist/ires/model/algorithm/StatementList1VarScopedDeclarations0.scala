package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementList1VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""StatementList1VarScopedDeclarations0""", List(Id("""this"""), Id("""StatementList"""), Id("""StatementListItem""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""VarScopedDeclarations""")).setId(26806), ILet(Id("""declarations"""), ERef(RefId(Id("""__x0__""")))).setId(26807), IAccess(Id("""__x1__"""), ERef(RefId(Id("""StatementListItem"""))), EStr("""VarScopedDeclarations""")).setId(26809), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(26811), ILet(Id("""__x3__"""), EINum(0L)).setId(26812), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(26813), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""declarations""")))).setId(26810), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(26814))).setId(26815)).setId(26816), IReturn(ERef(RefId(Id("""declarations""")))).setId(26819))).setId(-1))
  /* Beautified form:
  "StatementList1VarScopedDeclarations0" (this, StatementList, StatementListItem) => {
    access __x0__ = (StatementList "VarScopedDeclarations")
    let declarations = __x0__
    access __x1__ = (StatementListItem "VarScopedDeclarations")
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
