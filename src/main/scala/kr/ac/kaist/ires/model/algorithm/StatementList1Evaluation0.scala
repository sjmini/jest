package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StatementList1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""StatementList1Evaluation0""", List(Id("""this"""), Id("""StatementList"""), Id("""StatementListItem""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""Evaluation""")).setId(26909), ILet(Id("""sl"""), ERef(RefId(Id("""__x0__""")))).setId(26910), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""sl""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""sl""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""sl""")), ERef(RefProp(RefId(Id("""sl""")), EStr("""Value""")))).setId(26912), IReturn(ERef(RefId(Id("""sl""")))).setId(26913)).setId(26914), ISeq(List()).setId(26915)).setId(26916), IExpr(ERef(RefId(Id("""sl""")))).setId(26917), IAccess(Id("""__x1__"""), ERef(RefId(Id("""StatementListItem"""))), EStr("""Evaluation""")).setId(26920), ILet(Id("""s"""), ERef(RefId(Id("""__x1__""")))).setId(26921), IApp(Id("""__x2__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""s"""))), ERef(RefId(Id("""sl"""))))).setId(26923), IApp(Id("""__x3__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(26924), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(26925), IReturn(ERef(RefId(Id("""__x4__""")))).setId(26926))).setId(-1))
  /* Beautified form:
  "StatementList1Evaluation0" (this, StatementList, StatementListItem) => {
    access __x0__ = (StatementList "Evaluation")
    let sl = __x0__
    if (= (typeof sl) "Completion") if (= sl["Type"] CONST_normal) sl = sl["Value"] else return sl else {}
    sl
    access __x1__ = (StatementListItem "Evaluation")
    let s = __x1__
    app __x2__ = (UpdateEmpty s sl)
    app __x3__ = (Completion __x2__)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
