package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionDeclaration0Contains0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionDeclaration0Contains0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody"""), Id("""symbol""")), None, IReturn(EBool(false)).setId(43397))
  val instToStepMap: Map[Int, Int] = Map(43397 -> 0, 43398 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43398, 43397))
  /* Beautified form:
  "AsyncFunctionDeclaration0Contains0" (this, BindingIdentifier, FormalParameters, AsyncFunctionBody, symbol) => return false
  */
}
