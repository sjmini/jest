package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CoverCallExpressionAndAsyncArrowHead0BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""CoverCallExpressionAndAsyncArrowHead0BoundNames0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Arguments""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""this"""))), EStr("""CoveredAsyncArrowHead""")).setId(44128), ILet(Id("""head"""), ERef(RefId(Id("""__x0__""")))).setId(44129), IAccess(Id("""__x1__"""), ERef(RefId(Id("""head"""))), EStr("""BoundNames""")).setId(44131), IReturn(ERef(RefId(Id("""__x1__""")))).setId(44132))).setId(-1))
  /* Beautified form:
  "CoverCallExpressionAndAsyncArrowHead0BoundNames0" (this, MemberExpression, Arguments) => {
    access __x0__ = (this "CoveredAsyncArrowHead")
    let head = __x0__
    access __x1__ = (head "BoundNames")
    return __x1__
  }
  */
}
