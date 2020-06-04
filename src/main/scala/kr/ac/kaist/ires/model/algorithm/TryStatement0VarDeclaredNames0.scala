package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement0VarDeclaredNames0""", List(Id("""this"""), Id("""Block"""), Id("""Catch""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""VarDeclaredNames""")).setId(37066), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(37067), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Catch"""))), EStr("""VarDeclaredNames""")).setId(37069), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(37071), ILet(Id("""__x3__"""), EINum(0L)).setId(37072), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(37073), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(37070), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(37074))).setId(37075)).setId(37076), IReturn(ERef(RefId(Id("""names""")))).setId(37079))).setId(-1))
  /* Beautified form:
  "TryStatement0VarDeclaredNames0" (this, Block, Catch) => {
    access __x0__ = (Block "VarDeclaredNames")
    let names = __x0__
    access __x1__ = (Catch "VarDeclaredNames")
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
