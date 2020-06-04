package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement4LabelledEvaluation3 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement4LabelledEvaluation3""", List(Id("""this"""), Id("""LexicalDeclaration"""), Id("""Expression0"""), Id("""Expression1"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(ILet(Id("""oldEnv"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(31275), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""oldEnv"""))))).setId(31277), ILet(Id("""loopEnv"""), ERef(RefId(Id("""__x0__""")))).setId(31278), ILet(Id("""loopEnvRec"""), ERef(RefProp(RefId(Id("""loopEnv""")), EStr("""EnvironmentRecord""")))).setId(31280), IAccess(Id("""__x1__"""), ERef(RefId(Id("""LexicalDeclaration"""))), EStr("""IsConstantDeclaration""")).setId(31282), ILet(Id("""isConst"""), ERef(RefId(Id("""__x1__""")))).setId(31283), IAccess(Id("""__x2__"""), ERef(RefId(Id("""LexicalDeclaration"""))), EStr("""BoundNames""")).setId(31285), ILet(Id("""boundNames"""), ERef(RefId(Id("""__x2__""")))).setId(31286), ILet(Id("""__x3__"""), ERef(RefId(Id("""boundNames""")))).setId(31308), ILet(Id("""__x4__"""), EINum(0L)).setId(31309), IWhile(EBOp(OLt, ERef(RefId(Id("""__x4__"""))), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""length""")))), ISeq(List(ILet(Id("""dn"""), ERef(RefProp(RefId(Id("""__x3__""")), ERef(RefId(Id("""__x4__""")))))).setId(31310), IIf(EBOp(OEq, ERef(RefId(Id("""isConst"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefProp(RefId(Id("""loopEnvRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""loopEnvRec"""))), ERef(RefId(Id("""dn"""))), EBool(true))).setId(31288), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(31289), IReturn(ERef(RefId(Id("""__x5__""")))).setId(31290)).setId(31291), ISeq(List()).setId(31292)).setId(31293), IExpr(ERef(RefId(Id("""__x5__""")))).setId(31294))).setId(31296), ISeq(List(IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""loopEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""loopEnvRec"""))), ERef(RefId(Id("""dn"""))), EBool(false))).setId(31297), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(31298), IReturn(ERef(RefId(Id("""__x6__""")))).setId(31299)).setId(31300), ISeq(List()).setId(31292)).setId(31301), IExpr(ERef(RefId(Id("""__x6__""")))).setId(31302))).setId(31304)).setId(31305), IAssign(RefId(Id("""__x4__""")), EBOp(OPlus, ERef(RefId(Id("""__x4__"""))), EINum(1L))).setId(31311))).setId(31312)).setId(31313), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""loopEnv""")))).setId(31316), IAccess(Id("""__x7__"""), ERef(RefId(Id("""LexicalDeclaration"""))), EStr("""Evaluation""")).setId(31319), ILet(Id("""forDcl"""), ERef(RefId(Id("""__x7__""")))).setId(31320), IApp(Id("""__x8__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""forDcl"""))))).setId(31322), IIf(ERef(RefId(Id("""__x8__"""))), ISeq(List(IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""oldEnv""")))).setId(31323), IApp(Id("""__x9__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""forDcl"""))))).setId(31325), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(31326), IReturn(ERef(RefId(Id("""__x10__""")))).setId(31327))).setId(31329), ISeq(List()).setId(31292)).setId(31330), IIf(EBOp(OEq, ERef(RefId(Id("""isConst"""))), EBool(false)), ILet(Id("""perIterationLets"""), ERef(RefId(Id("""boundNames""")))).setId(31332), ILet(Id("""perIterationLets"""), EList(List())).setId(31334)).setId(31336), IApp(Id("""__x11__"""), ERef(RefId(Id("""ForBodyEvaluation"""))), List(ERef(RefId(Id("""Expression0"""))), ERef(RefId(Id("""Expression1"""))), ERef(RefId(Id("""Statement"""))), ERef(RefId(Id("""perIterationLets"""))), ERef(RefId(Id("""labelSet"""))))).setId(31338), ILet(Id("""bodyResult"""), ERef(RefId(Id("""__x11__""")))).setId(31339), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""oldEnv""")))).setId(31341), IApp(Id("""__x12__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""bodyResult"""))))).setId(31343), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x12__"""))))).setId(31344), IReturn(ERef(RefId(Id("""__x13__""")))).setId(31345))).setId(-1))
  /* Beautified form:
  "IterationStatement4LabelledEvaluation3" (this, LexicalDeclaration, Expression0, Expression1, Statement, labelSet) => {
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    app __x0__ = (NewDeclarativeEnvironment oldEnv)
    let loopEnv = __x0__
    let loopEnvRec = loopEnv["EnvironmentRecord"]
    access __x1__ = (LexicalDeclaration "IsConstantDeclaration")
    let isConst = __x1__
    access __x2__ = (LexicalDeclaration "BoundNames")
    let boundNames = __x2__
    let __x3__ = boundNames
    let __x4__ = 0i
    while (< __x4__ __x3__["length"]) {
      let dn = __x3__[__x4__]
      if (= isConst true) {
        app __x5__ = (loopEnvRec["CreateImmutableBinding"] loopEnvRec dn true)
        if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        __x5__
      } else {
        app __x6__ = (loopEnvRec["CreateMutableBinding"] loopEnvRec dn false)
        if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        __x6__
      }
      __x4__ = (+ __x4__ 1i)
    }
    GLOBAL_context["LexicalEnvironment"] = loopEnv
    access __x7__ = (LexicalDeclaration "Evaluation")
    let forDcl = __x7__
    app __x8__ = (IsAbruptCompletion forDcl)
    if __x8__ {
      GLOBAL_context["LexicalEnvironment"] = oldEnv
      app __x9__ = (Completion forDcl)
      app __x10__ = (WrapCompletion __x9__)
      return __x10__
    } else {}
    if (= isConst false) let perIterationLets = boundNames else let perIterationLets = (new [])
    app __x11__ = (ForBodyEvaluation Expression0 Expression1 Statement perIterationLets labelSet)
    let bodyResult = __x11__
    GLOBAL_context["LexicalEnvironment"] = oldEnv
    app __x12__ = (Completion bodyResult)
    app __x13__ = (WrapCompletion __x12__)
    return __x13__
  }
  */
}
