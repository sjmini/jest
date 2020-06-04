package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ResolveThisBinding {
  val length: Int = 0
  val func: Func = Func("""ResolveThisBinding""", List(), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetThisEnvironment"""))), List()).setId(8537), ILet(Id("""envRec"""), ERef(RefId(Id("""__x0__""")))).setId(8538), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""GetThisBinding"""))), List(ERef(RefId(Id("""envRec"""))))).setId(8540), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(8541), IReturn(ERef(RefId(Id("""__x1__""")))).setId(8542)).setId(8543), ISeq(List()).setId(8544)).setId(8545), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(8546), IReturn(ERef(RefId(Id("""__x2__""")))).setId(8547))).setId(-1))
  /* Beautified form:
  "ResolveThisBinding" () => {
    app __x0__ = (GetThisEnvironment )
    let envRec = __x0__
    app __x1__ = (envRec["GetThisBinding"] envRec)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
