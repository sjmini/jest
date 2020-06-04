package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreatePerIterationEnvironment {
  val length: Int = 1
  val func: Func = Func("""CreatePerIterationEnvironment""", List(Id("""perIterationBindings""")), None, ISeq(List(IIf(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""perIterationBindings""")), EStr("""length""")))), ISeq(List(ILet(Id("""lastIterationEnv"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(31661), ILet(Id("""lastIterationEnvRec"""), ERef(RefProp(RefId(Id("""lastIterationEnv""")), EStr("""EnvironmentRecord""")))).setId(31663), ILet(Id("""outer"""), ERef(RefProp(RefId(Id("""lastIterationEnv""")), EStr("""Outer""")))).setId(31665), IApp(Id("""__x0__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""outer"""))))).setId(31668), ILet(Id("""thisIterationEnv"""), ERef(RefId(Id("""__x0__""")))).setId(31669), ILet(Id("""thisIterationEnvRec"""), ERef(RefProp(RefId(Id("""thisIterationEnv""")), EStr("""EnvironmentRecord""")))).setId(31671), ILet(Id("""__x1__"""), ERef(RefId(Id("""perIterationBindings""")))).setId(31691), ILet(Id("""__x2__"""), EINum(0L)).setId(31692), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""bn"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(31693), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""thisIterationEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""thisIterationEnvRec"""))), ERef(RefId(Id("""bn"""))), EBool(false))).setId(31673), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(31674), IReturn(ERef(RefId(Id("""__x3__""")))).setId(31675)).setId(31676), ISeq(List()).setId(31667)).setId(31677), IExpr(ERef(RefId(Id("""__x3__""")))).setId(31678), IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""lastIterationEnvRec""")), EStr("""GetBindingValue"""))), List(ERef(RefId(Id("""lastIterationEnvRec"""))), ERef(RefId(Id("""bn"""))), EBool(true))).setId(31680), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(31681), IReturn(ERef(RefId(Id("""__x4__""")))).setId(31682)).setId(31683), ISeq(List()).setId(31667)).setId(31684), ILet(Id("""lastValue"""), ERef(RefId(Id("""__x4__""")))).setId(31685), IApp(Id("""__x5__"""), ERef(RefProp(RefId(Id("""thisIterationEnvRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""thisIterationEnvRec"""))), ERef(RefId(Id("""bn"""))), ERef(RefId(Id("""lastValue"""))))).setId(31687), IExpr(ERef(RefId(Id("""__x5__""")))).setId(31688), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(31694))).setId(31695)).setId(31696), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""thisIterationEnv""")))).setId(31699))).setId(31701), ISeq(List()).setId(31667)).setId(31702), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(31704), IReturn(ERef(RefId(Id("""__x6__""")))).setId(31705))).setId(-1))
  /* Beautified form:
  "CreatePerIterationEnvironment" (perIterationBindings) => {
    if (< 0i perIterationBindings["length"]) {
      let lastIterationEnv = GLOBAL_context["LexicalEnvironment"]
      let lastIterationEnvRec = lastIterationEnv["EnvironmentRecord"]
      let outer = lastIterationEnv["Outer"]
      app __x0__ = (NewDeclarativeEnvironment outer)
      let thisIterationEnv = __x0__
      let thisIterationEnvRec = thisIterationEnv["EnvironmentRecord"]
      let __x1__ = perIterationBindings
      let __x2__ = 0i
      while (< __x2__ __x1__["length"]) {
        let bn = __x1__[__x2__]
        app __x3__ = (thisIterationEnvRec["CreateMutableBinding"] thisIterationEnvRec bn false)
        if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        __x3__
        app __x4__ = (lastIterationEnvRec["GetBindingValue"] lastIterationEnvRec bn true)
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        let lastValue = __x4__
        app __x5__ = (thisIterationEnvRec["InitializeBinding"] thisIterationEnvRec bn lastValue)
        __x5__
        __x2__ = (+ __x2__ 1i)
      }
      GLOBAL_context["LexicalEnvironment"] = thisIterationEnv
    } else {}
    app __x6__ = (WrapCompletion undefined)
    return __x6__
  }
  */
}
