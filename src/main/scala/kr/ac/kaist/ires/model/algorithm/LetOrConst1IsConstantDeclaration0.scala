package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LetOrConst1IsConstantDeclaration0 {
  val length: Int = 0
  val func: Func = Func("""LetOrConst1IsConstantDeclaration0""", List(Id("""this""")), None, IReturn(EBool(true)).setId(27192))
  val instToStepMap: Map[Int, Int] = Map(27192 -> 0, 27193 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27192, 27193))
  /* Beautified form:
  "LetOrConst1IsConstantDeclaration0" (this) => return true
  */
}
