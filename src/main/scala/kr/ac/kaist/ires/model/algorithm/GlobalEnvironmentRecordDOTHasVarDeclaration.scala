package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GlobalEnvironmentRecordDOTHasVarDeclaration {
  val length: Int = 1
  val func: Func = Func("""GlobalEnvironmentRecord.HasVarDeclaration""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48537), ILet(Id("""varDeclaredNames"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""VarNames""")))).setId(48539), IIf(EContains(ERef(RefId(Id("""varDeclaredNames"""))), ERef(RefId(Id("""N""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(48541), IReturn(ERef(RefId(Id("""__x0__""")))).setId(48542))).setId(48543), ISeq(List()).setId(48544)).setId(48545), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(48547), IReturn(ERef(RefId(Id("""__x1__""")))).setId(48548))).setId(-1))
  /* Beautified form:
  "GlobalEnvironmentRecord.HasVarDeclaration" (this, N) => {
    let envRec = this
    let varDeclaredNames = envRec["VarNames"]
    if (contains varDeclaredNames N) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion false)
    return __x1__
  }
  */
}
