package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object CaseClause0LexicallyDeclaredNames1 extends Algorithm {
  val name: String = "CaseClause0LexicallyDeclaredNames1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CaseClause0LexicallyDeclaredNames1" (this, Expression, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "LexicallyDeclaredNames")
      return __x0__
    } else {}
    return (new [])
  }"""), this)
}
