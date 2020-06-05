package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassDeclaration1BoundNames0 extends Algorithm {
  val name: String = "ClassDeclaration1BoundNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ClassDeclaration1BoundNames0" (this, ClassTail) => return (new ["*default*"])"""), this)
}
