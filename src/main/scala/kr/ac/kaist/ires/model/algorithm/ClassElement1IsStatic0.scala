package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassElement1IsStatic0 {
  val length: Int = 0
  val func: Func = Func("""ClassElement1IsStatic0""", List(Id("""this"""), Id("""MethodDefinition""")), None, IReturn(EBool(true)).setId(42484))
  val instToStepMap: Map[Int, Int] = Map(42484 -> 0, 42485 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(42485, 42484))
  /* Beautified form:
  "ClassElement1IsStatic0" (this, MethodDefinition) => return true
  */
}
