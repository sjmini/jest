package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BreakStatement1ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""BreakStatement1ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelIdentifier"""))), EStr("""StringValue""")).setId(33979), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""labelSet"""))), ERef(RefId(Id("""__x0__"""))))), IReturn(EBool(true)).setId(33980), ISeq(List()).setId(33982)).setId(33983), IReturn(EBool(false)).setId(33985))).setId(-1))
  /* Beautified form:
  "BreakStatement1ContainsUndefinedBreakTarget0" (this, LabelIdentifier, labelSet) => {
    access __x0__ = (LabelIdentifier "StringValue")
    if (! (contains labelSet __x0__)) return true else {}
    return false
  }
  */
}
