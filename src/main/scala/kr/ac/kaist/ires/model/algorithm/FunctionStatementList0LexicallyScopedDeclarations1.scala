package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionStatementList0LexicallyScopedDeclarations1 {
  val length: Int = 0
  val func: Func = Func("""FunctionStatementList0LexicallyScopedDeclarations1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""TopLevelLexicallyScopedDeclarations""")).setId(38090), IReturn(ERef(RefId(Id("""__x0__""")))).setId(38091))).setId(38096))
  val instToStepMap: Map[Int, Int] = Map(38090 -> 0, 38091 -> 0, 38092 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38090, 38092, 38091))
  /* Beautified form:
  "FunctionStatementList0LexicallyScopedDeclarations1" (this, StatementList) => {
    access __x0__ = (StatementList "TopLevelLexicallyScopedDeclarations")
    return __x0__
  }
  */
}
