package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTINTRINSIC_AsyncGeneratorPrototypeDOTthrow {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.INTRINSIC_AsyncGeneratorPrototype.throw""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(89536), ILet(Id("""exception"""), ERef(RefId(Id("""__x0__""")))).setId(89537), ILet(Id("""generator"""), ERef(RefId(Id("""this""")))).setId(89539), IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(ERef(RefId(Id("""exception"""))))).setId(89541), ILet(Id("""completion"""), ERef(RefId(Id("""__x1__""")))).setId(89542), IApp(Id("""__x2__"""), ERef(RefId(Id("""AsyncGeneratorEnqueue"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefId(Id("""completion"""))))).setId(89544), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(89545), IReturn(ERef(RefId(Id("""__x2__""")))).setId(89546)).setId(89547), ISeq(List()).setId(89548)).setId(89549), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(89550), IReturn(ERef(RefId(Id("""__x3__""")))).setId(89551))).setId(-1))
  /* Beautified form:
  "GLOBAL.INTRINSIC_AsyncGeneratorPrototype.throw" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let exception = __x0__
    let generator = this
    app __x1__ = (ThrowCompletion exception)
    let completion = __x1__
    app __x2__ = (AsyncGeneratorEnqueue generator completion)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
