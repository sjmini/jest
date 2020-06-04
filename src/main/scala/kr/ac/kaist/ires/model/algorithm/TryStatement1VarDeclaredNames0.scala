package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement1VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement1VarDeclaredNames0""", List(Id("""this"""), Id("""Block"""), Id("""Finally""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""VarDeclaredNames""")).setId(37106), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(37107), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Finally"""))), EStr("""VarDeclaredNames""")).setId(37109), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(37111), ILet(Id("""__x3__"""), EINum(0L)).setId(37112), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(37113), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(37110), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(37114))).setId(37115)).setId(37116), IReturn(ERef(RefId(Id("""names""")))).setId(37119))).setId(-1))
  /* Beautified form:
  "TryStatement1VarDeclaredNames0" (this, Block, Finally) => {
    access __x0__ = (Block "VarDeclaredNames")
    let names = __x0__
    access __x1__ = (Finally "VarDeclaredNames")
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
