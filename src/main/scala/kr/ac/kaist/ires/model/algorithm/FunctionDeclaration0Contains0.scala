package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionDeclaration0Contains0 {
  val length: Int = 0
  val func: Func = Func("""FunctionDeclaration0Contains0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""FunctionBody"""), Id("""symbol""")), None, IReturn(EBool(false)).setId(37800))
  val instToStepMap: Map[Int, Int] = Map(37800 -> 0, 37801 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37801, 37800))
  /* Beautified form:
  "FunctionDeclaration0Contains0" (this, BindingIdentifier, FormalParameters, FunctionBody, symbol) => return false
  */
}
