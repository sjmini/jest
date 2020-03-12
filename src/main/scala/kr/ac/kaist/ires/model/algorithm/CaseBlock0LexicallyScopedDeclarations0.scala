package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseBlock0LexicallyScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock0LexicallyScopedDeclarations0""", List(Id("""this""")), None, IReturn(EList(List())).setId(34958))
  val instToStepMap: Map[Int, Int] = Map(34958 -> 0, 34959 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34959, 34958))
  /* Beautified form:
  "CaseBlock0LexicallyScopedDeclarations0" (this) => return (new [])
  */
}
