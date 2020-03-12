package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorExpression0Contains1 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorExpression0Contains1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""AsyncGeneratorBody"""), Id("""symbol""")), None, IReturn(EBool(false)).setId(41446))
  val instToStepMap: Map[Int, Int] = Map(41446 -> 0, 41447 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(41447, 41446))
  /* Beautified form:
  "AsyncGeneratorExpression0Contains1" (this, BindingIdentifier, FormalParameters, AsyncGeneratorBody, symbol) => return false
  */
}
