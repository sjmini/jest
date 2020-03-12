package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LetOrConst0IsConstantDeclaration0 {
  val length: Int = 0
  val func: Func = Func("""LetOrConst0IsConstantDeclaration0""", List(Id("""this""")), None, IReturn(EBool(false)).setId(27187))
  val instToStepMap: Map[Int, Int] = Map(27187 -> 0, 27188 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27187, 27188))
  /* Beautified form:
  "LetOrConst0IsConstantDeclaration0" (this) => return false
  */
}
