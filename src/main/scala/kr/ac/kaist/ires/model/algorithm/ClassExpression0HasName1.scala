package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassExpression0HasName1 extends Algorithm {
  val name: String = "ClassExpression0HasName1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ClassExpression0HasName1" (this, BindingIdentifier, ClassTail) => return true"""), this)
}
