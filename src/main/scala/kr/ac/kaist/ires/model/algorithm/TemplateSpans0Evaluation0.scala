package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TemplateSpans0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""TemplateSpans0Evaluation0""", List(Id("""this"""), Id("""TemplateTail""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateTail"""))), EStr("""TV""")).setId(15866), ILet(Id("""tail"""), ERef(RefId(Id("""__x0__""")))).setId(15868), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""tail"""))))).setId(15870), IReturn(ERef(RefId(Id("""__x1__""")))).setId(15871))).setId(15878))
  val instToStepMap: Map[Int, Int] = HashMap(15870 -> 1, 15866 -> 0, 15868 -> 0, 15871 -> 1, 15869 -> 0, 15872 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(15866, 15868, 15869), 1 -> HashSet(15870, 15871, 15872))
  /* Beautified form:
  "TemplateSpans0Evaluation0" (this, TemplateTail) => {
    access __x0__ = (TemplateTail "TV")
    let tail = __x0__
    app __x1__ = (WrapCompletion tail)
    return __x1__
  }
  */
}
