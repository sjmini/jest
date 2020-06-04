package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem0TopLevelVarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem0TopLevelVarDeclaredNames0""", List(Id("""this"""), Id("""Statement""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""Statement"""))), """Statement10"""), ISeq(List(IAccess(Id("""LabelledStatement"""), ERef(RefId(Id("""Statement"""))), EStr("""LabelledStatement""")).setId(26620), IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""TopLevelVarDeclaredNames""")).setId(26617), IReturn(ERef(RefId(Id("""__x0__""")))).setId(26618))).setId(26621), ISeq(List()).setId(26622)).setId(26623), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")).setId(26624), IReturn(ERef(RefId(Id("""__x1__""")))).setId(26625))).setId(-1))
  /* Beautified form:
  "StatementListItem0TopLevelVarDeclaredNames0" (this, Statement) => {
    if (is-instance-of Statement Statement10) {
      access LabelledStatement = (Statement "LabelledStatement")
      access __x0__ = (Statement "TopLevelVarDeclaredNames")
      return __x0__
    } else {}
    access __x1__ = (Statement "VarDeclaredNames")
    return __x1__
  }
  */
}
