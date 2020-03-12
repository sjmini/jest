package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionDeclaration0IsConstantDeclaration0 {
  val length: Int = 0
  val func: Func = Func("""FunctionDeclaration0IsConstantDeclaration0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""FunctionBody""")), None, IReturn(EBool(false)).setId(38006))
  val instToStepMap: Map[Int, Int] = Map(38006 -> 0, 38007 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38007, 38006))
  /* Beautified form:
  "FunctionDeclaration0IsConstantDeclaration0" (this, BindingIdentifier, FormalParameters, FunctionBody) => return false
  */
}
