package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTCreateDataPropertyOnObjectFunctions {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.CreateDataPropertyOnObjectFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))).setId(64451), IApp(Id("""__x0__"""), ERef(RefId(Id("""ToPropertyKey"""))), List(ERef(RefId(Id("""key"""))))).setId(64454), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(64455), IReturn(ERef(RefId(Id("""__x0__""")))).setId(64456)).setId(64457), ISeq(List()).setId(64453)).setId(64458), ILet(Id("""propertyKey"""), ERef(RefId(Id("""__x0__""")))).setId(64459), IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""propertyKey"""))), ERef(RefId(Id("""value"""))))).setId(64461), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(64462), IReturn(ERef(RefId(Id("""__x1__""")))).setId(64463)).setId(64464), ISeq(List()).setId(64453)).setId(64465), IExpr(ERef(RefId(Id("""__x1__""")))).setId(64466), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(64468), IReturn(ERef(RefId(Id("""__x2__""")))).setId(64469))).setId(-1))
  /* Beautified form:
  "GLOBAL.CreateDataPropertyOnObjectFunctions" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (ToPropertyKey key)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let propertyKey = __x0__
    app __x1__ = (CreateDataPropertyOrThrow O propertyKey value)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (WrapCompletion undefined)
    return __x2__
  }
  */
}
