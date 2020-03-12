package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionExpression0IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""FunctionExpression0IsFunctionDefinition0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""FunctionBody""")), None, IReturn(EBool(true)).setId(38016))
  val instToStepMap: Map[Int, Int] = Map(38016 -> 0, 38017 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38016, 38017))
  /* Beautified form:
  "FunctionExpression0IsFunctionDefinition0" (this, FormalParameters, FunctionBody) => return true
  */
}
