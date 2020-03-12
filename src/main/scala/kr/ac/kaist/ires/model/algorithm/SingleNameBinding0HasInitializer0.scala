package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SingleNameBinding0HasInitializer0 {
  val length: Int = 0
  val func: Func = Func("""SingleNameBinding0HasInitializer0""", List(Id("""this"""), Id("""BindingIdentifier""")), None, IReturn(EBool(false)).setId(28169))
  val instToStepMap: Map[Int, Int] = Map(28169 -> 0, 28170 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28169, 28170))
  /* Beautified form:
  "SingleNameBinding0HasInitializer0" (this, BindingIdentifier) => return false
  */
}
