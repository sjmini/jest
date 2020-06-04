package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsAnonymousFunctionDefinition {
  val length: Int = 1
  val func: Func = Func("""IsAnonymousFunctionDefinition""", List(Id("""expr""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""expr"""))), EStr("""IsFunctionDefinition""")).setId(37968), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false)), IReturn(EBool(false)).setId(37969), ISeq(List()).setId(37971)).setId(37972), IAccess(Id("""__x1__"""), ERef(RefId(Id("""expr"""))), EStr("""HasName""")).setId(37974), ILet(Id("""hasName"""), ERef(RefId(Id("""__x1__""")))).setId(37975), IIf(EBOp(OEq, ERef(RefId(Id("""hasName"""))), EBool(true)), IReturn(EBool(false)).setId(37977), ISeq(List()).setId(37971)).setId(37979), IReturn(EBool(true)).setId(37981))).setId(-1))
  /* Beautified form:
  "IsAnonymousFunctionDefinition" (expr) => {
    access __x0__ = (expr "IsFunctionDefinition")
    if (= __x0__ false) return false else {}
    access __x1__ = (expr "HasName")
    let hasName = __x1__
    if (= hasName true) return false else {}
    return true
  }
  */
}
