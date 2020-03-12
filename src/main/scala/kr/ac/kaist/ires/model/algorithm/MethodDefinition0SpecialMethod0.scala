package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MethodDefinition0SpecialMethod0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition0SpecialMethod0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""FunctionBody""")), None, IReturn(EBool(false)).setId(39591))
  val instToStepMap: Map[Int, Int] = Map(39591 -> 0, 39592 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39591, 39592))
  /* Beautified form:
  "MethodDefinition0SpecialMethod0" (this, PropertyName, UniqueFormalParameters, FunctionBody) => return false
  */
}
