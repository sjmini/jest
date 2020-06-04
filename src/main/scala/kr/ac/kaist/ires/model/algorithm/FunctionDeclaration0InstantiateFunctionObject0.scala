package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionDeclaration0InstantiateFunctionObject0 {
  val length: Int = 0
  val func: Func = Func("""FunctionDeclaration0InstantiateFunctionObject0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""FormalParameters"""), Id("""FunctionBody"""), Id("""scope""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(38419), ILet(Id("""name"""), ERef(RefId(Id("""__x0__""")))).setId(38420), IApp(Id("""__x1__"""), ERef(RefId(Id("""FunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""FunctionBody"""))), ERef(RefId(Id("""scope"""))))).setId(38422), ILet(Id("""F"""), ERef(RefId(Id("""__x1__""")))).setId(38423), IApp(Id("""__x2__"""), ERef(RefId(Id("""MakeConstructor"""))), List(ERef(RefId(Id("""F"""))))).setId(38425), IExpr(ERef(RefId(Id("""__x2__""")))).setId(38426), IApp(Id("""__x3__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""name"""))))).setId(38428), IExpr(ERef(RefId(Id("""__x3__""")))).setId(38429), IAssign(RefProp(RefId(Id("""F""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(38431), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(38433), IReturn(ERef(RefId(Id("""__x4__""")))).setId(38434))).setId(-1))
  /* Beautified form:
  "FunctionDeclaration0InstantiateFunctionObject0" (this, BindingIdentifier, FormalParameters, FunctionBody, scope) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let name = __x0__
    app __x1__ = (FunctionCreate CONST_Normal FormalParameters FunctionBody scope)
    let F = __x1__
    app __x2__ = (MakeConstructor F)
    __x2__
    app __x3__ = (SetFunctionName F name)
    __x3__
    F["SourceText"] = (get-syntax this)
    app __x4__ = (WrapCompletion F)
    return __x4__
  }
  */
}
