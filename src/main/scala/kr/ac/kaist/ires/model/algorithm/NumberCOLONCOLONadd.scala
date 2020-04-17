package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NumberCOLONCOLONadd {
  val func: Func = parseFunc(""""NumberCOLONCOLONadd" (x, y) => return (+ x y)""")
}
