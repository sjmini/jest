package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryObjectDOTOwnPropertyKeys {
  val length: Int = 0
  val func: Func = Func("""OrdinaryObject.OwnPropertyKeys""", List(Id("""O""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryOwnPropertyKeys"""))), List(ERef(RefId(Id("""O"""))))).setId(50951), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(50952), IReturn(ERef(RefId(Id("""__x0__""")))).setId(50953)).setId(50954), ISeq(List()).setId(50955)).setId(50956), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(50957), IReturn(ERef(RefId(Id("""__x1__""")))).setId(50958))).setId(-1))
  /* Beautified form:
  "OrdinaryObject.OwnPropertyKeys" (O) => {
    app __x0__ = (OrdinaryOwnPropertyKeys O)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
