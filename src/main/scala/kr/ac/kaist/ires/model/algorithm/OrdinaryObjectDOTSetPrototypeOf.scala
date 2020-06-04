package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryObjectDOTSetPrototypeOf {
  val length: Int = 1
  val func: Func = Func("""OrdinaryObject.SetPrototypeOf""", List(Id("""O"""), Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinarySetPrototypeOf"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""V"""))))).setId(49209), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(49210), IReturn(ERef(RefId(Id("""__x0__""")))).setId(49211)).setId(49212), ISeq(List()).setId(49213)).setId(49214), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(49215), IReturn(ERef(RefId(Id("""__x1__""")))).setId(49216))).setId(-1))
  /* Beautified form:
  "OrdinaryObject.SetPrototypeOf" (O, V) => {
    app __x0__ = (OrdinarySetPrototypeOf O V)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
