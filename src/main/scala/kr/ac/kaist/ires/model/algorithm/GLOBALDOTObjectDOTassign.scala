package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObjectDOTassign {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.Object.assign""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(63722), ILet(Id("""target"""), ERef(RefId(Id("""__x0__""")))).setId(63723), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""target"""))))).setId(63725), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(63726), IReturn(ERef(RefId(Id("""__x1__""")))).setId(63727)).setId(63728), ISeq(List()).setId(63729)).setId(63730), ILet(Id("""to"""), ERef(RefId(Id("""__x1__""")))).setId(63731), IExpr(ENotSupported("""Etc""")).setId(63733), IExpr(ENotSupported("""Etc""")).setId(63733), IExpr(ENotSupported("""Etc""")).setId(63733), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""to"""))))).setId(63734), IReturn(ERef(RefId(Id("""__x2__""")))).setId(63735))).setId(-1))
  /* Beautified form:
  "GLOBAL.Object.assign" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let target = __x0__
    app __x1__ = (ToObject target)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let to = __x1__
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    app __x2__ = (WrapCompletion to)
    return __x2__
  }
  */
}
