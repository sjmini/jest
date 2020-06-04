package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionDeclaration1InstantiateFunctionObject0 {
  val length: Int = 0
  val func: Func = Func("""FunctionDeclaration1InstantiateFunctionObject0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""FunctionBody"""), Id("""scope""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""FunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""FunctionBody"""))), ERef(RefId(Id("""scope"""))))).setId(38461), ILet(Id("""F"""), ERef(RefId(Id("""__x0__""")))).setId(38462), IApp(Id("""__x1__"""), ERef(RefId(Id("""MakeConstructor"""))), List(ERef(RefId(Id("""F"""))))).setId(38464), IExpr(ERef(RefId(Id("""__x1__""")))).setId(38465), IApp(Id("""__x2__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""F"""))), EStr("""default"""))).setId(38467), IExpr(ERef(RefId(Id("""__x2__""")))).setId(38468), IAssign(RefProp(RefId(Id("""F""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(38470), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(38472), IReturn(ERef(RefId(Id("""__x3__""")))).setId(38473))).setId(-1))
  /* Beautified form:
  "FunctionDeclaration1InstantiateFunctionObject0" (this, FormalParameters, FunctionBody, scope) => {
    app __x0__ = (FunctionCreate CONST_Normal FormalParameters FunctionBody scope)
    let F = __x0__
    app __x1__ = (MakeConstructor F)
    __x1__
    app __x2__ = (SetFunctionName F "default")
    __x2__
    F["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion F)
    return __x3__
  }
  */
}
