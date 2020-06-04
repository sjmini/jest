package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTHasThisBinding {
  val length: Int = 0
  val func: Func = Func("""DeclarativeEnvironmentRecord.HasThisBinding""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(47364), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47365))).setId(-1))
  /* Beautified form:
  "DeclarativeEnvironmentRecord.HasThisBinding" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
