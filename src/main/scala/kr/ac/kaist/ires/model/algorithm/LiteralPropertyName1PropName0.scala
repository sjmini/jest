package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LiteralPropertyName1PropName0 {
  val length: Int = 0
  val func: Func = Func("""LiteralPropertyName1PropName0""", List(Id("""this"""), Id("""StringLiteral""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StringLiteral"""))), EStr("""SV""")).setId(14495), IReturn(ERef(RefId(Id("""__x0__""")))).setId(14496))).setId(14501))
  val instToStepMap: Map[Int, Int] = Map(14496 -> 0, 14497 -> 0, 14495 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14495, 14497, 14496))
  /* Beautified form:
  "LiteralPropertyName1PropName0" (this, StringLiteral) => {
    access __x0__ = (StringLiteral "SV")
    return __x0__
  }
  */
}
