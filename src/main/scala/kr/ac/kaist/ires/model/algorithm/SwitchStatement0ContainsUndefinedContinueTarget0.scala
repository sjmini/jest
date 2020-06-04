package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SwitchStatement0ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""SwitchStatement0ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""Expression"""), Id("""CaseBlock"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseBlock"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(34630), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(34631), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34632))).setId(-1))
  /* Beautified form:
  "SwitchStatement0ContainsUndefinedContinueTarget0" (this, Expression, CaseBlock, iterationSet, labelSet) => {
    access __x0__ = (CaseBlock "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    return __x1__
  }
  */
}
