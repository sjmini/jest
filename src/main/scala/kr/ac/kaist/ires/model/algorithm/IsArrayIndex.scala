package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsArrayIndex {
  val func: Func = parseFunc(""""IsArrayIndex" (P) => {
    app u = (ToUint32 P)
    if (= u 4294967295i) return false else {}
    app s = (ToString u)
    return (= s P)
  }""")
}