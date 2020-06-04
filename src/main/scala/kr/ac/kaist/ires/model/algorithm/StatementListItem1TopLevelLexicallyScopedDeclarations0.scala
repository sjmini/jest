package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem1TopLevelLexicallyScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem1TopLevelLexicallyScopedDeclarations0""", List(Id("""this"""), Id("""Declaration""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""Declaration"""))), """Declaration0"""), ISeq(List(IAccess(Id("""HoistableDeclaration"""), ERef(RefId(Id("""Declaration"""))), EStr("""HoistableDeclaration""")).setId(26524), IReturn(EList(List())).setId(26521))).setId(26525), ISeq(List()).setId(26526)).setId(26527), IReturn(EList(List(ERef(RefId(Id("""Declaration""")))))).setId(26528))).setId(-1))
  /* Beautified form:
  "StatementListItem1TopLevelLexicallyScopedDeclarations0" (this, Declaration) => {
    if (is-instance-of Declaration Declaration0) {
      access HoistableDeclaration = (Declaration "HoistableDeclaration")
      return (new [])
    } else {}
    return (new [Declaration])
  }
  */
}
