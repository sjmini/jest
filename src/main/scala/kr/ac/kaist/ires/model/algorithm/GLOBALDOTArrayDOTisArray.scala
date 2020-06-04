package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTisArray {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.isArray""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(75673), ILet(Id("""arg"""), ERef(RefId(Id("""__x0__""")))).setId(75674), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsArray"""))), List(ERef(RefId(Id("""arg"""))))).setId(75676), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(75677), IReturn(ERef(RefId(Id("""__x1__""")))).setId(75678)).setId(75679), ISeq(List()).setId(75680)).setId(75681), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(75682), IReturn(ERef(RefId(Id("""__x2__""")))).setId(75683))).setId(-1))
  /* Beautified form:
  "GLOBAL.Array.isArray" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let arg = __x0__
    app __x1__ = (IsArray arg)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
