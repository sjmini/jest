package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem1TopLevelLexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem1TopLevelLexicallyDeclaredNames0""", List(Id("""this"""), Id("""Declaration""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""Declaration"""))), """Declaration0"""), ISeq(List(IAccess(Id("""HoistableDeclaration"""), ERef(RefId(Id("""Declaration"""))), EStr("""HoistableDeclaration""")).setId(26447), IReturn(EList(List())).setId(26444))).setId(26448), ISeq(List()).setId(26449)).setId(26450), IAccess(Id("""__x0__"""), ERef(RefId(Id("""Declaration"""))), EStr("""BoundNames""")).setId(26451), IReturn(ERef(RefId(Id("""__x0__""")))).setId(26452))).setId(-1))
  /* Beautified form:
  "StatementListItem1TopLevelLexicallyDeclaredNames0" (this, Declaration) => {
    if (is-instance-of Declaration Declaration0) {
      access HoistableDeclaration = (Declaration "HoistableDeclaration")
      return (new [])
    } else {}
    access __x0__ = (Declaration "BoundNames")
    return __x0__
  }
  */
}
