package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementListItem0TopLevelLexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem0TopLevelLexicallyDeclaredNames0""", List(Id("""this"""), Id("""Statement""")), None, IReturn(EList(List())).setId(26439))
  val instToStepMap: Map[Int, Int] = Map(26439 -> 0, 26440 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26439, 26440))
  /* Beautified form:
  "StatementListItem0TopLevelLexicallyDeclaredNames0" (this, Statement) => return (new [])
  */
}
