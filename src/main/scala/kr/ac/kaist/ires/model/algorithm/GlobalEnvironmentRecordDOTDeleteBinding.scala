package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GlobalEnvironmentRecordDOTDeleteBinding {
  val length: Int = 1
  val func: Func = Func("""GlobalEnvironmentRecord.DeleteBinding""", List(Id("""this"""), Id("""N""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48351), ILet(Id("""DclRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""DeclarativeRecord""")))).setId(48353), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))))).setId(48355), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""DeleteBinding"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))))).setId(48356), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(48357), IReturn(ERef(RefId(Id("""__x2__""")))).setId(48358))).setId(48360), ISeq(List()).setId(48361)).setId(48362), ILet(Id("""ObjRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""ObjectRecord""")))).setId(48364), ILet(Id("""globalObject"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""BindingObject""")))).setId(48366), IApp(Id("""__x3__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""globalObject"""))), ERef(RefId(Id("""N"""))))).setId(48368), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(48369), IReturn(ERef(RefId(Id("""__x3__""")))).setId(48370)).setId(48371), ISeq(List()).setId(48361)).setId(48372), ILet(Id("""existingProp"""), ERef(RefId(Id("""__x3__""")))).setId(48373), IIf(EBOp(OEq, ERef(RefId(Id("""existingProp"""))), EBool(true)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""ObjRec""")), EStr("""DeleteBinding"""))), List(ERef(RefId(Id("""ObjRec"""))), ERef(RefId(Id("""N"""))))).setId(48375), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(48376), IReturn(ERef(RefId(Id("""__x4__""")))).setId(48377)).setId(48378), ISeq(List()).setId(48361)).setId(48379), ILet(Id("""status"""), ERef(RefId(Id("""__x4__""")))).setId(48380), IIf(EBOp(OEq, ERef(RefId(Id("""status"""))), EBool(true)), ISeq(List(ILet(Id("""varNames"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""VarNames""")))).setId(48382), ILet(Id("""__x5__"""), EINum(0L)).setId(48384), ILet(Id("""__x6__"""), ERef(RefProp(RefId(Id("""varNames""")), EStr("""length""")))).setId(48385), IWhile(EBOp(OAnd, EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""__x6__""")))), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""varNames""")), ERef(RefId(Id("""__x5__"""))))), ERef(RefId(Id("""N""")))))), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L))).setId(48386)).setId(48387), IIf(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""__x6__""")))), IExpr(EPop(ERef(RefId(Id("""varNames"""))), ERef(RefId(Id("""__x5__"""))))).setId(48388), ISeq(List()).setId(48389)).setId(48390))).setId(48392), ISeq(List()).setId(48361)).setId(48393), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""status"""))))).setId(48395), IReturn(ERef(RefId(Id("""__x7__""")))).setId(48396))).setId(48398), ISeq(List()).setId(48361)).setId(48399), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(48401), IReturn(ERef(RefId(Id("""__x8__""")))).setId(48402))).setId(-1))
  /* Beautified form:
  "GlobalEnvironmentRecord.DeleteBinding" (this, N) => {
    let envRec = this
    let DclRec = envRec["DeclarativeRecord"]
    app __x0__ = (DclRec["HasBinding"] DclRec N)
    if (= __x0__ true) {
      app __x1__ = (DclRec["DeleteBinding"] DclRec N)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    let ObjRec = envRec["ObjectRecord"]
    let globalObject = ObjRec["BindingObject"]
    app __x3__ = (HasOwnProperty globalObject N)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let existingProp = __x3__
    if (= existingProp true) {
      app __x4__ = (ObjRec["DeleteBinding"] ObjRec N)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let status = __x4__
      if (= status true) {
        let varNames = envRec["VarNames"]
        let __x5__ = 0i
        let __x6__ = varNames["length"]
        while (&& (< __x5__ __x6__) (! (= varNames[__x5__] N))) __x5__ = (+ __x5__ 1i)
        if (< __x5__ __x6__) (pop varNames __x5__) else {}
      } else {}
      app __x7__ = (WrapCompletion status)
      return __x7__
    } else {}
    app __x8__ = (WrapCompletion true)
    return __x8__
  }
  */
}
