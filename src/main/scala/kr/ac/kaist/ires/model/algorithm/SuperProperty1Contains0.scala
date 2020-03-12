package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SuperProperty1Contains0 {
  val length: Int = 0
  val func: Func = Func("""SuperProperty1Contains0""", List(Id("""this"""), Id("""IdentifierName"""), Id("""symbol""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(16239), IIf(EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """ReservedWord"""), IReturn(EBool(false)).setId(16240), ISeq(List()).setId(16255)).setId(16243), IIf(EBOp(OAnd, EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """Identifier"""), EBOp(OEq, EGetSyntax(ERef(RefId(Id("""symbol""")))), EGetSyntax(ERef(RefId(Id("""IdentifierName""")))))), IReturn(EBool(true)).setId(16246), ISeq(List()).setId(16258)).setId(16248), IReturn(EBool(false)).setId(16250))).setId(16261))
  val instToStepMap: Map[Int, Int] = HashMap(16244 -> 2, 16247 -> 3, 16246 -> 3, 16241 -> 1, 16249 -> 4, 16239 -> 0, 16250 -> 5, 16243 -> 2, 16248 -> 4, 16251 -> 5, 16240 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(16239), 5 -> HashSet(16251, 16250), 1 -> HashSet(16240, 16241), 2 -> HashSet(16243, 16244), 3 -> HashSet(16247, 16246), 4 -> HashSet(16248, 16249))
  /* Beautified form:
  "SuperProperty1Contains0" (this, IdentifierName, symbol) => {
    !!! "Etc"
    if (is-instance-of symbol ReservedWord) return false else {}
    if (&& (is-instance-of symbol Identifier) (= (get-syntax symbol) (get-syntax IdentifierName))) return true else {}
    return false
  }
  */
}
