package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SuperProperty1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""SuperProperty1Evaluation0""", List(Id("""this"""), Id("""IdentifierName""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetThisEnvironment"""))), List()).setId(17685), ILet(Id("""env"""), ERef(RefId(Id("""__x0__""")))).setId(17686), IApp(Id("""__x1__"""), ERef(RefProp(RefId(Id("""env""")), EStr("""GetThisBinding"""))), List(ERef(RefId(Id("""env"""))))).setId(17688), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(17689), IReturn(ERef(RefId(Id("""__x1__""")))).setId(17690)).setId(17691), ISeq(List()).setId(17692)).setId(17693), ILet(Id("""actualThis"""), ERef(RefId(Id("""__x1__""")))).setId(17694), IAccess(Id("""__x2__"""), ERef(RefId(Id("""IdentifierName"""))), EStr("""StringValue""")).setId(17696), ILet(Id("""propertyKey"""), ERef(RefId(Id("""__x2__""")))).setId(17697), IIf(EBool(true), ILet(Id("""strict"""), EBool(true)).setId(17699), ILet(Id("""strict"""), EBool(false)).setId(17701)).setId(17703), IApp(Id("""__x3__"""), ERef(RefId(Id("""MakeSuperPropertyReference"""))), List(ERef(RefId(Id("""actualThis"""))), ERef(RefId(Id("""propertyKey"""))), ERef(RefId(Id("""strict"""))))).setId(17705), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(17706), IReturn(ERef(RefId(Id("""__x3__""")))).setId(17707)).setId(17708), ISeq(List()).setId(17692)).setId(17709), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(17710), IReturn(ERef(RefId(Id("""__x4__""")))).setId(17711))).setId(-1))
  /* Beautified form:
  "SuperProperty1Evaluation0" (this, IdentifierName) => {
    app __x0__ = (GetThisEnvironment )
    let env = __x0__
    app __x1__ = (env["GetThisBinding"] env)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let actualThis = __x1__
    access __x2__ = (IdentifierName "StringValue")
    let propertyKey = __x2__
    if true let strict = true else let strict = false
    app __x3__ = (MakeSuperPropertyReference actualThis propertyKey strict)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
