package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement6VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement6VarScopedDeclarations0""", List(Id("""this"""), Id("""ForBinding"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(ILet(Id("""declarations"""), EList(List(ERef(RefId(Id("""ForBinding""")))))).setId(32349), IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(32351), ILet(Id("""__x1__"""), ERef(RefId(Id("""__x0__""")))).setId(32353), ILet(Id("""__x2__"""), EINum(0L)).setId(32354), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x3__"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(32355), IAppend(ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""declarations""")))).setId(32352), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(32356))).setId(32357)).setId(32358), IReturn(ERef(RefId(Id("""declarations""")))).setId(32361))).setId(-1))
  /* Beautified form:
  "IterationStatement6VarScopedDeclarations0" (this, ForBinding, Expression, Statement) => {
    let declarations = (new [ForBinding])
    access __x0__ = (Statement "VarScopedDeclarations")
    let __x1__ = __x0__
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let __x3__ = __x1__[__x2__]
      append __x3__ -> declarations
      __x2__ = (+ __x2__ 1i)
    }
    return declarations
  }
  */
}
