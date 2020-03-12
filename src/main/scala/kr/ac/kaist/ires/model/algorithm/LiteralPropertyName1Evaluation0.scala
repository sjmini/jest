package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LiteralPropertyName1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""LiteralPropertyName1Evaluation0""", List(Id("""this"""), Id("""StringLiteral""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StringLiteral"""))), EStr("""SV""")).setId(14711), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(14712), IReturn(ERef(RefId(Id("""__x1__""")))).setId(14713))).setId(14719))
  val instToStepMap: Map[Int, Int] = Map(14711 -> 0, 14712 -> 0, 14713 -> 0, 14714 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14712, 14713, 14714, 14711))
  /* Beautified form:
  "LiteralPropertyName1Evaluation0" (this, StringLiteral) => {
    access __x0__ = (StringLiteral "SV")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
