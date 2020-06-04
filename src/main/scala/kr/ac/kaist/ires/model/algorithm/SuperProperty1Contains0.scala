package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SuperProperty1Contains0 {
  val length: Int = 0
  val func: Func = Func("""SuperProperty1Contains0""", List(Id("""this"""), Id("""IdentifierName"""), Id("""symbol""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(16239), IIf(EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """ReservedWord"""), IReturn(EBool(false)).setId(16240), ISeq(List()).setId(16242)).setId(16243), IIf(EBOp(OAnd, EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """Identifier"""), EBOp(OEq, EGetSyntax(ERef(RefId(Id("""symbol""")))), EGetSyntax(ERef(RefId(Id("""IdentifierName""")))))), IReturn(EBool(true)).setId(16246), ISeq(List()).setId(16242)).setId(16248), IReturn(EBool(false)).setId(16250))).setId(-1))
  /* Beautified form:
  "SuperProperty1Contains0" (this, IdentifierName, symbol) => {
    !!! "Etc"
    if (is-instance-of symbol ReservedWord) return false else {}
    if (&& (is-instance-of symbol Identifier) (= (get-syntax symbol) (get-syntax IdentifierName))) return true else {}
    return false
  }
  */
}
