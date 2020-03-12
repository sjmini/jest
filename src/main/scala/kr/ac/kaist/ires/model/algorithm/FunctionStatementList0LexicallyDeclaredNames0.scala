package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionStatementList0LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""FunctionStatementList0LexicallyDeclaredNames0""", List(Id("""this""")), None, IReturn(EList(List())).setId(38070))
  val instToStepMap: Map[Int, Int] = Map(38070 -> 0, 38071 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38071, 38070))
  /* Beautified form:
  "FunctionStatementList0LexicallyDeclaredNames0" (this) => return (new [])
  */
}
