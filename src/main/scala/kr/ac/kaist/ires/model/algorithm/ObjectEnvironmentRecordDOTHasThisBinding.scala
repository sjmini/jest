package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectEnvironmentRecordDOTHasThisBinding {
  val length: Int = 0
  val func: Func = Func("""ObjectEnvironmentRecord.HasThisBinding""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(47785), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47786))).setId(-1))
  /* Beautified form:
  "ObjectEnvironmentRecord.HasThisBinding" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
