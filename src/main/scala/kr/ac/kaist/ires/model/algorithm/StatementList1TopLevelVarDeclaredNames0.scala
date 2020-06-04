package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementList1TopLevelVarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""StatementList1TopLevelVarDeclaredNames0""", List(Id("""this"""), Id("""StatementList"""), Id("""StatementListItem""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""TopLevelVarDeclaredNames""")).setId(26550), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(26551), IAccess(Id("""__x1__"""), ERef(RefId(Id("""StatementListItem"""))), EStr("""TopLevelVarDeclaredNames""")).setId(26553), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(26555), ILet(Id("""__x3__"""), EINum(0L)).setId(26556), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(26557), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(26554), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(26558))).setId(26559)).setId(26560), IReturn(ERef(RefId(Id("""names""")))).setId(26563))).setId(-1))
  /* Beautified form:
  "StatementList1TopLevelVarDeclaredNames0" (this, StatementList, StatementListItem) => {
    access __x0__ = (StatementList "TopLevelVarDeclaredNames")
    let names = __x0__
    access __x1__ = (StatementListItem "TopLevelVarDeclaredNames")
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
