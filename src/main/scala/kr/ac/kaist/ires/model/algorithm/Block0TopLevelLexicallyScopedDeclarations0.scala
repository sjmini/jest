package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Block0TopLevelLexicallyScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""Block0TopLevelLexicallyScopedDeclarations0""", List(Id("""this""")), None, IReturn(EList(List())).setId(26471))
  val instToStepMap: Map[Int, Int] = Map(26471 -> 0, 26472 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26471, 26472))
  /* Beautified form:
  "Block0TopLevelLexicallyScopedDeclarations0" (this) => return (new [])
  */
}
