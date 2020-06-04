package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinarySet {
  val length: Int = 4
  val func: Func = Func("""OrdinarySet""", List(Id("""O"""), Id("""P"""), Id("""V"""), Id("""Receiver""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(50545), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(50546), IReturn(ERef(RefId(Id("""__x0__""")))).setId(50547)).setId(50548), ISeq(List()).setId(50544)).setId(50549), ILet(Id("""ownDesc"""), ERef(RefId(Id("""__x0__""")))).setId(50550), IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinarySetWithOwnDescriptor"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""V"""))), ERef(RefId(Id("""Receiver"""))), ERef(RefId(Id("""ownDesc"""))))).setId(50552), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(50553), IReturn(ERef(RefId(Id("""__x2__""")))).setId(50554))).setId(-1))
  /* Beautified form:
  "OrdinarySet" (O, P, V, Receiver) => {
    app __x0__ = (O["GetOwnProperty"] O P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let ownDesc = __x0__
    app __x1__ = (OrdinarySetWithOwnDescriptor O P V Receiver ownDesc)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
