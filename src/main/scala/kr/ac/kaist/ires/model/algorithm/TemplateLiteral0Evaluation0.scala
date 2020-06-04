package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateLiteral0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""TemplateLiteral0Evaluation0""", List(Id("""this"""), Id("""NoSubstitutionTemplate""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""NoSubstitutionTemplate"""))), EStr("""TV""")).setId(15758), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(15759), IReturn(ERef(RefId(Id("""__x1__""")))).setId(15760))).setId(-1))
  /* Beautified form:
  "TemplateLiteral0Evaluation0" (this, NoSubstitutionTemplate) => {
    access __x0__ = (NoSubstitutionTemplate "TV")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
