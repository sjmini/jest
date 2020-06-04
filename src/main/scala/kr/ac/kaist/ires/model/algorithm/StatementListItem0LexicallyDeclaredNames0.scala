package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementListItem0LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem0LexicallyDeclaredNames0""", List(Id("""this"""), Id("""Statement""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""Statement"""))), """Statement10"""), ISeq(List(IAccess(Id("""LabelledStatement"""), ERef(RefId(Id("""Statement"""))), EStr("""LabelledStatement""")).setId(26290), IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelledStatement"""))), EStr("""LexicallyDeclaredNames""")).setId(26287), IReturn(ERef(RefId(Id("""__x0__""")))).setId(26288))).setId(26291), ISeq(List()).setId(26292)).setId(26293), IReturn(EList(List())).setId(26294))).setId(-1))
  /* Beautified form:
  "StatementListItem0LexicallyDeclaredNames0" (this, Statement) => {
    if (is-instance-of Statement Statement10) {
      access LabelledStatement = (Statement "LabelledStatement")
      access __x0__ = (LabelledStatement "LexicallyDeclaredNames")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
