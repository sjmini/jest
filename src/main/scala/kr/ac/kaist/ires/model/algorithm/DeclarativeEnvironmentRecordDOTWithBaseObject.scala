package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTWithBaseObject {
  val length: Int = 0
  val func: Func = Func("""DeclarativeEnvironmentRecord.WithBaseObject""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(47384), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47385))).setId(-1))
  /* Beautified form:
  "DeclarativeEnvironmentRecord.WithBaseObject" (this) => {
    app __x0__ = (WrapCompletion undefined)
    return __x0__
  }
  */
}
