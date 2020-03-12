package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorMethod0PropName0 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorMethod0PropName0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""AsyncGeneratorBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""PropName""")).setId(41506), IReturn(ERef(RefId(Id("""__x0__""")))).setId(41507))).setId(41512))
  val instToStepMap: Map[Int, Int] = Map(41506 -> 0, 41507 -> 0, 41508 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(41507, 41506, 41508))
  /* Beautified form:
  "AsyncGeneratorMethod0PropName0" (this, PropertyName, UniqueFormalParameters, AsyncGeneratorBody) => {
    access __x0__ = (PropertyName "PropName")
    return __x0__
  }
  */
}
