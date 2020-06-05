package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem1LexicallyScopedDeclarations0 extends Algorithm {
  val name: String = "StatementListItem1LexicallyScopedDeclarations0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""StatementListItem1LexicallyScopedDeclarations0" (this, Declaration) => {
    access __x0__ = (Declaration "DeclarationPart")
    return (new [__x0__])
  }"""), this)
}
