package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionStatementList0LexicallyScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""FunctionStatementList0LexicallyScopedDeclarations0""", List(Id("""this""")), None, IReturn(EList(List())).setId(38085))
  val instToStepMap: Map[Int, Int] = Map(38085 -> 0, 38086 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38086, 38085))
  /* Beautified form:
  "FunctionStatementList0LexicallyScopedDeclarations0" (this) => return (new [])
  */
}
