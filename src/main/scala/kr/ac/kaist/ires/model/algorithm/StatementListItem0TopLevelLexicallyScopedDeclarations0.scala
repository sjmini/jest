package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementListItem0TopLevelLexicallyScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem0TopLevelLexicallyScopedDeclarations0""", List(Id("""this"""), Id("""Statement""")), None, IReturn(EList(List())).setId(26516))
  val instToStepMap: Map[Int, Int] = Map(26516 -> 0, 26517 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26517, 26516))
  /* Beautified form:
  "StatementListItem0TopLevelLexicallyScopedDeclarations0" (this, Statement) => return (new [])
  */
}
