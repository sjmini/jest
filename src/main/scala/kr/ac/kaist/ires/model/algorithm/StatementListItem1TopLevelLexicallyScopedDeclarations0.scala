package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem1TopLevelLexicallyScopedDeclarations0 extends Algorithm {
  val name: String = "StatementListItem1TopLevelLexicallyScopedDeclarations0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""StatementListItem1TopLevelLexicallyScopedDeclarations0" (this, Declaration) => {
    if (is-instance-of Declaration Declaration0) {
      access HoistableDeclaration = (Declaration "HoistableDeclaration")
      return (new [])
    } else {}
    return (new [Declaration])
  }"""), this)
}
