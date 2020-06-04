package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTINTRINSIC_GeneratorPrototypeDOTnext {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.INTRINSIC_GeneratorPrototype.next""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(88708), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(88709), ILet(Id("""g"""), ERef(RefId(Id("""this""")))).setId(88711), IApp(Id("""__x1__"""), ERef(RefId(Id("""GeneratorResume"""))), List(ERef(RefId(Id("""g"""))), ERef(RefId(Id("""value"""))))).setId(88713), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(88714), IReturn(ERef(RefId(Id("""__x1__""")))).setId(88715)).setId(88716), ISeq(List()).setId(88717)).setId(88718), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(88719), IReturn(ERef(RefId(Id("""__x2__""")))).setId(88720))).setId(-1))
  /* Beautified form:
  "GLOBAL.INTRINSIC_GeneratorPrototype.next" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let g = this
    app __x1__ = (GeneratorResume g value)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
