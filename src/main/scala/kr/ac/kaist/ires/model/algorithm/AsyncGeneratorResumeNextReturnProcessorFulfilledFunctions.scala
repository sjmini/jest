package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorResumeNextReturnProcessorFulfilledFunctions {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorResumeNextReturnProcessorFulfilledFunctions""", List(), None, ISeq(List(ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(11478), IAssign(RefProp(RefProp(RefId(Id("""F""")), EStr("""Generator""")), EStr("""AsyncGeneratorState""")), EStr("""completed""")).setId(11480), IApp(Id("""__x0__"""), ERef(RefId(Id("""AsyncGeneratorResolve"""))), List(ERef(RefProp(RefId(Id("""F""")), EStr("""Generator"""))), ERef(RefId(Id("""value"""))), EBool(true))).setId(11482), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(11483), IReturn(ERef(RefId(Id("""__x0__""")))).setId(11484)).setId(11485), ISeq(List()).setId(11486)).setId(11487), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(11488), IReturn(ERef(RefId(Id("""__x1__""")))).setId(11489))).setId(-1))
  /* Beautified form:
  "AsyncGeneratorResumeNextReturnProcessorFulfilledFunctions" () => {
    let F = GLOBAL_context["Function"]
    F["Generator"]["AsyncGeneratorState"] = "completed"
    app __x0__ = (AsyncGeneratorResolve F["Generator"] value true)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
