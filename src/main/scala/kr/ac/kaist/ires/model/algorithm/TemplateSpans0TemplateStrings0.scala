package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TemplateSpans0TemplateStrings0 {
  val length: Int = 0
  val func: Func = Func("""TemplateSpans0TemplateStrings0""", List(Id("""this"""), Id("""TemplateTail"""), Id("""raw""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""raw"""))), EBool(false)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateTail"""))), EStr("""TV""")).setId(15186), ILet(Id("""tail"""), ERef(RefId(Id("""__x0__""")))).setId(15187))).setId(15202), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""TemplateTail"""))), EStr("""TRV""")).setId(15191), ILet(Id("""tail"""), ERef(RefId(Id("""__x1__""")))).setId(15192))).setId(15205)).setId(15195), IReturn(EList(List(ERef(RefId(Id("""tail""")))))).setId(15197))).setId(15208))
  val instToStepMap: Map[Int, Int] = HashMap(15193 -> 5, 15195 -> 5, 15192 -> 5, 15188 -> 2, 15196 -> 5, 15191 -> 5, 15187 -> 2, 15198 -> 6, 15186 -> 2, 15197 -> 6, 15194 -> 5, 15189 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(2 -> HashSet(15186, 15189, 15188, 15187), 5 -> HashSet(15193, 15194, 15195, 15192, 15196, 15191), 6 -> HashSet(15197, 15198))
  /* Beautified form:
  "TemplateSpans0TemplateStrings0" (this, TemplateTail, raw) => {
    if (= raw false) {
      access __x0__ = (TemplateTail "TV")
      let tail = __x0__
    } else {
      access __x1__ = (TemplateTail "TRV")
      let tail = __x1__
    }
    return (new [tail])
  }
  */
}
