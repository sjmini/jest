package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TemplateMiddleList0TemplateStrings0 {
  val length: Int = 0
  val func: Func = Func("""TemplateMiddleList0TemplateStrings0""", List(Id("""this"""), Id("""TemplateMiddle"""), Id("""Expression"""), Id("""raw""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""raw"""))), EBool(false)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateMiddle"""))), EStr("""TV""")).setId(15262), ILet(Id("""string"""), ERef(RefId(Id("""__x0__""")))).setId(15263))).setId(15278), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""TemplateMiddle"""))), EStr("""TRV""")).setId(15267), ILet(Id("""string"""), ERef(RefId(Id("""__x1__""")))).setId(15268))).setId(15281)).setId(15271), IReturn(EList(List(ERef(RefId(Id("""string""")))))).setId(15273))).setId(15284))
  val instToStepMap: Map[Int, Int] = HashMap(15267 -> 5, 15263 -> 2, 15264 -> 2, 15274 -> 6, 15271 -> 5, 15269 -> 5, 15265 -> 2, 15270 -> 5, 15262 -> 2, 15268 -> 5, 15272 -> 5, 15273 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(2 -> HashSet(15263, 15264, 15265, 15262), 5 -> HashSet(15267, 15271, 15270, 15269, 15268, 15272), 6 -> HashSet(15274, 15273))
  /* Beautified form:
  "TemplateMiddleList0TemplateStrings0" (this, TemplateMiddle, Expression, raw) => {
    if (= raw false) {
      access __x0__ = (TemplateMiddle "TV")
      let string = __x0__
    } else {
      access __x1__ = (TemplateMiddle "TRV")
      let string = __x1__
    }
    return (new [string])
  }
  */
}
