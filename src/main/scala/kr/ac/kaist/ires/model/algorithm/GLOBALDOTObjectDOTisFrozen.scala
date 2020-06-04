package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObjectDOTisFrozen {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Object.isFrozen""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(65073), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(65074), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(65076), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(65077), IReturn(ERef(RefId(Id("""__x2__""")))).setId(65078))).setId(65079), ISeq(List()).setId(65080)).setId(65081), IApp(Id("""__x3__"""), ERef(RefId(Id("""TestIntegrityLevel"""))), List(ERef(RefId(Id("""O"""))), EStr("""frozen"""))).setId(65083), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(65084), IReturn(ERef(RefId(Id("""__x3__""")))).setId(65085)).setId(65086), ISeq(List()).setId(65080)).setId(65087), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(65088), IReturn(ERef(RefId(Id("""__x4__""")))).setId(65089))).setId(-1))
  /* Beautified form:
  "GLOBAL.Object.isFrozen" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (Type O)
    if (! (= __x1__ Object)) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (TestIntegrityLevel O "frozen")
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
