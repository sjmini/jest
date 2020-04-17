package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NumberCOLONCOLONmultiply {
  val func: Func = parseFunc(""""NumberCOLONCOLONmultiply" (x, y) => return (* x y)""")
}
