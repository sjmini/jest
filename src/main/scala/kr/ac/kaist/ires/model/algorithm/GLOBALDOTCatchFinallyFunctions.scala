package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTCatchFinallyFunctions {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.CatchFinallyFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(93220), ILet(Id("""onFinally"""), ERef(RefProp(RefId(Id("""F""")), EStr("""OnFinally""")))).setId(93222), IApp(Id("""__x0__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""onFinally"""))), EUndef)).setId(93225), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(93226), IReturn(ERef(RefId(Id("""__x0__""")))).setId(93227)).setId(93228), ISeq(List()).setId(93224)).setId(93229), ILet(Id("""result"""), ERef(RefId(Id("""__x0__""")))).setId(93230), ILet(Id("""C"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Constructor""")))).setId(93232), IApp(Id("""__x1__"""), ERef(RefId(Id("""PromiseResolve"""))), List(ERef(RefId(Id("""C"""))), ERef(RefId(Id("""result"""))))).setId(93234), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(93235), IReturn(ERef(RefId(Id("""__x1__""")))).setId(93236)).setId(93237), ISeq(List()).setId(93224)).setId(93238), ILet(Id("""promise"""), ERef(RefId(Id("""__x1__""")))).setId(93239), IExpr(ENotSupported("""Etc""")).setId(93241), IApp(Id("""__x2__"""), ERef(RefId(Id("""Invoke"""))), List(ERef(RefId(Id("""promise"""))), EStr("""then"""), EList(List(ERef(RefId(Id("""thrower"""))))))).setId(93242), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(93243), IReturn(ERef(RefId(Id("""__x2__""")))).setId(93244)).setId(93245), ISeq(List()).setId(93224)).setId(93246), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(93247), IReturn(ERef(RefId(Id("""__x3__""")))).setId(93248))).setId(-1))
  /* Beautified form:
  "GLOBAL.CatchFinallyFunctions" (this, argumentsList, NewTarget) => {
    let F = GLOBAL_context["Function"]
    let onFinally = F["OnFinally"]
    app __x0__ = (Call onFinally undefined)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let result = __x0__
    let C = F["Constructor"]
    app __x1__ = (PromiseResolve C result)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promise = __x1__
    !!! "Etc"
    app __x2__ = (Invoke promise "then" (new [thrower]))
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
