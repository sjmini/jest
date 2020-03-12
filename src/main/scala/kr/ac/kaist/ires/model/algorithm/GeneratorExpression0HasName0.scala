package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorExpression0HasName0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorExpression0HasName0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""GeneratorBody""")), None, IReturn(EBool(false)).setId(40022))
  val instToStepMap: Map[Int, Int] = Map(40022 -> 0, 40023 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(40023, 40022))
  /* Beautified form:
  "GeneratorExpression0HasName0" (this, FormalParameters, GeneratorBody) => return false
  */
}
