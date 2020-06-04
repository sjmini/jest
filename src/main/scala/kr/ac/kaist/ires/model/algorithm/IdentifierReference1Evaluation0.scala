package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IdentifierReference1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""IdentifierReference1Evaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ResolveBinding"""))), List(EStr("""yield"""))).setId(13390), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(13391), IReturn(ERef(RefId(Id("""__x0__""")))).setId(13392)).setId(13393), ISeq(List()).setId(13394)).setId(13395), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(13396), IReturn(ERef(RefId(Id("""__x1__""")))).setId(13397))).setId(-1))
  /* Beautified form:
  "IdentifierReference1Evaluation0" (this) => {
    app __x0__ = (ResolveBinding "yield")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
