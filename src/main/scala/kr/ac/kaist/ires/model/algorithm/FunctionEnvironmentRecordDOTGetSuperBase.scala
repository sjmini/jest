package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionEnvironmentRecordDOTGetSuperBase {
  val length: Int = 0
  val func: Func = Func("""FunctionEnvironmentRecord.GetSuperBase""", List(Id("""this""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47976), ILet(Id("""home"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""HomeObject""")))).setId(47978), IIf(EBOp(OEq, ERef(RefId(Id("""home"""))), EUndef), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(47980), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47981))).setId(47982), ISeq(List()).setId(47983)).setId(47984), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""home""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""home"""))))).setId(47986), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(47987), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47988)).setId(47989), ISeq(List()).setId(47983)).setId(47990), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(47991), IReturn(ERef(RefId(Id("""__x2__""")))).setId(47992))).setId(-1))
  /* Beautified form:
  "FunctionEnvironmentRecord.GetSuperBase" (this) => {
    let envRec = this
    let home = envRec["HomeObject"]
    if (= home undefined) {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    app __x1__ = (home["GetPrototypeOf"] home)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
