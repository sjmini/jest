package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTMapDOTprototypeDOTvalues {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Map.prototype.values""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""M"""), ERef(RefId(Id("""this""")))).setId(85179), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateMapIterator"""))), List(ERef(RefId(Id("""M"""))), EStr("""value"""))).setId(85181), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(85182), IReturn(ERef(RefId(Id("""__x0__""")))).setId(85183)).setId(85184), ISeq(List()).setId(85185)).setId(85186), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(85187), IReturn(ERef(RefId(Id("""__x1__""")))).setId(85188))).setId(-1))
  /* Beautified form:
  "GLOBAL.Map.prototype.values" (this, argumentsList, NewTarget) => {
    let M = this
    app __x0__ = (CreateMapIterator M "value")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
