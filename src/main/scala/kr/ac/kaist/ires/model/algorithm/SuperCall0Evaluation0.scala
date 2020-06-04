package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SuperCall0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""SuperCall0Evaluation0""", List(Id("""this"""), Id("""Arguments""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetNewTarget"""))), List()).setId(17760), ILet(Id("""newTarget"""), ERef(RefId(Id("""__x0__""")))).setId(17761), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetSuperConstructor"""))), List()).setId(17764), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(17765), IReturn(ERef(RefId(Id("""__x1__""")))).setId(17766)).setId(17767), ISeq(List()).setId(17763)).setId(17768), ILet(Id("""func"""), ERef(RefId(Id("""__x1__""")))).setId(17769), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Arguments"""))), EStr("""ArgumentListEvaluation""")).setId(17771), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(17772), IReturn(ERef(RefId(Id("""__x2__""")))).setId(17773)).setId(17774), ISeq(List()).setId(17763)).setId(17775), ILet(Id("""argList"""), ERef(RefId(Id("""__x2__""")))).setId(17776), IApp(Id("""__x3__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""func"""))), ERef(RefId(Id("""argList"""))), ERef(RefId(Id("""newTarget"""))))).setId(17778), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(17779), IReturn(ERef(RefId(Id("""__x3__""")))).setId(17780)).setId(17781), ISeq(List()).setId(17763)).setId(17782), ILet(Id("""result"""), ERef(RefId(Id("""__x3__""")))).setId(17783), IApp(Id("""__x4__"""), ERef(RefId(Id("""GetThisEnvironment"""))), List()).setId(17785), ILet(Id("""thisER"""), ERef(RefId(Id("""__x4__""")))).setId(17786), IApp(Id("""__x5__"""), ERef(RefProp(RefId(Id("""thisER""")), EStr("""BindThisValue"""))), List(ERef(RefId(Id("""thisER"""))), ERef(RefId(Id("""result"""))))).setId(17788), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(17789), IReturn(ERef(RefId(Id("""__x5__""")))).setId(17790)).setId(17791), ISeq(List()).setId(17763)).setId(17792), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(17793), IReturn(ERef(RefId(Id("""__x6__""")))).setId(17794))).setId(-1))
  /* Beautified form:
  "SuperCall0Evaluation0" (this, Arguments) => {
    app __x0__ = (GetNewTarget )
    let newTarget = __x0__
    app __x1__ = (GetSuperConstructor )
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let func = __x1__
    access __x2__ = (Arguments "ArgumentListEvaluation")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let argList = __x2__
    app __x3__ = (Construct func argList newTarget)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let result = __x3__
    app __x4__ = (GetThisEnvironment )
    let thisER = __x4__
    app __x5__ = (thisER["BindThisValue"] thisER result)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
