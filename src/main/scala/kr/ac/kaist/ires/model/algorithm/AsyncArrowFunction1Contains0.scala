package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncArrowFunction1Contains0 {
  val length: Int = 0
  val func: Func = Func("""AsyncArrowFunction1Contains0""", List(Id("""this"""), Id("""CoverCallExpressionAndAsyncArrowHead"""), Id("""AsyncConciseBody"""), Id("""symbol""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """NewTarget"""), EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """SuperProperty""")), EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """SuperCall""")), EBOp(OEq, ERef(RefId(Id("""symbol"""))), EStr("""super"""))), EBOp(OEq, ERef(RefId(Id("""symbol"""))), EStr("""this""")))), IReturn(EBool(false)).setId(44169), ISeq(List()).setId(44171)).setId(44172), IAccess(Id("""__x0__"""), ERef(RefId(Id("""CoverCallExpressionAndAsyncArrowHead"""))), EStr("""CoveredAsyncArrowHead""")).setId(44174), ILet(Id("""head"""), ERef(RefId(Id("""__x0__""")))).setId(44175), IAccess(Id("""__x1__"""), ERef(RefId(Id("""head"""))), EStr("""Contains""")).setId(44177), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(44178), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), IReturn(EBool(true)).setId(44179), ISeq(List()).setId(44171)).setId(44181), IAccess(Id("""__x3__"""), ERef(RefId(Id("""AsyncConciseBody"""))), EStr("""Contains""")).setId(44183), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(44184), IReturn(ERef(RefId(Id("""__x4__""")))).setId(44185))).setId(-1))
  /* Beautified form:
  "AsyncArrowFunction1Contains0" (this, CoverCallExpressionAndAsyncArrowHead, AsyncConciseBody, symbol) => {
    if (! (|| (|| (|| (|| (is-instance-of symbol NewTarget) (is-instance-of symbol SuperProperty)) (is-instance-of symbol SuperCall)) (= symbol "super")) (= symbol "this"))) return false else {}
    access __x0__ = (CoverCallExpressionAndAsyncArrowHead "CoveredAsyncArrowHead")
    let head = __x0__
    access __x1__ = (head "Contains")
    app __x2__ = (__x1__ symbol)
    if (= __x2__ true) return true else {}
    access __x3__ = (AsyncConciseBody "Contains")
    app __x4__ = (__x3__ symbol)
    return __x4__
  }
  */
}
