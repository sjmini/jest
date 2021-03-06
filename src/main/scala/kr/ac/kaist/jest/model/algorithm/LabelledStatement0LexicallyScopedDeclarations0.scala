package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object LabelledStatement0LexicallyScopedDeclarations0 extends Algorithm {
  val name: String = "LabelledStatement0LexicallyScopedDeclarations0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LabelledStatement0LexicallyScopedDeclarations0" (this, LabelIdentifier, LabelledItem) => {
    access __x0__ = (LabelledItem "LexicallyScopedDeclarations")
    return __x0__
  }"""), this)
}
