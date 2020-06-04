package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleEnvironmentRecordDOTGetThisBinding {
  val length: Int = 0
  val func: Func = Func("""ModuleEnvironmentRecord.GetThisBinding""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(49142), IReturn(ERef(RefId(Id("""__x0__""")))).setId(49143))).setId(-1))
  /* Beautified form:
  "ModuleEnvironmentRecord.GetThisBinding" (this) => {
    app __x0__ = (WrapCompletion undefined)
    return __x0__
  }
  */
}
