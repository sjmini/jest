package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionExpression0HasName1 {
  val length: Int = 0
  val func: Func = Func("""FunctionExpression0HasName1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""FunctionBody""")), None, IReturn(EBool(true)).setId(37963))
  val instToStepMap: Map[Int, Int] = Map(37963 -> 0, 37964 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37964, 37963))
  /* Beautified form:
  "FunctionExpression0HasName1" (this, BindingIdentifier, FormalParameters, FunctionBody) => return true
  */
}
