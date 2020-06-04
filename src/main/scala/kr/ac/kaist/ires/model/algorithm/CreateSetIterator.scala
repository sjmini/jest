package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateSetIterator {
  val length: Int = 2
  val func: Func = Func("""CreateSetIterator""", List(Id("""set"""), Id("""kind""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""set"""))), EStr("""SetData"""))).setId(86333), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(86334), IReturn(ERef(RefId(Id("""__x0__""")))).setId(86335)).setId(86336), ISeq(List()).setId(86337)).setId(86338), IExpr(ERef(RefId(Id("""__x0__""")))).setId(86339), IApp(Id("""__x1__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_SetIteratorPrototype"""))), EList(List(EStr("""IteratedSet"""), EStr("""SetNextIndex"""), EStr("""SetIterationKind"""))))).setId(86341), ILet(Id("""iterator"""), ERef(RefId(Id("""__x1__""")))).setId(86342), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""IteratedSet""")), ERef(RefId(Id("""set""")))).setId(86344), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""SetNextIndex""")), EINum(0L)).setId(86346), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""SetIterationKind""")), ERef(RefId(Id("""kind""")))).setId(86348), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""iterator"""))))).setId(86350), IReturn(ERef(RefId(Id("""__x2__""")))).setId(86351))).setId(-1))
  /* Beautified form:
  "CreateSetIterator" (set, kind) => {
    app __x0__ = (RequireInternalSlot set "SetData")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (ObjectCreate INTRINSIC_SetIteratorPrototype (new ["IteratedSet", "SetNextIndex", "SetIterationKind"]))
    let iterator = __x1__
    iterator["IteratedSet"] = set
    iterator["SetNextIndex"] = 0i
    iterator["SetIterationKind"] = kind
    app __x2__ = (WrapCompletion iterator)
    return __x2__
  }
  */
}
