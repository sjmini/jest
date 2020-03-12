package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorDeclaration0IsConstantDeclaration0 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorDeclaration0IsConstantDeclaration0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""AsyncGeneratorBody""")), None, IReturn(EBool(false)).setId(41491))
  val instToStepMap: Map[Int, Int] = Map(41491 -> 0, 41492 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(41492, 41491))
  /* Beautified form:
  "AsyncGeneratorDeclaration0IsConstantDeclaration0" (this, BindingIdentifier, FormalParameters, AsyncGeneratorBody) => return false
  */
}
