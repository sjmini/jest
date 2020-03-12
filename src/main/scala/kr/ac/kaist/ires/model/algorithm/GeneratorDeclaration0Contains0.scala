package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorDeclaration0Contains0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorDeclaration0Contains0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""GeneratorBody"""), Id("""symbol""")), None, IReturn(EBool(false)).setId(39977))
  val instToStepMap: Map[Int, Int] = Map(39977 -> 0, 39978 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39977, 39978))
  /* Beautified form:
  "GeneratorDeclaration0Contains0" (this, BindingIdentifier, FormalParameters, GeneratorBody, symbol) => return false
  */
}
