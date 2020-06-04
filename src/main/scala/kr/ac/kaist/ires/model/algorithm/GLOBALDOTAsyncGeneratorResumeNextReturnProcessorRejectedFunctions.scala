package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAsyncGeneratorResumeNextReturnProcessorRejectedFunctions {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.AsyncGeneratorResumeNextReturnProcessorRejectedFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(90343), ILet(Id("""reason"""), ERef(RefId(Id("""__x0__""")))).setId(90344), ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(90346), IAssign(RefProp(RefProp(RefId(Id("""F""")), EStr("""Generator""")), EStr("""AsyncGeneratorState""")), EStr("""completed""")).setId(90348), IApp(Id("""__x1__"""), ERef(RefId(Id("""AsyncGeneratorReject"""))), List(ERef(RefProp(RefId(Id("""F""")), EStr("""Generator"""))), ERef(RefId(Id("""reason"""))))).setId(90350), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(90351), IReturn(ERef(RefId(Id("""__x1__""")))).setId(90352)).setId(90353), ISeq(List()).setId(90354)).setId(90355), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(90356), IReturn(ERef(RefId(Id("""__x2__""")))).setId(90357))).setId(-1))
  /* Beautified form:
  "GLOBAL.AsyncGeneratorResumeNextReturnProcessorRejectedFunctions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let reason = __x0__
    let F = GLOBAL_context["Function"]
    F["Generator"]["AsyncGeneratorState"] = "completed"
    app __x1__ = (AsyncGeneratorReject F["Generator"] reason)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
