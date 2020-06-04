package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NewFunctionEnvironment {
  val length: Int = 2
  val func: Func = Func("""NewFunctionEnvironment""", List(Id("""F"""), Id("""newTarget""")), None, ISeq(List(ILet(Id("""env"""), EMap(Ty("""LexicalEnvironment"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(8009), ILet(Id("""envRec"""), EMap(Ty("""FunctionEnvironmentRecord"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(8011), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""FunctionObject""")), ERef(RefId(Id("""F""")))).setId(8013), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""ThisMode"""))), ERef(RefId(Id("""CONST_lexical""")))), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""ThisBindingStatus""")), EStr("""lexical""")).setId(8015), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""ThisBindingStatus""")), EStr("""uninitialized""")).setId(8017)).setId(8019), ILet(Id("""home"""), ERef(RefProp(RefId(Id("""F""")), EStr("""HomeObject""")))).setId(8021), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""HomeObject""")), ERef(RefId(Id("""home""")))).setId(8023), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""NewTarget""")), ERef(RefId(Id("""newTarget""")))).setId(8025), IAssign(RefProp(RefId(Id("""env""")), EStr("""EnvironmentRecord""")), ERef(RefId(Id("""envRec""")))).setId(8027), IAssign(RefProp(RefId(Id("""env""")), EStr("""Outer""")), ERef(RefProp(RefId(Id("""F""")), EStr("""Environment""")))).setId(8029), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""env"""))))).setId(8031), IReturn(ERef(RefId(Id("""__x0__""")))).setId(8032))).setId(-1))
  /* Beautified form:
  "NewFunctionEnvironment" (F, newTarget) => {
    let env = (new LexicalEnvironment("SubMap" -> (new SubMap())))
    let envRec = (new FunctionEnvironmentRecord("SubMap" -> (new SubMap())))
    envRec["FunctionObject"] = F
    if (= F["ThisMode"] CONST_lexical) envRec["ThisBindingStatus"] = "lexical" else envRec["ThisBindingStatus"] = "uninitialized"
    let home = F["HomeObject"]
    envRec["HomeObject"] = home
    envRec["NewTarget"] = newTarget
    env["EnvironmentRecord"] = envRec
    env["Outer"] = F["Environment"]
    app __x0__ = (WrapCompletion env)
    return __x0__
  }
  */
}
