package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SingleNameBinding0IsSimpleParameterList0 {
  val length: Int = 0
  val func: Func = Func("""SingleNameBinding0IsSimpleParameterList0""", List(Id("""this"""), Id("""BindingIdentifier""")), None, IReturn(EBool(true)).setId(28189))
  val instToStepMap: Map[Int, Int] = Map(28189 -> 0, 28190 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28190, 28189))
  /* Beautified form:
  "SingleNameBinding0IsSimpleParameterList0" (this, BindingIdentifier) => return true
  */
}
