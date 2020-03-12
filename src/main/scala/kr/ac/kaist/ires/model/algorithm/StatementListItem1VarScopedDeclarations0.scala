package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementListItem1VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem1VarScopedDeclarations0""", List(Id("""this"""), Id("""Declaration""")), None, IReturn(EList(List())).setId(26846))
  val instToStepMap: Map[Int, Int] = Map(26846 -> 0, 26847 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26846, 26847))
  /* Beautified form:
  "StatementListItem1VarScopedDeclarations0" (this, Declaration) => return (new [])
  */
}
