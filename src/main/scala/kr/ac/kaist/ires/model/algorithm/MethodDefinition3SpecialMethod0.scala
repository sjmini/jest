package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MethodDefinition3SpecialMethod0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition3SpecialMethod0""", List(Id("""this"""), Id("""AsyncGeneratorMethod""")), None, IReturn(EBool(true)).setId(39606))
  val instToStepMap: Map[Int, Int] = Map(39606 -> 0, 39607 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39606, 39607))
  /* Beautified form:
  "MethodDefinition3SpecialMethod0" (this, AsyncGeneratorMethod) => return true
  */
}
