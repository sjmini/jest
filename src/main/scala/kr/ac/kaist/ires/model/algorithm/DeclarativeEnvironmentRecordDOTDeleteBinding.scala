package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTDeleteBinding {
  val length: Int = 1
  val func: Func = Func("""DeclarativeEnvironmentRecord.DeleteBinding""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47344), IExpr(ENotSupported("""Etc""")).setId(47347), IExpr(ENotSupported("""Etc""")).setId(47347), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(47348), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47349))).setId(-1))
  /* Beautified form:
  "DeclarativeEnvironmentRecord.DeleteBinding" (this, N) => {
    let envRec = this
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (WrapCompletion true)
    return __x0__
  }
  */
}
