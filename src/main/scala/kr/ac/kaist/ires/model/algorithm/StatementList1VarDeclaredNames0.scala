package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementList1VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""StatementList1VarDeclaredNames0""", List(Id("""this"""), Id("""StatementList"""), Id("""StatementListItem""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""VarDeclaredNames""")).setId(26756), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(26757), IAccess(Id("""__x1__"""), ERef(RefId(Id("""StatementListItem"""))), EStr("""VarDeclaredNames""")).setId(26759), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(26761), ILet(Id("""__x3__"""), EINum(0L)).setId(26762), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(26763), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(26760), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(26764))).setId(26765)).setId(26766), IReturn(ERef(RefId(Id("""names""")))).setId(26769))).setId(-1))
  /* Beautified form:
  "StatementList1VarDeclaredNames0" (this, StatementList, StatementListItem) => {
    access __x0__ = (StatementList "VarDeclaredNames")
    let names = __x0__
    access __x1__ = (StatementListItem "VarDeclaredNames")
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
