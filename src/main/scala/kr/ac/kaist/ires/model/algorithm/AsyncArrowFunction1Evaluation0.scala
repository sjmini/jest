package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncArrowFunction1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""AsyncArrowFunction1Evaluation0""", List(Id("""this"""), Id("""CoverCallExpressionAndAsyncArrowHead"""), Id("""AsyncConciseBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""GLOBAL_context"""))), EStr("""LexicalEnvironment""")).setId(44601), ILet(Id("""scope"""), ERef(RefId(Id("""__x0__""")))).setId(44602), IAccess(Id("""__x1__"""), ERef(RefId(Id("""CoverCallExpressionAndAsyncArrowHead"""))), EStr("""CoveredAsyncArrowHead""")).setId(44604), ILet(Id("""head"""), ERef(RefId(Id("""__x1__""")))).setId(44605), IAccess(Id("""__x2__"""), ERef(RefId(Id("""head"""))), EStr("""ArrowFormalParameters""")).setId(44607), ILet(Id("""parameters"""), ERef(RefId(Id("""__x2__""")))).setId(44608), IApp(Id("""__x3__"""), ERef(RefId(Id("""AsyncFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Arrow"""))), ERef(RefId(Id("""parameters"""))), ERef(RefId(Id("""AsyncConciseBody"""))), ERef(RefId(Id("""scope"""))))).setId(44610), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(44611), IReturn(ERef(RefId(Id("""__x3__""")))).setId(44612)).setId(44613), ISeq(List()).setId(44614)).setId(44615), ILet(Id("""closure"""), ERef(RefId(Id("""__x3__""")))).setId(44616), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(44618), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(44620), IReturn(ERef(RefId(Id("""__x4__""")))).setId(44621))).setId(-1))
  /* Beautified form:
  "AsyncArrowFunction1Evaluation0" (this, CoverCallExpressionAndAsyncArrowHead, AsyncConciseBody) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    access __x1__ = (CoverCallExpressionAndAsyncArrowHead "CoveredAsyncArrowHead")
    let head = __x1__
    access __x2__ = (head "ArrowFormalParameters")
    let parameters = __x2__
    app __x3__ = (AsyncFunctionCreate CONST_Arrow parameters AsyncConciseBody scope)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let closure = __x3__
    closure["SourceText"] = (get-syntax this)
    app __x4__ = (WrapCompletion closure)
    return __x4__
  }
  */
}
