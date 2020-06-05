package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTDeleteBinding extends Algorithm {
  val name: String = "DeclarativeEnvironmentRecordDOTDeleteBinding"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""DeclarativeEnvironmentRecord.DeleteBinding" (this, N) => {
    let envRec = this
    assert (! (= envRec["SubMap"][N] absent))
    if false {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {}
    delete envRec["SubMap"][N]
    app __x1__ = (WrapCompletion true)
    return __x1__
  }"""), this)
}
