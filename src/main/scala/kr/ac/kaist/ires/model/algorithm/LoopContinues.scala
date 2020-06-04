package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LoopContinues {
  val length: Int = 2
  val func: Func = Func("""LoopContinues""", List(Id("""completion"""), Id("""labelSet""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""completion""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(30606), IReturn(ERef(RefId(Id("""__x0__""")))).setId(30607))).setId(30608), ISeq(List()).setId(30609)).setId(30610), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""completion""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_continue"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(30612), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30613))).setId(30614), ISeq(List()).setId(30609)).setId(30615), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""completion""")), EStr("""Target"""))), ERef(RefId(Id("""CONST_empty""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(30617), IReturn(ERef(RefId(Id("""__x2__""")))).setId(30618))).setId(30619), ISeq(List()).setId(30609)).setId(30620), IIf(EContains(ERef(RefId(Id("""labelSet"""))), ERef(RefProp(RefId(Id("""completion""")), EStr("""Target""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(30622), IReturn(ERef(RefId(Id("""__x3__""")))).setId(30623))).setId(30624), ISeq(List()).setId(30609)).setId(30625), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(30627), IReturn(ERef(RefId(Id("""__x4__""")))).setId(30628))).setId(-1))
  /* Beautified form:
  "LoopContinues" (completion, labelSet) => {
    if (= completion["Type"] CONST_normal) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    if (! (= completion["Type"] CONST_continue)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (= completion["Target"] CONST_empty) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    if (contains labelSet completion["Target"]) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion false)
    return __x4__
  }
  */
}
