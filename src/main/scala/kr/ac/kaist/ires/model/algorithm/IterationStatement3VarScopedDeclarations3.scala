package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement3VarScopedDeclarations3 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement3VarScopedDeclarations3""", List(Id("""this"""), Id("""VariableDeclarationList"""), Id("""Expression0"""), Id("""Expression1"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""VariableDeclarationList"""))), EStr("""VarScopedDeclarations""")).setId(31105), ILet(Id("""declarations"""), ERef(RefId(Id("""__x0__""")))).setId(31106), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(31108), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(31110), ILet(Id("""__x3__"""), EINum(0L)).setId(31111), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(31112), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""declarations""")))).setId(31109), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(31113))).setId(31114)).setId(31115), IReturn(ERef(RefId(Id("""declarations""")))).setId(31118))).setId(-1))
  /* Beautified form:
  "IterationStatement3VarScopedDeclarations3" (this, VariableDeclarationList, Expression0, Expression1, Statement) => {
    access __x0__ = (VariableDeclarationList "VarScopedDeclarations")
    let declarations = __x0__
    access __x1__ = (Statement "VarScopedDeclarations")
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
