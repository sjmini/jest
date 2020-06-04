package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTmatchAll {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.matchAll""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(72022), ILet(Id("""regexp"""), ERef(RefId(Id("""__x0__""")))).setId(72023), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(72025), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(72026), IReturn(ERef(RefId(Id("""__x1__""")))).setId(72027)).setId(72028), ISeq(List()).setId(72029)).setId(72030), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(72031), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""regexp"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""regexp"""))), ENull))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""regexp"""))), ERef(RefId(Id("""SYMBOL_matchAll"""))))).setId(72033), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(72034), IReturn(ERef(RefId(Id("""__x2__""")))).setId(72035)).setId(72036), ISeq(List()).setId(72029)).setId(72037), ILet(Id("""matcher"""), ERef(RefId(Id("""__x2__""")))).setId(72038), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""matcher"""))), EUndef)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""matcher"""))), ERef(RefId(Id("""regexp"""))), EList(List(ERef(RefId(Id("""O"""))))))).setId(72040), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(72041), IReturn(ERef(RefId(Id("""__x3__""")))).setId(72042)).setId(72043), ISeq(List()).setId(72029)).setId(72044), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(72045), IReturn(ERef(RefId(Id("""__x4__""")))).setId(72046))).setId(72048), ISeq(List()).setId(72029)).setId(72049))).setId(72051), ISeq(List()).setId(72029)).setId(72052), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(72054), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(72055), IReturn(ERef(RefId(Id("""__x5__""")))).setId(72056)).setId(72057), ISeq(List()).setId(72029)).setId(72058), ILet(Id("""S"""), ERef(RefId(Id("""__x5__""")))).setId(72059), IApp(Id("""__x6__"""), ERef(RefId(Id("""RegExpCreate"""))), List(ERef(RefId(Id("""regexp"""))), EStr("""g"""))).setId(72061), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(72062), IReturn(ERef(RefId(Id("""__x6__""")))).setId(72063)).setId(72064), ISeq(List()).setId(72029)).setId(72065), ILet(Id("""rx"""), ERef(RefId(Id("""__x6__""")))).setId(72066), IApp(Id("""__x7__"""), ERef(RefId(Id("""Invoke"""))), List(ERef(RefId(Id("""rx"""))), ERef(RefId(Id("""SYMBOL_matchAll"""))), EList(List(ERef(RefId(Id("""S"""))))))).setId(72068), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(72069), IReturn(ERef(RefId(Id("""__x7__""")))).setId(72070)).setId(72071), ISeq(List()).setId(72029)).setId(72072), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(72073), IReturn(ERef(RefId(Id("""__x8__""")))).setId(72074))).setId(-1))
  /* Beautified form:
  "GLOBAL.String.prototype.matchAll" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let regexp = __x0__
    app __x1__ = (RequireObjectCoercible this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    if (! (|| (= regexp undefined) (= regexp null))) {
      app __x2__ = (GetMethod regexp SYMBOL_matchAll)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let matcher = __x2__
      if (! (= matcher undefined)) {
        app __x3__ = (Call matcher regexp (new [O]))
        if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
    } else {}
    app __x5__ = (ToString O)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let S = __x5__
    app __x6__ = (RegExpCreate regexp "g")
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let rx = __x6__
    app __x7__ = (Invoke rx SYMBOL_matchAll (new [S]))
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
