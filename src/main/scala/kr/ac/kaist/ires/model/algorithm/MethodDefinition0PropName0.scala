package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MethodDefinition0PropName0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition0PropName0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""FunctionBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""PropName""")).setId(39561), IReturn(ERef(RefId(Id("""__x0__""")))).setId(39562))).setId(39567))
  val instToStepMap: Map[Int, Int] = Map(39561 -> 0, 39562 -> 0, 39563 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39562, 39561, 39563))
  /* Beautified form:
  "MethodDefinition0PropName0" (this, PropertyName, UniqueFormalParameters, FunctionBody) => {
    access __x0__ = (PropertyName "PropName")
    return __x0__
  }
  */
}
