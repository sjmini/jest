package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MethodDefinition5SpecialMethod0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition5SpecialMethod0""", List(Id("""this"""), Id("""PropertyName"""), Id("""PropertySetParameterList"""), Id("""FunctionBody""")), None, IReturn(EBool(true)).setId(39616))
  val instToStepMap: Map[Int, Int] = Map(39616 -> 0, 39617 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39617, 39616))
  /* Beautified form:
  "MethodDefinition5SpecialMethod0" (this, PropertyName, PropertySetParameterList, FunctionBody) => return true
  */
}
