package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object IterationStatement7VarDeclaredNames0 extends Algorithm {
  val name: String = "IterationStatement7VarDeclaredNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IterationStatement7VarDeclaredNames0" (this, ForDeclaration, Expression, Statement) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }"""), this)
}
