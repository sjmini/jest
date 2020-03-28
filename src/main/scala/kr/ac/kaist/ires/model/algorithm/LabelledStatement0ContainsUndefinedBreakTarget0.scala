package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledStatement0ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""LabelledStatement0ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""LabelledItem"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelIdentifier"""))), EStr("""StringValue""")), ILet(Id("""label"""), ERef(RefId(Id("""__x0__""")))), ILet(Id("""__x1__"""), ECopy(ERef(RefId(Id("""labelSet"""))))), IAppend(ERef(RefId(Id("""label"""))), ERef(RefId(Id("""__x1__""")))), ILet(Id("""newLabelSet"""), ERef(RefId(Id("""__x1__""")))), IAccess(Id("""__x2__"""), ERef(RefId(Id("""LabelledItem"""))), EStr("""ContainsUndefinedBreakTarget""")), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""newLabelSet"""))))), IReturn(ERef(RefId(Id("""__x3__""")))))))
  /* Beautified form:
  "LabelledStatement0ContainsUndefinedBreakTarget0" (this, LabelIdentifier, LabelledItem, labelSet) => {
    access __x0__ = (LabelIdentifier "StringValue")
    let label = __x0__
    let __x1__ = (copy-obj labelSet)
    append label -> __x1__
    let newLabelSet = __x1__
    access __x2__ = (LabelledItem "ContainsUndefinedBreakTarget")
    app __x3__ = (__x2__ newLabelSet)
    return __x3__
  }
  */
}