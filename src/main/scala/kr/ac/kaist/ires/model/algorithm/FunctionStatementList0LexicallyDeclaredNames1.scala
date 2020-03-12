package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionStatementList0LexicallyDeclaredNames1 {
  val length: Int = 0
  val func: Func = Func("""FunctionStatementList0LexicallyDeclaredNames1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""TopLevelLexicallyDeclaredNames""")).setId(38075), IReturn(ERef(RefId(Id("""__x0__""")))).setId(38076))).setId(38081))
  val instToStepMap: Map[Int, Int] = Map(38075 -> 0, 38076 -> 0, 38077 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38076, 38075, 38077))
  /* Beautified form:
  "FunctionStatementList0LexicallyDeclaredNames1" (this, StatementList) => {
    access __x0__ = (StatementList "TopLevelLexicallyDeclaredNames")
    return __x0__
  }
  */
}
