package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement1ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement1ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(30882), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(30883), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30884))).setId(-1))
  /* Beautified form:
  "IterationStatement1ContainsUndefinedContinueTarget0" (this, Expression, Statement, iterationSet, labelSet) => {
    access __x0__ = (Statement "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    return __x1__
  }
  */
}
