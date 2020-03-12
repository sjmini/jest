package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementListItem1VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem1VarDeclaredNames0""", List(Id("""this"""), Id("""Declaration""")), None, IReturn(EList(List())).setId(26796))
  val instToStepMap: Map[Int, Int] = Map(26796 -> 0, 26797 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26796, 26797))
  /* Beautified form:
  "StatementListItem1VarDeclaredNames0" (this, Declaration) => return (new [])
  */
}
