package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MemberExpression2Contains0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression2Contains0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""IdentifierName"""), Id("""symbol""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""MemberExpression"""))), EStr("""Contains""")).setId(16194), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(16195), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), IReturn(EBool(true)).setId(16196), ISeq(List()).setId(16198)).setId(16199), IIf(EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """ReservedWord"""), IReturn(EBool(false)).setId(16201), ISeq(List()).setId(16198)).setId(16203), IIf(EBOp(OAnd, EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """Identifier"""), EBOp(OEq, EGetSyntax(ERef(RefId(Id("""symbol""")))), EGetSyntax(ERef(RefId(Id("""IdentifierName""")))))), IReturn(EBool(true)).setId(16206), ISeq(List()).setId(16198)).setId(16208), IReturn(EBool(false)).setId(16210))).setId(-1))
  /* Beautified form:
  "MemberExpression2Contains0" (this, MemberExpression, IdentifierName, symbol) => {
    access __x0__ = (MemberExpression "Contains")
    app __x1__ = (__x0__ symbol)
    if (= __x1__ true) return true else {}
    if (is-instance-of symbol ReservedWord) return false else {}
    if (&& (is-instance-of symbol Identifier) (= (get-syntax symbol) (get-syntax IdentifierName))) return true else {}
    return false
  }
  */
}
