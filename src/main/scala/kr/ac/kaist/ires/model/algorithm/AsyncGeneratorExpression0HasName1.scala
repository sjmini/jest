package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorExpression0HasName1 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorExpression0HasName1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""AsyncGeneratorBody""")), None, IReturn(EBool(true)).setId(41486))
  val instToStepMap: Map[Int, Int] = Map(41486 -> 0, 41487 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(41487, 41486))
  /* Beautified form:
  "AsyncGeneratorExpression0HasName1" (this, BindingIdentifier, FormalParameters, AsyncGeneratorBody) => return true
  */
}
