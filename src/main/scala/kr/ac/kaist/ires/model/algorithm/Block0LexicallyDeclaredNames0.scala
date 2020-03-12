package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Block0LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""Block0LexicallyDeclaredNames0""", List(Id("""this""")), None, IReturn(EList(List())).setId(26242))
  val instToStepMap: Map[Int, Int] = Map(26242 -> 0, 26243 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26243, 26242))
  /* Beautified form:
  "Block0LexicallyDeclaredNames0" (this) => return (new [])
  */
}
