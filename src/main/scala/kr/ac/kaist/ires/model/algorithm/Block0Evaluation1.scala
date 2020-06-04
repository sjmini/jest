package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Block0Evaluation1 {
  val length: Int = 0
  val func: Func = Func("""Block0Evaluation1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(ILet(Id("""oldEnv"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(26864), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""oldEnv"""))))).setId(26866), ILet(Id("""blockEnv"""), ERef(RefId(Id("""__x0__""")))).setId(26867), IApp(Id("""__x1__"""), ERef(RefId(Id("""BlockDeclarationInstantiation"""))), List(ERef(RefId(Id("""StatementList"""))), ERef(RefId(Id("""blockEnv"""))))).setId(26869), IExpr(ERef(RefId(Id("""__x1__""")))).setId(26870), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""blockEnv""")))).setId(26872), IAccess(Id("""__x2__"""), ERef(RefId(Id("""StatementList"""))), EStr("""Evaluation""")).setId(26875), ILet(Id("""blockValue"""), ERef(RefId(Id("""__x2__""")))).setId(26876), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""oldEnv""")))).setId(26878), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""blockValue"""))))).setId(26880), IReturn(ERef(RefId(Id("""__x3__""")))).setId(26881))).setId(-1))
  /* Beautified form:
  "Block0Evaluation1" (this, StatementList) => {
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment oldEnv)
    let blockEnv = __x0__
    app __x1__ = (BlockDeclarationInstantiation StatementList blockEnv)
    __x1__
    GLOBAL_context["LexicalEnvironment"] = blockEnv
    access __x2__ = (StatementList "Evaluation")
    let blockValue = __x2__
    GLOBAL_context["LexicalEnvironment"] = oldEnv
    app __x3__ = (WrapCompletion blockValue)
    return __x3__
  }
  */
}
