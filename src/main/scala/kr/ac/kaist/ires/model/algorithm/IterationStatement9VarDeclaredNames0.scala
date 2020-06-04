package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement9VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement9VarDeclaredNames0""", List(Id("""this"""), Id("""ForBinding"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ForBinding"""))), EStr("""BoundNames""")).setId(32239), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(32240), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")).setId(32242), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(32244), ILet(Id("""__x3__"""), EINum(0L)).setId(32245), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(32246), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(32243), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(32247))).setId(32248)).setId(32249), IReturn(ERef(RefId(Id("""names""")))).setId(32252))).setId(-1))
  /* Beautified form:
  "IterationStatement9VarDeclaredNames0" (this, ForBinding, AssignmentExpression, Statement) => {
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
