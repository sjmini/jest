package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Catch0VarScopedDeclarations0 extends Algorithm {
  val name: String = "Catch0VarScopedDeclarations0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Catch0VarScopedDeclarations0" (this, CatchParameter, Block) => {
    access __x0__ = (Block "VarScopedDeclarations")
    return __x0__
  }"""), this)
}
