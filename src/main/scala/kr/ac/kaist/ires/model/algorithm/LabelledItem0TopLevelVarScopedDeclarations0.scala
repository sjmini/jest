package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledItem0TopLevelVarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""LabelledItem0TopLevelVarScopedDeclarations0""", List(Id("""this"""), Id("""Statement""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""Statement"""))), """Statement10"""), ISeq(List(IAccess(Id("""LabelledStatement"""), ERef(RefId(Id("""Statement"""))), EStr("""LabelledStatement""")).setId(36418), IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""TopLevelVarScopedDeclarations""")).setId(36415), IReturn(ERef(RefId(Id("""__x0__""")))).setId(36416))).setId(36419), ISeq(List()).setId(36420)).setId(36421), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(36422), IReturn(ERef(RefId(Id("""__x1__""")))).setId(36423))).setId(-1))
  /* Beautified form:
  "LabelledItem0TopLevelVarScopedDeclarations0" (this, Statement) => {
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
