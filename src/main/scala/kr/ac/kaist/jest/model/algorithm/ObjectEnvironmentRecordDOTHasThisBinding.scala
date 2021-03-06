package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ObjectEnvironmentRecordDOTHasThisBinding extends Algorithm {
  val name: String = "ObjectEnvironmentRecordDOTHasThisBinding"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ObjectEnvironmentRecord.HasThisBinding" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}
