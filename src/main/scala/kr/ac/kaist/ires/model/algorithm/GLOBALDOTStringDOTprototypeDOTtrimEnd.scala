package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTtrimEnd {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.String.prototype.trimEnd""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""S"""), ERef(RefId(Id("""this""")))).setId(74367), IApp(Id("""__x0__"""), ERef(RefId(Id("""TrimString"""))), List(ERef(RefId(Id("""S"""))), EStr("""end"""))).setId(74369), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(74370), IReturn(ERef(RefId(Id("""__x0__""")))).setId(74371)).setId(74372), ISeq(List()).setId(74373)).setId(74374), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(74375), IReturn(ERef(RefId(Id("""__x1__""")))).setId(74376))).setId(-1))
  /* Beautified form:
  "GLOBAL.String.prototype.trimEnd" (this, argumentsList, NewTarget) => {
    let S = this
    app __x0__ = (TrimString S "end")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
