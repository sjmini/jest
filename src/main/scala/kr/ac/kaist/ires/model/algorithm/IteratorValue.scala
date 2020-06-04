package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IteratorValue {
  val length: Int = 1
  val func: Func = Func("""IteratorValue""", List(Id("""iterResult""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""iterResult"""))), EStr("""value"""))).setId(7384), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(7385), IReturn(ERef(RefId(Id("""__x0__""")))).setId(7386)).setId(7387), ISeq(List()).setId(7383)).setId(7388), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(7389), IReturn(ERef(RefId(Id("""__x1__""")))).setId(7390))).setId(-1))
  /* Beautified form:
  "IteratorValue" (iterResult) => {
    app __x0__ = (Get iterResult "value")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
