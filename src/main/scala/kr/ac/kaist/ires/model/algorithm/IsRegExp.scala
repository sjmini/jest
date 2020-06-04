package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsRegExp {
  val length: Int = 1
  val func: Func = Func("""IsRegExp""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""argument"""))))).setId(3657), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3658), IReturn(ERef(RefId(Id("""__x1__""")))).setId(3659))).setId(3660), ISeq(List()).setId(3661)).setId(3662), IApp(Id("""__x2__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""argument"""))), ERef(RefId(Id("""SYMBOL_match"""))))).setId(3664), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(3665), IReturn(ERef(RefId(Id("""__x2__""")))).setId(3666)).setId(3667), ISeq(List()).setId(3661)).setId(3668), ILet(Id("""matcher"""), ERef(RefId(Id("""__x2__""")))).setId(3669), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""matcher"""))), EUndef)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""matcher"""))))).setId(3671), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(3672), IReturn(ERef(RefId(Id("""__x3__""")))).setId(3673)).setId(3674), ISeq(List()).setId(3661)).setId(3675), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(3676), IReturn(ERef(RefId(Id("""__x4__""")))).setId(3677))).setId(3678), ISeq(List()).setId(3661)).setId(3679), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argument""")), EStr("""RegExpMatcher"""))), EAbsent)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3681), IReturn(ERef(RefId(Id("""__x5__""")))).setId(3682))).setId(3683), ISeq(List()).setId(3661)).setId(3684), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3686), IReturn(ERef(RefId(Id("""__x6__""")))).setId(3687))).setId(-1))
  /* Beautified form:
  "IsRegExp" (argument) => {
    app __x0__ = (Type argument)
    if (! (= __x0__ Object)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    app __x2__ = (Get argument SYMBOL_match)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let matcher = __x2__
    if (! (= matcher undefined)) {
      app __x3__ = (ToBoolean matcher)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    if (! (= argument["RegExpMatcher"] absent)) {
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    app __x6__ = (WrapCompletion false)
    return __x6__
  }
  */
}
