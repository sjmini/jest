package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTFunction {
  val length: Int = 5
  val func: Func = Func("""GLOBAL.Function""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""C"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(66117), ILet(Id("""args"""), ERef(RefId(Id("""argumentsList""")))).setId(66119), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateDynamicFunction"""))), List(ERef(RefId(Id("""C"""))), ERef(RefId(Id("""NewTarget"""))), EStr("""normal"""), ERef(RefId(Id("""args"""))))).setId(66121), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(66122), IReturn(ERef(RefId(Id("""__x0__""")))).setId(66123)).setId(66124), ISeq(List()).setId(66125)).setId(66126), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(66127), IReturn(ERef(RefId(Id("""__x1__""")))).setId(66128))).setId(-1))
  /* Beautified form:
  "GLOBAL.Function" (this, argumentsList, NewTarget) => {
    let C = GLOBAL_context["Function"]
    let args = argumentsList
    app __x0__ = (CreateDynamicFunction C NewTarget "normal" args)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
