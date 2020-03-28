package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IteratorValue {
  val length: Int = 1
  val func: Func = Func("""IteratorValue""", List(Id("""iterResult""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""iterResult"""))))), IAssert(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), IApp(Id("""__x1__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""iterResult"""))), EStr("""value"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x1__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x1__"""))))), ISeq(List())), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))), IReturn(ERef(RefId(Id("""__x2__""")))))))
  /* Beautified form:
  "IteratorValue" (iterResult) => {
    app __x0__ = (Type iterResult)
    assert (= __x0__ Object)
    app __x1__ = (Get iterResult "value")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}