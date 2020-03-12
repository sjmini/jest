package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionDeclaration0IsConstantDeclaration0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionDeclaration0IsConstantDeclaration0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody""")), None, IReturn(EBool(false)).setId(43457))
  val instToStepMap: Map[Int, Int] = Map(43457 -> 0, 43458 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43458, 43457))
  /* Beautified form:
  "AsyncFunctionDeclaration0IsConstantDeclaration0" (this, BindingIdentifier, FormalParameters, AsyncFunctionBody) => return false
  */
}
