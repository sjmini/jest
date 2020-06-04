package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTSetDOTprototypeDOTentries {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Set.prototype.entries""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""S"""), ERef(RefId(Id("""this""")))).setId(85957), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateSetIterator"""))), List(ERef(RefId(Id("""S"""))), EStr("""key+value"""))).setId(85959), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(85960), IReturn(ERef(RefId(Id("""__x0__""")))).setId(85961)).setId(85962), ISeq(List()).setId(85963)).setId(85964), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(85965), IReturn(ERef(RefId(Id("""__x1__""")))).setId(85966))).setId(-1))
  /* Beautified form:
  "GLOBAL.Set.prototype.entries" (this, argumentsList, NewTarget) => {
    let S = this
    app __x0__ = (CreateSetIterator S "key+value")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
