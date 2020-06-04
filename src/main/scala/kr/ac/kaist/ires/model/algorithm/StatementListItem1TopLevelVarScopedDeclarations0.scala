package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem1TopLevelVarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem1TopLevelVarScopedDeclarations0""", List(Id("""this"""), Id("""Declaration""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""Declaration"""))), """Declaration0"""), ISeq(List(IAccess(Id("""HoistableDeclaration"""), ERef(RefId(Id("""Declaration"""))), EStr("""HoistableDeclaration""")).setId(26726), IAccess(Id("""__x0__"""), ERef(RefId(Id("""HoistableDeclaration"""))), EStr("""DeclarationPart""")).setId(26720), ILet(Id("""declaration"""), ERef(RefId(Id("""__x0__""")))).setId(26721), IReturn(EList(List(ERef(RefId(Id("""declaration""")))))).setId(26723))).setId(26727), ISeq(List()).setId(26728)).setId(26729), IReturn(EList(List())).setId(26730))).setId(-1))
  /* Beautified form:
  "StatementListItem1TopLevelVarScopedDeclarations0" (this, Declaration) => {
    if (is-instance-of Declaration Declaration0) {
      access HoistableDeclaration = (Declaration "HoistableDeclaration")
      access __x0__ = (HoistableDeclaration "DeclarationPart")
      let declaration = __x0__
      return (new [declaration])
    } else {}
    return (new [])
  }
  */
}
