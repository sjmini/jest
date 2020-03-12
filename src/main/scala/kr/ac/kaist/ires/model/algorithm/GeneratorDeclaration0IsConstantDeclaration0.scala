package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorDeclaration0IsConstantDeclaration0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorDeclaration0IsConstantDeclaration0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""GeneratorBody""")), None, IReturn(EBool(false)).setId(40032))
  val instToStepMap: Map[Int, Int] = Map(40032 -> 0, 40033 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(40033, 40032))
  /* Beautified form:
  "GeneratorDeclaration0IsConstantDeclaration0" (this, BindingIdentifier, FormalParameters, GeneratorBody) => return false
  */
}
