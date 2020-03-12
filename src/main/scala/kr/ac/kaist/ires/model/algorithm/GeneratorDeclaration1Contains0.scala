package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorDeclaration1Contains0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorDeclaration1Contains0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""GeneratorBody"""), Id("""symbol""")), None, IReturn(EBool(false)).setId(39982))
  val instToStepMap: Map[Int, Int] = Map(39982 -> 0, 39983 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39983, 39982))
  /* Beautified form:
  "GeneratorDeclaration1Contains0" (this, FormalParameters, GeneratorBody, symbol) => return false
  */
}
