package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FormalParameters4ExpectedArgumentCount0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameters4ExpectedArgumentCount0""", List(Id("""this"""), Id("""FormalParameterList"""), Id("""FunctionRestParameter""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FormalParameterList"""))), EStr("""ExpectedArgumentCount""")).setId(37877), IReturn(ERef(RefId(Id("""__x0__""")))).setId(37878))).setId(37883))
  val instToStepMap: Map[Int, Int] = Map(37877 -> 0, 37878 -> 0, 37879 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37879, 37877, 37878))
  /* Beautified form:
  "FormalParameters4ExpectedArgumentCount0" (this, FormalParameterList, FunctionRestParameter) => {
    access __x0__ = (FormalParameterList "ExpectedArgumentCount")
    return __x0__
  }
  */
}
