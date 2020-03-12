package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FormalParameters4IsSimpleParameterList0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameters4IsSimpleParameterList0""", List(Id("""this"""), Id("""FormalParameterList"""), Id("""FunctionRestParameter""")), None, IReturn(EBool(false)).setId(38031))
  val instToStepMap: Map[Int, Int] = Map(38032 -> 0, 38031 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38032, 38031))
  /* Beautified form:
  "FormalParameters4IsSimpleParameterList0" (this, FormalParameterList, FunctionRestParameter) => return false
  */
}
