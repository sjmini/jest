package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassElement0IsStatic0 {
  val length: Int = 0
  val func: Func = Func("""ClassElement0IsStatic0""", List(Id("""this"""), Id("""MethodDefinition""")), None, IReturn(EBool(false)).setId(42479))
  val instToStepMap: Map[Int, Int] = Map(42480 -> 0, 42479 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(42479, 42480))
  /* Beautified form:
  "ClassElement0IsStatic0" (this, MethodDefinition) => return false
  */
}
