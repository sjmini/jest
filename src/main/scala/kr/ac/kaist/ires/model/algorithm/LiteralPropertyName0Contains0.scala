package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LiteralPropertyName0Contains0 {
  val length: Int = 0
  val func: Func = Func("""LiteralPropertyName0Contains0""", List(Id("""this"""), Id("""IdentifierName"""), Id("""symbol""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """ReservedWord"""), IReturn(EBool(false)).setId(14421), ISeq(List()).setId(14435)).setId(14424), IIf(EBOp(OAnd, EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """Identifier"""), EBOp(OEq, EGetSyntax(ERef(RefId(Id("""symbol""")))), EGetSyntax(ERef(RefId(Id("""IdentifierName""")))))), IReturn(EBool(true)).setId(14427), ISeq(List()).setId(14438)).setId(14429), IReturn(EBool(false)).setId(14431))).setId(14441))
  val instToStepMap: Map[Int, Int] = HashMap(14431 -> 4, 14430 -> 3, 14428 -> 2, 14424 -> 1, 14429 -> 3, 14427 -> 2, 14421 -> 0, 14422 -> 0, 14432 -> 4, 14425 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(14421, 14422), 1 -> HashSet(14424, 14425), 2 -> HashSet(14428, 14427), 3 -> HashSet(14430, 14429), 4 -> HashSet(14431, 14432))
  /* Beautified form:
  "LiteralPropertyName0Contains0" (this, IdentifierName, symbol) => {
    if (is-instance-of symbol ReservedWord) return false else {}
    if (&& (is-instance-of symbol Identifier) (= (get-syntax symbol) (get-syntax IdentifierName))) return true else {}
    return false
  }
  */
}
