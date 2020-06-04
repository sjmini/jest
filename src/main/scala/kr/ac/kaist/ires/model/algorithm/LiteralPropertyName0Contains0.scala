package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LiteralPropertyName0Contains0 {
  val length: Int = 0
  val func: Func = Func("""LiteralPropertyName0Contains0""", List(Id("""this"""), Id("""IdentifierName"""), Id("""symbol""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """ReservedWord"""), IReturn(EBool(false)).setId(14421), ISeq(List()).setId(14423)).setId(14424), IIf(EBOp(OAnd, EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """Identifier"""), EBOp(OEq, EGetSyntax(ERef(RefId(Id("""symbol""")))), EGetSyntax(ERef(RefId(Id("""IdentifierName""")))))), IReturn(EBool(true)).setId(14427), ISeq(List()).setId(14423)).setId(14429), IReturn(EBool(false)).setId(14431))).setId(-1))
  /* Beautified form:
  "LiteralPropertyName0Contains0" (this, IdentifierName, symbol) => {
    if (is-instance-of symbol ReservedWord) return false else {}
    if (&& (is-instance-of symbol Identifier) (= (get-syntax symbol) (get-syntax IdentifierName))) return true else {}
    return false
  }
  */
}
