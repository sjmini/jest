package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionDeclaration1Contains0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionDeclaration1Contains0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody"""), Id("""symbol""")), None, IReturn(EBool(false)).setId(43402))
  val instToStepMap: Map[Int, Int] = Map(43402 -> 0, 43403 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43403, 43402))
  /* Beautified form:
  "AsyncFunctionDeclaration1Contains0" (this, FormalParameters, AsyncFunctionBody, symbol) => return false
  */
}
