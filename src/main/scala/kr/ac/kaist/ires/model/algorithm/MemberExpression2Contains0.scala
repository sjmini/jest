package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression2Contains0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression2Contains0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""IdentifierName"""), Id("""symbol""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""MemberExpression"""))), EStr("""Contains""")).setId(16194), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(16195), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), IReturn(EBool(true)).setId(16196), ISeq(List()).setId(16216)).setId(16199), IIf(EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """ReservedWord"""), IReturn(EBool(false)).setId(16201), ISeq(List()).setId(16219)).setId(16203), IIf(EBOp(OAnd, EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """Identifier"""), EBOp(OEq, EGetSyntax(ERef(RefId(Id("""symbol""")))), EGetSyntax(ERef(RefId(Id("""IdentifierName""")))))), IReturn(EBool(true)).setId(16206), ISeq(List()).setId(16222)).setId(16208), IReturn(EBool(false)).setId(16210))).setId(16225))
  val instToStepMap: Map[Int, Int] = HashMap(16196 -> 0, 16211 -> 6, 16208 -> 5, 16204 -> 3, 16200 -> 1, 16210 -> 6, 16195 -> 1, 16201 -> 2, 16194 -> 1, 16202 -> 2, 16206 -> 4, 16207 -> 4, 16197 -> 0, 16203 -> 3, 16199 -> 1, 16209 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(16196, 16197), 5 -> HashSet(16208, 16209), 1 -> HashSet(16200, 16195, 16199, 16194), 6 -> HashSet(16211, 16210), 2 -> HashSet(16201, 16202), 3 -> HashSet(16204, 16203), 4 -> HashSet(16206, 16207))
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
