package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateLiteral0TemplateStrings0 {
  val length: Int = 0
  val func: Func = Func("""TemplateLiteral0TemplateStrings0""", List(Id("""this"""), Id("""NoSubstitutionTemplate"""), Id("""raw""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""raw"""))), EBool(false)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""NoSubstitutionTemplate"""))), EStr("""TV""")).setId(15110), ILet(Id("""string"""), ERef(RefId(Id("""__x0__""")))).setId(15111))).setId(15113), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""NoSubstitutionTemplate"""))), EStr("""TRV""")).setId(15115), ILet(Id("""string"""), ERef(RefId(Id("""__x1__""")))).setId(15116))).setId(15118)).setId(15119), IReturn(EList(List(ERef(RefId(Id("""string""")))))).setId(15121))).setId(-1))
  /* Beautified form:
  "TemplateLiteral0TemplateStrings0" (this, NoSubstitutionTemplate, raw) => {
    if (= raw false) {
      access __x0__ = (NoSubstitutionTemplate "TV")
      let string = __x0__
    } else {
      access __x1__ = (NoSubstitutionTemplate "TRV")
      let string = __x1__
    }
    return (new [string])
  }
  */
}
