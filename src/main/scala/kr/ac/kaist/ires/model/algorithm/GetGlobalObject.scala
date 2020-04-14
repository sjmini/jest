package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetGlobalObject {
  val length: Int = 0
  val func: Func = parseFunc(""""GetGlobalObject" () => {
    let currentRealm = REALM
    app __x0__ = (WrapCompletion currentRealm["GlobalObject"])
    return __x0__
  }""")
}
