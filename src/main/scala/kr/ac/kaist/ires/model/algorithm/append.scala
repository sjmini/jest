package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object append extends Algorithm {
  val name: String = "append"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""append" (x, y) => {
    let k = 0i
    while (< k y.length) {
      append y[k] -> x
      k = (+ k 1i)
    }
  }"""), this)
}
