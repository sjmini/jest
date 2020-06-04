package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BreakableStatement0ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""BreakableStatement0ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""IterationStatement"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(ILet(Id("""__x0__"""), ECopy(ERef(RefId(Id("""iterationSet"""))))).setId(25757), ILet(Id("""__x1__"""), ERef(RefId(Id("""labelSet""")))).setId(25759), ILet(Id("""__x2__"""), EINum(0L)).setId(25760), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x3__"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(25761), IAppend(ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""__x0__""")))).setId(25758), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(25762))).setId(25763)).setId(25764), ILet(Id("""newIterationSet"""), ERef(RefId(Id("""__x0__""")))).setId(25766), IAccess(Id("""__x4__"""), ERef(RefId(Id("""IterationStatement"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(25768), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""newIterationSet"""))), EList(List()))).setId(25769), IReturn(ERef(RefId(Id("""__x5__""")))).setId(25770))).setId(-1))
  /* Beautified form:
  "BreakableStatement0ContainsUndefinedContinueTarget0" (this, IterationStatement, iterationSet, labelSet) => {
    let __x0__ = (copy-obj iterationSet)
    let __x1__ = labelSet
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let __x3__ = __x1__[__x2__]
      append __x3__ -> __x0__
      __x2__ = (+ __x2__ 1i)
    }
    let newIterationSet = __x0__
    access __x4__ = (IterationStatement "ContainsUndefinedContinueTarget")
    app __x5__ = (__x4__ newIterationSet (new []))
    return __x5__
  }
  */
}
