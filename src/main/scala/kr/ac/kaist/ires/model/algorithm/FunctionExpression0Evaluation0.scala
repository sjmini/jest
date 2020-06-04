package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionExpression0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""FunctionExpression0Evaluation0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""FunctionBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""GLOBAL_context"""))), EStr("""LexicalEnvironment""")).setId(38547), ILet(Id("""scope"""), ERef(RefId(Id("""__x0__""")))).setId(38548), IApp(Id("""__x1__"""), ERef(RefId(Id("""FunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""FunctionBody"""))), ERef(RefId(Id("""scope"""))))).setId(38550), ILet(Id("""closure"""), ERef(RefId(Id("""__x1__""")))).setId(38551), IApp(Id("""__x2__"""), ERef(RefId(Id("""MakeConstructor"""))), List(ERef(RefId(Id("""closure"""))))).setId(38553), IExpr(ERef(RefId(Id("""__x2__""")))).setId(38554), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(38556), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(38558), IReturn(ERef(RefId(Id("""__x3__""")))).setId(38559))).setId(-1))
  /* Beautified form:
  "FunctionExpression0Evaluation0" (this, FormalParameters, FunctionBody) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    app __x1__ = (FunctionCreate CONST_Normal FormalParameters FunctionBody scope)
    let closure = __x1__
    app __x2__ = (MakeConstructor closure)
    __x2__
    closure["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion closure)
    return __x3__
  }
  */
}
