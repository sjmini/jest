package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ForInOfHeadEvaluation {
  val length: Int = 3
  val func: Func = Func("""ForInOfHeadEvaluation""", List(Id("""TDZnames"""), Id("""expr"""), Id("""iterationKind""")), None, ISeq(List(ILet(Id("""oldEnv"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(33100), IIf(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""TDZnames""")), EStr("""length""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""oldEnv"""))))).setId(33103), ILet(Id("""TDZ"""), ERef(RefId(Id("""__x0__""")))).setId(33104), ILet(Id("""TDZEnvRec"""), ERef(RefProp(RefId(Id("""TDZ""")), EStr("""EnvironmentRecord""")))).setId(33106), ILet(Id("""__x1__"""), ERef(RefId(Id("""TDZnames""")))).setId(33116), ILet(Id("""__x2__"""), EINum(0L)).setId(33117), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(33118), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""TDZEnvRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""TDZEnvRec"""))), ERef(RefId(Id("""name"""))), EBool(false))).setId(33108), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(33109), IReturn(ERef(RefId(Id("""__x3__""")))).setId(33110)).setId(33111), ISeq(List()).setId(33102)).setId(33112), IExpr(ERef(RefId(Id("""__x3__""")))).setId(33113), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(33119))).setId(33120)).setId(33121), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""TDZ""")))).setId(33124))).setId(33126), ISeq(List()).setId(33102)).setId(33127), IAccess(Id("""__x4__"""), ERef(RefId(Id("""expr"""))), EStr("""Evaluation""")).setId(33130), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x4__""")))).setId(33131), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""oldEnv""")))).setId(33133), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))).setId(33135), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(33136), IReturn(ERef(RefId(Id("""__x5__""")))).setId(33137)).setId(33138), ISeq(List()).setId(33102)).setId(33139), ILet(Id("""exprValue"""), ERef(RefId(Id("""__x5__""")))).setId(33140), IIf(EBOp(OEq, ERef(RefId(Id("""iterationKind"""))), ERef(RefId(Id("""CONST_enumerate""")))), ISeq(List(IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""exprValue"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""exprValue"""))), ENull)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EMap(Ty("""Completion"""), List((EStr("""Type"""), ERef(RefId(Id("""CONST_break""")))), (EStr("""Value"""), ERef(RefId(Id("""CONST_empty""")))), (EStr("""Target"""), ERef(RefId(Id("""CONST_empty""")))))))).setId(33142), IReturn(ERef(RefId(Id("""__x6__""")))).setId(33143))).setId(33145), ISeq(List()).setId(33102)).setId(33146), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""exprValue"""))))).setId(33148), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(33149), IReturn(ERef(RefId(Id("""__x7__""")))).setId(33150)).setId(33151), ISeq(List()).setId(33102)).setId(33152), ILet(Id("""obj"""), ERef(RefId(Id("""__x7__""")))).setId(33153), IApp(Id("""__x8__"""), ERef(RefId(Id("""EnumerateObjectProperties"""))), List(ERef(RefId(Id("""obj"""))))).setId(33155), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(33156), IReturn(ERef(RefId(Id("""__x8__""")))).setId(33157)).setId(33158), ISeq(List()).setId(33102)).setId(33159), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(33160), IReturn(ERef(RefId(Id("""__x9__""")))).setId(33161))).setId(33163), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""iterationKind"""))), ERef(RefId(Id("""CONST_asynciterate""")))), ILet(Id("""iteratorHint"""), ERef(RefId(Id("""CONST_async""")))).setId(33164), ILet(Id("""iteratorHint"""), ERef(RefId(Id("""CONST_sync""")))).setId(33166)).setId(33168), IApp(Id("""__x10__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""exprValue"""))), ERef(RefId(Id("""iteratorHint"""))))).setId(33170), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(33171), IReturn(ERef(RefId(Id("""__x10__""")))).setId(33172)).setId(33173), ISeq(List()).setId(33102)).setId(33174), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(33175), IReturn(ERef(RefId(Id("""__x11__""")))).setId(33176))).setId(33178)).setId(33179))).setId(-1))
  /* Beautified form:
  "ForInOfHeadEvaluation" (TDZnames, expr, iterationKind) => {
    let oldEnv = GLOBAL_context["LexicalEnvironment"]
    if (< 0i TDZnames["length"]) {
      app __x0__ = (NewDeclarativeEnvironment oldEnv)
      let TDZ = __x0__
      let TDZEnvRec = TDZ["EnvironmentRecord"]
      let __x1__ = TDZnames
      let __x2__ = 0i
      while (< __x2__ __x1__["length"]) {
        let name = __x1__[__x2__]
        app __x3__ = (TDZEnvRec["CreateMutableBinding"] TDZEnvRec name false)
        if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        __x3__
        __x2__ = (+ __x2__ 1i)
      }
      GLOBAL_context["LexicalEnvironment"] = TDZ
    } else {}
    access __x4__ = (expr "Evaluation")
    let exprRef = __x4__
    GLOBAL_context["LexicalEnvironment"] = oldEnv
    app __x5__ = (GetValue exprRef)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let exprValue = __x5__
    if (= iterationKind CONST_enumerate) {
      if (|| (= exprValue undefined) (= exprValue null)) {
        app __x6__ = (WrapCompletion (new Completion("Type" -> CONST_break, "Value" -> CONST_empty, "Target" -> CONST_empty)))
        return __x6__
      } else {}
      app __x7__ = (ToObject exprValue)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let obj = __x7__
      app __x8__ = (EnumerateObjectProperties obj)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {
      if (= iterationKind CONST_asynciterate) let iteratorHint = CONST_async else let iteratorHint = CONST_sync
      app __x10__ = (GetIterator exprValue iteratorHint)
      if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    }
  }
  */
}
