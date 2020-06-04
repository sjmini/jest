package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseDOTprototypeDOTcatch {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Promise.prototype.catch""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(92931), ILet(Id("""onRejected"""), ERef(RefId(Id("""__x0__""")))).setId(92932), ILet(Id("""promise"""), ERef(RefId(Id("""this""")))).setId(92934), IApp(Id("""__x1__"""), ERef(RefId(Id("""Invoke"""))), List(ERef(RefId(Id("""promise"""))), EStr("""then"""), EList(List(EUndef, ERef(RefId(Id("""onRejected"""))))))).setId(92936), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(92937), IReturn(ERef(RefId(Id("""__x1__""")))).setId(92938)).setId(92939), ISeq(List()).setId(92940)).setId(92941), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(92942), IReturn(ERef(RefId(Id("""__x2__""")))).setId(92943))).setId(-1))
  /* Beautified form:
  "GLOBAL.Promise.prototype.catch" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let onRejected = __x0__
    let promise = this
    app __x1__ = (Invoke promise "then" (new [undefined, onRejected]))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
