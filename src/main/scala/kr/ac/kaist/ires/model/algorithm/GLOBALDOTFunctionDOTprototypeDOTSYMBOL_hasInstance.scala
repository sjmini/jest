package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTFunctionDOTprototypeDOTSYMBOL_hasInstance {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Function.prototype.SYMBOL_hasInstance""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(67325), ILet(Id("""V"""), ERef(RefId(Id("""__x0__""")))).setId(67326), ILet(Id("""F"""), ERef(RefId(Id("""this""")))).setId(67328), IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryHasInstance"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""V"""))))).setId(67330), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(67331), IReturn(ERef(RefId(Id("""__x1__""")))).setId(67332)).setId(67333), ISeq(List()).setId(67334)).setId(67335), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(67336), IReturn(ERef(RefId(Id("""__x2__""")))).setId(67337))).setId(-1))
  /* Beautified form:
  "GLOBAL.Function.prototype.SYMBOL_hasInstance" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let V = __x0__
    let F = this
    app __x1__ = (OrdinaryHasInstance F V)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
