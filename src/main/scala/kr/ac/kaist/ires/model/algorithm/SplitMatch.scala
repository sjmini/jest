package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SplitMatch {
  val length: Int = 3
  val func: Func = Func("""SplitMatch""", List(Id("""S"""), Id("""q"""), Id("""R""")), None, ISeq(List(ILet(Id("""r"""), ERef(RefProp(RefId(Id("""R""")), EStr("""length""")))).setId(73802), ILet(Id("""s"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))).setId(73804), IIf(EBOp(OLt, ERef(RefId(Id("""s"""))), EBOp(OPlus, ERef(RefId(Id("""q"""))), ERef(RefId(Id("""r"""))))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(73806), IReturn(ERef(RefId(Id("""__x0__""")))).setId(73807))).setId(73808), ISeq(List()).setId(73801)).setId(73809), IExpr(ENotSupported("""NumberOp""")).setId(73811), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""q"""))), ERef(RefId(Id("""r""")))))).setId(73812), IReturn(ERef(RefId(Id("""__x1__""")))).setId(73813))).setId(-1))
  /* Beautified form:
  "SplitMatch" (S, q, R) => {
    let r = R["length"]
    let s = S["length"]
    if (< s (+ q r)) {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {}
    !!! "NumberOp"
    app __x1__ = (WrapCompletion (+ q r))
    return __x1__
  }
  */
}
