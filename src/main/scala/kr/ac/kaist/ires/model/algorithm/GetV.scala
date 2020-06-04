package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetV {
  val length: Int = 2
  val func: Func = Func("""GetV""", List(Id("""V"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""V"""))))).setId(4994), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(4995), IReturn(ERef(RefId(Id("""__x0__""")))).setId(4996)).setId(4997), ISeq(List()).setId(4993)).setId(4998), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(4999), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))))).setId(5001), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(5002), IReturn(ERef(RefId(Id("""__x1__""")))).setId(5003)).setId(5004), ISeq(List()).setId(4993)).setId(5005), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(5006), IReturn(ERef(RefId(Id("""__x2__""")))).setId(5007))).setId(-1))
  /* Beautified form:
  "GetV" (V, P) => {
    app __x0__ = (ToObject V)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (O["Get"] O P V)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
