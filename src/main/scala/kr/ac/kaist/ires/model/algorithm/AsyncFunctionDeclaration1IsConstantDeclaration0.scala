package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionDeclaration1IsConstantDeclaration0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionDeclaration1IsConstantDeclaration0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody""")), None, IReturn(EBool(false)).setId(43462))
  val instToStepMap: Map[Int, Int] = Map(43462 -> 0, 43463 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43463, 43462))
  /* Beautified form:
  "AsyncFunctionDeclaration1IsConstantDeclaration0" (this, FormalParameters, AsyncFunctionBody) => return false
  */
}
