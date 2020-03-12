package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorDeclaration1IsConstantDeclaration0 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorDeclaration1IsConstantDeclaration0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""AsyncGeneratorBody""")), None, IReturn(EBool(false)).setId(41496))
  val instToStepMap: Map[Int, Int] = Map(41496 -> 0, 41497 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(41496, 41497))
  /* Beautified form:
  "AsyncGeneratorDeclaration1IsConstantDeclaration0" (this, FormalParameters, AsyncGeneratorBody) => return false
  */
}
