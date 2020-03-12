package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncMethod0PropName0 {
  val length: Int = 0
  val func: Func = Func("""AsyncMethod0PropName0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""AsyncFunctionBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""PropName""")).setId(43477), IReturn(ERef(RefId(Id("""__x0__""")))).setId(43478))).setId(43483))
  val instToStepMap: Map[Int, Int] = Map(43477 -> 0, 43478 -> 0, 43479 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(43477, 43479, 43478))
  /* Beautified form:
  "AsyncMethod0PropName0" (this, PropertyName, UniqueFormalParameters, AsyncFunctionBody) => {
    access __x0__ = (PropertyName "PropName")
    return __x0__
  }
  */
}
