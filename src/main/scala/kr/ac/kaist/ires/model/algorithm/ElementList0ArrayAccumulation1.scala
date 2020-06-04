package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ElementList0ArrayAccumulation1 {
  val length: Int = 0
  val func: Func = Func("""ElementList0ArrayAccumulation1""", List(Id("""this"""), Id("""Elision"""), Id("""AssignmentExpression"""), Id("""array"""), Id("""nextIndex""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""Elision"""))), EAbsent), ILet(Id("""padding"""), EINum(0L)).setId(13790), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Elision"""))), EStr("""ElisionWidth""")).setId(13789), ILet(Id("""padding"""), ERef(RefId(Id("""__x0__""")))).setId(13792))).setId(13793)).setId(13794), IAccess(Id("""__x1__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(13797), ILet(Id("""initResult"""), ERef(RefId(Id("""__x1__""")))).setId(13798), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""initResult"""))))).setId(13800), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(13801), IReturn(ERef(RefId(Id("""__x2__""")))).setId(13802)).setId(13803), ISeq(List()).setId(13804)).setId(13805), ILet(Id("""initValue"""), ERef(RefId(Id("""__x2__""")))).setId(13806), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToUint32"""))), List(EBOp(OPlus, ERef(RefId(Id("""nextIndex"""))), ERef(RefId(Id("""padding""")))))).setId(13808), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(13809), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""array"""))), ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""initValue"""))))).setId(13810), ILet(Id("""created"""), ERef(RefId(Id("""__x5__""")))).setId(13811), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""nextIndex"""))), ERef(RefId(Id("""padding""")))), EINum(1L)))).setId(13813), IReturn(ERef(RefId(Id("""__x6__""")))).setId(13814))).setId(-1))
  /* Beautified form:
  "ElementList0ArrayAccumulation1" (this, Elision, AssignmentExpression, array, nextIndex) => {
    if (= Elision absent) let padding = 0i else {
      access __x0__ = (Elision "ElisionWidth")
      let padding = __x0__
    }
    access __x1__ = (AssignmentExpression "Evaluation")
    let initResult = __x1__
    app __x2__ = (GetValue initResult)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let initValue = __x2__
    app __x3__ = (ToUint32 (+ nextIndex padding))
    app __x4__ = (ToString __x3__)
    app __x5__ = (CreateDataProperty array __x4__ initValue)
    let created = __x5__
    app __x6__ = (WrapCompletion (+ (+ nextIndex padding) 1i))
    return __x6__
  }
  */
}
