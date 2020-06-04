package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObjectDOTgetOwnPropertySymbols {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Object.getOwnPropertySymbols""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(64807), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(64808), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetOwnPropertyKeys"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Symbol"""))))).setId(64810), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(64811), IReturn(ERef(RefId(Id("""__x1__""")))).setId(64812)).setId(64813), ISeq(List()).setId(64814)).setId(64815), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(64816), IReturn(ERef(RefId(Id("""__x2__""")))).setId(64817))).setId(-1))
  /* Beautified form:
  "GLOBAL.Object.getOwnPropertySymbols" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (GetOwnPropertyKeys O Symbol)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
