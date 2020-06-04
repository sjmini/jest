package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateMiddleList1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""TemplateMiddleList1Evaluation0""", List(Id("""this"""), Id("""TemplateMiddleList"""), Id("""TemplateMiddle"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateMiddleList"""))), EStr("""Evaluation""")).setId(15999), ILet(Id("""rest"""), ERef(RefId(Id("""__x0__""")))).setId(16000), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""rest""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""rest""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""rest""")), ERef(RefProp(RefId(Id("""rest""")), EStr("""Value""")))).setId(16002), IReturn(ERef(RefId(Id("""rest""")))).setId(16003)).setId(16004), ISeq(List()).setId(16005)).setId(16006), IExpr(ERef(RefId(Id("""rest""")))).setId(16007), IAccess(Id("""__x1__"""), ERef(RefId(Id("""TemplateMiddle"""))), EStr("""TV""")).setId(16009), ILet(Id("""middle"""), ERef(RefId(Id("""__x1__""")))).setId(16011), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(16014), ILet(Id("""subRef"""), ERef(RefId(Id("""__x2__""")))).setId(16015), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""subRef"""))))).setId(16017), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(16018), IReturn(ERef(RefId(Id("""__x3__""")))).setId(16019)).setId(16020), ISeq(List()).setId(16005)).setId(16021), ILet(Id("""sub"""), ERef(RefId(Id("""__x3__""")))).setId(16022), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""sub"""))))).setId(16024), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(16025), IReturn(ERef(RefId(Id("""__x4__""")))).setId(16026)).setId(16027), ISeq(List()).setId(16005)).setId(16028), ILet(Id("""last"""), ERef(RefId(Id("""__x4__""")))).setId(16029), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""rest"""))), ERef(RefId(Id("""middle""")))), ERef(RefId(Id("""last""")))))).setId(16031), IReturn(ERef(RefId(Id("""__x5__""")))).setId(16032))).setId(-1))
  /* Beautified form:
  "TemplateMiddleList1Evaluation0" (this, TemplateMiddleList, TemplateMiddle, Expression) => {
    access __x0__ = (TemplateMiddleList "Evaluation")
    let rest = __x0__
    if (= (typeof rest) "Completion") if (= rest["Type"] CONST_normal) rest = rest["Value"] else return rest else {}
    rest
    access __x1__ = (TemplateMiddle "TV")
    let middle = __x1__
    access __x2__ = (Expression "Evaluation")
    let subRef = __x2__
    app __x3__ = (GetValue subRef)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let sub = __x3__
    app __x4__ = (ToString sub)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let last = __x4__
    app __x5__ = (WrapCompletion (+ (+ rest middle) last))
    return __x5__
  }
  */
}
