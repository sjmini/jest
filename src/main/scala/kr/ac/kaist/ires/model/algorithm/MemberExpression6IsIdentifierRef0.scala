package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MemberExpression6IsIdentifierRef0 extends Algorithm {
  val name: String = "MemberExpression6IsIdentifierRef0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MemberExpression6IsIdentifierRef0" (this, MemberExpression, Arguments) => return false"""), this)
}
