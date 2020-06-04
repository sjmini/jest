package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrowParameters1IsSimpleParameterList0 {
  val length: Int = 0
  val func: Func = Func("""ArrowParameters1IsSimpleParameterList0""", List(Id("""this"""), Id("""CoverParenthesizedExpressionAndArrowParameterList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CoverParenthesizedExpressionAndArrowParameterList"""))), EStr("""CoveredFormalsList""")).setId(38768), ILet(Id("""formals"""), ERef(RefId(Id("""__x0__""")))).setId(38769), IAccess(Id("""__x1__"""), ERef(RefId(Id("""formals"""))), EStr("""IsSimpleParameterList""")).setId(38771), IReturn(ERef(RefId(Id("""__x1__""")))).setId(38772))).setId(-1))
  /* Beautified form:
  "ArrowParameters1IsSimpleParameterList0" (this, CoverParenthesizedExpressionAndArrowParameterList) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredFormalsList")
    let formals = __x0__
    access __x1__ = (formals "IsSimpleParameterList")
    return __x1__
  }
  */
}
