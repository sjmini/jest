package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TemplateSpans1TemplateStrings0 {
  val length: Int = 0
  val func: Func = Func("""TemplateSpans1TemplateStrings0""", List(Id("""this"""), Id("""TemplateMiddleList"""), Id("""TemplateTail"""), Id("""raw""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateMiddleList"""))), EStr("""TemplateStrings""")).setId(15218), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""raw"""))))).setId(15219), ILet(Id("""middle"""), ERef(RefId(Id("""__x1__""")))).setId(15220), IIf(EBOp(OEq, ERef(RefId(Id("""raw"""))), EBool(false)), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""TemplateTail"""))), EStr("""TV""")).setId(15223), ILet(Id("""tail"""), ERef(RefId(Id("""__x2__""")))).setId(15224))).setId(15242), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""TemplateTail"""))), EStr("""TRV""")).setId(15228), ILet(Id("""tail"""), ERef(RefId(Id("""__x3__""")))).setId(15229))).setId(15245)).setId(15232), IReturn(EList(List(ERef(RefId(Id("""middle"""))), ERef(RefId(Id("""tail""")))))).setId(15234))).setId(15248))
  val instToStepMap: Map[Int, Int] = HashMap(15225 -> 3, 15235 -> 7, 15221 -> 0, 15226 -> 3, 15224 -> 3, 15233 -> 6, 15220 -> 0, 15223 -> 3, 15228 -> 6, 15218 -> 0, 15230 -> 6, 15219 -> 0, 15229 -> 6, 15231 -> 6, 15234 -> 7, 15232 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(15221, 15220, 15218, 15219), 3 -> HashSet(15225, 15226, 15224, 15223), 6 -> HashSet(15232, 15233, 15228, 15230, 15229, 15231), 7 -> HashSet(15235, 15234))
  /* Beautified form:
  "TemplateSpans1TemplateStrings0" (this, TemplateMiddleList, TemplateTail, raw) => {
    access __x0__ = (TemplateMiddleList "TemplateStrings")
    app __x1__ = (__x0__ raw)
    let middle = __x1__
    if (= raw false) {
      access __x2__ = (TemplateTail "TV")
      let tail = __x2__
    } else {
      access __x3__ = (TemplateTail "TRV")
      let tail = __x3__
    }
    return (new [middle, tail])
  }
  */
}
