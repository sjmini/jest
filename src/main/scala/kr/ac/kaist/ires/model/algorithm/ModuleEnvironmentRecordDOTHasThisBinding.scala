package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleEnvironmentRecordDOTHasThisBinding {
  val length: Int = 0
  val func: Func = Func("""ModuleEnvironmentRecord.HasThisBinding""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(49132), IReturn(ERef(RefId(Id("""__x0__""")))).setId(49133))).setId(-1))
  /* Beautified form:
  "ModuleEnvironmentRecord.HasThisBinding" (this) => {
    app __x0__ = (WrapCompletion true)
    return __x0__
  }
  */
}
