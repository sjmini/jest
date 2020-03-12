package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SubstitutionTemplate0TemplateStrings0 {
  val length: Int = 0
  val func: Func = Func("""SubstitutionTemplate0TemplateStrings0""", List(Id("""this"""), Id("""TemplateHead"""), Id("""Expression"""), Id("""TemplateSpans"""), Id("""raw""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""raw"""))), EBool(false)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateHead"""))), EStr("""TV""")).setId(15143), ILet(Id("""head"""), ERef(RefId(Id("""__x0__""")))).setId(15144))).setId(15163), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""TemplateHead"""))), EStr("""TRV""")).setId(15148), ILet(Id("""head"""), ERef(RefId(Id("""__x1__""")))).setId(15149))).setId(15166)).setId(15152), IAccess(Id("""__x2__"""), ERef(RefId(Id("""TemplateSpans"""))), EStr("""TemplateStrings""")).setId(15154), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""raw"""))))).setId(15155), ILet(Id("""tail"""), ERef(RefId(Id("""__x3__""")))).setId(15156), IReturn(EList(List(ERef(RefId(Id("""head"""))), ERef(RefId(Id("""tail""")))))).setId(15158))).setId(15172))
  val instToStepMap: Map[Int, Int] = HashMap(15158 -> 7, 15146 -> 2, 15150 -> 5, 15151 -> 5, 15155 -> 6, 15152 -> 5, 15148 -> 5, 15144 -> 2, 15145 -> 2, 15143 -> 2, 15153 -> 5, 15156 -> 6, 15157 -> 6, 15149 -> 5, 15154 -> 6, 15159 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(2 -> HashSet(15143, 15146, 15144, 15145), 5 -> HashSet(15153, 15150, 15151, 15152, 15148, 15149), 6 -> HashSet(15155, 15154, 15156, 15157), 7 -> HashSet(15158, 15159))
  /* Beautified form:
  "SubstitutionTemplate0TemplateStrings0" (this, TemplateHead, Expression, TemplateSpans, raw) => {
    if (= raw false) {
      access __x0__ = (TemplateHead "TV")
      let head = __x0__
    } else {
      access __x1__ = (TemplateHead "TRV")
      let head = __x1__
    }
    access __x2__ = (TemplateSpans "TemplateStrings")
    app __x3__ = (__x2__ raw)
    let tail = __x3__
    return (new [head, tail])
  }
  */
}
