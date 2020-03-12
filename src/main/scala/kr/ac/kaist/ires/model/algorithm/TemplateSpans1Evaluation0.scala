package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TemplateSpans1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""TemplateSpans1Evaluation0""", List(Id("""this"""), Id("""TemplateMiddleList"""), Id("""TemplateTail""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateMiddleList"""))), EStr("""Evaluation""")).setId(15885), ILet(Id("""head"""), ERef(RefId(Id("""__x0__""")))).setId(15886), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""head""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""head""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""head""")), ERef(RefProp(RefId(Id("""head""")), EStr("""Value""")))).setId(15888), IReturn(ERef(RefId(Id("""head""")))).setId(15889)).setId(15890), ISeq(List()).setId(15908)).setId(15892), IExpr(ERef(RefId(Id("""head""")))).setId(15893), IAccess(Id("""__x1__"""), ERef(RefId(Id("""TemplateTail"""))), EStr("""TV""")).setId(15895), ILet(Id("""tail"""), ERef(RefId(Id("""__x1__""")))).setId(15897), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""head"""))), ERef(RefId(Id("""tail""")))))).setId(15899), IReturn(ERef(RefId(Id("""__x2__""")))).setId(15900))).setId(15915))
  val instToStepMap: Map[Int, Int] = HashMap(15885 -> 0, 15900 -> 3, 15893 -> 1, 15892 -> 1, 15897 -> 2, 15887 -> 0, 15898 -> 2, 15895 -> 2, 15894 -> 1, 15899 -> 3, 15886 -> 0, 15901 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(15885, 15886, 15887), 1 -> HashSet(15893, 15892, 15894), 2 -> HashSet(15897, 15898, 15895), 3 -> HashSet(15900, 15901, 15899))
  /* Beautified form:
  "TemplateSpans1Evaluation0" (this, TemplateMiddleList, TemplateTail) => {
    access __x0__ = (TemplateMiddleList "Evaluation")
    let head = __x0__
    if (= (typeof head) "Completion") if (= head["Type"] CONST_normal) head = head["Value"] else return head else {}
    head
    access __x1__ = (TemplateTail "TV")
    let tail = __x1__
    app __x2__ = (WrapCompletion (+ head tail))
    return __x2__
  }
  */
}
