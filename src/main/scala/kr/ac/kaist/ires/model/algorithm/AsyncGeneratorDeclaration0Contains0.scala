package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorDeclaration0Contains0 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorDeclaration0Contains0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""AsyncGeneratorBody"""), Id("""symbol""")), None, IReturn(EBool(false)).setId(41436))
  val instToStepMap: Map[Int, Int] = Map(41436 -> 0, 41437 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(41437, 41436))
  /* Beautified form:
  "AsyncGeneratorDeclaration0Contains0" (this, BindingIdentifier, FormalParameters, AsyncGeneratorBody, symbol) => return false
  */
}
