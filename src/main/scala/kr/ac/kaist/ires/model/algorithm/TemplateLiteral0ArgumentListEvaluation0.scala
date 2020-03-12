package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TemplateLiteral0ArgumentListEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""TemplateLiteral0ArgumentListEvaluation0""", List(Id("""this"""), Id("""NoSubstitutionTemplate""")), None, ISeq(List(ILet(Id("""templateLiteral"""), ERef(RefId(Id("""this""")))).setId(15341), IApp(Id("""__x0__"""), ERef(RefId(Id("""GetTemplateObject"""))), List(ERef(RefId(Id("""templateLiteral"""))))).setId(15343), ILet(Id("""siteObj"""), ERef(RefId(Id("""__x0__""")))).setId(15344), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List(ERef(RefId(Id("""siteObj"""))))))).setId(15346), IReturn(ERef(RefId(Id("""__x1__""")))).setId(15347))).setId(15355))
  val instToStepMap: Map[Int, Int] = HashMap(15346 -> 2, 15342 -> 0, 15343 -> 1, 15345 -> 1, 15344 -> 1, 15348 -> 2, 15347 -> 2, 15341 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(15342, 15341), 1 -> HashSet(15343, 15345, 15344), 2 -> HashSet(15346, 15348, 15347))
  /* Beautified form:
  "TemplateLiteral0ArgumentListEvaluation0" (this, NoSubstitutionTemplate) => {
    let templateLiteral = this
    app __x0__ = (GetTemplateObject templateLiteral)
    let siteObj = __x0__
    app __x1__ = (WrapCompletion (new [siteObj]))
    return __x1__
  }
  */
}
