package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MethodDefinition1SpecialMethod0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition1SpecialMethod0""", List(Id("""this"""), Id("""GeneratorMethod""")), None, IReturn(EBool(true)).setId(39596))
  val instToStepMap: Map[Int, Int] = Map(39596 -> 0, 39597 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39597, 39596))
  /* Beautified form:
  "MethodDefinition1SpecialMethod0" (this, GeneratorMethod) => return true
  */
}
