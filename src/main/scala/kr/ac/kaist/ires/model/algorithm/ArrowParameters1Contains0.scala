package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrowParameters1Contains0 {
  val length: Int = 0
  val func: Func = Func("""ArrowParameters1Contains0""", List(Id("""this"""), Id("""CoverParenthesizedExpressionAndArrowParameterList"""), Id("""symbol""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CoverParenthesizedExpressionAndArrowParameterList"""))), EStr("""CoveredFormalsList""")).setId(38723), ILet(Id("""formals"""), ERef(RefId(Id("""__x0__""")))).setId(38724), IAccess(Id("""__x1__"""), ERef(RefId(Id("""formals"""))), EStr("""Contains""")).setId(38726), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(38727), IReturn(ERef(RefId(Id("""__x2__""")))).setId(38728))).setId(-1))
  /* Beautified form:
  "ArrowParameters1Contains0" (this, CoverParenthesizedExpressionAndArrowParameterList, symbol) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredFormalsList")
    let formals = __x0__
    access __x1__ = (formals "Contains")
    app __x2__ = (__x1__ symbol)
    return __x2__
  }
  */
}
