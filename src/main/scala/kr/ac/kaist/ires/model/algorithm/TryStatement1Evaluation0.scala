package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement1Evaluation0""", List(Id("""this"""), Id("""Block"""), Id("""Finally""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""Evaluation""")).setId(37563), ILet(Id("""B"""), ERef(RefId(Id("""__x0__""")))).setId(37564), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Finally"""))), EStr("""Evaluation""")).setId(37567), ILet(Id("""F"""), ERef(RefId(Id("""__x1__""")))).setId(37568), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""F""")), ERef(RefId(Id("""B""")))).setId(37570), ISeq(List()).setId(37572)).setId(37573), IApp(Id("""__x2__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""F"""))), EUndef)).setId(37575), IApp(Id("""__x3__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(37576), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(37577), IReturn(ERef(RefId(Id("""__x4__""")))).setId(37578))).setId(-1))
  /* Beautified form:
  "TryStatement1Evaluation0" (this, Block, Finally) => {
    access __x0__ = (Block "Evaluation")
    let B = __x0__
    access __x1__ = (Finally "Evaluation")
    let F = __x1__
    if (= F["Type"] CONST_normal) F = B else {}
    app __x2__ = (UpdateEmpty F undefined)
    app __x3__ = (Completion __x2__)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
