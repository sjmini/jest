package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryDelete {
  val length: Int = 2
  val func: Func = Func("""OrdinaryDelete""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(50886), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(50887), IReturn(ERef(RefId(Id("""__x0__""")))).setId(50888)).setId(50889), ISeq(List()).setId(50885)).setId(50890), ILet(Id("""desc"""), ERef(RefId(Id("""__x0__""")))).setId(50891), IIf(EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(50893), IReturn(ERef(RefId(Id("""__x1__""")))).setId(50894))).setId(50895), ISeq(List()).setId(50885)).setId(50896), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Configurable"""))), EBool(true)), ISeq(List(IDelete(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P"""))))).setId(50898), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(50899), IReturn(ERef(RefId(Id("""__x2__""")))).setId(50900))).setId(50902), ISeq(List()).setId(50885)).setId(50903), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(50905), IReturn(ERef(RefId(Id("""__x3__""")))).setId(50906))).setId(-1))
  /* Beautified form:
  "OrdinaryDelete" (O, P) => {
    app __x0__ = (O["GetOwnProperty"] O P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let desc = __x0__
    if (= desc undefined) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
    if (= desc["Configurable"] true) {
      delete O["SubMap"][P]
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion false)
    return __x3__
  }
  */
}
