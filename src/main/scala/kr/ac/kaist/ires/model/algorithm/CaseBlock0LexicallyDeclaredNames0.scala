package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseBlock0LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock0LexicallyDeclaredNames0""", List(Id("""this""")), None, IReturn(EList(List())).setId(34807))
  val instToStepMap: Map[Int, Int] = Map(34807 -> 0, 34808 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34808, 34807))
  /* Beautified form:
  "CaseBlock0LexicallyDeclaredNames0" (this) => return (new [])
  */
}
