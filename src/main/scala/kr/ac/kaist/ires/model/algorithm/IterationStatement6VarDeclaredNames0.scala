package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement6VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement6VarDeclaredNames0""", List(Id("""this"""), Id("""ForBinding"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ForBinding"""))), EStr("""BoundNames""")).setId(32169), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(32170), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")).setId(32172), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(32174), ILet(Id("""__x3__"""), EINum(0L)).setId(32175), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(32176), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(32173), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(32177))).setId(32178)).setId(32179), IReturn(ERef(RefId(Id("""names""")))).setId(32182))).setId(-1))
  /* Beautified form:
  "IterationStatement6VarDeclaredNames0" (this, ForBinding, Expression, Statement) => {
    access __x0__ = (ForBinding "BoundNames")
    let names = __x0__
    access __x1__ = (Statement "VarDeclaredNames")
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
