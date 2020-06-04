package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement2Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement2Evaluation0""", List(Id("""this"""), Id("""Block"""), Id("""Catch"""), Id("""Finally""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""Evaluation""")).setId(37606), ILet(Id("""B"""), ERef(RefId(Id("""__x0__""")))).setId(37607), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""B""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_throw""")))), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""Catch"""))), EStr("""CatchClauseEvaluation""")).setId(37609), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefProp(RefId(Id("""B""")), EStr("""Value"""))))).setId(37610), ILet(Id("""C"""), ERef(RefId(Id("""__x2__""")))).setId(37611))).setId(37612), ILet(Id("""C"""), ERef(RefId(Id("""B""")))).setId(37613)).setId(37615), IAccess(Id("""__x3__"""), ERef(RefId(Id("""Finally"""))), EStr("""Evaluation""")).setId(37618), ILet(Id("""F"""), ERef(RefId(Id("""__x3__""")))).setId(37619), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""F""")), ERef(RefId(Id("""C""")))).setId(37621), ISeq(List()).setId(37623)).setId(37624), IApp(Id("""__x4__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""F"""))), EUndef)).setId(37626), IApp(Id("""__x5__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(37627), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(37628), IReturn(ERef(RefId(Id("""__x6__""")))).setId(37629))).setId(-1))
  /* Beautified form:
  "TryStatement2Evaluation0" (this, Block, Catch, Finally) => {
    access __x0__ = (Block "Evaluation")
    let B = __x0__
    if (= B["Type"] CONST_throw) {
      access __x1__ = (Catch "CatchClauseEvaluation")
      app __x2__ = (__x1__ B["Value"])
      let C = __x2__
    } else let C = B
    access __x3__ = (Finally "Evaluation")
    let F = __x3__
    if (= F["Type"] CONST_normal) F = C else {}
    app __x4__ = (UpdateEmpty F undefined)
    app __x5__ = (Completion __x4__)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
