package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MethodDefinition4SpecialMethod0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition4SpecialMethod0""", List(Id("""this"""), Id("""PropertyName"""), Id("""FunctionBody""")), None, IReturn(EBool(true)).setId(39611))
  val instToStepMap: Map[Int, Int] = Map(39611 -> 0, 39612 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39611, 39612))
  /* Beautified form:
  "MethodDefinition4SpecialMethod0" (this, PropertyName, FunctionBody) => return true
  */
}
