package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem0TopLevelVarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem0TopLevelVarScopedDeclarations0""", List(Id("""this"""), Id("""Statement""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""Statement"""))), """Statement10"""), ISeq(List(IAccess(Id("""LabelledStatement"""), ERef(RefId(Id("""Statement"""))), EStr("""LabelledStatement""")).setId(26694), IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""TopLevelVarScopedDeclarations""")).setId(26691), IReturn(ERef(RefId(Id("""__x0__""")))).setId(26692))).setId(26695), ISeq(List()).setId(26696)).setId(26697), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(26698), IReturn(ERef(RefId(Id("""__x1__""")))).setId(26699))).setId(-1))
  /* Beautified form:
  "StatementListItem0TopLevelVarScopedDeclarations0" (this, Statement) => {
    if (is-instance-of Statement Statement10) {
      access LabelledStatement = (Statement "LabelledStatement")
      access __x0__ = (Statement "TopLevelVarScopedDeclarations")
      return __x0__
    } else {}
    access __x1__ = (Statement "VarScopedDeclarations")
    return __x1__
  }
  */
}
