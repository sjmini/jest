package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTAsyncfromSyncIteratorValueUnwrapFunctions {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.AsyncfromSyncIteratorValueUnwrapFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(88405), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(88406), ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(88408), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""value"""))), ERef(RefProp(RefId(Id("""F""")), EStr("""Done"""))))).setId(88410), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(88411), IReturn(ERef(RefId(Id("""__x1__""")))).setId(88412)).setId(88413), ISeq(List()).setId(88414)).setId(88415), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(88416), IReturn(ERef(RefId(Id("""__x2__""")))).setId(88417))).setId(-1))
  /* Beautified form:
  "GLOBAL.AsyncfromSyncIteratorValueUnwrapFunctions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let F = GLOBAL_context["Function"]
    app __x1__ = (CreateIterResultObject value F["Done"])
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
