package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Declaration2DeclarationPart0 extends Algorithm {
  val name: String = "Declaration2DeclarationPart0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Declaration2DeclarationPart0" (this, LexicalDeclaration) => return LexicalDeclaration"""), this)
}
