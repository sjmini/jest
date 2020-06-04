package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DeclarativeEnvironmentRecordDOTHasBinding {
  val length: Int = 1
  val func: Func = Func("""DeclarativeEnvironmentRecord.HasBinding""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47099), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N"""))))), EAbsent)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(47101), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47102))).setId(47103), ISeq(List()).setId(47104)).setId(47105), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(47107), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47108))).setId(-1))
  /* Beautified form:
  "DeclarativeEnvironmentRecord.HasBinding" (this, N) => {
    let envRec = this
    if (! (= envRec["SubMap"][N] absent)) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion false)
    return __x1__
  }
  */
}
