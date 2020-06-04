package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement5ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement5ContainsDuplicateLabels0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsDuplicateLabels""")).setId(31788), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(31789), IReturn(ERef(RefId(Id("""__x1__""")))).setId(31790))).setId(-1))
  /* Beautified form:
  "IterationStatement5ContainsDuplicateLabels0" (this, LeftHandSideExpression, Expression, Statement, labelSet) => {
    access __x0__ = (Statement "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
