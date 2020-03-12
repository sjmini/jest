package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MethodDefinition2SpecialMethod0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition2SpecialMethod0""", List(Id("""this"""), Id("""AsyncMethod""")), None, IReturn(EBool(true)).setId(39601))
  val instToStepMap: Map[Int, Int] = Map(39601 -> 0, 39602 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39601, 39602))
  /* Beautified form:
  "MethodDefinition2SpecialMethod0" (this, AsyncMethod) => return true
  */
}
