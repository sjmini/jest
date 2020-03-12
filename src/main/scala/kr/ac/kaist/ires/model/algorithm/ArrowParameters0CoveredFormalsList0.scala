package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrowParameters0CoveredFormalsList0 {
  val length: Int = 0
  val func: Func = Func("""ArrowParameters0CoveredFormalsList0""", List(Id("""this"""), Id("""BindingIdentifier""")), None, IReturn(ERef(RefId(Id("""this""")))).setId(38785))
  val instToStepMap: Map[Int, Int] = Map(38785 -> 0, 38786 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38786, 38785))
  /* Beautified form:
  "ArrowParameters0CoveredFormalsList0" (this, BindingIdentifier) => return this
  */
}
