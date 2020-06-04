package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateMiddleList1SubstitutionEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""TemplateMiddleList1SubstitutionEvaluation0""", List(Id("""this"""), Id("""TemplateMiddleList"""), Id("""TemplateMiddle"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateMiddleList"""))), EStr("""SubstitutionEvaluation""")).setId(15693), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(15694), IReturn(ERef(RefId(Id("""__x0__""")))).setId(15695)).setId(15696), ISeq(List()).setId(15697)).setId(15698), ILet(Id("""preceding"""), ERef(RefId(Id("""__x0__""")))).setId(15699), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(15702), ILet(Id("""nextRef"""), ERef(RefId(Id("""__x1__""")))).setId(15703), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""nextRef"""))))).setId(15705), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(15706), IReturn(ERef(RefId(Id("""__x2__""")))).setId(15707)).setId(15708), ISeq(List()).setId(15697)).setId(15709), ILet(Id("""next"""), ERef(RefId(Id("""__x2__""")))).setId(15710), IAppend(ERef(RefId(Id("""next"""))), ERef(RefId(Id("""preceding""")))).setId(15712), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""preceding"""))))).setId(15714), IReturn(ERef(RefId(Id("""__x3__""")))).setId(15715))).setId(-1))
  /* Beautified form:
  "TemplateMiddleList1SubstitutionEvaluation0" (this, TemplateMiddleList, TemplateMiddle, Expression) => {
    access __x0__ = (TemplateMiddleList "SubstitutionEvaluation")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let preceding = __x0__
    access __x1__ = (Expression "Evaluation")
    let nextRef = __x1__
    app __x2__ = (GetValue nextRef)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let next = __x2__
    append next -> preceding
    app __x3__ = (WrapCompletion preceding)
    return __x3__
  }
  */
}
