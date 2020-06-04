package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NewGlobalEnvironment {
  val length: Int = 2
  val func: Func = Func("""NewGlobalEnvironment""", List(Id("""G"""), Id("""thisValue""")), None, ISeq(List(ILet(Id("""env"""), EMap(Ty("""LexicalEnvironment"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(8063), ILet(Id("""objRec"""), EMap(Ty("""ObjectEnvironmentRecord"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())), (EStr("""BindingObject"""), ERef(RefId(Id("""G"""))))))).setId(8065), ILet(Id("""dclRec"""), EMap(Ty("""DeclarativeEnvironmentRecord"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(8067), ILet(Id("""globalRec"""), EMap(Ty("""GlobalEnvironmentRecord"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(8069), IAssign(RefProp(RefId(Id("""globalRec""")), EStr("""ObjectRecord""")), ERef(RefId(Id("""objRec""")))).setId(8071), IAssign(RefProp(RefId(Id("""globalRec""")), EStr("""GlobalThisValue""")), ERef(RefId(Id("""thisValue""")))).setId(8073), IAssign(RefProp(RefId(Id("""globalRec""")), EStr("""DeclarativeRecord""")), ERef(RefId(Id("""dclRec""")))).setId(8075), IAssign(RefProp(RefId(Id("""globalRec""")), EStr("""VarNames""")), EList(List())).setId(8077), IAssign(RefProp(RefId(Id("""env""")), EStr("""EnvironmentRecord""")), ERef(RefId(Id("""globalRec""")))).setId(8079), IAssign(RefProp(RefId(Id("""env""")), EStr("""Outer""")), ENull).setId(8081), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""env"""))))).setId(8083), IReturn(ERef(RefId(Id("""__x0__""")))).setId(8084))).setId(-1))
  /* Beautified form:
  "NewGlobalEnvironment" (G, thisValue) => {
    let env = (new LexicalEnvironment("SubMap" -> (new SubMap())))
    let objRec = (new ObjectEnvironmentRecord("SubMap" -> (new SubMap()), "BindingObject" -> G))
    let dclRec = (new DeclarativeEnvironmentRecord("SubMap" -> (new SubMap())))
    let globalRec = (new GlobalEnvironmentRecord("SubMap" -> (new SubMap())))
    globalRec["ObjectRecord"] = objRec
    globalRec["GlobalThisValue"] = thisValue
    globalRec["DeclarativeRecord"] = dclRec
    globalRec["VarNames"] = (new [])
    env["EnvironmentRecord"] = globalRec
    env["Outer"] = null
    app __x0__ = (WrapCompletion env)
    return __x0__
  }
  */
}
