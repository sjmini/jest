package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTtrimEnd {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.String.prototype.trimEnd""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""S"""), ERef(RefId(Id("""this""")))), IApp(Id("""__x0__"""), ERef(RefId(Id("""TrimString"""))), List(ERef(RefId(Id("""S"""))), EStr("""end"""))), IIf(EIsCompletion(ERef(RefId(Id("""__x0__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x0__"""))))), ISeq(List())), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))), IReturn(ERef(RefId(Id("""__x1__""")))))))
  /* Beautified form:
  "GLOBAL.String.prototype.trimEnd" (this, argumentsList, NewTarget) => {
    let S = this
    app __x0__ = (TrimString S "end")
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}