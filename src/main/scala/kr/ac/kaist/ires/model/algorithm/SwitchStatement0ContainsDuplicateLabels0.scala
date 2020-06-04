package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SwitchStatement0ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""SwitchStatement0ContainsDuplicateLabels0""", List(Id("""this"""), Id("""Expression"""), Id("""CaseBlock"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseBlock"""))), EStr("""ContainsDuplicateLabels""")).setId(34276), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34277), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34278))).setId(-1))
  /* Beautified form:
  "SwitchStatement0ContainsDuplicateLabels0" (this, Expression, CaseBlock, labelSet) => {
    access __x0__ = (CaseBlock "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
