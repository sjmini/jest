package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementList1LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""StatementList1LexicallyDeclaredNames0""", List(Id("""this"""), Id("""StatementList"""), Id("""StatementListItem""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""LexicallyDeclaredNames""")).setId(26247), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(26248), IAccess(Id("""__x1__"""), ERef(RefId(Id("""StatementListItem"""))), EStr("""LexicallyDeclaredNames""")).setId(26250), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(26252), ILet(Id("""__x3__"""), EINum(0L)).setId(26253), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(26254), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(26251), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(26255))).setId(26256)).setId(26257), IReturn(ERef(RefId(Id("""names""")))).setId(26260))).setId(-1))
  /* Beautified form:
  "StatementList1LexicallyDeclaredNames0" (this, StatementList, StatementListItem) => {
    access __x0__ = (StatementList "LexicallyDeclaredNames")
    let names = __x0__
    access __x1__ = (StatementListItem "LexicallyDeclaredNames")
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
