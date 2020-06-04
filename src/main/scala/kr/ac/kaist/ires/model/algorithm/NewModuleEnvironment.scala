package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NewModuleEnvironment {
  val length: Int = 1
  val func: Func = Func("""NewModuleEnvironment""", List(Id("""E""")), None, ISeq(List(ILet(Id("""env"""), EMap(Ty("""LexicalEnvironment"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(8113), IExpr(ENotSupported("""Etc""")).setId(8115), IAssign(RefProp(RefId(Id("""env""")), EStr("""EnvironmentRecord""")), ERef(RefId(Id("""envRec""")))).setId(8116), IAssign(RefProp(RefId(Id("""env""")), EStr("""Outer""")), ERef(RefId(Id("""E""")))).setId(8118), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""env"""))))).setId(8120), IReturn(ERef(RefId(Id("""__x0__""")))).setId(8121))).setId(-1))
  /* Beautified form:
  "NewModuleEnvironment" (E) => {
    let env = (new LexicalEnvironment("SubMap" -> (new SubMap())))
    !!! "Etc"
    env["EnvironmentRecord"] = envRec
    env["Outer"] = E
    app __x0__ = (WrapCompletion env)
    return __x0__
  }
  */
}
