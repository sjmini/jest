package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorMethod0PropName0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorMethod0PropName0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""GeneratorBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""PropName""")).setId(40047), IReturn(ERef(RefId(Id("""__x0__""")))).setId(40048))).setId(40053))
  val instToStepMap: Map[Int, Int] = Map(40048 -> 0, 40049 -> 0, 40047 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(40048, 40047, 40049))
  /* Beautified form:
  "GeneratorMethod0PropName0" (this, PropertyName, UniqueFormalParameters, GeneratorBody) => {
    access __x0__ = (PropertyName "PropName")
    return __x0__
  }
  */
}
