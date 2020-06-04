package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement1VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement1VarScopedDeclarations0""", List(Id("""this"""), Id("""Block"""), Id("""Finally""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""VarScopedDeclarations""")).setId(37262), ILet(Id("""declarations"""), ERef(RefId(Id("""__x0__""")))).setId(37263), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Finally"""))), EStr("""VarScopedDeclarations""")).setId(37265), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(37267), ILet(Id("""__x3__"""), EINum(0L)).setId(37268), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(37269), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""declarations""")))).setId(37266), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(37270))).setId(37271)).setId(37272), IReturn(ERef(RefId(Id("""declarations""")))).setId(37275))).setId(-1))
  /* Beautified form:
  "TryStatement1VarScopedDeclarations0" (this, Block, Finally) => {
    access __x0__ = (Block "VarScopedDeclarations")
    let declarations = __x0__
    access __x1__ = (Finally "VarScopedDeclarations")
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
