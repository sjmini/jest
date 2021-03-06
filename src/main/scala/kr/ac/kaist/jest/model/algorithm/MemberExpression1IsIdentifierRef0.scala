package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object MemberExpression1IsIdentifierRef0 extends Algorithm {
  val name: String = "MemberExpression1IsIdentifierRef0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MemberExpression1IsIdentifierRef0" (this, MemberExpression, Expression) => return false"""), this)
}
