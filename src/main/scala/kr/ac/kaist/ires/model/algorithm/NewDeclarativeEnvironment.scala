package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NewDeclarativeEnvironment {
  val length: Int = 1
  val func: Func = Func("""NewDeclarativeEnvironment""", List(Id("""E""")), None, ISeq(List(ILet(Id("""env"""), EMap(Ty("""LexicalEnvironment"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(7956), ILet(Id("""envRec"""), EMap(Ty("""DeclarativeEnvironmentRecord"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(7958), IAssign(RefProp(RefId(Id("""env""")), EStr("""EnvironmentRecord""")), ERef(RefId(Id("""envRec""")))).setId(7960), IAssign(RefProp(RefId(Id("""env""")), EStr("""Outer""")), ERef(RefId(Id("""E""")))).setId(7962), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""env"""))))).setId(7964), IReturn(ERef(RefId(Id("""__x0__""")))).setId(7965))).setId(-1))
  /* Beautified form:
  "NewDeclarativeEnvironment" (E) => {
    let env = (new LexicalEnvironment("SubMap" -> (new SubMap())))
    let envRec = (new DeclarativeEnvironmentRecord("SubMap" -> (new SubMap())))
    env["EnvironmentRecord"] = envRec
    env["Outer"] = E
    app __x0__ = (WrapCompletion env)
    return __x0__
  }
  */
}
