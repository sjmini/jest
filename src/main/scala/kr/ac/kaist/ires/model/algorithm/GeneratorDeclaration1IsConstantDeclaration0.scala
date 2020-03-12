package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorDeclaration1IsConstantDeclaration0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorDeclaration1IsConstantDeclaration0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""GeneratorBody""")), None, IReturn(EBool(false)).setId(40037))
  val instToStepMap: Map[Int, Int] = Map(40037 -> 0, 40038 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(40038, 40037))
  /* Beautified form:
  "GeneratorDeclaration1IsConstantDeclaration0" (this, FormalParameters, GeneratorBody) => return false
  */
}
