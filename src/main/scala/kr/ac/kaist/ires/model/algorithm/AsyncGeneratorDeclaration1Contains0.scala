package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorDeclaration1Contains0 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorDeclaration1Contains0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""AsyncGeneratorBody"""), Id("""symbol""")), None, IReturn(EBool(false)).setId(41441))
  val instToStepMap: Map[Int, Int] = Map(41441 -> 0, 41442 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(41442, 41441))
  /* Beautified form:
  "AsyncGeneratorDeclaration1Contains0" (this, FormalParameters, AsyncGeneratorBody, symbol) => return false
  */
}
