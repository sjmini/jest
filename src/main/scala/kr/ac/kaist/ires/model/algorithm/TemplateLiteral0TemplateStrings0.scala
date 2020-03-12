package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TemplateLiteral0TemplateStrings0 {
  val length: Int = 0
  val func: Func = Func("""TemplateLiteral0TemplateStrings0""", List(Id("""this"""), Id("""NoSubstitutionTemplate"""), Id("""raw""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""raw"""))), EBool(false)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""NoSubstitutionTemplate"""))), EStr("""TV""")).setId(15110), ILet(Id("""string"""), ERef(RefId(Id("""__x0__""")))).setId(15111))).setId(15126), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""NoSubstitutionTemplate"""))), EStr("""TRV""")).setId(15115), ILet(Id("""string"""), ERef(RefId(Id("""__x1__""")))).setId(15116))).setId(15129)).setId(15119), IReturn(EList(List(ERef(RefId(Id("""string""")))))).setId(15121))).setId(15132))
  val instToStepMap: Map[Int, Int] = HashMap(15115 -> 5, 15119 -> 5, 15110 -> 2, 15118 -> 5, 15121 -> 6, 15111 -> 2, 15117 -> 5, 15113 -> 2, 15112 -> 2, 15122 -> 6, 15116 -> 5, 15120 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(2 -> HashSet(15110, 15111, 15113, 15112), 5 -> HashSet(15115, 15119, 15118, 15117, 15116, 15120), 6 -> HashSet(15121, 15122))
  /* Beautified form:
  "TemplateLiteral0TemplateStrings0" (this, NoSubstitutionTemplate, raw) => {
    if (= raw false) {
      access __x0__ = (NoSubstitutionTemplate "TV")
      let string = __x0__
    } else {
      access __x1__ = (NoSubstitutionTemplate "TRV")
      let string = __x1__
    }
    return (new [string])
  }
  */
}
