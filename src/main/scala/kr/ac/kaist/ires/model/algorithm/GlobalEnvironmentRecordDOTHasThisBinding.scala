package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GlobalEnvironmentRecordDOTHasThisBinding {
  val length: Int = 0
  val func: Func = Func("""GlobalEnvironmentRecord.HasThisBinding""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(48493), IReturn(ERef(RefId(Id("""__x0__""")))).setId(48494))).setId(-1))
  /* Beautified form:
  "GlobalEnvironmentRecord.HasThisBinding" (this) => {
    app __x0__ = (WrapCompletion true)
    return __x0__
  }
  */
}
