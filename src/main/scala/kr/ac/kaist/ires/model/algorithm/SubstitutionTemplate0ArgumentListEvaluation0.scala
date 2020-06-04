package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SubstitutionTemplate0ArgumentListEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""SubstitutionTemplate0ArgumentListEvaluation0""", List(Id("""this"""), Id("""TemplateHead"""), Id("""Expression"""), Id("""TemplateSpans""")), None, ISeq(List(ILet(Id("""templateLiteral"""), ERef(RefId(Id("""this""")))).setId(15362), IApp(Id("""__x0__"""), ERef(RefId(Id("""GetTemplateObject"""))), List(ERef(RefId(Id("""templateLiteral"""))))).setId(15364), ILet(Id("""siteObj"""), ERef(RefId(Id("""__x0__""")))).setId(15365), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(15368), ILet(Id("""firstSubRef"""), ERef(RefId(Id("""__x1__""")))).setId(15369), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""firstSubRef"""))))).setId(15371), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(15372), IReturn(ERef(RefId(Id("""__x2__""")))).setId(15373)).setId(15374), ISeq(List()).setId(15375)).setId(15376), ILet(Id("""firstSub"""), ERef(RefId(Id("""__x2__""")))).setId(15377), IAccess(Id("""__x3__"""), ERef(RefId(Id("""TemplateSpans"""))), EStr("""SubstitutionEvaluation""")).setId(15379), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(15380), IReturn(ERef(RefId(Id("""__x3__""")))).setId(15381)).setId(15382), ISeq(List()).setId(15375)).setId(15383), ILet(Id("""restSub"""), ERef(RefId(Id("""__x3__""")))).setId(15384), ILet(Id("""__x4__"""), ECopy(ERef(RefId(Id("""restSub"""))))).setId(15386), IPrepend(ERef(RefId(Id("""firstSub"""))), ERef(RefId(Id("""__x4__""")))).setId(15387), IPrepend(ERef(RefId(Id("""siteObj"""))), ERef(RefId(Id("""__x4__""")))).setId(15388), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(15389), IReturn(ERef(RefId(Id("""__x5__""")))).setId(15390))).setId(-1))
  /* Beautified form:
  "SubstitutionTemplate0ArgumentListEvaluation0" (this, TemplateHead, Expression, TemplateSpans) => {
    let templateLiteral = this
    app __x0__ = (GetTemplateObject templateLiteral)
    let siteObj = __x0__
    access __x1__ = (Expression "Evaluation")
    let firstSubRef = __x1__
    app __x2__ = (GetValue firstSubRef)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let firstSub = __x2__
    access __x3__ = (TemplateSpans "SubstitutionEvaluation")
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let restSub = __x3__
    let __x4__ = (copy-obj restSub)
    prepend firstSub -> __x4__
    prepend siteObj -> __x4__
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
