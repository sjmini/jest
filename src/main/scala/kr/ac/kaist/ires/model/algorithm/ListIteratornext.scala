package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ListIteratornext {
  val length: Int = 0
  val func: Func = Func("""ListIteratornext""", List(Id("""this""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))).setId(7813), ILet(Id("""list"""), ERef(RefProp(RefId(Id("""O""")), EStr("""IteratedList""")))).setId(7816), ILet(Id("""index"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ListIteratorNextIndex""")))).setId(7818), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""list""")), EStr("""length""")))).setId(7820), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""len"""))))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))).setId(7822), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(7823), IReturn(ERef(RefId(Id("""__x1__""")))).setId(7824))).setId(7826), ISeq(List()).setId(7815)).setId(7827), IAssign(RefProp(RefId(Id("""O""")), EStr("""ListIteratorNextIndex""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))).setId(7829), IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefProp(RefId(Id("""list""")), ERef(RefId(Id("""index"""))))), EBool(false))).setId(7831), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(7832), IReturn(ERef(RefId(Id("""__x3__""")))).setId(7833))).setId(-1))
  /* Beautified form:
  "ListIteratornext" (this) => {
    let O = this
    let list = O["IteratedList"]
    let index = O["ListIteratorNextIndex"]
    let len = list["length"]
    if (! (< index len)) {
      app __x0__ = (CreateIterResultObject undefined true)
      app __x1__ = (WrapCompletion __x0__)
      return __x1__
    } else {}
    O["ListIteratorNextIndex"] = (+ index 1i)
    app __x2__ = (CreateIterResultObject list[index] false)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
