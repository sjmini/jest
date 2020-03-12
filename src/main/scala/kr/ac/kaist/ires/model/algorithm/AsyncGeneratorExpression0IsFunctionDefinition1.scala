package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorExpression0IsFunctionDefinition1 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorExpression0IsFunctionDefinition1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""AsyncGeneratorBody""")), None, IReturn(EBool(true)).setId(41501))
  val instToStepMap: Map[Int, Int] = Map(41501 -> 0, 41502 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(41501, 41502))
  /* Beautified form:
  "AsyncGeneratorExpression0IsFunctionDefinition1" (this, BindingIdentifier, FormalParameters, AsyncGeneratorBody) => return true
  */
}
