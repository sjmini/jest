package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameter0IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameter0IteratorBindingInitialization0""", List(Id("""this"""), Id("""BindingElement"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElement"""))), EStr("""ContainsExpression""")).setId(38261), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false)), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingElement"""))), EStr("""IteratorBindingInitialization""")).setId(38262), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))).setId(38263), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(38264), IReturn(ERef(RefId(Id("""__x3__""")))).setId(38265))).setId(38266), ISeq(List()).setId(38267)).setId(38268), ILet(Id("""currentContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(38270), IAccess(Id("""__x4__"""), ERef(RefId(Id("""currentContext"""))), EStr("""VariableEnvironment""")).setId(38272), ILet(Id("""originalEnv"""), ERef(RefId(Id("""__x4__""")))).setId(38273), IApp(Id("""__x5__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""originalEnv"""))))).setId(38275), ILet(Id("""paramVarEnv"""), ERef(RefId(Id("""__x5__""")))).setId(38276), IAssign(RefProp(RefId(Id("""currentContext""")), EStr("""VariableEnvironment""")), ERef(RefId(Id("""paramVarEnv""")))).setId(38278), IAssign(RefProp(RefId(Id("""currentContext""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""paramVarEnv""")))).setId(38280), IAccess(Id("""__x6__"""), ERef(RefId(Id("""BindingElement"""))), EStr("""IteratorBindingInitialization""")).setId(38282), IApp(Id("""__x7__"""), ERef(RefId(Id("""__x6__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))).setId(38283), ILet(Id("""result"""), ERef(RefId(Id("""__x7__""")))).setId(38284), IAssign(RefProp(RefId(Id("""currentContext""")), EStr("""VariableEnvironment""")), ERef(RefId(Id("""originalEnv""")))).setId(38286), IAssign(RefProp(RefId(Id("""currentContext""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""originalEnv""")))).setId(38288), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(38290), IReturn(ERef(RefId(Id("""__x8__""")))).setId(38291))).setId(-1))
  /* Beautified form:
  "FormalParameter0IteratorBindingInitialization0" (this, BindingElement, iteratorRecord, environment) => {
    access __x0__ = (BindingElement "ContainsExpression")
    if (= __x0__ false) {
      access __x1__ = (BindingElement "IteratorBindingInitialization")
      app __x2__ = (__x1__ iteratorRecord environment)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    let currentContext = GLOBAL_context
    access __x4__ = (currentContext "VariableEnvironment")
    let originalEnv = __x4__
    app __x5__ = (NewDeclarativeEnvironment originalEnv)
    let paramVarEnv = __x5__
    currentContext["VariableEnvironment"] = paramVarEnv
    currentContext["LexicalEnvironment"] = paramVarEnv
    access __x6__ = (BindingElement "IteratorBindingInitialization")
    app __x7__ = (__x6__ iteratorRecord environment)
    let result = __x7__
    currentContext["VariableEnvironment"] = originalEnv
    currentContext["LexicalEnvironment"] = originalEnv
    app __x8__ = (WrapCompletion result)
    return __x8__
  }
  */
}
